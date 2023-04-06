CREATE DEFINER=`root`@`localhost` PROCEDURE `define_sabor_con_error`(vcodigo VARCHAR(20))
BEGIN
DECLARE vsabor VARCHAR(20);
DECLARE mensajeerror VARCHAR(50);
DECLARE CONTINUE HANDLER FOR 1339
SET mensajeerror = 'Sabor no definido en ningun caso.';
SELECT SABOR INTO vsabor FROM tabla_de_productos WHERE CODIGO_DEL_PRODUCTO = vcodigo;
CASE vsabor
WHEN 'Maracuya' THEN SELECT 'Muy Rico';
WHEN 'Frutilla' THEN SELECT 'Muy Rico';
WHEN 'Uva' THEN SELECT 'Muy Rico';
WHEN 'Limon' THEN SELECT 'Muy Rico';
WHEN 'Sandia' THEN SELECT 'Normal';
WHEN 'Mango' THEN SELECT 'Normal';
END CASE;
SELECT mensajeerror;
END

CALL define_sabor_con_error('544932');