DELIMITER $$
CREATE PROCEDURE `evaluacion_facturas`(vfecha DATE)
BEGIN
DECLARE mensaje VARCHAR(50);
DECLARE N_FACTURAS INTEGER;
SELECT COUNT(*) INTO N_FACTURAS FROM facturas WHERE
FECHA_VENTA = vfecha;
IF N_FACTURAS > 70
THEN SET mensaje = 'Muchas facturas' ;
ELSE SET mensaje = 'Pocas facturas' ;
END IF;
SELECT mensaje;
END $$