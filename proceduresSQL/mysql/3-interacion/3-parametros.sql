USE `jugos_ventas`;
DROP procedure IF EXISTS `new_parameter`;

DELIMITER $$
USE `jugos_ventas`$$
CREATE PROCEDURE `new_parameter` (vcodigo VARCHAR(20), vnombre VARCHAR(20), vsabor VARCHAR(20), vtamano VARCHAR(20), venvase VARCHAR(20), vprecio DECIMAL(4,2))
BEGIN
INSERT INTO tabla_de_productos (CODIGO_DEL_PRODUCTO,NOMBRE_DEL_PRODUCTO,SABOR,TAMANO,ENVASE,PRECIO_DE_LISTA)
     VALUES (vcodigo, vnombre, vsabor, vtamano, venvase, vprecio);
END$$

DELIMITER ;

USE jugos_ventas;

SELECT * FROM  tabla_de_productos WHERE CODIGO_DEL_PRODUCTO = '1000800';

-- stored procedures
CALL new_parameter('1000800', 'Sabor del Mar', '700 ml', 'Naranja', 'Botella de Vidrio', 2.25);


-- stored procedures reajuste_comision

DELIMITER $$
CREATE PROCEDURE `reajuste_comision`(vporcentaje FLOAT)
BEGIN
UPDATE tabla_de_vendedores SET PORCENTAJE_COMISION =  PORCENTAJE_COMISION * (1 + vporcentaje);
END $$