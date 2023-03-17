USE jugos_ventas;


SELECT DNI, NOMBRE, DIRECCION_1, DIRECCION_2, BARRIO, CIUDAD, ESTADO, CP, FECHA_DE_NACIMIENTO,
EDAD, SEXO, LIMITE_DE_CREDITO, VOLUMEN_DE_COMPRA, PRIMERA_COMPRA FROM tabla_de_clientes;


SELECT * FROM tabla_de_clientes;

SELECT DNI, NOMBRE FROM tabla_de_clientes;

-- Alias
SELECT DNI AS IDENTIFICACION, NOMBRE AS CLIENENTE FROM tabla_de_clientes;

-- Productos
SELECT * FROM tabla_de_productos;

SELECT * FROM tabla_de_productos WHERE SABOR = 'UVA';
SELECT * FROM tabla_de_productos WHERE SABOR = 'Mango';
SELECT * FROM tabla_de_productos WHERE ENVASE = 'Botella PET';


-- WHERE < > 
SELECT * FROM tabla_de_productos WHERE PRECIO_DE_LISTA > 16;
SELECT * FROM tabla_de_productos WHERE PRECIO_DE_LISTA <= 17;

-- float
SELECT * FROM tabla_de_productos WHERE PRECIO_DE_LISTA BETWEEN 16 AND 16.2;

