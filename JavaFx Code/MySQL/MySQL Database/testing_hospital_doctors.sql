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
  `Contact` varchar(15) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctors`
--

LOCK TABLES `doctors` WRITE;
/*!40000 ALTER TABLE `doctors` DISABLE KEYS */;
INSERT INTO `doctors` VALUES (28,'Dr. Robert Brown','Male','Neurology','Mon: 9 AM, Thu: 11 AM','345-678-9012'),(29,'Dr. Lisa Taylor','Female','Pediatrics','Tue: 10 AM, Fri: 2 PM','456-789-0123'),(30,'Dr. Michael Lee','Male','Orthopedics','Wed: 1 PM, Sat: 3 PM','567-890-1234'),(31,'Dr. Sarah Wilson','Female','Oncology','Mon: 2 PM, Thu: 4 PM','678-901-2345'),(32,'Dr. David Anderson','Male','Radiology','Tue: 9 AM, Fri: 1 PM','789-012-3456'),(33,'Dr. Emily Thomas','Female','Pathology','Mon: 11 AM, Wed: 3 PM','890-123-4567'),(34,'Dr. James Jackson','Male','Gastroenterology','Tue: 2 PM, Thu: 4 PM','901-234-5678'),(35,'Dr. Karen White','Female','Psychiatry','Wed: 10 AM, Sat: 1 PM','012-345-6789'),(36,'Dr. Daniel Harris','Male','Urology','Mon: 12 PM, Fri: 3 PM','123-456-7809'),(37,'Dr. Jessica Martin','Female','Gynecology','Tue: 11 AM, Thu: 2 PM','234-567-8902'),(38,'Dr. Thomas Moore','Male','Ophthalmology','Mon: 9 AM, Wed: 1 PM','345-678-9013'),(39,'Dr. Jennifer Clark','Female','Nephrology','Tue: 10 AM, Fri: 4 PM','456-789-0124'),(40,'Dr. Richard Lewis','Male','Endocrinology','Wed: 11 AM, Sat: 2 PM','567-890-1235'),(41,'Dr. Olivia Walker','Female','Hematology','Mon: 10 AM, Thu: 1 PM','678-901-2346'),(42,'Dr. William Scott','Male','Rheumatology','Tue: 12 PM, Fri: 3 PM','789-012-3457'),(43,'Dr. Sophia Young','Female','Pulmonology','Wed: 9 AM, Sat: 4 PM','890-123-4568'),(44,'Dr. Charles King','Male','Immunology','Mon: 1 PM, Thu: 3 PM','901-234-5679'),(45,'Dr. Isabella Martinez','Female','General Surgery','Tue: 3 PM, Fri: 1 PM','012-345-6790'),(47,'Dr. Kobir Khan','Male','Pathology','Sun: 10 AM, Sun: 11 AM, Sun:12 PM','012345678936'),(49,'Dr. Joges Bosu','Male','Neurology','Fri: 10AM-3PM','0123456987'),(50,'Dr. ponir Mia','Male','Dermatology','Sun:10AM-1PM','0132546987');
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

-- Dump completed on 2024-12-03 15:42:55
