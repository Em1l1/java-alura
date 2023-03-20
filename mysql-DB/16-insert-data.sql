USE ventas_jugos;

INSERT INTO tb_producto (CODIGO, DESCRIPCION, SABOR, TAMANO, ENVASE, PRECIO_LISTA) VALUES ( '1040107', 'Light', 'Sandia', '350 ml', 'Lata', 4.56);


INSERT INTO tb_producto (CODIGO, DESCRIPCION, SABOR, TAMANO, ENVASE, PRECIO_LISTA) VALUES ( '1040108', 'Extra', 'Mango', '350 ml', 'Lata', 3.56);


INSERT INTO tb_producto 
VALUES ( '1040109', 'normal', 'Fresa', '350 ml', 'Lata', 4.56),
( '1040110', 'Light', 'Naranja', '450 ml', 'Botella', 5.56),
( '1040111', 'normal', 'Uvas', '450 ml', 'Botella', 5.56);

SELECT * FROM tb_producto;