CREATE FUNCTION `f_define` (vsabor VARCHAR(40))
RETURNS VARCHAR(40)
BEGIN
DECLARE vretorno VARCHAR(40) DEFAULT "";
CASE vsabor
WHEN 'Limon' THEN SET vretorno = 'Muy Rico';
WHEN 'Frutilla' THEN SET vretorno = 'Normal';
WHEN 'Uva' THEN SET vretorno = 'Muy Rico';
WHEN 'Mango' THEN SET vretorno = 'Normal';
ELSE SET vretorno = 'Jugos comunes';
END CASE;
RETURN vretorno;
END




SELECT f_define('Maracuya');


SELECT NOMBRE_DEL_PRODUCTO, SABOR, f_define_sabor(SABOR) AS TIPO
FROM tabla_de_productos;

SELECT NOMBRE_DEL_PRODUCTO, SABOR FROM tabla_de_productos
WHERE f_define_sabor(SABOR) = 'Muy Rico';