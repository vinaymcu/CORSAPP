create table `customer` (
	`id` bigint (11),
	`name` varchar (135),
	`email` varchar (150)
); 
insert into `customer` (`id`, `name`, `email`) values('1','vinay','vinay@gmail.com');
insert into `customer` (`id`, `name`, `email`) values('2','aaa','aaa@gmail.com');
insert into `customer` (`id`, `name`, `email`) values('3','bbbb','bbb@gmail.com');


CREATE TABLE `user` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `userid` VARCHAR(40) DEFAULT NULL,
  `firstname` VARCHAR(40) DEFAULT NULL,
  `lastname` VARCHAR(40) DEFAULT NULL,
  `email` VARCHAR(40) DEFAULT NULL,
  `password` VARCHAR(40) DEFAULT NULL,
  `isactive` TINYINT(1) DEFAULT NULL,
  `city` VARCHAR(40) DEFAULT NULL,
   PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8


