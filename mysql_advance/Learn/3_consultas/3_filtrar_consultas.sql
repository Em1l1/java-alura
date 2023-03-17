-- Active: 1678972949371@@127.0.0.1@3306@jugos_ventas
USE jugos_ventas;

SELECT ESTADO, LIMITE_DE_CREDITO FROM tabla_de_clientes;

SELECT ESTADO, SUM(LIMITE_DE_CREDITO) AS LIMITE_TOTAL FROM tabla_de_clientes GROUP BY ESTADO;

SELECT ENVASE, SUM(PRECIO_DE_LISTA) AS MAYOR_PRECIO FROM tabla_de_productos GROUP BY ENVASE;

SELECT ENVASE, COUNT(*) FROM tabla_de_productos GROUP BY ENVASE;


SELECT CIUDAD, BARRIO, SUM(LIMITE_DE_CREDITO) AS LIMITE FROM tabla_de_clientes WHERE CIUDAD = 'Ciudad de Mexico' GROUP BY BARRIO;

SELECT CIUDAD, BARRIO, SUM(LIMITE_DE_CREDITO) AS LIMITE FROM tabla_de_clientes WHERE CIUDAD = 'GUADALAJARA' GROUP BY BARRIO;

SELECT ESTADO, BARRIO, MAX(LIMITE_DE_CREDITO) AS LIMITE FROM tabla_de_clientes GROUP BY ESTADO, BARRIO;

SELECT ESTADO, BARRIO, MAX(LIMITE_DE_CREDITO) 
AS LIMITE, EDAD 
FROM tabla_de_clientes 
WHERE EDAD >= 20 
GROUP BY ESTADO, BARRIO 
ORDER BY EDAD;


SELECT MAX(CANTIDAD) AS CANTIDAD_MAXIMA FROM items_facturas WHERE CODIGO_DEL_PRODUCTO = "1101035";

SELECT COUNT(*) FROM items_facturas WHERE CODIGO_DEL_PRODUCTO = "1101035" AND CANTIDAD = 99;