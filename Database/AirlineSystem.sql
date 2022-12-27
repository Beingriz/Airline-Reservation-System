-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: airlinesystem
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `UserId` varchar(250) NOT NULL,
  `FirstName` varchar(250) DEFAULT NULL,
  `LastName` varchar(250) DEFAULT NULL,
  `Dob` date DEFAULT NULL,
  `PhoneNo` varchar(250) DEFAULT NULL,
  `UserName` varchar(250) NOT NULL,
  `Password` varchar(250) NOT NULL,
  PRIMARY KEY (`UserId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES ('ADM001','Md','Rizwan','1993-07-18','8951775912','Beingriz','123456'),('ADM002','Nigar','Sultana','1994-12-05','9066673291','Nigar','123456');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `CustomerId` varchar(250) NOT NULL,
  `FirstName` varchar(250) NOT NULL,
  `LastName` varchar(250) NOT NULL,
  `PassportId` varchar(250) NOT NULL,
  `Dob` date NOT NULL,
  `Gender` varchar(50) NOT NULL,
  `PhoneNo` varchar(250) NOT NULL,
  `Address` varchar(45) NOT NULL,
  `NICId` varchar(250) NOT NULL,
  PRIMARY KEY (`CustomerId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES ('CS001','Mohammed','Rizwan','SSFATSA','2022-12-20','Male','8951775912','Chikkabashti	','SDASD2Q');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flights`
--

DROP TABLE IF EXISTS `flights`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `flights` (
  `FlightId` varchar(250) NOT NULL,
  `FlightName` varchar(250) DEFAULT NULL,
  `Arrival` varchar(250) NOT NULL,
  `Departure` varchar(250) NOT NULL,
  `Date` date DEFAULT NULL,
  `SeatLeft` int DEFAULT NULL,
  `Fare` int DEFAULT NULL,
  `TravelTime` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`FlightId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flights`
--

LOCK TABLES `flights` WRITE;
/*!40000 ALTER TABLE `flights` DISABLE KEYS */;
INSERT INTO `flights` VALUES ('FLT001','Air Indigo','Delhi','Goa','2022-12-07',60,2500,'2'),('FLT002','Air Aisia','Mumbai','Goa','2022-12-15',55,1500,'1.5'),('FLT003','Boein','Delhi','Bangaloe','2022-12-16',25,1500,'2');
/*!40000 ALTER TABLE `flights` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tickets`
--

DROP TABLE IF EXISTS `tickets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tickets` (
  `Ticket_Id` varchar(250) NOT NULL,
  `CustomerId` varchar(250) NOT NULL,
  `FirstName` varchar(250) NOT NULL,
  `LastName` varchar(250) NOT NULL,
  `PhoneNo` varchar(250) NOT NULL,
  `FlightId` varchar(250) NOT NULL,
  `FlightName` varchar(250) NOT NULL,
  `Arrival` varchar(250) NOT NULL,
  `Departure` varchar(250) NOT NULL,
  `Date` date NOT NULL,
  `Fare` int NOT NULL,
  `Seats` int NOT NULL,
  `TotalFare` int NOT NULL,
  PRIMARY KEY (`Ticket_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tickets`
--

LOCK TABLES `tickets` WRITE;
/*!40000 ALTER TABLE `tickets` DISABLE KEYS */;
INSERT INTO `tickets` VALUES ('TCK001','cs001','Mohammed','Rizwan','8951775912','FLT003','Boein','Delhi','Bangaloe','2022-12-16',1500,1,1500),('TCK002','CS001','Mohammed','Rizwan','8951775912','FLT003','Boein','Delhi','Bangaloe','2022-12-16',1500,3,4500),('TCK003','cs001','Mohammed','Rizwan','8951775912','FLT003','Boein','Delhi','Bangaloe','2022-12-16',1500,3,4500),('TCK004','cs001','Mohammed','Rizwan','8951775912','FLT003','Boein','Delhi','Bangaloe','2022-12-16',1500,5,7500),('TCK005','cs001','Mohammed','Rizwan','8951775912','FLT003','Boein','Delhi','Bangaloe','2022-12-16',1500,1,1500);
/*!40000 ALTER TABLE `tickets` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-27  7:25:15
