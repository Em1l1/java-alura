USE ventas_jugos;

SHOW TABLES;

-- incluyendo  multiples registros
SELECT * FROM jugos_ventas.tabla_de_products;

SELECT CODIGO_DEL_PRODUCTO AS CODIGO, NOMBREL_DEL_PRODUCTO AS DESCRIPCION, SABER, TAMANO, ENVASE, PRECIO_DE_LISTA AS PRECIO_LISTA
FROM jugos_ventas.tabla_de_productos
WHERE CODIGO_DEL_PRODUCTO NOT IN (SELECT CODIGO FROM tb_producto);

SELECT * FROM tb_producto;

USE ventas_jugos;

INSERT INTO tb_clientes
SELECT DNI, NOMBRE, DIRECCION_1 AS DIRECCION,
BARRIO, CIUDAD, ESTADO, CP, FECHA_DE_NACIMIENTO 
AS FECHA_NACIMIENTO, EDAD, SEXO, LIMITE_DE_CREDITO
AS LIMITE_CREDITO, VOLUMEN_DE_COMPRA AS VOLUMEN_COMPRA,
PRIMERA_COMPRA FROM jugos_ventas.tabla_de_clientes
WHERE DNI NOT IN (SELECT DNI FROM tb_clientes);