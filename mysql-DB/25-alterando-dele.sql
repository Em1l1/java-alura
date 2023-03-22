SELECT * FROM tb_producto2;

INSET INTO tb_producto2
SELECT * FROM tb_producto;

UPDATE tb_producto2 SET PRECIO_LISTA = PRECIO_LISTA* 1.15;

DELETE FROM tb_producto2;