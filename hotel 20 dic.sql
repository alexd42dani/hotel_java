/*
SQLyog Ultimate v9.63 
MySQL - 5.7.23 : Database - hotel
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`hotel` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `hotel_java`;

/*Table structure for table `apertura_cierre` */

DROP TABLE IF EXISTS `apertura_cierre`;

CREATE TABLE `apertura_cierre` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `caja_id` int(11) NOT NULL,
  `fecha_apertura` date DEFAULT NULL,
  `hora_apertura` varchar(5) DEFAULT NULL,
  `fecha_cierre` date DEFAULT NULL,
  `hora_cierre` varchar(5) DEFAULT NULL,
  `saldo_inicial` varchar(45) DEFAULT NULL,
  `saldo_final` varchar(45) DEFAULT NULL,
  `usuario_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_apertura_cierre_caja1_idx` (`caja_id`),
  KEY `fk_apertura_cierre_personal1_idx` (`usuario_id`),
  CONSTRAINT `fk_apertura_cierre_caja1` FOREIGN KEY (`caja_id`) REFERENCES `caja` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_apertura_cierre_usuario` FOREIGN KEY (`usuario_id`) REFERENCES `usuarios` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

/*Data for the table `apertura_cierre` */

insert  into `apertura_cierre`(`id`,`caja_id`,`fecha_apertura`,`hora_apertura`,`fecha_cierre`,`hora_cierre`,`saldo_inicial`,`saldo_final`,`usuario_id`) values (6,1,'2018-12-13','09:53','2018-12-15','02:30','1000000','1797090',1),(7,5,'2018-12-16','12:11','2018-12-16','12:15','500000','845817',1),(8,4,'2018-12-16','12:36','2018-12-16','12:37','400000','745817',1),(9,2,'2018-12-17','11:52','2018-12-20','12:00','500000','500000',1),(10,5,'2018-12-20','12:01','2018-12-20','12:03','100000','776363',1);

/*Table structure for table `caja` */

DROP TABLE IF EXISTS `caja`;

CREATE TABLE `caja` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `caja` */

insert  into `caja`(`id`,`descripcion`) values (1,'Caja 1'),(2,'Caja 2'),(3,'Caja 3'),(4,'Caja 4'),(5,'Caja 5');

/*Table structure for table `cama` */

DROP TABLE IF EXISTS `cama`;

CREATE TABLE `cama` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) DEFAULT NULL,
  `capacidad` int(11) DEFAULT NULL,
  `precio` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

/*Data for the table `cama` */

insert  into `cama`(`id`,`descripcion`,`capacidad`,`precio`) values (1,'Cama Doble',2,20000),(2,'Cama Francesa',2,20000),(3,'Cama Individual',1,20000),(4,'Cama Queen Size',2,20000),(5,'Cama King Size',2,20000),(6,'Cama Matrimonial',2,20000),(7,'Cama Supletoria',1,20000),(8,'Cuna',1,20000),(9,'Cama Matrimonial Amplia',2,20000);

/*Table structure for table `caracteristicas` */

DROP TABLE IF EXISTS `caracteristicas`;

CREATE TABLE `caracteristicas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;

/*Data for the table `caracteristicas` */

insert  into `caracteristicas`(`id`,`descripcion`) values (1,'Heladera'),(4,'TV'),(6,'Caja Fuerte'),(8,'A/C'),(9,'Cafetera y tetera'),(10,'Telefono'),(11,'Baño'),(12,'Salon'),(13,'Hall'),(14,'Cocina'),(15,'Mobiliario estandar'),(16,'Mobiliario medio'),(17,'Mobiliario Deluxe'),(18,'Jacuzzi');

/*Table structure for table `cargo` */

DROP TABLE IF EXISTS `cargo`;

CREATE TABLE `cargo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) DEFAULT NULL,
  `departamento` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `cargo` */

insert  into `cargo`(`id`,`descripcion`,`departamento`) values (1,'Recepcionista','Recepcion'),(2,'Gerente de Reservas','Alojamiento y Reservas'),(3,'Gerente de Alojamiento','Alojamiento y Reservas'),(4,'Camarera de Pisos','Cocina'),(5,'Limpiadora','Limpieza'),(6,'Administrador de Sistema','informatica');

/*Table structure for table `ciudad` */

DROP TABLE IF EXISTS `ciudad`;

CREATE TABLE `ciudad` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(100) NOT NULL DEFAULT '',
  `idDepartamento` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idPais` (`idDepartamento`),
  CONSTRAINT `ciudad_ibfk_1` FOREIGN KEY (`idDepartamento`) REFERENCES `departamento` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

/*Data for the table `ciudad` */

insert  into `ciudad`(`id`,`descripcion`,`idDepartamento`) values (1,'Asuncion',1),(2,'San Lorenzo',1),(3,'New York',2),(4,'Buenos Aires',3),(5,'San Pablo',4),(6,'Washintong Dc',6),(7,'Brasilia',5),(9,'Barcelona',7),(10,'Ciudad del Este',8),(11,'Hernandarias',8);

/*Table structure for table `cobro_cheque` */

DROP TABLE IF EXISTS `cobro_cheque`;

CREATE TABLE `cobro_cheque` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cobrosid` int(11) DEFAULT NULL,
  `identidad` int(11) DEFAULT NULL,
  `numero` int(50) DEFAULT NULL,
  `emision` date DEFAULT NULL,
  `vencimiento` date DEFAULT NULL,
  `monto` int(50) DEFAULT NULL,
  `titular` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cobrosid` (`cobrosid`),
  KEY `identidad` (`identidad`),
  CONSTRAINT `cheque_ibfk_1` FOREIGN KEY (`cobrosid`) REFERENCES `cobros` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `cheque_ibfk_2` FOREIGN KEY (`identidad`) REFERENCES `entidad` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `cobro_cheque` */

insert  into `cobro_cheque`(`id`,`cobrosid`,`identidad`,`numero`,`emision`,`vencimiento`,`monto`,`titular`) values (1,8,4,656565,'2018-12-01','2018-12-13',200000,'Luisa Fariña'),(2,6,5,6565,'2018-12-02','2018-12-17',50000,'Andrea Gonzalez'),(3,9,3,545,'2018-11-26','2018-12-17',5454,'dsfsd'),(4,10,2,12121,'2018-12-01','2018-12-19',500000,'karla');

/*Table structure for table `cobro_efectivo` */

DROP TABLE IF EXISTS `cobro_efectivo`;

