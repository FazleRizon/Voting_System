-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 19, 2023 at 08:58 PM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `votingsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `candidate`
--

CREATE TABLE `candidate` (
  `candidate_ID` int(11) NOT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `nid` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `election_name` varchar(100) DEFAULT NULL,
  `election_id` int(11) DEFAULT NULL,
  `symbol_name` varchar(20) DEFAULT NULL,
  `symbol_id` int(11) DEFAULT NULL,
  `symbol_path` varchar(50) DEFAULT NULL,
  `Vote` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `candidate`
--

INSERT INTO `candidate` (`candidate_ID`, `Name`, `nid`, `email`, `election_name`, `election_id`, `symbol_name`, `symbol_id`, `symbol_path`, `Vote`) VALUES
(7, 'Abul Kalam', '1234567893', 'abul123@gmail.com', 'Dhaka North City Corporation Election', 10, 'Airplane', 1, '/images/airplane.jpg', 7),
(8, 'Abdul Rashid', '0987654321', 'rashid456@gmail.com', 'Dhaka North City Corporation Election', 10, 'Bus', 2, '/images/bus.jpg', 5),
(9, 'Sattar Rahman', '5678932141', 'sattar789@gmail.com', 'Dhaka North City Corporation Election', 10, 'Car', 3, '/images/car.jpg', 6),
(10, 'Abul Bashar', '5678902341', 'abulbashar234@gmail.com', 'Dhaka North City Corporation Election', 10, 'Elephent', 4, '/images/elephent.jpg', 6),
(11, 'Lopa Rahman', '8907654321', 'loparahman456@gmail.com', 'Dhaka North City Corporation Election', 10, 'Horse', 5, '/images/horse.jpg', 3),
(12, 'Papia Jahan', '6785433332', 'papiajahan123@gmail.com', 'Dhaka North City Corporation Election', 10, 'Mango', 6, '/images/mango.png', 2);

-- --------------------------------------------------------

--
-- Table structure for table `elections`
--

CREATE TABLE `elections` (
  `ID` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Description` varchar(500) DEFAULT NULL,
  `StartTime` varchar(25) NOT NULL,
  `StopTime` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `elections`
--

INSERT INTO `elections` (`ID`, `Name`, `Description`, `StartTime`, `StopTime`) VALUES
(10, 'Dhaka North City Corporation Election', 'Dhaka North City Corporation (DNCC) election is a local government election held in Dhaka, Bangladesh to elect the mayor and councilors of the city corporation. The DNCC is responsible for providing basic services such as waste management, water supply, and road maintenance to the residents of the northern part of Dhaka.', '2023-02-11T10:00', '2023-02-11T17:00'),
(11, 'Mymensingh City Corporation Election', 'Mymensingh City Corporation Election', '2023-03-21T10:00', '2023-03-21T16:00');

-- --------------------------------------------------------

--
-- Table structure for table `symbols`
--

