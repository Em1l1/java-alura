-- MySQL Script generated by MySQL Workbench
-- Mon 20 Mar 2023 02:02:04 AM CST
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema ventas_jugos
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema ventas_jugos
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `ventas_jugos` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci ;
USE `ventas_jugos` ;

-- -----------------------------------------------------
-- Table `ventas_jugos`.`tb_cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ventas_jugos`.`tb_cliente` (
  `DNI` VARCHAR(11) NOT NULL,
  `NOMBRE` VARCHAR(100) NULL DEFAULT NULL,
  `DIRECCION` VARCHAR(150) NULL DEFAULT NULL,
  `BARRIO` VARCHAR(50) NULL DEFAULT NULL,
  `CIUDAD` VARCHAR(50) NULL DEFAULT NULL,
  `ESTADO` VARCHAR(45) NULL DEFAULT NULL,
  `CP` VARCHAR(8) NULL DEFAULT NULL,
  `FECHA_NACIMIENTO` DATE NULL DEFAULT NULL,
  `EDAD` INT(2) NULL DEFAULT NULL,
  `SEXO` VARCHAR(1) NULL DEFAULT NULL,
  `LIMITE_CREDITO` FLOAT NULL DEFAULT NULL,
  `VOLUMEN_COMPRA` FLOAT NULL DEFAULT NULL,
  `PRIMERA_COMPRA` BIT(1) NULL DEFAULT NULL,
  PRIMARY KEY (`DNI`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_unicode_ci;


-- -----------------------------------------------------
-- Table `ventas_jugos`.`tb_vendedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ventas_jugos`.`tb_vendedor` (
  `MATRICULA` VARCHAR(5) NOT NULL,
  `NOMBRE` VARCHAR(100) NULL DEFAULT NULL,
  `BARRIO` VARCHAR(50) NULL DEFAULT NULL,
  `COMISION` FLOAT NULL DEFAULT NULL,
  `FECHA_ADMISION` DATE NULL DEFAULT NULL,
  `DE_VACACIONES` BIT(1) NULL DEFAULT NULL,
  PRIMARY KEY (`MATRICULA`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_unicode_ci;


-- -----------------------------------------------------
-- Table `ventas_jugos`.`tb_factura`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ventas_jugos`.`tb_factura` (
  `NUMERO` VARCHAR(5) NOT NULL,
  `FECHA` DATE NULL DEFAULT NULL,
  `DNI` VARCHAR(11) NOT NULL,
  `MATRICULA` VARCHAR(5) NOT NULL,
  `IMPUESTO` FLOAT NULL DEFAULT NULL,
  PRIMARY KEY (`NUMERO`),
  INDEX `FK_CLIENTE` (`DNI` ASC) VISIBLE,
  INDEX `FK_VENDEDOR` (`MATRICULA` ASC) VISIBLE,
  CONSTRAINT `FK_CLIENTE`
    FOREIGN KEY (`DNI`)
    REFERENCES `ventas_jugos`.`tb_cliente` (`DNI`),
  CONSTRAINT `FK_VENDEDOR`
    FOREIGN KEY (`MATRICULA`)
    REFERENCES `ventas_jugos`.`tb_vendedor` (`MATRICULA`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_unicode_ci;


-- -----------------------------------------------------
-- Table `ventas_jugos`.`tb_producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ventas_jugos`.`tb_producto` (
  `CODIGO` VARCHAR(10) NOT NULL,
  `DESCRIPCION` VARCHAR(100) NULL DEFAULT NULL,
  `SABOR` VARCHAR(50) NULL DEFAULT NULL,
  `TAMANO` VARCHAR(50) NULL DEFAULT NULL,
  `ENVASE` VARCHAR(50) NULL DEFAULT NULL,
  `PRECIO_LISTA` FLOAT NULL DEFAULT NULL,
  PRIMARY KEY (`CODIGO`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_unicode_ci;


-- -----------------------------------------------------
-- Table `ventas_jugos`.`tb_items_facturas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ventas_jugos`.`tb_items_facturas` (
  `NUMERO` VARCHAR(5) NOT NULL,
  `CODIGO` VARCHAR(10) NOT NULL,
  `CANTIDAD` INT(11) NULL DEFAULT NULL,
  `PRECIO` FLOAT NULL DEFAULT NULL,
  PRIMARY KEY (`NUMERO`, `CODIGO`),
  INDEX `FK_PRODUCTO` (`CODIGO` ASC) VISIBLE,
  CONSTRAINT `FK_FACTURA`
    FOREIGN KEY (`NUMERO`)
    REFERENCES `ventas_jugos`.`tb_factura` (`NUMERO`),
  CONSTRAINT `FK_PRODUCTO`
    FOREIGN KEY (`CODIGO`)
    REFERENCES `ventas_jugos`.`tb_producto` (`CODIGO`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_unicode_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
