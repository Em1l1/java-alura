USE jugos_ventas;

select * from tabla_de_productos;

-- PROCEDURE sabor
CREATE DEFINER=`root`@`localhost` PROCEDURE `mostrar_sabor`(vcodigo VARCHAR(15))
BEGIN
DECLARE vsabor VARCHAR(20);
SELECT SABOR INTO vsabor FROM tabla_de_productos WHERE CODIGO_DEL_PRODUCTO = vcodigo;
SELECT vsabor;
END


CALL mostrar_sabor('1001002');

DELIMITER $$
CREATE PROCEDURE `cantidad_facturas`()
BEGIN
DECLARE N_FACTURAS INTEGER;
SELECT COUNT(*) INTO N_FACTURAS FROM facturas WHERE
FECHA_VENTA = '2017-01-01';
SELECT N_FACTURAS;
END $$