CREATE TABLE `symbols` (
  `id` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `path` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `symbols`
--

INSERT INTO `symbols` (`id`, `name`, `path`) VALUES
(1, 'Airplane', '/images/airplane.jpg'),
(2, 'Bus', '/images/bus.jpg'),
(3, 'Car', '/images/car.jpg'),
(4, 'Elephent', '/images/elephent.jpg'),
(5, 'Horse', '/images/horse.jpg'),
(6, 'Mango', '/images/mango.png'),
(7, 'Pineapple', '/images/pineapple.png'),
(8, 'Rabbit', '/images/Rabbit.jpg'),
(9, 'Train', '/images/Train.jpg'),
(10, 'Truck', '/images/Truck.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(6) UNSIGNED NOT NULL,
  `username` varchar(30) NOT NULL,
  `pass` varchar(30) NOT NULL,
  `isAdmin` tinyint(1) DEFAULT NULL,
  `isEnbaled` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `pass`, `isAdmin`, `isEnbaled`) VALUES
(1, 'admin', 'pass', 1, 1),
(2, 'hasanahmed23', '4567890123', 0, 0),
(3, 'mdrafiulislam', '5678901234', 0, 0),
(4, 'nusratjahan', '6789012345', 0, 0),
(5, 'shahriarhossain', '7890123456', 0, 0),
(6, 'anikaakter', '8901234567', 0, 0),
(7, 'mdabdulkader', '9012345678', 0, 0),
(8, 'fatemabegum', '0123456789', 0, 0),
(9, 'mdjashimuddin', '1234567890', 0, 0),
(10, 'sarwarhossain', '2345678901', 0, 0),
(11, 'fatemakhatun', '3456789012', 0, 0),
(12, 'mdabdulmannan', '4567890123', 0, 0),
(13, 'nahidhasan', '5678901234', 0, 0),
(14, 'mdrafiqulislam', '6789012345', 0, 0),
(15, 'mdabdulalim', '7890123456', 0, 0),
(16, 'mdanwarhossain', '8901234567', 0, 0),
(17, 'jahidhasan', '9012345678', 0, 0),
(18, 'nasimakter', '0123456789', 0, 0),
(19, 'mdkamalhossain', '1234567890', 0, 0),
(20, 'mdshahidulislam', '2345678901', 0, 0),
(21, 'aminabegum', '3456789012', 0, 0),
(22, 'mdsamirhossain', '4567890123', 0, 0),
(23, 'mdrashedulislam', '5678901234', 0, 0),
(24, 'mdshahalam', '6789012345', 0, 0),
(25, 'mdrafiulhaque', '7890123456', 0, 0),
(26, 'mdabdulquader', '8901234567', 0, 0),
(27, 'mdshafiulislam', '9012345678', 0, 0),
(28, 'nasimaakter', '0123456789', 0, 0),
(29, 'mdrobiulislam', '1234567890', 0, 0),
(30, 'mdmonirulislam', '2345678901', 0, 0),
(31, 'mdshovonislam', '3456789012', 0, 0),
(32, 'abhasan1', 'ym3onKYpKM', 0, 1);

-- --------------------------------------------------------

--
-- Table structure for table `voterinfo`
--

CREATE TABLE `voterinfo` (
  `voter_id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `nid` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `pass` varchar(50) NOT NULL,
  `election` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `voterinfo`
--

INSERT INTO `voterinfo` (`voter_id`, `name`, `nid`, `email`, `username`, `pass`, `election`) VALUES
(11, 'Hasan Ahmed', '1234567890', 'hasan.ahmed@gmail.com', 'hasanahmed23', '4567890123', 'Dhaka North City Corporation Election'),
(12, 'Md. Rafiul Islam', '2345678901', 'md.rafiul.islam@gmail.com', 'mdrafiulislam', '5678901234', 'Dhaka North City Corporation Election'),
(13, 'Nusrat Jahan', '3456789012', 'nusrat.jahan@gmail.com', 'nusratjahan', '6789012345', 'Dhaka North City Corporation Election'),
(14, 'Shahriar Hossain', '4567890123', 'shahriar.hossain@gmail.com', 'shahriarhossain', '7890123456', 'Dhaka North City Corporation Election'),
(15, 'Anika Akter', '5678901234', 'anika.akter@gmail.com', 'anikaakter', '8901234567', 'Dhaka North City Corporation Election'),
(16, 'Md. Abdul Kader', '6789012345', 'md.abdul.kader@gmail.com', 'mdabdulkader', '9012345678', 'Dhaka North City Corporation Election'),
(17, 'Fatema Begum', '7890123456', 'fatema.begum@gmail.com', 'fatemabegum', '0123456789', 'Dhaka North City Corporation Election'),
(18, 'Md. Jashim Uddin', '8901234567', 'md.jashim.uddin@gmail.com', 'mdjashimuddin', '1234567890', 'Dhaka North City Corporation Election'),
(19, 'Sarwar Hossain', '9012345678', 'sarwar.hossain@gmail.com', 'sarwarhossain', '2345678901', 'Dhaka North City Corporation Election'),
(20, 'Fatema Khatun', '0123456789', 'fatema.khatun@gmail.com', 'fatemakhatun', '3456789012', 'Dhaka North City Corporation Election'),
(21, 'Md. Abdul Mannan', '1234567890', 'md.abdul.mannan@gmail.com', 'mdabdulmannan', '4567890123', 'Dhaka North City Corporation Election'),
(22, 'Nahid Hasan', '2345678901', 'nahid.hasan@gmail.com', 'nahidhasan', '5678901234', 'Dhaka North City Corporation Election'),
(23, 'Md. Rafiqul Islam', '3456789012', 'md.rafiqul.islam@gmail.com', 'mdrafiqulislam', '6789012345', 'Dhaka North City Corporation Election'),
(24, 'Md. Abdul Alim', '4567890123', 'md.abdul.alim@gmail.com', 'mdabdulalim', '7890123456', 'Dhaka North City Corporation Election'),
(25, 'Md. Anwar Hossain', '5678901234', 'md.anwar.hossain@gmail.com', 'mdanwarhossain', '8901234567', 'Dhaka North City Corporation Election'),
(26, 'Jahid Hasan', '6789012345', 'jahid.hasan@gmail.com', 'jahidhasan', '9012345678', 'Dhaka North City Corporation Election'),
(27, 'Nasim Akter', '7890123456', 'nasim.akter@gmail.com', 'nasimakter', '0123456789', 'Dhaka North City Corporation Election'),
(28, 'Md. Kamal Hossain', '8901234567', 'md.kamal.hossain@gmail.com', 'mdkamalhossain', '1234567890', 'Dhaka North City Corporation Election'),
(29, 'Md. Shahidul Islam', '9012345678', 'md.shahidul.islam@gmail.com', 'mdshahidulislam', '2345678901', 'Dhaka North City Corporation Election'),
(30, 'Amina Begum', '0123456789', 'amina.begum@gmail.com', 'aminabegum', '3456789012', 'Dhaka North City Corporation Election'),
(31, 'Md. Samir Hossain', '1234567890', 'md.samir.hossain@gmail.com', 'mdsamirhossain', '4567890123', 'Dhaka North City Corporation Election'),
(32, 'Md. Rashedul Islam', '2345678901', 'md.rashedul.islam@gmail.com', 'mdrashedulislam', '5678901234', 'Dhaka North City Corporation Election'),
(33, 'Md. Shah Alam', '3456789012', 'md.shah.alam@gmail.com', 'mdshahalam', '6789012345', 'Dhaka North City Corporation Election'),
(34, 'Md. Rafiul Haque', '4567890123', 'md.rafiul.haque@gmail.com', 'mdrafiulhaque', '7890123456', 'Dhaka North City Corporation Election'),
(35, 'Md. Abdul Quader', '5678901234', 'md.abdul.quader@gmail.com', 'mdabdulquader', '8901234567', 'Dhaka North City Corporation Election'),
(36, 'Md. Shafiul Islam', '6789012345', 'md.shafiul.islam@gmail.com', 'mdshafiulislam', '9012345678', 'Dhaka North City Corporation Election'),
(37, 'Nasima Akter', '7890123456', 'nasima.akter@gmail.com', 'nasimaakter', '0123456789', 'Dhaka North City Corporation Election'),
(38, 'Md. Robiul Islam', '8901234567', 'md.robiul.islam@gmail.com', 'mdrobiulislam', '1234567890', 'Dhaka North City Corporation Election'),
(39, 'Md. Monirul Islam', '9012345678', 'md.monirul.islam@gmail.com', 'mdmonirulislam', '2345678901', 'Dhaka North City Corporation Election'),
(40, 'Md. Shovon Islam', '0123456789', 'md.shovon.islam@gmail.com', 'mdshovonislam', '3456789012', 'Dhaka North City Corporation Election'),
(41, 'Abul Hasan', '5694870361', 'abhasan@gmail.com', 'abhasan1', 'ym3onKYpKM', 'Mymensingh City Corporation Election');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `candidate`
--
ALTER TABLE `candidate`
  ADD PRIMARY KEY (`candidate_ID`);

--
-- Indexes for table `elections`
--
ALTER TABLE `elections`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `symbols`
--
ALTER TABLE `symbols`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `voterinfo`
--
ALTER TABLE `voterinfo`
  ADD PRIMARY KEY (`voter_id`),
  ADD UNIQUE KEY `usename` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `candidate`
--
ALTER TABLE `candidate`
  MODIFY `candidate_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
--
-- AUTO_INCREMENT for table `elections`
--
ALTER TABLE `elections`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `symbols`
--
ALTER TABLE `symbols`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(6) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;
--
-- AUTO_INCREMENT for table `voterinfo`
--
ALTER TABLE `voterinfo`
  MODIFY `voter_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=42;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
