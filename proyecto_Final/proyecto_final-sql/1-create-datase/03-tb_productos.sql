CREATE TABLE productos(
  CODIGO VARCHAR(10) NOT NULL,
  DESCRIPCION VARCHAR(100),
  SABOR VARCHAR(50),
  TAMANO VARCHAR(50),
  ENVASE VARCHAR(50),
  PRECIO FLOAT,
  PRIMARY KEY(CODIGO)
);