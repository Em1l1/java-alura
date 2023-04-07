DELIMITER $$
CREATE PROCEDURE `limite_creditos`()
BEGIN
DECLARE limite_credito FLOAT;
DECLARE limite_credito_acumulado FLOAT;
DECLARE fin_cursor INT;
DECLARE c CURSOR FOR SELECT LIMITE_DE_CREDITO FROM tabla_de_clientes;
DECLARE CONTINUE HANDLER FOR NOT FOUND SET fin_cursor = 1;
SET fin_cursor = 0;
SET limite_credito_acumulado = 0;
SET limite_credito = 0;
OPEN c;
WHILE fin_cursor = 0
DO
FETCH c INTO limite_credito;
IF fin_cursor = 0 
THEN SET limite_credito_acumulado = limite_credito_acumulado + limite_credito;
END IF;
END WHILE;
SELECT limite_credito_acumulado;
CLOSE c;
END $$