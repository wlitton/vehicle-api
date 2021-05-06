
DROP TABLE IF EXISTS `vehicle`;

CREATE TABLE `vehicle` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created` datetime DEFAULT NULL,
  `updated` datetime DEFAULT NULL,
  `created_by` varchar(45) DEFAULT NULL,
  `updated_by` varchar(45) DEFAULT NULL,
  `status` enum('ACTIVE','INACTIVE','DELETED') DEFAULT NULL,
  `make` varchar(45) NOT NULL,
  `model` varchar(45) NOT NULL,
  `year` varchar(4) DEFAULT NULL,
  `color` varchar(45) NOT NULL,
  `price` varchar(10) NOT NULL,
  `mileage` varchar(15) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `vehicle` WRITE;
/*!40000 ALTER TABLE `vehicle` DISABLE KEYS */;

INSERT INTO `vehicle` (`id`, `created`, `updated`, `created_by`, `updated_by`, `status`, `make`, `model`, `year`, `color`, `price`, `mileage`)
VALUES
	(1,NULL,NULL,NULL,NULL,'ACTIVE','GMC','Sierra','2014','Gold','50,000','80,000'),
  (2,NULL,NULL,NULL,NULL,'ACTIVE','Ford','Mustang','2020','Green','10,000','0'),
  (3,NULL,NULL,NULL,NULL,'ACTIVE','Lincoln','Navigator','2015','Pink','20,000','100,000'),
  (4,NULL,NULL,NULL,NULL,'ACTIVE','Toyota','Avalon','2012','Red','50,000','0'),
  (5,NULL,NULL,NULL,NULL,'ACTIVE','Honda','Civic','2007','Blue','50,000','100,000'),
  (6,NULL,NULL,NULL,NULL,'ACTIVE','GMC','Sierra','2014','Orange','30,000','10,000'),
  (7,NULL,NULL,NULL,NULL,'ACTIVE','GMC','Sierra','2014','Yellow','50,000','100,000'),
  (8,NULL,NULL,NULL,NULL,'ACTIVE','GMC','Sierra','2014','Gold','50,000','0'),
  (9,NULL,NULL,NULL,NULL,'ACTIVE','Honda','Civic','2013','Blue','40,000','10,000'),
  (10,NULL,NULL,NULL,NULL,'ACTIVE','GMC','Sierra','2015','Gold','50,000','100,000'),
  (11,NULL,NULL,NULL,NULL,'ACTIVE','GMC','Sierra','2014','Red','45,000','10,000'),
  (12,NULL,NULL,NULL,NULL,'ACTIVE','Ford','F150','2018','Gold','50,000','100,000'),
  (13,NULL,NULL,NULL,NULL,'ACTIVE','GMC','Sierra','2019','Pink','50,000','0'),
  (14,NULL,NULL,NULL,NULL,'ACTIVE','Chevrolet','Silverado','2014','Gold','50,000','20,000'),
  (15,NULL,NULL,NULL,NULL,'ACTIVE','GMC','Sierra','2014','Gold','50,000','60,000'),
  (16,NULL,NULL,NULL,NULL,'ACTIVE','GMC','Sierra','2014','Gold','50,000','80,000'),
  (17,NULL,NULL,NULL,NULL,'ACTIVE','Ford','Mustang','2020','Green','10,000','0'),
  (18,NULL,NULL,NULL,NULL,'ACTIVE','Lincoln','Navigator','2015','Pink','20,000','100,000'),
  (19,NULL,NULL,NULL,NULL,'ACTIVE','Toyota','Avalon','2012','Red','50,000','0'),
  (20,NULL,NULL,NULL,NULL,'ACTIVE','Honda','Civic','2007','Blue','50,000','100,000'),
  (21,NULL,NULL,NULL,NULL,'ACTIVE','GMC','Sierra','2014','Orange','30,000','10,000'),
  (22,NULL,NULL,NULL,NULL,'ACTIVE','GMC','Sierra','2014','Yellow','50,000','100,000'),
  (23,NULL,NULL,NULL,NULL,'ACTIVE','GMC','Sierra','2014','Gold','50,000','0'),
  (24,NULL,NULL,NULL,NULL,'ACTIVE','Honda','Civic','2013','Blue','40,000','10,000'),
  (25,NULL,NULL,NULL,NULL,'ACTIVE','GMC','Sierra','2015','Gold','50,000','100,000'),
  (26,NULL,NULL,NULL,NULL,'ACTIVE','GMC','Sierra','2014','Red','45,000','10,000'),
  (27,NULL,NULL,NULL,NULL,'ACTIVE','Ford','F150','2018','Gold','50,000','100,000'),
  (28,NULL,NULL,NULL,NULL,'ACTIVE','GMC','Sierra','2019','Pink','50,000','0'),
  (29,NULL,NULL,NULL,NULL,'ACTIVE','Chevrolet','Silverado','2014','Gold','50,000','20,000'),
  (30,NULL,NULL,NULL,NULL,'ACTIVE','GMC','Sierra','2014','Gold','50,000','60,000');

/*!40000 ALTER TABLE `vehicle` ENABLE KEYS */;
UNLOCK TABLES;
