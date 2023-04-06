SELECT DISTINCT SABOR FROM tabla_de_productos;

/*
Maracuya Rico
Limon Rico
Uva Rico
Sandia Normal
Mango Normal
Los demas comunes
*/

-- PROCEDURE
CREATE DEFINER=`root`@`localhost` PROCEDURE `define_sabor`(vcodigo VARCHAR(20))
BEGIN
DECLARE vsabor VARCHAR(20);
SELECT SABOR INTO vsabor FROM tabla_de_productos WHERE CODIGO_DEL_PRODUCTO = vcodigo;
CASE vsabor
WHEN 'Maracuya' THEN SELECT 'Muy Rico';
WHEN 'Frutilla' THEN SELECT 'Muy Rico';
WHEN 'Uva' THEN SELECT 'Muy Rico';
WHEN 'Limon' THEN SELECT 'Muy Rico';
WHEN 'Sandia' THEN SELECT 'Normal';
WHEN 'Mango' THEN SELECT 'Normal';
ELSE SELECT 'Jugos comunes';
END CASE;
END


CALL define_sabor('544931');

SELECT SABOR FROM tabla_de_productos WHERE CODIGO_DEL_PRODUCTO =  '1002767';