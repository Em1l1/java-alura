SELECT * FROM tbcliente;

SELECT * FROM tbcliente WHERE FECHA_NACIMIENTO = '1995-01-13';

SELECT * FROM tbcliente WHERE FECHA_NACIMIENTO < '1995-01-13';

SELECT * FROM tbcliente WHERE FECHA_NACIMIENTO >= '1995-01-13';

SELECT * FROM tbcliente WHERE YEAR(FECHA_NACIMIENTO) = 1995;
SELECT * FROM tbcliente WHERE DAY(FECHA_NACIMIENTO) = 20;

-- vendedores Admintidos en 20216
SELECT * FROM TABLA_DE_VENDEDORES WHERE YEAR(FECHA_ADMISION) >= 2016;