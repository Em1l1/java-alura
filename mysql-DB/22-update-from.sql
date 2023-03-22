SELECT * FROM tb_vendedor;

SELECT * FROM jugos_ventas.tabla_de_vendedores;

SELECT * FROM tb_vendedor A
INNER JOIN 
jugos_ventas.tabla_de_vendedores B
ON A.MATRICULA = SUBSTRING(B.MATRICULA,3,3);

UPDATE tb_vendedor A
INNER JOIN 
jugos_ventas.tabla_de_vendedores B
ON A.MATRICULA = SUBSTRING(B.MATRICULA,3,3);
SET A.DE_VACACIONES = B.VACACIONES;

SELECT * FROM tb_vendedor;

-- tb_compra
SELECT A.DNI FROM tb_clientes A
INNER JOIN tb_vendedor B
ON A.BARRIO = B.BARRIO

UPDATE tb_clientes A 
INNER JOIN 
tb_vendedor B
ON A.BARRIO = B.BARRIO
SET A.VOLUMEN_COMPRA = A.VOLUMEN_COMPRA * 1.3
