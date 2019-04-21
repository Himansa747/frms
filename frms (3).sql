-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 02, 2019 at 01:11 PM
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
-- Table structure for table `bodyharmtype`
--

CREATE TABLE `bodyharmtype` (
  `bodyHarmTypeID` int(11) NOT NULL,
  `Harm_Detail` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `clinical_patient`
--

CREATE TABLE `clinical_patient` (
  `Patient_ID` varchar(100) NOT NULL,
  `Ward` varchar(100) DEFAULT NULL,
  `Bed_No` varchar(100) DEFAULT NULL,
  `Date_of_Admit` date DEFAULT NULL,
  `Time_of_Admit` time DEFAULT NULL,
  `Date_of_Discharge` date DEFAULT NULL,
  `Time_of_Discharge` time DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `jmo`
--

CREATE TABLE `jmo` (
  `name` varchar(70) NOT NULL,
  `username` varchar(20) NOT NULL,
  `Doctor_ID` varchar(100) NOT NULL,
  `NIC` varchar(20) NOT NULL,
  `password` varchar(200) NOT NULL,
  `email` varchar(50) NOT NULL,
  `contactNumber` varchar(10) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `accountType` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jmo`
--

INSERT INTO `jmo` (`name`, `username`, `Doctor_ID`, `NIC`, `password`, `email`, `contactNumber`, `Address`, `accountType`) VALUES
('chandima', 'chandima', '8923', '903120897v', '76edbc40b2ff193d520194623510bccf377df5976c0a9076835cf1746127d0dfde94c6507db8ea07b314ef4cec7fdebe0df59ea37002380a7315697f1c5d9eb2', 'chandima@gmail.com', '0776544077', 'No 34, Kumara Place, Colombo 7', 'AJMO'),
('lahiru', 'lahiru', '1244', '942123059v', '7ab8dcdc19de43fb488610a50d5c3d44426ad75c61375429b0f517a308d8b1fdf658d2054e1b60112a79b05bb27af458fb86912b60900f352f606dc4e2bde5f8', 'slahiru@gmail.com', '0773233400', 'No 34, Saman Road, Colombo 7', 'CJMO');

-- --------------------------------------------------------

--
-- Table structure for table `mlef`
--

CREATE TABLE `mlef` (
  `dateOfIssue` date NOT NULL,
  `MLEF_ID` varchar(30) NOT NULL,
  `Patient_ID` varchar(100) NOT NULL,
  `Police_ID` varchar(20) NOT NULL,
  `jmoId` varchar(10) NOT NULL,
  `NIC` varchar(20) NOT NULL,
  `hospital` varchar(60) NOT NULL,
  `ward` varchar(20) DEFAULT NULL,
  `admissionDate` date DEFAULT NULL,
  `admissionTime` time DEFAULT NULL,
  `bhtNumber` varchar(10) DEFAULT NULL,
  `examinationDate` date NOT NULL,
  `examinationTime` time NOT NULL,
  `dateOfDischarge` date DEFAULT NULL,
  `bodyHarmTypeId` int(11) NOT NULL,
  `internalInjuryDetails` text,
  `causavativeWeaponType` varchar(10) DEFAULT NULL,
  `otherWeaponDetails` varchar(40) DEFAULT NULL,
  `categoryOfHurt` varchar(30) DEFAULT NULL,
  `lifeEndangerFactor` varchar(5) DEFAULT NULL,
  `alcoholConsumptionDetails` varchar(30) DEFAULT NULL,
  `drugConsumtion` varchar(30) DEFAULT NULL,
  `sexualAssultDetails` text,
  `heymanPenetration` varchar(5) DEFAULT NULL,
  `analPenetration` varchar(5) DEFAULT NULL,
  `labialPenetration` varchar(5) DEFAULT NULL,
  `Investigations` text,
  `referals` text,
  `otherOpinions` text,
  `remarks` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `mlefbodyharm`
--

CREATE TABLE `mlefbodyharm` (
  `mlefid` int(30) NOT NULL,
  `bodyHarmType` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mlefbodyharm`
--

INSERT INTO `mlefbodyharm` (`mlefid`, `bodyHarmType`) VALUES
(8, 'cut'),
(8, 'explotion'),
(9, 'Burn'),
(9, 'Explosive'),
(9, 'None'),
(14, 'Abrasion'),
(14, 'Bite'),
(14, 'Burn'),
(14, 'Cut'),
(14, 'Explosive'),
(14, 'FireArm'),
(14, 'Fracture'),
(14, 'None'),
(14, 'Stab'),
(14, 'unknown1'),
(14, 'unknown2'),
(14, 'Unknown3'),
(16, 'Abrasion'),
(16, 'Bite'),
(16, 'Cut'),
(16, 'Explosive'),
(16, 'FireArm'),
(16, 'Unknown3'),
(17, 'Explosive'),
(17, 'None'),
(17, 'unknown2'),
(18, 'Abrasion'),
(18, 'Fracture');

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

-- --------------------------------------------------------

--
-- Table structure for table `mlefweapon`
--

CREATE TABLE `mlefweapon` (
  `mlefid` int(30) NOT NULL,
  `weapon` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mlefweapon`
--

INSERT INTO `mlefweapon` (`mlefid`, `weapon`) VALUES
(9, 'Blunt'),
(9, 'Explosive'),
(9, 'Firearm'),
(9, 'None'),
(9, 'Sharp'),
(14, 'Blunt'),
(14, 'Explosive'),
(14, 'Firearm'),
(14, 'None'),
(14, 'Sharp'),
(16, 'Blunt'),
(16, 'Explosive'),
(16, 'Firearm'),
(16, 'Sharp'),
(17, 'Blunt'),
(17, 'None'),
(17, 'Sharp'),
(18, 'Blunt');

-- --------------------------------------------------------

--
-- Table structure for table `mlef_police`
--

CREATE TABLE `mlef_police` (
  `Police_ID` varchar(20) NOT NULL,
  `MLEF_ID` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pathological_patient`
--

CREATE TABLE `pathological_patient` (
  `Patient_ID` varchar(100) NOT NULL,
  `Date_of_arrival` date NOT NULL,
  `Time_of_arrival` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `Title` varchar(20) DEFAULT NULL,
  `F_Name` varchar(100) NOT NULL,
  `L_Name` varchar(100) DEFAULT NULL,
  `Sex` varchar(20) DEFAULT NULL,
  `DateofBirth` date NOT NULL,
  `Patient_ID` varchar(100) NOT NULL,
  `Guardian` varchar(100) DEFAULT NULL,
  `address` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`Title`, `F_Name`, `L_Name`, `Sex`, `DateofBirth`, `Patient_ID`, `Guardian`, `address`) VALUES
(NULL, 'A.B. Senevi', NULL, NULL, '2018-08-21', '50, ingiriya Road, Padukka', NULL, '50, ingiriya Road, Padukka'),
(NULL, 'Kamal Perera', NULL, NULL, '2018-11-15', '93129020v', NULL, 'No 30, Flower Road, Colombo 12'),
(NULL, 'Saman Kumara', NULL, NULL, '2018-10-30', 'No 32, Ingiriya Road, Meegoda', NULL, 'No 32, Ingiriya Road, Meegoda');

-- --------------------------------------------------------

--
-- Table structure for table `policeofficer`
--

CREATE TABLE `policeofficer` (
  `name` varchar(200) NOT NULL,
  `username` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL,
  `email` varchar(200) NOT NULL,
  `contactNumber` varchar(10) NOT NULL,
  `Police_ID` varchar(20) NOT NULL,
  `accountType` varchar(20) NOT NULL,
  `Police_station` varchar(20) NOT NULL,
  `Officer_rank` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `policeofficer`
--

INSERT INTO `policeofficer` (`name`, `username`, `password`, `email`, `contactNumber`, `Police_ID`, `accountType`, `Police_station`, `Officer_rank`) VALUES
('Sunil Shantha', 'police', '33f51c0afa27df8878e42760d46963788aff4084a7a46cba34ef9e316bdf21782ebe118530696ebe40115ca39a36e9c73528a2570a2ad8e3e0c70bf27d25ef1e', 'sunil@gmail.com', '0761233122', '23432', 'HPLO', 'Ragama', 'PC');

-- --------------------------------------------------------

--
-- Table structure for table `postmortem_report`
--

CREATE TABLE `postmortem_report` (
  `SR` varchar(250) NOT NULL,
  `Police` varchar(250) DEFAULT NULL,
  `Police_ID` varchar(20) NOT NULL,
  `Patient_ID` varchar(100) NOT NULL,
  `INQUEST` varchar(250) NOT NULL,
  `Place` varchar(250) DEFAULT NULL,
  `Court` varchar(250) DEFAULT NULL,
  `Date_1` datetime(6) DEFAULT NULL,
  `CASE_No` varchar(250) DEFAULT NULL,
  `Name_of_Medical` varchar(250) DEFAULT NULL,
  `Doctor_NIC` varchar(20) DEFAULT NULL,
  `Examination_date` datetime(6) DEFAULT NULL,
  `Name_of_request` varchar(250) DEFAULT NULL,
  `District` varchar(250) DEFAULT NULL,
  `Place_of_Exam` varchar(250) DEFAULT NULL,
  `Name_of_idendifier` varchar(250) DEFAULT NULL,
  `Examnination_locous` varchar(500) DEFAULT NULL,
  `External_Examination` varchar(500) DEFAULT NULL,
  `Height` varchar(100) DEFAULT NULL,
  `Eyes_pupils` varchar(500) DEFAULT NULL,
  `Hair` varchar(500) DEFAULT NULL,
  `Tongue` varchar(500) DEFAULT NULL,
  `Tooth` varchar(500) DEFAULT NULL,
  `Sign_death` varchar(500) DEFAULT NULL,
  `Flaccidity` varchar(500) DEFAULT NULL,
  `Rigor_mortis` varchar(500) DEFAULT NULL,
  `Hypostasis` varchar(500) DEFAULT NULL,
  `Puterfaction` varchar(500) DEFAULT NULL,
  `Hand` varchar(500) DEFAULT NULL,
  `Openings` varchar(500) DEFAULT NULL,
  `Nose` varchar(500) DEFAULT NULL,
  `Urinary` varchar(500) DEFAULT NULL,
  `Anal` varchar(500) DEFAULT NULL,
  `Neck` varchar(500) DEFAULT NULL,
  `Soft_tissues` varchar(500) DEFAULT NULL,
  `Head` varchar(500) DEFAULT NULL,
  `Soft_parts` varchar(500) DEFAULT NULL,
  `Skull` varchar(500) DEFAULT NULL,
  `Membranes` varchar(500) DEFAULT NULL,
  `Brain_substance` varchar(500) DEFAULT NULL,
  `Blood_vasela_brain` varchar(500) DEFAULT NULL,
  `Spain_cord` varchar(500) DEFAULT NULL,
  `Thorax` varchar(500) DEFAULT NULL,
  `Soft_part_1` varchar(500) DEFAULT NULL,
  `Ribs` varchar(500) DEFAULT NULL,
  `Chest` varchar(500) DEFAULT NULL,
  `Pericardium` varchar(500) DEFAULT NULL,
  `Heart` varchar(500) DEFAULT NULL,
  `Coronary_vessels` varchar(500) DEFAULT NULL,
  `Large_blood` varchar(500) DEFAULT NULL,
  `Larynax` varchar(500) DEFAULT NULL,
  `Pleura` varchar(500) DEFAULT NULL,
  `Gullet` varchar(500) DEFAULT NULL,
  `Abdomen` varchar(500) DEFAULT NULL,
  `Organs` varchar(500) DEFAULT NULL,
  `Peritoneum` varchar(500) DEFAULT NULL,
  `Diaphragm` varchar(500) DEFAULT NULL,
  `Liver` varchar(500) DEFAULT NULL,
  `Spleen` varchar(500) DEFAULT NULL,
  `Stomach` varchar(500) DEFAULT NULL,
  `Duodenum` varchar(500) DEFAULT NULL,
  `Large_intenstines` varchar(500) DEFAULT NULL,
  `Pancreas` varchar(500) DEFAULT NULL,
  `Kidneys` varchar(500) DEFAULT NULL,
  `Supra_renal_glands` varchar(500) DEFAULT NULL,
  `Pelvis` varchar(500) DEFAULT NULL,
  `Urinary_bladder` varchar(500) DEFAULT NULL,
  `Generative_organs` varchar(500) DEFAULT NULL,
  `Blood_vessels` varchar(500) DEFAULT NULL,
  `Vertebrae` varchar(500) DEFAULT NULL,
  `Relevent_cause` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bodyharmtype`
--
ALTER TABLE `bodyharmtype`
  ADD PRIMARY KEY (`bodyHarmTypeID`);

--
-- Indexes for table `clinical_patient`
--
ALTER TABLE `clinical_patient`
  ADD PRIMARY KEY (`Patient_ID`);

--
-- Indexes for table `jmo`
--
ALTER TABLE `jmo`
  ADD PRIMARY KEY (`NIC`);

--
-- Indexes for table `mlef`
--
ALTER TABLE `mlef`
  ADD PRIMARY KEY (`MLEF_ID`),
  ADD KEY `FK_MLEF_Patient` (`Patient_ID`),
  ADD KEY `FK_JMO_mlef` (`NIC`),
  ADD KEY `FK_police_mlef` (`Police_ID`);

--
-- Indexes for table `mlefbodyharm`
--
ALTER TABLE `mlefbodyharm`
  ADD PRIMARY KEY (`mlefid`,`bodyHarmType`);

--
-- Indexes for table `mleform`
--
ALTER TABLE `mleform`
  ADD PRIMARY KEY (`number`),
  ADD KEY `mleformDoctor` (`jmoId`);

--
-- Indexes for table `mlefweapon`
--
ALTER TABLE `mlefweapon`
  ADD PRIMARY KEY (`mlefid`,`weapon`);

--
-- Indexes for table `mlef_police`
--
ALTER TABLE `mlef_police`
  ADD PRIMARY KEY (`Police_ID`,`MLEF_ID`),
  ADD KEY `FK_MLEF_mlef_polce` (`MLEF_ID`);

--
-- Indexes for table `pathological_patient`
--
ALTER TABLE `pathological_patient`
  ADD PRIMARY KEY (`Patient_ID`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`Patient_ID`);

--
-- Indexes for table `policeofficer`
--
ALTER TABLE `policeofficer`
  ADD PRIMARY KEY (`Police_ID`);

--
-- Indexes for table `postmortem_report`
--
ALTER TABLE `postmortem_report`
  ADD PRIMARY KEY (`SR`),
  ADD KEY `FK_police_postmortem_report` (`Police_ID`),
  ADD KEY `FK_patient_postmortem_report` (`Patient_ID`),
  ADD KEY `FK_JMO_postmortem_report` (`Doctor_NIC`);

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
-- Constraints for table `clinical_patient`
--
ALTER TABLE `clinical_patient`
  ADD CONSTRAINT `FK_PID` FOREIGN KEY (`Patient_ID`) REFERENCES `patient` (`Patient_ID`);

--
-- Constraints for table `mlef`
--
ALTER TABLE `mlef`
  ADD CONSTRAINT `FK_JMO_mlef` FOREIGN KEY (`NIC`) REFERENCES `jmo` (`NIC`),
  ADD CONSTRAINT `FK_MLEF_Patient` FOREIGN KEY (`Patient_ID`) REFERENCES `patient` (`Patient_ID`),
  ADD CONSTRAINT `FK_police_mlef` FOREIGN KEY (`Police_ID`) REFERENCES `policeofficer` (`Police_ID`);

--
-- Constraints for table `mlefbodyharm`
--
ALTER TABLE `mlefbodyharm`
  ADD CONSTRAINT `mlefbHarm` FOREIGN KEY (`mlefid`) REFERENCES `mleform` (`number`);

--
-- Constraints for table `mleform`
--
ALTER TABLE `mleform`
  ADD CONSTRAINT `mleformDoctor` FOREIGN KEY (`jmoId`) REFERENCES `jmo` (`NIC`);

--
-- Constraints for table `mlef_police`
--
ALTER TABLE `mlef_police`
  ADD CONSTRAINT `FK_MLEF_mlef_polce` FOREIGN KEY (`MLEF_ID`) REFERENCES `mlef` (`MLEF_ID`),
  ADD CONSTRAINT `FK_policeofficer_mlef_police` FOREIGN KEY (`Police_ID`) REFERENCES `policeofficer` (`Police_ID`);

--
-- Constraints for table `pathological_patient`
--
ALTER TABLE `pathological_patient`
  ADD CONSTRAINT `FK_PID_pathological_patient` FOREIGN KEY (`Patient_ID`) REFERENCES `patient` (`Patient_ID`);

--
-- Constraints for table `postmortem_report`
--
ALTER TABLE `postmortem_report`
  ADD CONSTRAINT `FK_JMO_postmortem_report` FOREIGN KEY (`Doctor_NIC`) REFERENCES `jmo` (`NIC`),
  ADD CONSTRAINT `FK_patient_postmortem_report` FOREIGN KEY (`Patient_ID`) REFERENCES `patient` (`Patient_ID`),
  ADD CONSTRAINT `FK_police_postmortem_report` FOREIGN KEY (`Police_ID`) REFERENCES `policeofficer` (`Police_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
