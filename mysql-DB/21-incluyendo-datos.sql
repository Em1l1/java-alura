SELECT * FROM tb_producto;


-- update
UPDATE tb_producto SET PRECIO_LISTA=20 WHERE CODIGO = '1040107';

UPDATE tb_producto SET DESCRIPCION= 'Sabor de la Montana Mango', TAMANO= '2 litros', ENVASE= 'Botella Vidrio', PRECIO_LISTA=10 WHERE CODIGO = '1040108';

SELECT * FROM tb_cliente;
UPDATE tb_cliente SET VOLUMEN_COMPRA = VOLUMEN_COMPRA/10;



UPDATE tb_clientes SET 
DIRECCION = 'Jorge Emilio 23',
BARRIO = 'San Antonio',
CIUDAD = 'Guadalajara',
ESTADO = 'JC',
CEP = '44700000'
WHERE DNI = '5840119709'