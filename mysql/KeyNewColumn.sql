ALTER TABLE TBCLIENTES ADD PRIMARY KEY(DNI);

ALTER TABLE TBCLIENTES ADD COLUMN(FECHA_NACIMIENTO DATE);

INSERT INTO TBCLIENTES(
DNI,
NOMBRE,
DIRECCION1, 
DIRECCION2, 
BARRIO,
CIUDAD,
ESTADO,
CP,
EDAD,
SEXO, 
LIMITE_CREDITO,
VOLUMEN_COMPRA, 
PRIMERA_COMPRA,
FECHA_NACIMIENTO) VALUES(
'456879548', 'Pedro el Escamoso', 'Calle del Sol, 25', '', 'Los Laureles', 'CDMX', 'México', '65784', 55, 'M',
1000000, 2000, 0, '1976-05-25');