CREATE TABLE `cobro_efectivo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `monto` int(11) DEFAULT NULL,
  `cobrosid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cobrosid` (`cobrosid`),
  CONSTRAINT `cobro_efectivo_ibfk_1` FOREIGN KEY (`cobrosid`) REFERENCES `cobros` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

/*Data for the table `cobro_efectivo` */

insert  into `cobro_efectivo`(`id`,`monto`,`cobrosid`) values (4,400000,6),(5,67090,7),(6,45817,8),(7,45817,9),(8,76363,10);

/*Table structure for table `cobro_tarjeta` */

DROP TABLE IF EXISTS `cobro_tarjeta`;

CREATE TABLE `cobro_tarjeta` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cobrosid` int(11) DEFAULT NULL,
  `monto` int(50) DEFAULT NULL,
  `ticket` int(50) DEFAULT NULL,
  `entidad_id` int(11) NOT NULL,
  `tipo_tarjeta_id` int(11) NOT NULL,
  `marca_tarjeta_id` int(11) NOT NULL,
  `serie` int(40) DEFAULT NULL,
  `procesadora_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `cobrosid` (`cobrosid`),
  KEY `cobro_fk_tipo` (`tipo_tarjeta_id`),
  KEY `cobro_fk_marca` (`marca_tarjeta_id`),
  KEY `cobro_fk_entidad` (`entidad_id`),
  KEY `cobro_fk_procesa` (`procesadora_id`),
  CONSTRAINT `cobro_fk_entidad` FOREIGN KEY (`entidad_id`) REFERENCES `entidad` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `cobro_fk_marca` FOREIGN KEY (`marca_tarjeta_id`) REFERENCES `marca_tarjeta` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `cobro_fk_procesa` FOREIGN KEY (`procesadora_id`) REFERENCES `procesadora` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `cobro_fk_tipo` FOREIGN KEY (`tipo_tarjeta_id`) REFERENCES `tipo_tarjeta` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `tarjetas_ibfk_4` FOREIGN KEY (`cobrosid`) REFERENCES `cobros` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

/*Data for the table `cobro_tarjeta` */

insert  into `cobro_tarjeta`(`id`,`cobrosid`,`monto`,`ticket`,`entidad_id`,`tipo_tarjeta_id`,`marca_tarjeta_id`,`serie`,`procesadora_id`) values (6,7,330000,656,1,1,1,565,1),(7,8,100000,8888822,3,1,1,565656,4),(8,9,150000,454545,3,1,2,545454,1),(9,9,150000,454545,5,2,3,545454,3),(10,10,100000,65465,1,1,1,5454,1);

/*Table structure for table `cobros` */

DROP TABLE IF EXISTS `cobros`;

CREATE TABLE `cobros` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` date DEFAULT NULL,
  `cuentas_a_cobrar_id` int(11) NOT NULL,
  `apertura_cierre_id` int(11) NOT NULL,
  `usuario_id` int(11) NOT NULL,
  `estado` char(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_cobros_cuentas_a_cobrar1_idx` (`cuentas_a_cobrar_id`),
  KEY `fk_cobros_caja1_idx` (`apertura_cierre_id`),
  KEY `fk_cobros_usuario` (`usuario_id`),
  CONSTRAINT `fk_cobros_apertura_cierre` FOREIGN KEY (`apertura_cierre_id`) REFERENCES `apertura_cierre` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_cobros_cuentas_a_cobrar1` FOREIGN KEY (`cuentas_a_cobrar_id`) REFERENCES `cuentas_a_cobrar` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_cobros_usuario` FOREIGN KEY (`usuario_id`) REFERENCES `usuarios` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

/*Data for the table `cobros` */

insert  into `cobros`(`id`,`fecha`,`cuentas_a_cobrar_id`,`apertura_cierre_id`,`usuario_id`,`estado`) values (6,'2018-12-13',33,6,1,'P'),(7,'2018-12-13',33,6,1,'A'),(8,'2018-12-16',36,7,1,'A'),(9,'2018-12-16',37,8,1,'A'),(10,'2018-12-20',38,10,1,'A');

/*Table structure for table `cuentas_a_cobrar` */

DROP TABLE IF EXISTS `cuentas_a_cobrar`;

CREATE TABLE `cuentas_a_cobrar` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `factura_id` int(11) NOT NULL,
  `cantidad_cuotas` int(11) DEFAULT NULL,
  `nro_cuota` int(11) DEFAULT NULL,
  `estado` char(1) DEFAULT NULL,
  `fecha_a_pagar` date DEFAULT NULL,
  `monto` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_cuentas_a_cobrar_factura1_idx` (`factura_id`),
  CONSTRAINT `fk_cuentas_a_cobrar_factura1` FOREIGN KEY (`factura_id`) REFERENCES `factura` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=latin1;

/*Data for the table `cuentas_a_cobrar` */

insert  into `cuentas_a_cobrar`(`id`,`factura_id`,`cantidad_cuotas`,`nro_cuota`,`estado`,`fecha_a_pagar`,`monto`) values (33,19,1,1,'P','2019-01-13',397090),(36,24,2,1,'P','2019-01-15',345817),(37,24,2,2,'P','2019-02-15',345817),(38,25,1,1,'P','2019-01-20',676363);

/*Table structure for table `cuentas_a_cobrar_detalle` */

DROP TABLE IF EXISTS `cuentas_a_cobrar_detalle`;

CREATE TABLE `cuentas_a_cobrar_detalle` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `c_a_cobrar_id` int(11) NOT NULL,
  `interes_por_mora` int(3) DEFAULT NULL,
  `dias_de_gracia` int(3) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_cuentas_a_cobrar_detalle` (`c_a_cobrar_id`),
  CONSTRAINT `fk_cuentas_a_cobrar_detalle` FOREIGN KEY (`c_a_cobrar_id`) REFERENCES `cuentas_a_cobrar` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cuentas_a_cobrar_detalle` */

/*Table structure for table `departamento` */

DROP TABLE IF EXISTS `departamento`;

CREATE TABLE `departamento` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) DEFAULT NULL,
  `idPais` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `pk_departamento_pais` (`idPais`),
  CONSTRAINT `pk_departamento_pais` FOREIGN KEY (`idPais`) REFERENCES `pais` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

/*Data for the table `departamento` */

insert  into `departamento`(`id`,`descripcion`,`idPais`) values (1,'Central',1),(2,'New york',4),(3,'Buenos aires',3),(4,'Sao Paulo',2),(5,'Distrito Federal',2),(6,'Distrito Federal',4),(7,'Barcelona',5),(8,'Alto Parana',1);

/*Table structure for table `empleado` */

DROP TABLE IF EXISTS `empleado`;

CREATE TABLE `empleado` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cargo_id` int(11) DEFAULT NULL,
  `persona_id` int(11) DEFAULT NULL,
  `codigo_empleado` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_empleado_cargo` (`cargo_id`),
  KEY `fk_empleado_persona` (`persona_id`),
  CONSTRAINT `fk_empleado_cargo` FOREIGN KEY (`cargo_id`) REFERENCES `cargo` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_empleado_persona` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `empleado` */

insert  into `empleado`(`id`,`cargo_id`,`persona_id`,`codigo_empleado`) values (1,1,2,'E01'),(2,4,4,'E02'),(3,5,5,'E03'),(4,6,1,'E04');

/*Table structure for table `entidad` */

DROP TABLE IF EXISTS `entidad`;

CREATE TABLE `entidad` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Descripcion` varchar(100) DEFAULT NULL,
  `Tipo` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

/*Data for the table `entidad` */

insert  into `entidad`(`id`,`Descripcion`,`Tipo`) values (1,'Medalla Milagrosa','Cooperativa'),(2,'Prestamos S.A.','Prestamo'),(3,'Itau','Banco'),(4,'HSBC','Banco'),(5,'San Cristobal','Cooperativa'),(6,'Bancard','Banco'),(7,'Stock','Supermercado'),(8,'Continental','Banco'),(9,'Banco Central','Banco');

/*Table structure for table `estadia` */

DROP TABLE IF EXISTS `estadia`;

