DROP TABLE TABLA_DE_VENDEDORES;

CREATE TABLE TABLA_DE_VENDEDORES
( MATRICULA varchar(5),
NOMBRE varchar(100),
PORCENTAJE_COMISION float,
FECHA_ADMISION date,
DE_VACACIONES bit);

ALTER TABLE TABLA_DE_VENDEDORES ADD PRIMARY KEY (MATRICULA);

INSERT INTO TABLA_DE_VENDEDORES
(MATRICULA, NOMBRE, FECHA_ADMISION, PORCENTAJE_COMISION, DE_VACACIONES) VALUES ('00235','Márcio Almeida Silva','2014-08-15',0.08,0);

INSERT INTO TABLA_DE_VENDEDORES
(MATRICULA, NOMBRE, FECHA_ADMISION, PORCENTAJE_COMISION, DE_VACACIONES) VALUES ('00236','Cláudia Morais','2013-09-17',0.08,1);

INSERT INTO TABLA_DE_VENDEDORES
(MATRICULA, NOMBRE, FECHA_ADMISION, PORCENTAJE_COMISION, DE_VACACIONES) VALUES ('00238','Pericles Alves','2016-08-21',0.11,0);
