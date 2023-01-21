SELECT * FROM tbproducto;

-- Filtro y Registros/campos que son necesarios
SELECT * FROM tbproducto WHERE SABOR = "Naranja";

SELECT * FROM tbproducto WHERE ENVASE = "Botella PET";

-- Update/Cambios | incluye llave primaria

UPDATE tbproducto SET SABOR = "Citrico" WHERE SABOR = "Naranja";