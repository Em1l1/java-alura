USE jugos_ventas;

CALL new_parameter('1000800', 'Sabor del Mar', '700 ml', 'Naranja', 'Botella de Vidrio', 2.25);

-- PROCEDURE
CREATE DEFINER=`root`@`localhost` PROCEDURE `new_parameter`(vcodigo VARCHAR(20), vnombre VARCHAR(20), vsabor VARCHAR(20), vtamano VARCHAR(20), venvase VARCHAR(20), vprecio DECIMAL(4,2))
BEGIN
DECLARE mensaje VARCHAR(20);
INSERT INTO tabla_de_productos (CODIGO_DEL_PRODUCTO,NOMBRE_DEL_PRODUCTO,SABOR,TAMANO,ENVASE,PRECIO_DE_LISTA)
     VALUES (vcodigo, vnombre, vsabor, vtamano, venvase, vprecio);
SET mensaje = "Producto incluido con Exito";
SELECT mensaje;
END;


CALL new_parameter('1000801', 'Sabor del Mar', '700 ml', 'Naranja', 'Botella de Vidrio', 2.25);

CALL new_parameter('1000822', 'Sabor del Mar', '700 ml', 'Naranja', 'Botella de Vidrio', 2.25);



CREATE DEFINER=`root`@`localhost` PROCEDURE `new_parameter`(vcodigo VARCHAR(20), vnombre VARCHAR(20), vsabor VARCHAR(20), vtamano VARCHAR(20), venvase VARCHAR(20), vprecio DECIMAL(4,2))
BEGIN
DECLARE mensaje VARCHAR(20);
DECLARE EXIT HANDLER FOR 1062
BEGIN
	set mensaje = "Producto duplicado";
    SELECT mensaje;
END;
INSERT INTO tabla_de_productos (CODIGO_DEL_PRODUCTO,NOMBRE_DEL_PRODUCTO,SABOR,TAMANO,ENVASE,PRECIO_DE_LISTA)
     VALUES (vcodigo, vnombre, vsabor, vtamano, venvase, vprecio);
SET mensaje = "Producto incluido con Exito";
SELECT mensaje;
END

-- comando para tratar errores 
DECLARE EXIT HANDLER FOR