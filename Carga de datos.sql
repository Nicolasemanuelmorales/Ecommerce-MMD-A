drop Database if exists `db`;
create Database `db`;

Use `db`;

/* Usuario */

insert into Usuario(email,password,rol)
Value('asd@asd.com','asd','1');

/* Color */

insert into Color(Id,nombre)
Value(1,'Blanco');

insert into Color(Id,nombre)
Value(2,'Negro');

insert into Color(Id,nombre)
Value(3,'Gris');

insert into Color(Id,nombre)
Value(4,'Rojo');

insert into Color(Id,nombre)
Value(5,'Azul');

insert into Color(Id,nombre)
Value(6,'Amarillo');

insert into Color(Id,nombre)
Value(7,'Verde');

insert into Color(Id,nombre)
Value(8,'Rosa');

insert into Color(Id,nombre)
Value(9,'Celeste');



/* Talle */

insert into Talle(Id,nombre)
Value(1,'S');

insert into Talle(Id,nombre)
Value(2,'M');

insert into Talle(Id,nombre)
Value(3,'L');

insert into Talle(Id,nombre)
Value(4,'XL');


/* Material */

insert into Material(Id,nombre)
Value(1,'Algodon');

insert into Material(Id,nombre)
Value(2,'Cuero');

insert into Material(Id,nombre)
Value(4,'Cuerina');

insert into Material(Id,nombre)
Value(3,'Seda');

/* Tipo */

/*remeras*/

insert into Tipo(Id,nombre)
Value(111,'RemeraMangalarga');

insert into Tipo(Id,nombre)
Value(222,'RemeraMangacorta');

insert into Tipo(Id,nombre)
Value(333,'RemeraMusculosa');

/*pantalon*/

insert into Tipo(Id,nombre)
Value(444,'PantalonJean');

insert into Tipo(Id,nombre)
Value(555,'PantalonJoggin');

insert into Tipo(Id,nombre)
Value(666,'PantalonGabardina');

/*bermudas*/

insert into Tipo(Id,nombre)
Value(777,'BermudaJean');

insert into Tipo(Id,nombre)
Value(888,'BermudaJoggin');

insert into Tipo(Id,nombre)
Value(999,'BermudaGabardina');

/*Buzos*/

insert into Tipo(Id,nombre)
Value(100,'BuzoCanguro');

insert into Tipo(Id,nombre)
Value(110,'BuzoBasico');

insert into Tipo(Id,nombre)
Value(120,'BuzoElegante');

/*camisas*/

insert into Tipo(Id,nombre)
Value(130,'CamisaMangalarga');

insert into Tipo(Id,nombre)
Value(140,'CamisaMangacorta');

insert into Tipo(Id,nombre)
Value(150,'CamisaElegante');


/* Producto */

/*P Remeras ML*/

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(1,'images/rml1.jpg','AB SUPP POLO',420.00,2,1,4,111);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(2,'images/rml2.jpg','HAND DRAWN T2',470.00,7,3,3,111);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(3,'images/rml3.jpg','SPEEDWICK GRAPHIC',500.00,3,1,2,111);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(4,'images/rml4.jpg','VINTAGE TEE',450.00,3,3,2,111);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(5,'images/rml5.jpg','KAVAL GRP TEE',380.00,4,3,2,111);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(7,'images/rml6.jpg','SQUAD',220.00,2,1,1,111);

/*P Remeras MC*/

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(6,'images/rmc1.jpg','SQUAD',150.00,2,1,4,222);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(77,'images/rmc2.jpg','HAND DRAWN T2',270.00,7,3,3,222);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(8,'images/rmc3.jpg','CKAVAL GRP TEE',400.00,2,1,2,222);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(9,'images/rmc4.jpg','VINTAGE TEE',480.00,2,3,2,222);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(10,'images/rmc5.jpg','SPEEDWICK GRAPHI',380.00,4,3,2,222);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(11,'images/rmc6.jpg','AB SUPP POLO',260.00,2,1,1,222);

