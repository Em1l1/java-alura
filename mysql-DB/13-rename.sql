USE ventas_jugos;

ALTER TABLE tb_venta RENAME tb_facturas;

ALTER TABLE tb_facturas RENAME tb_factura;

ALTER TABLE facturas RENAME tb_factura;

-- ALTER TABLE cliente RENAME tb_cliente;

ALTER TABLE items_facturas RENAME tb_items_facturas;

SHOW TABLES;