USE `jugos_ventas`;
DROP procedure IF EXISTS `hola_mundo`;

DELIMITER $$
USE `jugos_ventas`$$
CREATE PROCEDURE `hola_mundo` ()
BEGIN
SELECT 'hola_mundo';
END$$

DELIMITER ;


CALL nuestra_numero;

CALL concatenar;

CALL comentario;



-- ADD
CREATE DEFINER=`root`@`localhost` PROCEDURE `declaracion`()
BEGIN
DECLARE V VARCHAR(30) DEFAULT "Caracteres Variables";
DECLARE i INTEGER DEFAULT 564;
DECLARE D DECIMAL(5,3) DEFAULT 89.765;
DECLARE F DATE DEFAULT "2021-01-01";
DECLARE ts timestamp DEFAULT current_timestamp();
SELECT V;
SELECT i;
SELECT D;
SELECT F;
SELECT ts;
END

--
CALL declaracion;


CREATE DEFINER=`root`@`localhost` PROCEDURE `atribuir`()
BEGIN
DECLARE numero INTEGER DEFAULT 987;
SELECT numero;
SET numero = 324;
SELECT numero;
END


CALL atribuir;

/*
Nombre: Cliente. 
Tipo: Caracteres con 10 posiciones. 
Valor: Juan.

Nombre: Edad. 
Tipo: Entero. 
Valor: 10.

Nombre: Fecha_Nacimiento. 
Tipo: Fecha. 
Valor: 10/01/2007.

Nombre: Costo. 
Tipo: Número con casillas decimales. 
Valor: 10.23 .
*/

CREATE PROCEDURE `desafio_1`()
BEGIN
DECLARE Cliente VARCHAR(10);
DECLARE Edad INT;
DECLARE Fecha_Nacimiento DATE;
DECLARE Costo FLOAT;

SET Cliente = 'Juan';
SET Edad = 10;
SET Fecha_Nacimiento = '20170110';
SET Costo = 10.23;

SELECT Cliente;
SELECT Edad;
SELECT Fecha_Nacimiento;
SELECT Costo;

END


CALL desafio_1;