-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 28, 2018 at 02:58 AM
-- Server version: 10.1.34-MariaDB
-- PHP Version: 7.2.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `frms`
--

-- --------------------------------------------------------

--
-- Table structure for table `mleform`
--

CREATE TABLE `mleform` (
  `PoliceStation` varchar(50) DEFAULT NULL,
  `dateOfIssue` date DEFAULT NULL,
  `number` int(30) NOT NULL,
  `examineeName` varchar(100) DEFAULT NULL,
  `examineeAddress` varchar(150) DEFAULT NULL,
  `examineeNIC` varchar(50) DEFAULT NULL,
  `examinationReason` varchar(200) DEFAULT NULL,
  `policeOfficerName` varchar(70) DEFAULT NULL,
  `officerRank` varchar(20) DEFAULT NULL,
  `jmoId` varchar(10) DEFAULT NULL,
  `hospital` varchar(60) DEFAULT NULL,
  `ward` varchar(20) DEFAULT NULL,
  `admissionDate` date DEFAULT NULL,
  `admissionTime` time DEFAULT NULL,
  `bhtNumber` varchar(10) DEFAULT NULL,
  `examinationDate` date DEFAULT NULL,
  `examinationTime` time DEFAULT NULL,
  `dateOfDischarge` date DEFAULT NULL,
  `bodyHarmTypeId` varchar(11) DEFAULT NULL,
  `internalInjuryDetails` text,
  `otherInjuryDetails` varchar(200) DEFAULT NULL,
  `causavativeWeaponType` varchar(10) DEFAULT NULL,
  `otherWeaponDetails` varchar(40) DEFAULT NULL,
  `categoryOfHurt` varchar(30) DEFAULT NULL,
  `lifeEndangerFactor` varchar(30) DEFAULT NULL,
  `alcoholConsumptionDetails` varchar(30) DEFAULT NULL,
  `drugConsumtion` varchar(30) DEFAULT NULL,
  `sexualAssultDetails` text,
  `heymanPenetration` varchar(200) DEFAULT NULL,
  `analPenetration` varchar(200) DEFAULT NULL,
  `labialPenetration` varchar(200) DEFAULT NULL,
  `Investigations` text,
  `referals` text,
  `otherOpinions` text,
  `remarks` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mleform`
--

INSERT INTO `mleform` (`PoliceStation`, `dateOfIssue`, `number`, `examineeName`, `examineeAddress`, `examineeNIC`, `examinationReason`, `policeOfficerName`, `officerRank`, `jmoId`, `hospital`, `ward`, `admissionDate`, `admissionTime`, `bhtNumber`, `examinationDate`, `examinationTime`, `dateOfDischarge`, `bodyHarmTypeId`, `internalInjuryDetails`, `otherInjuryDetails`, `causavativeWeaponType`, `otherWeaponDetails`, `categoryOfHurt`, `lifeEndangerFactor`, `alcoholConsumptionDetails`, `drugConsumtion`, `sexualAssultDetails`, `heymanPenetration`, `analPenetration`, `labialPenetration`, `Investigations`, `referals`, `otherOpinions`, `remarks`) VALUES
('Homagama', '2018-11-12', 1, 'H.K.Perera', 'Sumanadasa Road, Panagoda', NULL, NULL, 'H.S. Kumara', 'PC', '942123059v', 'Awissawella', 'null', '2018-11-28', '12:32:00', '3', '2018-11-14', '23:34:00', '2018-11-28', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('Homagama', '2018-11-12', 2, 'H.K.Perera', 'Sumanadasa Road, Panagoda', NULL, NULL, 'H.S. Kumara', 'PC', '942123059v', 'Awissawella', 'null', '2018-11-28', '12:32:00', '3', '2018-11-14', '23:34:00', '2018-11-28', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('Ingiriya', '2018-11-09', 3, 'Kasun', 'No 34, Ihalagama, Godagama', '943120650v', 'NA', 'Sunil Perera', 'PC', '942123059v', 'Panagoda', '2', '2018-11-14', '23:32:00', '3', '2018-11-28', '23:34:00', '2018-11-19', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('1', '2018-11-09', 8, '3', '4', '942123059v', 'NA', 'xxccvwe', 'sdf', '942123059v', 'sdsf', 'dfdgfdg', '2018-11-06', '22:34:00', 'dsf', '2018-11-22', '23:43:00', '2018-11-20', ' ', 'None', 'None2', ' ', 'None3', 'Grievious', 'Grievious', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('1', '2018-11-09', 9, '3', '4', '942123059v', 'NA', 'xxccvwe', 'sdf', '942123059v', 'sdsf', 'dfdgfdg', '2018-11-06', '22:34:00', 'dsf', '2018-11-22', '23:43:00', '2018-11-20', ' ', 'None', 'None2', ' ', 'None3', 'Grievious', 'Grievious', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('Wadduwa', '2018-11-17', 10, 'Anil', 'No 34, Colombo', '345675678v', 'NA', 'Kamal Perera', 'PC', '942123059v', 'Awissawella', '12', '2018-11-14', '23:22:00', '4', '2018-11-28', '12:42:00', '2018-11-21', ' ', 'None', 'None2222', ' ', 'None3333', 'Grievious', 'GrieviousNo', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('Kurunagala', '2018-11-16', 11, 'Ajith Perera', 'No 45, Mawatha, Kurunagala', '894560569v', 'NA', 'Prasanna', 'PC', '942123059v', 'Awissawella', '12', '2018-11-13', '05:46:00', '4', '2018-11-14', '03:45:00', '2018-11-14', ' ', 'None8', 'None9', ' ', 'None7', 'Non-grievious', 'GrieviousYes', 'None', 'None', 'None', 'Signs of vaginal/heyman prenetration present Yes', 'Signs of anal prenetration present Yes', 'Signs consistant with labial penetration present No', 'INV', 'REF', 'OPN', 'NO'),
('Galle', '2018-11-08', 12, 'Suji Dias', 'No 32, Thissa Road, Galle', '894562568v', 'NA', 'Kamal Dias', 'SS', '942123059v', 'Galle', '12', '2018-11-22', '23:24:00', '3', '2018-11-22', '03:24:00', '2018-11-20', ' ', 'None', 'None', ' ', 'None', 'Non-grievious', 'GrieviousYes', 'Breathing Smelling', 'Consumed', 'None', 'Signs of vaginal/heyman prenetration present No', 'Signs of anal prenetration present No', 'Signs consistant with labial penetration present No', 'None', 'None', 'None', 'None'),
('Kollupitiya', '2018-11-09', 13, '12', 'Address1', '34623535v', 'NA', 'Kapila', 'SS', '942123059v', 'Galle', '23', '2018-11-05', '03:34:00', '3', '2018-11-08', '03:34:00', '2018-11-22', ' ', 'None', 'None', ' ', 'None', 'Non-grievious', 'GrieviousNo', 'None', 'None', 'None', 'Signs of vaginal/heyman prenetration present No', 'Signs of anal prenetration present No', 'Signs consistant with labial penetration present No', 'None', 'None', 'None', 'None'),
('Matara', '2018-11-15', 14, 'Name1', 'Address1', '345643067v', 'NA', 'Kapila', 'ss', '942123059v', 'Wadduwa', 'w', '2018-11-06', '05:54:00', '3', '2018-11-02', '03:24:00', '2018-11-28', ' ', 'None', 'None', ' ', 'None', 'Non-grievious', 'GrieviousNo', 'None', 'None', 'None', 'Signs of vaginal/heyman prenetration present No', 'Signs of anal prenetration present No', 'Signs consistant with labial penetration present No', 'None', 'None', 'None', 'None'),
('Wadduwa', '2018-11-14', 16, 'ExamineeName', 'addr', '23567987v', 'NA', 'Silva', '12', '942123059v', 'Fort', '33', '2018-11-14', '23:34:00', '234', '2018-11-15', '23:04:00', '2018-11-14', ' ', 'None', 'None', ' ', 'None', 'Non-grievious', 'GrieviousNo', 'None', 'None', 'None', 'Signs of vaginal/heyman prenetration present No', 'Signs of anal prenetration present No', 'Signs consistant with labial penetration present No', 'None', 'None', 'None', 'None'),
('Padukka1', '2018-11-16', 17, 'Kapila', 'No 23, Ingiriya', '33424', 'NA', 'FG', 'SC', '942123059v', 'D', 'D', '2018-11-14', '23:12:00', '3', '2018-11-14', '23:24:00', '2018-11-13', ' ', 'None', 'None', ' ', 'None', 'Non-grievious', 'GrieviousNo', 'None', 'None', 'None', 'Signs of vaginal/heyman prenetration present No', 'Signs of anal prenetration present No', 'Signs consistant with labial penetration present No', 'None', 'None', 'None', 'None'),
('Biyagama', '2018-11-29', 18, 'A.B. Senevi', '50, ingiriya Road, Padukka', '600201620V', 'sexual abuse', 'saman', 'PC - 28935', '942123059v', 'T.H. Ragama', '16', '2018-11-28', '05:25:00', '213453/18', '2018-11-29', '10:00:00', '2018-11-29', ' ', 'None', 'None', ' ', 'None', 'Grievious', 'GrieviousNo', 'Under Infulence', 'None', 'He was knocked down by a car at 2.30 pm at Kaduwela - biyagama Road. He did not lose his consciousness. ', 'Signs of vaginal/heyman prenetration present No', 'Signs of anal prenetration present No', 'Signs consistant with labial penetration present No', 'X-ray left leg film No: 4325', 'Radiologist', 'None', 'None');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `mleform`
--
ALTER TABLE `mleform`
  ADD PRIMARY KEY (`number`),
  ADD KEY `mleformDoctor` (`jmoId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `mleform`
--
ALTER TABLE `mleform`
  MODIFY `number` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `mleform`
--
ALTER TABLE `mleform`
  ADD CONSTRAINT `mleformDoctor` FOREIGN KEY (`jmoId`) REFERENCES `jmo` (`NIC`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
