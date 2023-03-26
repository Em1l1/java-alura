SELECT DISTINCT BARRIO FROM tabla_de_vendedores;


-- subconsultas 
SELECT * FROM tabla_de_clientes
WHERE BARRIO IN ('Condesa', 'Del Valle', 'Contadero', 'Oblatos');

SELECT * FROM tabla_de_clientes
WHERE BARRIO IN (SELECT DISTINCT BARRIO FROM tabla_de_vendedores);

-- MAX
SELECT ENVASE, MAX(PRECIO_DE_LISTA) AS PRECIO_MAXIMO FROM tabla_de_productos GROUP BY ENVASE;

-- precio maximo
SELECT X.ENVASE, X.PRECIO_MAXIMO FROM
(SELECT ENVASE, MAX(PRECIO_DE_LISTA)
AS PRECIO_MAXIMO FROM tabla_de_productos GROUP BY ENVASE) X 
WHERE X.PRECIO_MAXIMO >= 10;

SHOW TABLES;