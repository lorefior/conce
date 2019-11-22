CREATE SCHEMA `concesionaria` ;

CREATE TABLE `concesionaria`.`vehiculo` (
  `idvehiculo` INT NOT NULL AUTO_INCREMENT,
  `marca` VARCHAR(25) NULL,
  `modelo` VARCHAR(25) NULL,
  `color` VARCHAR(25) NULL,
  `precio` INT NULL,
  PRIMARY KEY (`idvehiculo`));
  
  CREATE TABLE `concesionaria`.`usuario` (
  `idusuario` INT NOT NULL AUTO_INCREMENT,
  `nik` VARCHAR(25) unique NULL,
  `password` VARCHAR(25) NULL,
  `nombre` VARCHAR(25) NULL,
  `apellido` VARCHAR(25) NULL,
  `edad` INT NULL,
  PRIMARY KEY (`idusuario`));
  
  INSERT INTO `concesionaria`.`vehiculo` ( `idvehiculo`, `marca`, `modelo`,`color`,`precio`) 
values (4,'citroen','ds4','rojo,blanco',950000);