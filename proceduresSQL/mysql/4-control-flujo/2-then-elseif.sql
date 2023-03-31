-- PROCEDURE precio producto
CREATE DEFINER=`root`@`localhost` PROCEDURE `precio_producto`(vcodigo VARCHAR(20))
BEGIN
DECLARE vresultado VARCHAR(40);
DECLARE vprecio FLOAT;
SELECT PRECIO_DE_LISTA FROM tabla_de_productos
WHERE CODIGO_DEL_PRODUCTO = vcodigo;

IF vprecio >= 12
THEN SET vresultado = 'Producto costoso';
ELSEIF
vprecio >= 7 AND vprecio < 12
THEN SET vresultado = 'Producto asequible';
ELSE
SET vresultado = 'Producto barato';
END IF;
SELECT vresultado;
END;


CALL precio_producto('1000800');

DELIMITER $$
CREATE PROCEDURE `comparacion_ventas`(vfecha1 DATE, vfecha2 DATE)
BEGIN
DECLARE facturacion_inicial FLOAT;
DECLARE facturacion_final FLOAT;
DECLARE variacion float;
SELECT SUM(B.CANTIDAD * B.PRECIO) INTO facturacion_inicial  FROM 
facturas A INNER JOIN items_facturas B
ON A.NUMERO = B.NUMERO
WHERE A.FECHA_VENTA = vfecha1;
SELECT SUM(B.CANTIDAD * B.PRECIO) INTO facturacion_final  FROM 
facturas A INNER JOIN items_facturas B
ON A.NUMERO = B.NUMERO
WHERE A.FECHA_VENTA = vfecha2;
SET variacion = ((facturacion_final / facturacion_inicial) -1) * 100;
IF variacion > 10 THEN
SELECT 'Verde';
ELSEIF variacion >= -10 AND variacion <= 10 THEN
SELECT 'Amarillo';
ELSE
SELECT 'Rojo';
END IF;
END $$