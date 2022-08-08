# BandBook
Enlace para descargar el pdf del proyecto final [Jimenez_Sevilla_Antonio_ProyectoFinal.pdf](https://github.com/Jhaldreen/BandBook/files/9220734/Jimenez_Sevilla_Antonio_ProyectoFinal.pdf)

Este proyecto, ha sido realizado para crear una aplicación de escritorio, la cual permite ponerse en contacto bandas de música nóveles, independientes, etc. con los diferentes bares, pubs o promotores de eventos. De esta manera lo que se pretende es resolver el problema que existe a la hora de organizar eventos por todo el territorio español, omitiendo la necesidad de contratar una empresa de Booking, ya que no todo el mundo tiene presupuesto para poder contratarlo. Esta aplicación es innovadora, ya que en su comienzo los grupos normalmente carecen de presupuesto y contactos para poder salir de su provincia a mostrar sus trabajos en directo. Con esta aplicación, puedes ponerte en contacto con el local o pub que quieras, llegando a un acuerdo con el dueño para concertar una fecha de realización del evento de forma cómoda y óptima.


![2](https://user-images.githubusercontent.com/85558554/181779353-288b8feb-5c5b-4d94-ac3e-1e2761132941.jpg)

# Diagrama de clases

![6](https://user-images.githubusercontent.com/85558554/181780462-002142f0-a671-4009-901e-bbbc7bb574ed.jpg)


# Base de datos MySQL
Las tablas que hay que crear para que funcione la app en Netbeans son las siguientes.

CREATE TABLE IF NOT EXISTS BandBook.usuarios (
idusuarios INT NOT NULL AUTO_INCREMENT,
email VARCHAR(25) NOT NULL,
pass VARCHAR(45) NOT NULL,
name VARCHAR(45) NOT NULL,
phone INT(9) NULL,
state VARCHAR(45) NULL,
province VARCHAR(45) NULL,
num_people INT(10) NOT NULL,
PRIMARY KEY (idusuarios))
ENGINE = InnoDB

CREATE TABLE IF NOT EXISTS BandBook.mensajes (
idmensajes INT NOT NULL AUTO_INCREMENT,
mensajes_name VARCHAR(45) NOT NULL,
mensajes_asunto VARCHAR(45) NULL,
mensajes_texto VARCHAR(200) NOT NULL,
PRIMARY KEY (idmensajes))
ENGINE = InnoDB


He ido modificando algo la base de datos, según he ido avanzando despues de la entrega final, habría que crear una foreign key para mensajes_name, para ahorra código en java y sea más eficaz.



