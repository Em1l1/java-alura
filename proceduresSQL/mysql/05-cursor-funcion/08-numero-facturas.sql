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




-- FUNCTION
DELIMITER $$
CREATE FUNCTION `f_numero_facturas`(fecha DATE) 
RETURNS INTEGER
BEGIN
DECLARE n_facturas INT;
SELECT COUNT(*) INTO n_facturas FROM facturas WHERE FECHA_VENTA = fecha;
RETURN n_facturas;
END $$

SELECT f_numero_facturas() AS RESULTADO;