CREATE TABLE `estadia` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_operador` int(11) DEFAULT NULL,
  `comentarios` varchar(100) DEFAULT NULL,
  `precio` int(30) DEFAULT NULL,
  `estado` char(2) DEFAULT 'A',
  `tipo_cliente_id` int(11) NOT NULL,
  `usuario_id` int(11) NOT NULL,
  `Tipo_estadia_id` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_operador` (`id_operador`),
  KEY `fk_estadia_tipo_cliente1_idx` (`tipo_cliente_id`),
  KEY `fk_estadia_personal1_idx` (`usuario_id`),
  KEY `fk_estadia_Tipo_estadia1_idx` (`Tipo_estadia_id`),
  CONSTRAINT `estadia_ibfk_4` FOREIGN KEY (`id_operador`) REFERENCES `operador_turistico` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_estadia_Tipo_estadia1` FOREIGN KEY (`Tipo_estadia_id`) REFERENCES `tipo_estadia` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_estadia_tipo_cliente1` FOREIGN KEY (`tipo_cliente_id`) REFERENCES `tipo_cliente` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_estadia_usuario1` FOREIGN KEY (`usuario_id`) REFERENCES `usuarios` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `estadia` */

insert  into `estadia`(`id`,`id_operador`,`comentarios`,`precio`,`estado`,`tipo_cliente_id`,`usuario_id`,`Tipo_estadia_id`,`fecha`) values (1,1,'asdf',500000,'A',1,1,1,'2018-11-27'),(4,3,'ninguno',264000,'A',2,1,1,'2018-12-13'),(5,5,'sin comentario',10000,'A',1,1,1,'2018-12-15'),(6,3,'reserva ',600000,'I',6,1,1,'2018-12-19');

/*Table structure for table `estadia_extension` */

DROP TABLE IF EXISTS `estadia_extension`;

CREATE TABLE `estadia_extension` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_estadia` int(11) DEFAULT NULL,
  `id_habitacion` int(11) DEFAULT NULL,
  `salida` datetime DEFAULT NULL,
  `precio` int(30) DEFAULT NULL,
  `estado` char(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_estadia` (`id_estadia`),
  KEY `id_habitacion` (`id_habitacion`),
  CONSTRAINT `estadia_extension_ibfk_1` FOREIGN KEY (`id_estadia`) REFERENCES `estadia` (`id`),
  CONSTRAINT `estadia_extension_ibfk_2` FOREIGN KEY (`id_habitacion`) REFERENCES `habitaciones` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `estadia_extension` */

/*Table structure for table `estadia_hab_cambio` */

DROP TABLE IF EXISTS `estadia_hab_cambio`;

CREATE TABLE `estadia_hab_cambio` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_estadia` int(11) DEFAULT NULL,
  `id_hab_anterior` int(11) DEFAULT NULL,
  `id_habitacion` int(11) DEFAULT NULL,
  `comentarios` varchar(250) DEFAULT '',
  `estado` char(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_estadia` (`id_estadia`),
  KEY `id_hab_anterior` (`id_hab_anterior`),
  KEY `id_habitacion` (`id_habitacion`),
  CONSTRAINT `estadia_hab_cambio_ibfk_1` FOREIGN KEY (`id_estadia`) REFERENCES `estadia` (`id`),
  CONSTRAINT `estadia_hab_cambio_ibfk_2` FOREIGN KEY (`id_hab_anterior`) REFERENCES `habitaciones` (`id`),
  CONSTRAINT `estadia_hab_cambio_ibfk_3` FOREIGN KEY (`id_habitacion`) REFERENCES `habitaciones` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `estadia_hab_cambio` */

/*Table structure for table `estadia_habitaciones` */

DROP TABLE IF EXISTS `estadia_habitaciones`;

CREATE TABLE `estadia_habitaciones` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_estadia` int(11) DEFAULT NULL,
  `id_habitacion` int(11) DEFAULT NULL,
  `entrada` date DEFAULT NULL,
  `salida` date DEFAULT NULL,
  `hora_entrada` varchar(5) DEFAULT NULL,
  `hora_salida` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_estadia` (`id_estadia`),
  KEY `id_habitacion` (`id_habitacion`),
  CONSTRAINT `estadia_habitaciones_ibfk_1` FOREIGN KEY (`id_estadia`) REFERENCES `estadia` (`id`),
  CONSTRAINT `estadia_habitaciones_ibfk_2` FOREIGN KEY (`id_habitacion`) REFERENCES `habitaciones` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `estadia_habitaciones` */

insert  into `estadia_habitaciones`(`id`,`id_estadia`,`id_habitacion`,`entrada`,`salida`,`hora_entrada`,`hora_salida`) values (4,4,3,'2018-12-13','2018-12-16','14:00','18:00'),(5,5,9,'2018-12-13','2018-12-15','13:55','15:59'),(6,6,2,'2018-12-02','2018-12-14','12:50','12:50');

/*Table structure for table `estadia_huespedes` */

DROP TABLE IF EXISTS `estadia_huespedes`;

CREATE TABLE `estadia_huespedes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_estadia` int(11) DEFAULT NULL,
  `huespedes_id` int(11) NOT NULL,
  `habitacion_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_estadia` (`id_estadia`),
  KEY `fk_estadia_huesped_huespedes1_idx` (`huespedes_id`),
  KEY `fk_estadia_habitacion_id` (`habitacion_id`),
  CONSTRAINT `estadia_huesped_ibfk_1` FOREIGN KEY (`id_estadia`) REFERENCES `estadia` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_estadia_habitacion_id` FOREIGN KEY (`habitacion_id`) REFERENCES `habitaciones` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_estadia_huesped_huespedes1` FOREIGN KEY (`huespedes_id`) REFERENCES `huespedes` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `estadia_huespedes` */

insert  into `estadia_huespedes`(`id`,`id_estadia`,`huespedes_id`,`habitacion_id`) values (4,4,4,3),(5,5,5,9),(6,6,6,2);

/*Table structure for table `estadia_reserva` */

DROP TABLE IF EXISTS `estadia_reserva`;

CREATE TABLE `estadia_reserva` (
  `reservas_id` int(11) NOT NULL,
  `estadia_id` int(11) NOT NULL,
  PRIMARY KEY (`reservas_id`,`estadia_id`),
  KEY `fk_table1_reservas1_idx` (`reservas_id`),
  KEY `fk_reserva?estadia_estadia1_idx` (`estadia_id`),
  CONSTRAINT `fk_reserva?estadia_estadia1` FOREIGN KEY (`estadia_id`) REFERENCES `estadia` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_table1_reservas1` FOREIGN KEY (`reservas_id`) REFERENCES `reservas` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `estadia_reserva` */

insert  into `estadia_reserva`(`reservas_id`,`estadia_id`) values (11,6);

/*Table structure for table `estadia_servicios` */

DROP TABLE IF EXISTS `estadia_servicios`;

CREATE TABLE `estadia_servicios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `estadia_id` int(11) NOT NULL,
  `servicios_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_esta_ser_estadia` (`estadia_id`),
  KEY `fk_esta_ser_servicios` (`servicios_id`),
  CONSTRAINT `fk_esta_ser_estadia` FOREIGN KEY (`estadia_id`) REFERENCES `estadia` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_esta_ser_servicios` FOREIGN KEY (`servicios_id`) REFERENCES `servicios` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

/*Data for the table `estadia_servicios` */

insert  into `estadia_servicios`(`id`,`estadia_id`,`servicios_id`) values (7,4,30),(8,5,31),(9,5,32),(10,6,33),(11,6,34);

/*Table structure for table `estadia_tarifas` */

DROP TABLE IF EXISTS `estadia_tarifas`;

CREATE TABLE `estadia_tarifas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `estadia_id` int(11) NOT NULL,
  `tarifa_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_esta_tari_fk` (`estadia_id`),
  KEY `fk_esta_tari_tar_fk` (`tarifa_id`),
  CONSTRAINT `fk_esta_tari_fk` FOREIGN KEY (`estadia_id`) REFERENCES `estadia` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_esta_tari_tar_fk` FOREIGN KEY (`tarifa_id`) REFERENCES `tarifas` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

/*Data for the table `estadia_tarifas` */

insert  into `estadia_tarifas`(`id`,`estadia_id`,`tarifa_id`) values (5,4,5),(6,5,2),(8,6,1);

/*Table structure for table `factura` */

DROP TABLE IF EXISTS `factura`;

CREATE TABLE `factura` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` date DEFAULT NULL,
  `tipo_factura` varchar(45) DEFAULT NULL,
  `estado` char(1) DEFAULT NULL,
  `numero_id` int(11) NOT NULL,
  `huesped_id` int(11) NOT NULL,
  `ruc` varchar(20) DEFAULT NULL,
  `nro_factura` varchar(40) DEFAULT NULL,
  `can_cuo` int(2) DEFAULT NULL,
  `precio` int(40) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_huesped_cliente` (`huesped_id`),
  KEY `fk_factura_nro` (`numero_id`),
  CONSTRAINT `fk_factura_nro` FOREIGN KEY (`numero_id`) REFERENCES `nro_documento` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_huesped_cliente` FOREIGN KEY (`huesped_id`) REFERENCES `huespedes` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=latin1;

/*Data for the table `factura` */

insert  into `factura`(`id`,`fecha`,`tipo_factura`,`estado`,`numero_id`,`huesped_id`,`ruc`,`nro_factura`,`can_cuo`,`precio`) values (19,'2018-12-13','CONTADO','A',1,4,'453453456','001-002-0000012',1,397090),(24,'2018-12-15','CREDITO','A',1,5,'56555415-1','001-002-0000014',2,691635),(25,'2018-12-19','CREDITO','A',1,6,'5411222-2','011-022-0000021',1,676363);

/*Table structure for table `factura_detalle` */

DROP TABLE IF EXISTS `factura_detalle`;

CREATE TABLE `factura_detalle` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `factura_id` int(11) NOT NULL,
  `estadia_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_factura_detalle_factura1_idx` (`factura_id`),
  KEY `fk_factura_detalle_estadia` (`estadia_id`),
  CONSTRAINT `fk_factura_detalle_estadia` FOREIGN KEY (`estadia_id`) REFERENCES `estadia` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_factura_detalle_factura1` FOREIGN KEY (`factura_id`) REFERENCES `factura` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

/*Data for the table `factura_detalle` */

insert  into `factura_detalle`(`id`,`factura_id`,`estadia_id`) values (4,19,4),(6,24,5),(7,25,6);

/*Table structure for table `factura_servicios` */

DROP TABLE IF EXISTS `factura_servicios`;

CREATE TABLE `factura_servicios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `factura_id` int(11) NOT NULL,
  `estadia_servicios_id` int(11) NOT NULL,
  `iva_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_fac_ser_factura` (`factura_id`),
  KEY `fk_fac_ser_estadia_servicios` (`estadia_servicios_id`),
  KEY `fk_fac_ser_iva` (`iva_id`),
  CONSTRAINT `fk_fac_ser_estadia_servicios` FOREIGN KEY (`estadia_servicios_id`) REFERENCES `estadia_servicios` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_fac_ser_factura` FOREIGN KEY (`factura_id`) REFERENCES `factura` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_fac_ser_iva` FOREIGN KEY (`iva_id`) REFERENCES `iva` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

/*Data for the table `factura_servicios` */

insert  into `factura_servicios`(`id`,`factura_id`,`estadia_servicios_id`,`iva_id`) values (7,19,7,2),(9,24,8,2),(10,24,9,2),(11,25,10,2),(12,25,11,2);

/*Table structure for table `factura_tarifas` */

DROP TABLE IF EXISTS `factura_tarifas`;

CREATE TABLE `factura_tarifas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `factura_id` int(11) NOT NULL,
  `tarifa_id` int(11) DEFAULT NULL,
  `iva_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_fac_tar_factura` (`factura_id`),
  KEY `fk_fac_tar_tarifas` (`tarifa_id`),
  KEY `fk_fac_tar_iva` (`iva_id`),
  CONSTRAINT `fk_fac_tar_factura` FOREIGN KEY (`factura_id`) REFERENCES `factura` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_fac_tar_iva` FOREIGN KEY (`iva_id`) REFERENCES `iva` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_fac_tar_tarifas` FOREIGN KEY (`tarifa_id`) REFERENCES `tarifas` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

/*Data for the table `factura_tarifas` */

insert  into `factura_tarifas`(`id`,`factura_id`,`tarifa_id`,`iva_id`) values (8,19,5,2),(10,24,2,2),(11,25,1,2);

/*Table structure for table `habitacion_camas` */

DROP TABLE IF EXISTS `habitacion_camas`;

CREATE TABLE `habitacion_camas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `habitacion_id` int(11) NOT NULL,
  `cama_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_habitacion_camas_cama` (`cama_id`),
  KEY `fk_habitacion_camas_habitaciones` (`habitacion_id`),
  CONSTRAINT `fk_habitacion_camas_cama` FOREIGN KEY (`cama_id`) REFERENCES `cama` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_habitacion_camas_habitaciones` FOREIGN KEY (`habitacion_id`) REFERENCES `habitaciones` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

/*Data for the table `habitacion_camas` */

insert  into `habitacion_camas`(`id`,`habitacion_id`,`cama_id`) values (1,2,3),(5,3,1),(6,4,2),(7,4,5);

/*Table structure for table `habitacion_caracteristicas` */

DROP TABLE IF EXISTS `habitacion_caracteristicas`;

CREATE TABLE `habitacion_caracteristicas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_caracteristicas` int(11) DEFAULT NULL,
  `id_habitacion` int(11) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_caracteristicas` (`id_caracteristicas`),
  KEY `id_habitacion` (`id_habitacion`),
  CONSTRAINT `habitacion_caracteristicas_ibfk_1` FOREIGN KEY (`id_caracteristicas`) REFERENCES `caracteristicas` (`id`),
  CONSTRAINT `habitacion_caracteristicas_ibfk_2` FOREIGN KEY (`id_habitacion`) REFERENCES `habitaciones` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;

/*Data for the table `habitacion_caracteristicas` */

insert  into `habitacion_caracteristicas`(`id`,`id_caracteristicas`,`id_habitacion`,`cantidad`) values (1,1,2,1),(2,4,2,1),(3,8,2,1),(4,15,2,1),(16,11,3,1),(17,8,3,1),(18,13,4,1);

/*Table structure for table `habitacion_estado` */

DROP TABLE IF EXISTS `habitacion_estado`;

CREATE TABLE `habitacion_estado` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `habitacion_estado` */

insert  into `habitacion_estado`(`id`,`descripcion`) values (1,'Ocupada'),(2,'Desocupada'),(3,'Falta Limpieza'),(4,'Fuera de orden');

/*Table structure for table `habitacion_nombres` */

DROP TABLE IF EXISTS `habitacion_nombres`;

CREATE TABLE `habitacion_nombres` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

/*Data for the table `habitacion_nombres` */

insert  into `habitacion_nombres`(`id`,`nombre`) values (1,'Habitacion Individual'),(2,'Habitacion Doble uso individual'),(3,'Habitacion Doble'),(4,'Junior Suite'),(5,'Suites'),(6,'Habitacion con Terraza'),(7,'Habitacion Aparte'),(8,'Estudio'),(9,'Moderado'),(10,'Superior'),(11,'Deluxe'),(12,'Habitacion Triple'),(13,'Habitacion Matrimonial'),(14,'Habitacion Familiar'),(15,'Suite Nupcial'),(16,'Habitacion Presidencial');

/*Table structure for table `habitaciones` */

DROP TABLE IF EXISTS `habitaciones`;

CREATE TABLE `habitaciones` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_id` int(11) DEFAULT NULL,
  `descripcion` varchar(40) DEFAULT NULL,
  `capacidad` int(11) DEFAULT NULL,
  `id_tipo_hab` int(11) NOT NULL,
  `id_ubicacion` int(11) NOT NULL,
  `precio` int(20) DEFAULT NULL,
  `estado_id` int(11) NOT NULL,
  `estado` char(4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_tipo_hab` (`id_tipo_hab`),
  KEY `id_ubicacion` (`id_ubicacion`),
  KEY `fk_habitaciones_nombre` (`nombre_id`),
  KEY `habitaciones_estado1` (`estado_id`),
  CONSTRAINT `fk_habitaciones_nombre` FOREIGN KEY (`nombre_id`) REFERENCES `habitacion_nombres` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `habitaciones_estado1` FOREIGN KEY (`estado_id`) REFERENCES `habitacion_estado` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `habitaciones_ibfk_1` FOREIGN KEY (`id_tipo_hab`) REFERENCES `tipos_habitacion` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `habitaciones_ibfk_2` FOREIGN KEY (`id_ubicacion`) REFERENCES `ubicaciones` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;

/*Data for the table `habitaciones` */

insert  into `habitaciones`(`id`,`nombre_id`,`descripcion`,`capacidad`,`id_tipo_hab`,`id_ubicacion`,`precio`,`estado_id`,`estado`) values (2,1,'H01',1,1,1,5555,1,'I'),(3,2,'H02',1,2,2,5555,1,'I'),(4,3,'H03',2,2,2,10000,1,'A'),(5,4,'H04',2,4,3,80000,1,'A'),(6,5,'H05',2,4,3,50000,1,'A'),(7,6,'H06',2,2,3,50000,1,'A'),(8,7,'H07',1,1,1,50000,1,'A'),(9,8,'H08',2,4,3,5555,1,'A'),(10,9,'H09',1,1,2,50000,1,'A'),(11,10,'H10',2,2,2,50000,1,'A'),(12,11,'H11',3,4,3,40000,1,'A'),(13,12,'H12',3,3,1,50000,1,'A'),(14,13,'H13',2,5,2,50000,1,'A'),(15,14,'H14',4,6,1,50000,1,'A'),(16,15,'H15',2,7,3,50000,1,'A'),(17,16,'H16',3,8,3,50000,1,'A');

/*Table structure for table `huespedes` */

DROP TABLE IF EXISTS `huespedes`;

CREATE TABLE `huespedes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `profesion` varchar(50) DEFAULT NULL,
  `persona_id` int(11) DEFAULT NULL,
  `estadia_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_huespedes_persona` (`persona_id`),
  KEY `fk_huespedes_estadia` (`estadia_id`),
  CONSTRAINT `fk_huespedes_estadia` FOREIGN KEY (`estadia_id`) REFERENCES `estadia` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_huespedes_persona` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `huespedes` */

insert  into `huespedes`(`id`,`profesion`,`persona_id`,`estadia_id`) values (1,'Abogada',3,1),(4,'',1,4),(5,'',4,5),(6,'',8,6);

/*Table structure for table `iva` */

DROP TABLE IF EXISTS `iva`;

CREATE TABLE `iva` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(10) DEFAULT NULL,
  `porcentaje` int(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `iva` */

insert  into `iva`(`id`,`descripcion`,`porcentaje`) values (1,'IVA 5%',5),(2,'IVA 10%',10);

/*Table structure for table `marca_tarjeta` */

DROP TABLE IF EXISTS `marca_tarjeta`;

CREATE TABLE `marca_tarjeta` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Descripcion` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `marca_tarjeta` */

insert  into `marca_tarjeta`(`id`,`Descripcion`) values (1,'Visa'),(2,'MasterCard'),(3,'American Spress'),(4,'PayPal');

/*Table structure for table `nota_credito` */

DROP TABLE IF EXISTS `nota_credito`;

CREATE TABLE `nota_credito` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `factura_id` int(11) NOT NULL,
  `numero` int(20) DEFAULT NULL,
  `motivo` varchar(100) DEFAULT NULL,
  `precio_total` int(11) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_nota_credito_factura1_idx` (`factura_id`),
  CONSTRAINT `fk_nota_credito_factura1` FOREIGN KEY (`factura_id`) REFERENCES `factura` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `nota_credito` */

/*Table structure for table `nota_credito_detalle` */

DROP TABLE IF EXISTS `nota_credito_detalle`;

CREATE TABLE `nota_credito_detalle` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nota_credito_id` int(11) NOT NULL,
  `factura_id` int(11) NOT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `iva_id` int(11) NOT NULL,
  `precio` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_nota_credito_detalle_nota_credito1_idx` (`nota_credito_id`),
  KEY `fk_nota_Credito_det_factura` (`factura_id`),
  KEY `fk_nota_Credito_det_iva` (`iva_id`),
  CONSTRAINT `fk_nota_Credito_det_factura` FOREIGN KEY (`factura_id`) REFERENCES `factura` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_nota_Credito_det_iva` FOREIGN KEY (`iva_id`) REFERENCES `iva` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_nota_credito_detalle_nota_credito1` FOREIGN KEY (`nota_credito_id`) REFERENCES `nota_credito` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `nota_credito_detalle` */

/*Table structure for table `nro_documento` */

DROP TABLE IF EXISTS `nro_documento`;

CREATE TABLE `nro_documento` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nro1` int(5) DEFAULT NULL,
  `nro2` int(5) DEFAULT NULL,
  `nro_desde` int(5) DEFAULT NULL,
  `nro_hasta` int(5) DEFAULT NULL,
  `nro_utilizado` int(5) DEFAULT NULL,
  `timbrado_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_nro_timb` (`timbrado_id`),
  CONSTRAINT `fk_nro_timb` FOREIGN KEY (`timbrado_id`) REFERENCES `timbrado` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `nro_documento` */

insert  into `nro_documento`(`id`,`nro1`,`nro2`,`nro_desde`,`nro_hasta`,`nro_utilizado`,`timbrado_id`) values (1,11,22,1,150,21,3);

/*Table structure for table `operador_turistico` */

DROP TABLE IF EXISTS `operador_turistico`;

CREATE TABLE `operador_turistico` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `operador_turistico` */

insert  into `operador_turistico`(`id`,`descripcion`) values (1,'DTP'),(2,'Terranova'),(3,'Martin Travel'),(4,'Terramar'),(5,'Sin Operador'),(6,'Otro');

/*Table structure for table `pais` */

DROP TABLE IF EXISTS `pais`;

CREATE TABLE `pais` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(100) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `pais` */

insert  into `pais`(`id`,`descripcion`) values (1,'Paraguay'),(2,'Brasil'),(3,'Argentina'),(4,'EE.UU'),(5,'España');

/*Table structure for table `persona` */

DROP TABLE IF EXISTS `persona`;

CREATE TABLE `persona` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tipo_documento` int(11) NOT NULL,
  `nro_documento` varchar(45) DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  `telefono` varchar(50) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `ciudad_id` int(11) NOT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_persona_ciudad` (`ciudad_id`),
  KEY `fk_persona_tipo_documento` (`tipo_documento`),
  CONSTRAINT `fk_persona_ciudad` FOREIGN KEY (`ciudad_id`) REFERENCES `ciudad` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_persona_tipo_documento` FOREIGN KEY (`tipo_documento`) REFERENCES `tipo_documento` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

/*Data for the table `persona` */

insert  into `persona`(`id`,`tipo_documento`,`nro_documento`,`nombre`,`apellido`,`telefono`,`email`,`ciudad_id`,`direccion`,`fecha_nacimiento`) values (1,1,'4200057','Alexander','Gonzalez','0981542157','alexander1234@hotmail.com',1,'Mcal lopez 5455','2018-10-06'),(2,1,'6541222','Maria','Raquel','898989','mari@gmail.com',2,'san lorenzo 656','2018-10-06'),(3,1,'4515477','Josefina','Gimenez','098214587','js@gmail.com',3,'lincon 4545','2018-10-11'),(4,1,'755562','Luisa','Fariña','5151515','lscc@yahoo.com',4,'morice 5475','2018-10-26'),(5,1,'665656','Pamela','Aquino','54545','pame@gmail.com',6,'lambare ctan bado 33232','2018-11-01'),(6,2,'45454','Lucia','Quiñonez','456456','ejemplo@ejemplo.com',6,'jirjeifie','1990-02-02'),(7,1,'4545225','Diego','Gonzalez','151522','dg6@gmail.com',1,'mbarete 5565','2003-12-01'),(8,1,'5124452','Karla','Montiel','0954222','ejemplo@ejemplo.com',7,'av brasilia','1990-11-22');

/*Table structure for table `procesadora` */

DROP TABLE IF EXISTS `procesadora`;

CREATE TABLE `procesadora` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `procesadora` */

insert  into `procesadora`(`id`,`descripcion`) values (1,'Procard'),(2,'Bancard'),(3,'Bepsa'),(4,'Cabal'),(5,'Cooperativa Universitaria');

/*Table structure for table `productos` */

DROP TABLE IF EXISTS `productos`;

CREATE TABLE `productos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `producto` varchar(45) DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `precio` int(20) DEFAULT NULL,
  `tipo_producto_id` int(11) NOT NULL,
  `unidad_medida_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_productos_tipo_prodcto` (`tipo_producto_id`),
  KEY `fk_productos_unidad` (`unidad_medida_id`),
  CONSTRAINT `fk_productos_tipo_prodcto` FOREIGN KEY (`tipo_producto_id`) REFERENCES `tipo_producto` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_productos_unidad` FOREIGN KEY (`unidad_medida_id`) REFERENCES `unidad_de_medida` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

/*Data for the table `productos` */

insert  into `productos`(`id`,`producto`,`descripcion`,`precio`,`tipo_producto_id`,`unidad_medida_id`) values (2,'Coca Cola 1L','Gaseosa',10000,3,1),(3,'Jugo de Naranja 1L','Jugo',12000,3,1),(4,'Arroz con carne','Almuerzo',30000,2,4),(5,'Caldo de pollo','Almuerzo',30000,2,4),(6,'Milanesa con Arroz','Almuerzo',30000,2,4),(7,'Sopa paraguaya','sopa',10000,4,4),(8,'Chipa','chipa',10000,4,4),(9,'Omelet','Desayuno',10000,2,4),(10,'Sandwich de jamon y queso','Desayuno',10000,2,4),(11,'Frutas','Desayuno',10000,2,4),(12,'Cafe con Leche','Desayuno',10000,3,4),(13,'Pan tostado','Desayuno',5000,2,4);

/*Table structure for table `reserva_habitaciones` */

DROP TABLE IF EXISTS `reserva_habitaciones`;

CREATE TABLE `reserva_habitaciones` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_reserva` int(11) DEFAULT NULL,
  `id_habitaciones` int(11) DEFAULT NULL,
  `entrada` date DEFAULT NULL,
  `salida` date DEFAULT NULL,
  `hora_entrada` varchar(5) DEFAULT NULL,
  `hora_salida` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_reserva` (`id_reserva`),
  KEY `id_habitaciones` (`id_habitaciones`),
  CONSTRAINT `reserva_habitaciones_ibfk_1` FOREIGN KEY (`id_reserva`) REFERENCES `reservas` (`id`),
  CONSTRAINT `reserva_habitaciones_ibfk_2` FOREIGN KEY (`id_habitaciones`) REFERENCES `habitaciones` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

/*Data for the table `reserva_habitaciones` */

insert  into `reserva_habitaciones`(`id`,`id_reserva`,`id_habitaciones`,`entrada`,`salida`,`hora_entrada`,`hora_salida`) values (3,4,5,'2018-12-22','2018-12-24','11:11','11:11'),(9,6,5,'2018-12-25','2018-12-31','22:22','22:22'),(13,8,2,'2018-12-10','2018-12-12','11:11','11:11'),(14,9,2,'2019-01-24','2019-01-31','10:00','10:00'),(15,10,3,'2018-12-20','2018-12-24','11:50','13:00'),(16,11,2,'2018-12-02','2018-12-14','12:50','12:50');

/*Table structure for table `reserva_personas` */

DROP TABLE IF EXISTS `reserva_personas`;

CREATE TABLE `reserva_personas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `persona_id` int(11) NOT NULL,
  `reservas_id` int(11) NOT NULL,
  `habitacion_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_reserva_acompañante_huespedes1_idx` (`persona_id`),
  KEY `fk_reserva_acompañante_reservas1_idx` (`reservas_id`),
  KEY `fk_reservas_habitacion_id` (`habitacion_id`),
  CONSTRAINT `fk_reserva_acompañante_huespedes1` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_reserva_acompañante_reservas1` FOREIGN KEY (`reservas_id`) REFERENCES `reservas` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_reservas_habitacion_id` FOREIGN KEY (`habitacion_id`) REFERENCES `habitaciones` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;

/*Data for the table `reserva_personas` */

insert  into `reserva_personas`(`id`,`persona_id`,`reservas_id`,`habitacion_id`) values (2,2,4,5),(11,7,6,5),(16,5,8,2),(17,3,8,2),(18,7,9,2),(19,5,10,3),(20,8,11,2);

/*Table structure for table `reserva_tarifas` */

DROP TABLE IF EXISTS `reserva_tarifas`;

CREATE TABLE `reserva_tarifas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_reserva` int(11) NOT NULL,
  `id_tarifa` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_rt_reserva` (`id_reserva`),
  KEY `fk_rt_tarifas` (`id_tarifa`),
  CONSTRAINT `fk_rt_reserva` FOREIGN KEY (`id_reserva`) REFERENCES `reservas` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_rt_tarifas` FOREIGN KEY (`id_tarifa`) REFERENCES `tarifas` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;

/*Data for the table `reserva_tarifas` */

insert  into `reserva_tarifas`(`id`,`id_reserva`,`id_tarifa`) values (3,4,6),(14,8,1),(15,9,1),(16,10,5),(18,6,6),(19,11,1);

/*Table structure for table `reservas` */

DROP TABLE IF EXISTS `reservas`;

CREATE TABLE `reservas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_operador` int(11) DEFAULT NULL,
  `comentarios` varchar(100) DEFAULT '',
  `precio` int(30) DEFAULT NULL,
  `Estado` char(2) DEFAULT 'A',
  `tipo_cliente_id` int(11) NOT NULL,
  `usuario_id` int(11) NOT NULL,
  `tipo_reserva_id` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_operador` (`id_operador`),
  KEY `fk_reservas_tipo_cliente1_idx` (`tipo_cliente_id`),
  KEY `fk_reservas_personal1_idx` (`usuario_id`),
  KEY `fk_reservas_tipo_reserva1_idx` (`tipo_reserva_id`),
  CONSTRAINT `fk_reservas_tipo_cliente1` FOREIGN KEY (`tipo_cliente_id`) REFERENCES `tipo_cliente` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_reservas_tipo_reserva1` FOREIGN KEY (`tipo_reserva_id`) REFERENCES `tipo_reserva` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_reservas_usuario1` FOREIGN KEY (`usuario_id`) REFERENCES `usuarios` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `reservas_ibfk_4` FOREIGN KEY (`id_operador`) REFERENCES `operador_turistico` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

/*Data for the table `reservas` */

insert  into `reservas`(`id`,`id_operador`,`comentarios`,`precio`,`Estado`,`tipo_cliente_id`,`usuario_id`,`tipo_reserva_id`,`fecha`) values (4,1,'5555\r\n',160000,'A',3,1,4,'2018-12-08'),(6,3,'2222\r\n',480000,'A',1,1,5,'2018-12-08'),(8,3,'Reserva sin deposito',100000,'I',3,1,2,'2018-12-09'),(9,6,'ninguno',350000,'I',4,1,4,'2018-12-10'),(10,5,'reserva sin operador\r\n',352000,'I',6,1,2,'2018-12-13'),(11,3,'reserva ',600000,'I',6,1,2,'2018-12-19');

/*Table structure for table `servicios` */

DROP TABLE IF EXISTS `servicios`;

CREATE TABLE `servicios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_id` int(11) NOT NULL,
  `descripcion` varchar(100) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `usuario_id` int(11) DEFAULT NULL,
  `realizado` char(2) DEFAULT NULL,
  `precio` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_servicios_nombre` (`nombre_id`),
  KEY `fk_servicios_usuario_id` (`usuario_id`),
  CONSTRAINT `fk_servicios_nombre` FOREIGN KEY (`nombre_id`) REFERENCES `servicios_nombres` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_servicios_usuario_id` FOREIGN KEY (`usuario_id`) REFERENCES `usuarios` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=latin1;

/*Data for the table `servicios` */

insert  into `servicios`(`id`,`nombre_id`,`descripcion`,`fecha`,`usuario_id`,`realizado`,`precio`) values (11,1,'Desayuno en la habitacion','2018-10-30',2,'SI',10000),(12,3,'Llamada despertador a la habitacion','2018-10-17',2,'Si',0),(13,4,'Comestibles y minibar en la habitacion','2018-10-23',2,'SI',10000),(14,5,'cama extra','2018-10-15',2,'SI',50000),(15,2,'supervision y limpieza','2018-11-02',2,'SI',0),(16,6,'estado tecnico y mantenimiento de la habitacion','2018-10-09',2,'SI',0),(17,7,'servicio de spa pase bronce','2018-10-31',2,'SI',100000),(18,8,'servicio de sauna pase bronce','2018-10-31',2,'SI',100000),(19,9,'cerro tres kandu','2018-10-31',2,'SI',500000),(20,10,'estacionamiento','2018-10-31',2,'SI',80000),(21,11,'traslado aeropuerto','2018-11-30',2,'SI',100000),(22,12,'lavado de ropa','2018-10-31',2,'SI',100000),(23,13,'2 maletas','2018-10-30',2,'SI',0),(24,14,'mensaje de texto','2018-10-31',2,'SI',0),(25,5,'solicitud de cuna','2018-12-04',1,'SI',20000),(26,5,'55564','2018-12-09',1,'SI',40000),(30,7,'ninguno','2018-12-13',1,'NO',100000),(31,7,'sin descripcion','2018-12-15',1,'SI',600000),(32,4,'jugo de naranja','2018-12-15',1,'SI',24000),(33,11,'traslado','2018-12-19',1,'SI',0),(34,4,'comestibles','2018-12-19',1,'SI',20000);

/*Table structure for table `servicios_cama_extra` */

DROP TABLE IF EXISTS `servicios_cama_extra`;

CREATE TABLE `servicios_cama_extra` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `servicios_id` int(11) NOT NULL,
  `camas_id` int(11) NOT NULL,
  `habitacion_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_cama_servicios_cama` (`camas_id`),
  KEY `fk_cama_servicios` (`servicios_id`),
  KEY `fk_cama_habitacion` (`habitacion_id`),
  CONSTRAINT `fk_cama_habitacion` FOREIGN KEY (`habitacion_id`) REFERENCES `habitaciones` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_cama_servicios` FOREIGN KEY (`servicios_id`) REFERENCES `servicios` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_cama_servicios_cama` FOREIGN KEY (`camas_id`) REFERENCES `cama` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `servicios_cama_extra` */

insert  into `servicios_cama_extra`(`id`,`servicios_id`,`camas_id`,`habitacion_id`) values (1,14,7,2),(2,25,8,4),(3,26,2,2),(4,26,2,2);

/*Table structure for table `servicios_consumicion` */

DROP TABLE IF EXISTS `servicios_consumicion`;

CREATE TABLE `servicios_consumicion` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `servicio_id` int(11) DEFAULT NULL,
  `productos_id` int(11) NOT NULL,
  `habitacion_id` int(11) NOT NULL,
  `empleado_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_servicios_desaalm_habitacion` (`habitacion_id`),
  KEY `fk_servicios_desaalm_productos` (`productos_id`),
  KEY `fk_servicios_desaalm_servicios` (`servicio_id`),
  KEY `fk_servicios_desaalm_empleado` (`empleado_id`),
  CONSTRAINT `fk_servicios_desaalm_empleado` FOREIGN KEY (`empleado_id`) REFERENCES `empleado` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_servicios_desaalm_habitacion` FOREIGN KEY (`habitacion_id`) REFERENCES `habitaciones` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_servicios_desaalm_productos` FOREIGN KEY (`productos_id`) REFERENCES `productos` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_servicios_desaalm_servicios` FOREIGN KEY (`servicio_id`) REFERENCES `servicios` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `servicios_consumicion` */

insert  into `servicios_consumicion`(`id`,`servicio_id`,`productos_id`,`habitacion_id`,`empleado_id`) values (1,11,11,2,2),(2,13,2,2,2),(3,32,3,9,1),(4,32,3,9,1),(5,34,8,2,1),(6,34,8,2,4);

/*Table structure for table `servicios_detalle` */

DROP TABLE IF EXISTS `servicios_detalle`;

CREATE TABLE `servicios_detalle` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_servicios` int(11) DEFAULT NULL,
  `huesped_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_servicios` (`id_servicios`),
  KEY `fk_servicios_huesped` (`huesped_id`),
  CONSTRAINT `fk_servicios_huesped` FOREIGN KEY (`huesped_id`) REFERENCES `huespedes` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `servicios_detalle_ibfk_1` FOREIGN KEY (`id_servicios`) REFERENCES `servicios` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=latin1;

/*Data for the table `servicios_detalle` */

insert  into `servicios_detalle`(`id`,`id_servicios`,`huesped_id`) values (1,11,1),(2,12,1),(3,13,1),(4,14,1),(5,15,1),(6,16,1),(7,17,1),(8,18,1),(9,19,1),(10,20,1),(11,21,1),(12,22,1),(13,23,1),(15,25,1),(16,26,1),(20,30,4),(21,31,5),(22,32,5),(23,33,6),(24,34,6);

/*Table structure for table `servicios_equipaje` */

DROP TABLE IF EXISTS `servicios_equipaje`;

CREATE TABLE `servicios_equipaje` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `servicios_id` int(11) NOT NULL,
  `habitacion_id` int(11) NOT NULL,
  `maletas` varchar(40) DEFAULT NULL,
  `cantidad` int(3) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_equipaje_servicios` (`servicios_id`),
  KEY `fk_equipaje_habitacion` (`habitacion_id`),
  CONSTRAINT `fk_equipaje_habitacion` FOREIGN KEY (`habitacion_id`) REFERENCES `habitaciones` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_equipaje_servicios` FOREIGN KEY (`servicios_id`) REFERENCES `servicios` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `servicios_equipaje` */

insert  into `servicios_equipaje`(`id`,`servicios_id`,`habitacion_id`,`maletas`,`cantidad`) values (1,23,2,'2 maletas una roja otra negra',2);

/*Table structure for table `servicios_estacionamiento` */

DROP TABLE IF EXISTS `servicios_estacionamiento`;

CREATE TABLE `servicios_estacionamiento` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `servicio_id` int(11) NOT NULL,
  `marca` varchar(20) DEFAULT NULL,
  `modelo` varchar(20) DEFAULT NULL,
  `color` varchar(20) DEFAULT NULL,
  `nro_chapa` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_estacio_serrvicio` (`servicio_id`),
  CONSTRAINT `fk_estacio_serrvicio` FOREIGN KEY (`servicio_id`) REFERENCES `servicios` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `servicios_estacionamiento` */

insert  into `servicios_estacionamiento`(`id`,`servicio_id`,`marca`,`modelo`,`color`,`nro_chapa`) values (1,20,'toyora','allex','blanco','adf-544');

/*Table structure for table `servicios_lavanderia` */

DROP TABLE IF EXISTS `servicios_lavanderia`;

CREATE TABLE `servicios_lavanderia` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `servicios_id` int(11) NOT NULL,
  `habitacion_id` int(11) DEFAULT NULL,
  `prendas` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_limpieza_servicio` (`servicios_id`),
  KEY `fk_limpieza_habitacion` (`habitacion_id`),
  CONSTRAINT `fk_limpieza_habitacion` FOREIGN KEY (`habitacion_id`) REFERENCES `habitaciones` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_limpieza_servicio` FOREIGN KEY (`servicios_id`) REFERENCES `servicios` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `servicios_lavanderia` */

insert  into `servicios_lavanderia`(`id`,`servicios_id`,`habitacion_id`,`prendas`) values (1,22,2,'remera y pantalon');

/*Table structure for table `servicios_llamadas_despertador` */

DROP TABLE IF EXISTS `servicios_llamadas_despertador`;

CREATE TABLE `servicios_llamadas_despertador` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `servicio_id` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `hora` varchar(10) DEFAULT NULL,
  `numero_telefono` int(20) DEFAULT NULL,
  `habitacion_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_servicios_despertador_habi` (`habitacion_id`),
  KEY `fk_servicios_despertador_servi` (`servicio_id`),
  CONSTRAINT `fk_servicios_despertador_habi` FOREIGN KEY (`habitacion_id`) REFERENCES `habitaciones` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_servicios_despertador_servi` FOREIGN KEY (`servicio_id`) REFERENCES `servicios` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `servicios_llamadas_despertador` */

insert  into `servicios_llamadas_despertador`(`id`,`servicio_id`,`fecha`,`hora`,`numero_telefono`,`habitacion_id`) values (1,12,'2018-10-31','17:30',52221122,2);

/*Table structure for table `servicios_mantenimiento` */

DROP TABLE IF EXISTS `servicios_mantenimiento`;

CREATE TABLE `servicios_mantenimiento` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `servicios_id` int(11) NOT NULL,
  `habitacion_id` int(11) NOT NULL,
  `descripcion` varchar(100) DEFAULT NULL,
  `hora` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_mante_servicios` (`servicios_id`),
  KEY `fk_mante_habitacion` (`habitacion_id`),
  CONSTRAINT `fk_mante_habitacion` FOREIGN KEY (`habitacion_id`) REFERENCES `habitaciones` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_mante_servicios` FOREIGN KEY (`servicios_id`) REFERENCES `servicios` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `servicios_mantenimiento` */

insert  into `servicios_mantenimiento`(`id`,`servicios_id`,`habitacion_id`,`descripcion`,`hora`) values (1,16,2,'reparacion de la mesa de la habitacion','16:35');

/*Table structure for table `servicios_mensajes` */

DROP TABLE IF EXISTS `servicios_mensajes`;

CREATE TABLE `servicios_mensajes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `servicios_id` int(11) NOT NULL,
  `destinatario` varchar(50) DEFAULT NULL,
  `mensaje` varchar(250) DEFAULT NULL,
  `fecha_envio` date DEFAULT NULL,
  `hora_envio` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_mensajeria_servicios` (`servicios_id`),
  CONSTRAINT `fk_mensajeria_servicios` FOREIGN KEY (`servicios_id`) REFERENCES `servicios` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `servicios_mensajes` */

insert  into `servicios_mensajes`(`id`,`servicios_id`,`destinatario`,`mensaje`,`fecha_envio`,`hora_envio`) values (1,24,'0971412154 Jose Manuel','Estoy en el hotel awwa','2018-10-31','17:25');

/*Table structure for table `servicios_nombres` */

DROP TABLE IF EXISTS `servicios_nombres`;

CREATE TABLE `servicios_nombres` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

/*Data for the table `servicios_nombres` */

insert  into `servicios_nombres`(`id`,`nombre`) values (1,'Desayuno o Almuerzo'),(2,'Supervision y Limpieza'),(3,'Llamada depertador'),(4,'Comestibles y Minibar'),(5,'Camas extras o cunas'),(6,'Estado tecnico y mantenimiento'),(7,'Spa'),(8,'Sauna'),(9,'Turismo'),(10,'Estacionamiento'),(11,'Traslado'),(12,'Tintoreria y lavanderia'),(13,'Guarda equipaje'),(14,'Mensajeria');

/*Table structure for table `servicios_spa_sauna` */

DROP TABLE IF EXISTS `servicios_spa_sauna`;

CREATE TABLE `servicios_spa_sauna` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `servicios_id` int(11) NOT NULL,
  `spa_sauna_id` int(11) NOT NULL,
  `cantidad` int(4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_spa_sauna_servicios` (`servicios_id`),
  KEY `fk_spa_sauna_spa_sauna` (`spa_sauna_id`),
  CONSTRAINT `fk_spa_sauna_servicios` FOREIGN KEY (`servicios_id`) REFERENCES `servicios` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_spa_sauna_spa_sauna` FOREIGN KEY (`spa_sauna_id`) REFERENCES `spa_sauna` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `servicios_spa_sauna` */

insert  into `servicios_spa_sauna`(`id`,`servicios_id`,`spa_sauna_id`,`cantidad`) values (1,17,3,1),(2,18,1,1),(4,30,3,1),(5,31,2,2);

/*Table structure for table `servicios_supervision_limpieza` */

DROP TABLE IF EXISTS `servicios_supervision_limpieza`;

CREATE TABLE `servicios_supervision_limpieza` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `servicios_id` int(11) NOT NULL,
  `habitacion_id` int(11) NOT NULL,
  `descripcion` varchar(100) DEFAULT NULL,
  `empleado_id` int(11) NOT NULL,
  `hora` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_super_servicios` (`servicios_id`),
  KEY `fk_super_empleado` (`empleado_id`),
  KEY `fk_super_habitacion` (`habitacion_id`),
  CONSTRAINT `fk_super_empleado` FOREIGN KEY (`empleado_id`) REFERENCES `empleado` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_super_habitacion` FOREIGN KEY (`habitacion_id`) REFERENCES `habitaciones` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_super_servicios` FOREIGN KEY (`servicios_id`) REFERENCES `servicios` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `servicios_supervision_limpieza` */

insert  into `servicios_supervision_limpieza`(`id`,`servicios_id`,`habitacion_id`,`descripcion`,`empleado_id`,`hora`) values (1,15,2,'cambio de sabanas y toallas',3,'13:45');

/*Table structure for table `servicios_traslado` */

DROP TABLE IF EXISTS `servicios_traslado`;

CREATE TABLE `servicios_traslado` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `servicios_id` int(11) NOT NULL,
  `destino` varchar(40) DEFAULT NULL,
  `direccion` varchar(40) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `hora` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_tras_servicios` (`servicios_id`),
  CONSTRAINT `fk_tras_servicios` FOREIGN KEY (`servicios_id`) REFERENCES `servicios` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `servicios_traslado` */

insert  into `servicios_traslado`(`id`,`servicios_id`,`destino`,`direccion`,`fecha`,`hora`) values (1,21,'aeropuerto silvio pettirossi','luque','2018-11-01','16:30'),(2,33,'aeropuerto','luque','2018-12-19','23:57');

/*Table structure for table `servicios_turismo` */

DROP TABLE IF EXISTS `servicios_turismo`;

CREATE TABLE `servicios_turismo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `servicios_id` int(11) NOT NULL,
  `turismo_id` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `hora` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_turismo_servicio` (`servicios_id`),
  KEY `fk_turismo_turismo` (`turismo_id`),
  CONSTRAINT `fk_turismo_servicio` FOREIGN KEY (`servicios_id`) REFERENCES `servicios` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_turismo_turismo` FOREIGN KEY (`turismo_id`) REFERENCES `turismo` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `servicios_turismo` */

insert  into `servicios_turismo`(`id`,`servicios_id`,`turismo_id`,`fecha`,`hora`) values (1,19,2,'2018-10-31','15:30');

/*Table structure for table `spa_sauna` */

DROP TABLE IF EXISTS `spa_sauna`;

CREATE TABLE `spa_sauna` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `precio` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `spa_sauna` */

insert  into `spa_sauna`(`id`,`nombre`,`precio`) values (1,'sauna pase bronce',100000),(2,'sauna pase oro',300000),(3,'spa pase bronce',100000),(4,'spa pase oro',300000),(5,'sauna pase plata',200000),(6,'spa pase plata',200000);

/*Table structure for table `tarifas` */

DROP TABLE IF EXISTS `tarifas`;

CREATE TABLE `tarifas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tarifas_nombres_id` int(11) DEFAULT NULL,
  `temporada_id` int(11) DEFAULT NULL,
  `habitacion_id` int(11) NOT NULL,
  `cantidad_personas` int(4) DEFAULT NULL,
  `descuento_personas` varchar(4) DEFAULT NULL,
  `porcentaje_pago` varchar(4) DEFAULT NULL,
  `hora_limite` varchar(5) DEFAULT NULL,
  `precio` int(30) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_tarifas` (`tarifas_nombres_id`),
  KEY `id_temporada` (`temporada_id`),
  KEY `fk_tarifas_detalle_habitacion` (`habitacion_id`),
  CONSTRAINT `fk_tarifas_detalle_habitacion` FOREIGN KEY (`habitacion_id`) REFERENCES `habitaciones` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `tarifas_ibfk_1` FOREIGN KEY (`tarifas_nombres_id`) REFERENCES `tarifas_nombres` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `tarifas_ibfk_3` FOREIGN KEY (`temporada_id`) REFERENCES `temporadas` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `tarifas` */

insert  into `tarifas`(`id`,`tarifas_nombres_id`,`temporada_id`,`habitacion_id`,`cantidad_personas`,`descuento_personas`,`porcentaje_pago`,`hora_limite`,`precio`) values (1,4,1,2,1,'010','100','23:59',50000),(2,6,5,9,5,'015','100','18:59',5000),(5,6,5,3,5,'011','100','11:11',88000),(6,5,3,5,2,'022','022','18:50',80000);

/*Table structure for table `tarifas_nombres` */

DROP TABLE IF EXISTS `tarifas_nombres`;

CREATE TABLE `tarifas_nombres` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(100) DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

/*Data for the table `tarifas_nombres` */

insert  into `tarifas_nombres`(`id`,`descripcion`) values (1,'Pago anticipado + desayuno'),(2,'Flexible + desayuno'),(3,'RACK'),(4,'Especial'),(5,'Estandar'),(6,'Fin de Semana'),(7,'Grupos');

/*Table structure for table `tarifas_servicios` */

DROP TABLE IF EXISTS `tarifas_servicios`;

CREATE TABLE `tarifas_servicios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tarifa_id` int(11) NOT NULL,
  `servicio_nombres_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_tarifas_detalle_nombre_ser` (`servicio_nombres_id`),
  KEY `fk_tarifas_detalle_tarifas` (`tarifa_id`),
  CONSTRAINT `fk_tarifas_detalle_nombre_ser` FOREIGN KEY (`servicio_nombres_id`) REFERENCES `servicios_nombres` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_tarifas_detalle_tarifas` FOREIGN KEY (`tarifa_id`) REFERENCES `tarifas` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=latin1;

/*Data for the table `tarifas_servicios` */

insert  into `tarifas_servicios`(`id`,`tarifa_id`,`servicio_nombres_id`) values (24,6,4),(25,6,10),(26,1,1),(27,1,2),(28,2,2),(29,5,4),(30,5,9),(31,5,11);

/*Table structure for table `temporadas` */

DROP TABLE IF EXISTS `temporadas`;

CREATE TABLE `temporadas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(100) DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `temporadas` */

insert  into `temporadas`(`id`,`descripcion`) values (1,'Alta'),(2,'Baja'),(3,'Navidad'),(4,'Semana Santa'),(5,'Año Nuevo');

/*Table structure for table `timbrado` */

DROP TABLE IF EXISTS `timbrado`;

CREATE TABLE `timbrado` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nro` varchar(40) DEFAULT NULL,
  `fecha_desde` date DEFAULT NULL,
  `fecha_fin` date DEFAULT NULL,
  `estado` char(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `timbrado` */

insert  into `timbrado`(`id`,`nro`,`fecha_desde`,`fecha_fin`,`estado`) values (1,'54212547','2018-12-09','2019-12-09','A'),(2,'111','2018-12-09','2018-12-19','A'),(3,'84555151','2018-12-01','2018-12-14','A');

/*Table structure for table `tipo_cliente` */

DROP TABLE IF EXISTS `tipo_cliente`;

CREATE TABLE `tipo_cliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `tipo_cliente` */

insert  into `tipo_cliente`(`id`,`descripcion`) values (1,'Ejecutivo'),(2,'Familias'),(3,'Deportistas'),(4,'Turistas'),(5,'VIP'),(6,'Particular');

/*Table structure for table `tipo_documento` */

DROP TABLE IF EXISTS `tipo_documento`;

CREATE TABLE `tipo_documento` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(50) DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `tipo_documento` */

insert  into `tipo_documento`(`id`,`descripcion`) values (1,'Cedula'),(2,'Pasaporte'),(3,'Otro');

/*Table structure for table `tipo_estadia` */

DROP TABLE IF EXISTS `tipo_estadia`;

CREATE TABLE `tipo_estadia` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `tipo_estadia` */

insert  into `tipo_estadia`(`id`,`descripcion`) values (1,'estadia activa'),(2,'estadia con deposito'),(3,'estadia vip'),(4,'cambio de estadia'),(5,'cancelacion'),(6,'salida anticipada');

/*Table structure for table `tipo_producto` */

DROP TABLE IF EXISTS `tipo_producto`;

CREATE TABLE `tipo_producto` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `tipo_producto` */

insert  into `tipo_producto`(`id`,`descripcion`) values (1,'Golosinas'),(2,'Menu'),(3,'Bebidas'),(4,'Comestible');

/*Table structure for table `tipo_reserva` */

DROP TABLE IF EXISTS `tipo_reserva`;

CREATE TABLE `tipo_reserva` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

/*Data for the table `tipo_reserva` */

insert  into `tipo_reserva`(`id`,`descripcion`) values (1,'reservacion con deposito'),(2,'reservacion sin deposito'),(3,'reservacion vip'),(4,'cambio de reservacion'),(5,'cancelacion'),(6,'reembolso'),(7,'reservacion negada');

/*Table structure for table `tipo_tarjeta` */

DROP TABLE IF EXISTS `tipo_tarjeta`;

CREATE TABLE `tipo_tarjeta` (
  `id` int(1) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `tipo_tarjeta` */

insert  into `tipo_tarjeta`(`id`,`descripcion`) values (1,'Credito'),(2,'Debito');

/*Table structure for table `tipos_habitacion` */

DROP TABLE IF EXISTS `tipos_habitacion`;

CREATE TABLE `tipos_habitacion` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(100) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

/*Data for the table `tipos_habitacion` */

insert  into `tipos_habitacion`(`id`,`descripcion`) values (1,'Simple'),(2,'Doble'),(3,'Triple'),(4,'Suite'),(5,'Matrimonial'),(6,'Familiar'),(7,'Nupcial'),(8,'Presidencial');

/*Table structure for table `turismo` */

DROP TABLE IF EXISTS `turismo`;

CREATE TABLE `turismo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `destino` varchar(40) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `precio` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `turismo` */

insert  into `turismo`(`id`,`destino`,`direccion`,`precio`) values (1,'Casa de la independencia','asuncion 4554',500000),(2,'Cerro tres kandu','guaira 3131',500000);

/*Table structure for table `ubicaciones` */

DROP TABLE IF EXISTS `ubicaciones`;

CREATE TABLE `ubicaciones` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(100) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `ubicaciones` */

insert  into `ubicaciones`(`id`,`descripcion`) values (1,'Piso 1'),(2,'Piso 2'),(3,'Piso 3');

/*Table structure for table `unidad_de_medida` */

DROP TABLE IF EXISTS `unidad_de_medida`;

CREATE TABLE `unidad_de_medida` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `unidad_de_medida` */

insert  into `unidad_de_medida`(`id`,`descripcion`) values (1,'Litros'),(2,'Metros'),(3,'Kilogramos'),(4,'Unidad'),(5,'Gramos');

/*Table structure for table `usuarios` */

DROP TABLE IF EXISTS `usuarios`;

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(50) DEFAULT NULL,
  `pass` blob,
  `estado` char(2) DEFAULT 'A',
  `nivel_usuario` varchar(40) NOT NULL,
  `empleado_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_usuarios_tipo_usuario1_idx` (`nivel_usuario`),
  KEY `fk_usuario_empleado` (`empleado_id`),
  CONSTRAINT `fk_usuario_empleado` FOREIGN KEY (`empleado_id`) REFERENCES `empleado` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `usuarios` */

insert  into `usuarios`(`id`,`usuario`,`pass`,`estado`,`nivel_usuario`,`empleado_id`) values (1,'Admin','40bd001563085fc35165329ea1ff5c5ecbdbbeef','A','ADMIN',4),(2,'Maria','40bd001563085fc35165329ea1ff5c5ecbdbbeef','A','RECEPCION',1),(3,'Pame','40bd001563085fc35165329ea1ff5c5ecbdbbeef','A','CAJERO',3);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