/*P Remeras M*/

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(12,'images/rm1.jpg','SPEEDWICK GRAPHIC',160.00,2,1,4,333);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(13,'images/rm2.jpg','HAND DRAWN T2',130.00,7,3,3,333);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(14,'images/rm3.jpg','AB SUPP POLO',230.00,2,1,2,333);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(15,'images/rm4.jpg','KAVAL GRP TEE',310.00,2,3,2,333);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(16,'images/rm5.jpg','VINTAGE TEE',305.00,4,3,2,333);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(17,'images/rm6.jpg','SQUAD',175.00,2,1,1,333);

/*P camisa ML*/

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(18,'images/cml1.jpg','HAND DRAWN POLO',450.00,2,1,4,130);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(19,'images/cml2.jpg','T2 AB SUPP',370.00,7,3,3,130);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(20,'images/cml3.jpg','VINTAGE TEE',500.00,2,1,2,130);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(21,'images/cml4.jpg','VINTAGE SPEEDWICK ',450.00,2,3,2,130);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(22,'images/cml5.jpg','KAVAL  TEE',380.00,4,3,2,130);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(23,'images/cml6.jpg','SQUAD GRP',220.00,2,1,1,130);



/*P camisa MC*/

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(24,'images/cmc1.jpg','HAND SUPP POLO',700.00,2,1,4,140);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(25,'images/cmc2.jpg','HAND DRAWN T2',850.00,7,3,3,140);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(26,'images/cmc3.jpg','SPEEDWICK GRAPHIC',810.00,2,1,2,140);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(27,'images/cmc4.jpg','VINTAGE SQUAD',950.00,2,3,2,140);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(28,'images/cmc5.jpg','KAVAL GRP TEE',1000.00,4,3,2,140);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(29,'images/cmc6.jpg','SPEEDWICK',525.00,2,1,1,140);

/*P camisa E*/

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(30,'images/ce1.jpg','TEE SUPP TEE',1200.00,2,1,4,150);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(31,'images/ce2.jpg','GRP SPEEDWICK T2',1100.00,7,3,3,150);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(32,'images/ce3.jpg','SPEEDWICK GRAPHIC',1050.00,2,1,2,150);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(33,'images/ce4.jpg','VINTAGE TEE',1020.00,2,3,2,150);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(34,'images/ce5.jpg','KAVAL GRP TEE',850.00,4,3,2,150);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(35,'images/ce6.jpg','SQUAD',755.00,2,1,1,150);

/*P buzo c*/

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(36,'images/bc1.jpg','SQUAD SUPP SQUAD',450.00,2,1,4,100);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(37,'images/bc2.jpg','VINTAGE DRAWN T2',370.00,7,3,3,100);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(38,'images/bc3.jpg','SPEEDWICK GRAPHIC',500.00,2,1,2,100);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(39,'images/bc4.jpg','SQUAD TEE',450.00,2,3,2,100);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(40,'images/bc5.jpg','KAVAL GRP TEE',380.00,4,3,2,100);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(41,'images/bc6.jpg','SQUAD',220.00,2,1,1,100);

/*P buzo b*/

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(42,'images/bb1.jpg','POLO',700.00,2,1,4,110);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(43,'images/bb2.jpg','T2',750.00,7,3,3,110);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(44,'images/bb3.jpg','GRAPHIC',925.00,2,1,2,110);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(45,'images/bb4.jpg','TEE',560.00,2,3,2,110);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(46,'images/bb5.jpg','GRP',490.00,4,3,2,110);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(47,'images/bb6.jpg','SQUAD',510.00,2,1,1,110);

/*P buzo e*/

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(48,'images/be1.jpg','SUPP',450.00,2,1,4,120);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(49,'images/be2.jpg','DRAWN T2',370.00,7,3,3,120);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(50,'images/be3.jpg','SPEEDWICK GRAPHIC',500.00,2,1,2,120);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(51,'images/be4.jpg','VINTAGE',450.00,2,3,2,120);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(52,'images/be5.jpg','GRP TEE',380.00,4,3,2,120);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(53,'images/be6.jpg','VINTAGE VINTAGE',220.00,2,1,1,120);

