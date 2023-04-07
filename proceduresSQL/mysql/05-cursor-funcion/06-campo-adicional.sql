SELECT IFa.CANTIDAD, IFa.PRECIO FROM items_facturas IFa
INNER JOIN facturas  F ON F.NUMERO = IFa.NUMERO
WHERE MONTH(F.FECHA_VENTA) = 1 AND YEAR(F.FECHA_VENTA) = 2017;

-- PROCEDURE
DELIMITER $$
CREATE PROCEDURE `campo_adicional`()
BEGIN
DECLARE cantidad INT;
DECLARE precio FLOAT;
DECLARE facturacion_acumulada FLOAT;
DECLARE fin_cursor INT;
DECLARE c CURSOR FOR
SELECT IFa.CANTIDAD, IFa.PRECIO FROM items_facturas IFa
INNER JOIN facturas  F ON F.NUMERO = IFa.NUMERO
WHERE MONTH(F.FECHA_VENTA) = 1 AND YEAR(F.FECHA_VENTA) = 2017;
DECLARE CONTINUE HANDLER FOR NOT FOUND 
SET fin_cursor = 1;
OPEN c;
SET fin_cursor = 0;
SET facturacion_acumulada = 0;
WHILE fin_cursor = 0
DO
FETCH c INTO cantidad, precio;
IF fin_cursor = 0 THEN
SET facturacion_acumulada = facturacion_acumulada + (cantidad * precio);
END IF;
END WHILE;
CLOSE c;
SELECT facturacion_acumulada;
END $$