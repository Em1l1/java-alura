SELECT * FROM tabla_de_clientes;

SELECT FECHA_DE_NACIMIENTO FROM tabla_de_clientes
WHERE DNI = '1471156710';


-- PROCEDURE
CREATE PROCEDURE `edad_clientes` (vdni VARCHAR(20))
BEGIN
DECLARE vresultado VARCHAR(50);
DECLARE vfecha DATE;
SELECT FECHA_DE_NACIMIENTO INTO vfecha FROM tabla_de_clientes
WHERE DNI = vdni;

IF
vfecha < '19950101'
THEN
SET vresultado = 'Cliente Viejo';
ELSE
SET vresultado = 'Clinete Joven';
END IF;
SELECT vresultado;
END IF;
SELECT vresultado;
END


CALL edad_clientes(5648641702);