/*P pantalon j*/

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(54,'images/pj1.jpg','ABABAB',380.00,2,1,4,444);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(55,'images/pj2.jpg','HAND HAND T2',320.00,7,3,3,444);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(56,'images/pj3.jpg','HAND GRAPHIC',522.00,2,1,2,444);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(57,'images/pj4.jpg','VINTAGE HAND',555.00,2,3,2,444);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(58,'images/pj5.jpg','GRP GRP TEE',455.00,4,3,2,444);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(59,'images/pj6.jpg','SQUADTEE',285.00,2,1,1,444);

/*P pantalon jg*/

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(60,'images/pjg1.jpg','ABKAVAL SUPP',320.00,2,1,4,555);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(61,'images/pjg2.jpg','HANDT2 DRAWN T2',330.00,7,3,3,555);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(62,'images/pjg3.jpg','SPEEDWICK GRAPHIC',315.00,2,1,2,555);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(63,'images/pjg4.jpg','VINTAGEKAVAL TEE',250.00,2,3,2,555);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(64,'images/pjg5.jpg','KAVAL KAVAL TEE',220.00,4,3,2,555);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(65,'images/pjg6.jpg','SQUADKAVAL',500.00,2,1,1,555);


/*P pantalon g*/

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(66,'images/pe1.jpg','AB SUPP POLO',780.00,2,1,4,666);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(67,'images/pe2.jpg','HAND POLO T2',800.00,7,3,3,666);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(68,'images/pe3.jpg','SPEEDWICK POLO',960.00,2,1,2,666);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(69,'images/pe4.jpg','POLO TEE',750.00,2,3,2,666);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(70,'images/pe5.jpg','KAVAL GRP TEE',1000.00,4,3,2,666);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(71,'images/pe6.jpg','SQUADPOLO',850.00,2,1,1,666);


/*P bermuda j*/

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(72,'images/bj1.jpg','SQUAD SUPP SQUAD',450.00,2,1,4,777);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(73,'images/bj2.jpg','SQUAD DRAWN T2',370.00,7,3,3,777);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(74,'images/bj3.jpg','SQUAD GRAPHIC',500.00,2,1,2,777);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(75,'images/bj4.jpg','VINTAGE TEE',450.00,2,3,2,777);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(76,'images/bj5.jpg','KAVAL GRP TEE',380.00,4,3,2,777);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(78,'images/bj6.jpg','SQUAD',220.00,2,1,1,777);

/*P bermuda jg*/

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(79,'images/bjg1.jpg','TEE SUPP POLO',370.00,2,1,4,888);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(80,'images/bjg2.jpg','HANDTEE DRAWN ',370.00,7,3,3,888);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(81,'images/bjg3.jpg','TEE GRAPHIC',505.00,2,1,2,888);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(82,'images/bjg4.jpg','VINTAGETEE TEE',505.00,2,3,2,888);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(83,'images/bjg5.jpg','KAVAL  TEE',490.00,4,3,2,888);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(84,'images/bjg6.jpg','SQUTEEAD',360.00,2,1,1,888);

/*P bermuda g*/

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(85,'images/bg1.jpg','AB SUPP POLO',450.00,2,1,4,999);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(86,'images/bg2.jpg','HAND DRAWN T2',370.00,7,3,3,999);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(87,'images/bg3.jpg','SPEEDWICK GRAPHIC',500.00,2,1,2,999);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(88,'images/bg4.jpg','VINTAGE TEE',450.00,2,3,2,999);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(89,'images/bg5.jpg','KAVAL GRP TEE',380.00,4,3,2,999);

insert into Producto (Id,imagen,nombre,precio,color_id,material_id,talle_id,tipo_id)
Value(90,'images/bg6.jpg','SQUAD',220.00,2,1,1,999);