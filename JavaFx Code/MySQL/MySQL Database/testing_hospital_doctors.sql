-- MySQL dump 10.13  Distrib 8.0.40, for Win64 (x86_64)
--
-- Host: localhost    Database: testing_hospital
-- ------------------------------------------------------
-- Server version	8.0.40

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
-- Table structure for table `doctors`
--

DROP TABLE IF EXISTS `doctors`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `doctors` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `specialization` varchar(50) DEFAULT NULL,
  `schedule` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctors`
--

LOCK TABLES `doctors` WRITE;
/*!40000 ALTER TABLE `doctors` DISABLE KEYS */;
INSERT INTO `doctors` VALUES (1,'Dr. John Doe','Male','Cardiology','Mon: 10 AM, Wed: 2 PM, Fri: 4 PM'),(2,'Dr. Jane Smith','Female','Dermatology','Tue: 11 AM, Thu: 3 PM'),(3,'Dr. Mary Johnson','Female','Orthopedics','Mon: 9 AM, Thu: 1 PM'),(4,'Dr. James Brown','Male','Orthopedics','Tue: 10 AM, Fri: 3 PM'),(5,'Dr. William Lee','Male','Cardiology','Mon: 8 AM, Wed: 4 PM, Fri: 2 PM'),(6,'Dr. John Doe','Male','Cardiology','Sun: 12:00 PM, Mon: 2:00 PM,Wed: 5:00 PM'),(7,'Dr. Jane Smith','Female','Dermatology','10:00 AM - 1:00 PM, 3:00 PM - 6:00 PM'),(8,'Dr. Richard Roe','Male','Orthopedics','8:00 AM - 11:00 AM, 1:00 PM - 4:00 PM'),(9,'Dr. Emily Davis','Female','Cardiology','9:30 AM - 12:30 PM, 2:30 PM - 5:30 PM'),(10,'Dr. Mark Wilson','Male','Orthopedics','9:00 AM - 12:00 PM, 2:00 PM - 5:00 PM'),(11,'Dr. Sarah Lee','Female','Dermatology','10:00 AM - 1:00 PM, 3:00 PM - 6:00 PM'),(12,'Dr. Thomas Clark','Male','Neurology','8:30 AM - 11:30 AM, 1:30 PM - 4:30 PM'),(13,'Dr. Rachel Green','Female','Pediatrics','9:00 AM - 12:00 PM, 2:00 PM - 5:00 PM'),(14,'Dr. Michael Harris','Male','Psychiatry','10:00 AM - 1:00 PM, 3:00 PM - 6:00 PM'),(15,'Dr. Jessica Martin','Female','Obstetrics','7:30 AM - 10:30 AM, 12:30 PM - 3:30 PM'),(16,'Dr. William White','Male','Surgery','8:00 AM - 12:00 PM, 1:00 PM - 5:00 PM'),(17,'Dr. Olivia Brown','Female','Gynecology','9:00 AM - 1:00 PM, 2:00 PM - 5:00 PM'),(18,'Dr. David Johnson','Male','Urology','8:00 AM - 11:00 AM, 12:00 PM - 4:00 PM'),(19,'Dr. Laura King','Female','Internal Medicine','9:30 AM - 12:30 PM, 1:30 PM - 4:30 PM'),(20,'Dr. Andrew Thomas','Male','Endocrinology','10:00 AM - 1:00 PM, 2:00 PM - 5:00 PM'),(21,'Dr. Karen White','Female','Ophthalmology','9:00 AM - 12:00 PM, 1:00 PM - 4:00 PM'),(22,'Dr. Steven Walker','Male','Dentistry','8:30 AM - 11:30 AM, 2:00 PM - 5:00 PM'),(23,'Dr. Patricia Hall','Female','Gastroenterology','9:00 AM - 12:00 PM, 1:30 PM - 4:30 PM'),(24,'Dr. Brian Lee','Male','Rheumatology','8:00 AM - 11:00 AM, 2:00 PM - 5:00 PM'),(25,'Dr. Megan Clark','Female','Infectious Diseases','10:00 AM - 1:00 PM, 3:00 PM - 6:00 PM');
/*!40000 ALTER TABLE `doctors` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-12-03 11:05:39
