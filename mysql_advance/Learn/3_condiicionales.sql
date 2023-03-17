USE jugos_ventas;

-- OR
SELECT * FROM tabla_de_productos;
SELECT * FROM tabla_de_productos;

SELECT * FROM tabla_de_productos WHERE SABOR='mango' OR TAMANO='470 ml' ;

-- AND
SELECT * FROM tabla_de_productos WHERE SABOR='mango' AND TAMANO='470 ml' ;


-- NOT OR
SELECT * FROM tabla_de_productos WHERE NOT (SABOR='mango') OR TAMANO='470 ml' ;

SELECT * FROM tabla_de_productos WHERE NOT (SABOR='mango' OR TAMANO='470 ml');


SELECT * FROM tabla_de_productos WHERE SABOR='mango' OR NOT (TAMANO='470 ml');

-- IN
SELECT * FROM tabla_de_productos WHERE SABOR IN ('MANGO', 'UVA');

SELECT * FROM tabla_de_productos WHERE SABOR IN ('MANGO' OR 'UVA');
SELECT * FROM tabla_de_productos WHERE SABOR='MANGO' OR SABOR = 'UVA' ;


SELECT * FROM tabla_de_clientes WHERE CIUDAD IN ('ciudad de Mexico', 'Guadalajara');

SELECT * FROM tabla_de_clientes WHERE CIUDAD IN ('ciudad de Mexico', 'Guadalajara') AND EDAD > 21;

SELECT * FROM tabla_de_clientes WHERE CIUDAD IN ('ciudad de Mexico', 'Guadalajara') AND EDAD BETWEEN 20 AND 25;

SELECT * FROM tabla_de_clientes WHERE CIUDAD IN ('ciudad de Mexico', 'Guadalajara') AND (EDAD BETWEEN 20 AND 25);
-- NAND NOT AND

