create table producto (
id INT AUTO_INCREMENT,
nombre VARCHAR(50) NOT NULL,
descripcion VARCHAR(255),
cantidad INT NOT NULL DEFAULT 0,
PRIMARY KEY(id)
)Engine=InnoDB;
