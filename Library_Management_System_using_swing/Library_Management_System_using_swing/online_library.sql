-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 14, 2019 at 01:14 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `online_library`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `Username` varchar(50) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `Security_Q` varchar(50) NOT NULL,
  `Answer` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`Username`, `Name`, `Password`, `Security_Q`, `Answer`) VALUES
('mahmud', 'MAhmudul Islam', '12345', 'What is the name of your fabourite Book ?', 'Cone of Silence'),
('mahmud35', 'Mahmudul Islam', 'debugger', 'What is the name of your fabourite Writer?', 'Humayan Ahmed'),
('mahmud73', 'mahmudul islam', 'debugger35', 'Which langugae you are cofortable in ?  ', 'Bangla');

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE `book` (
  `Book_ID` int(11) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Edition` int(11) NOT NULL,
  `Publisher` varchar(30) NOT NULL,
  `Price` int(11) NOT NULL,
  `Pages` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`Book_ID`, `Name`, `Edition`, `Publisher`, `Price`, `Pages`) VALUES
(174, 'Learn Java in a hard way', 2, 'Princeton', 300, 200),
(393, 'Java the complete reference', 4, 'mit', 300, 900),
(899, 'How to Java', 9, 'pearson', 400, 1000);

-- --------------------------------------------------------

--
-- Table structure for table `issue`
--

CREATE TABLE `issue` (
  `Book_ID` int(11) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Edition` int(11) NOT NULL,
  `Publisher` varchar(30) NOT NULL,
  `Price` int(11) NOT NULL,
  `Pages` int(11) NOT NULL,
  `Student_ID` int(11) NOT NULL,
  `Sname` varchar(30) NOT NULL,
  `Department` varchar(30) NOT NULL,
  `Year` int(11) NOT NULL,
  `Semester` int(11) NOT NULL,
  `Issue_date` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `return_t`
--

CREATE TABLE `return_t` (
  `Student_ID` int(11) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Department` varchar(30) NOT NULL,
  `Year` int(11) NOT NULL,
  `Semester` int(11) NOT NULL,
  `Book_ID` int(11) NOT NULL,
  `Book_Name` varchar(30) NOT NULL,
  `Edition` int(11) NOT NULL,
  `Publisher` varchar(30) NOT NULL,
  `Price` int(11) NOT NULL,
  `Pages` int(11) NOT NULL,
  `Issue_date` varchar(30) NOT NULL,
  `Return_date` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `return_t`
--

INSERT INTO `return_t` (`Student_ID`, `Name`, `Department`, `Year`, `Semester`, `Book_ID`, `Book_Name`, `Edition`, `Publisher`, `Price`, `Pages`, `Issue_date`, `Return_date`) VALUES
(205, 'Mahmud', 'CSE', 4, 2, 899, 'How to Java', 9, 'pearson', 400, 1000, '', '14/4/2019'),
(981, 'Mahmudul Islam', 'CSE', 4, 2, 393, 'Java the complete reference', 4, 'mit', 300, 900, '15 april 2019 ', '15 april 2019');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `Student_ID` int(11) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Department` varchar(30) NOT NULL,
  `Year` int(11) NOT NULL,
  `Semester` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`Student_ID`, `Name`, `Department`, `Year`, `Semester`) VALUES
(205, 'Mahmud', 'CSE', 4, 2),
(410, 'mahmud', 'CSE', 1, 1),
(981, 'Mahmudul Islam', 'CSE', 4, 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`Username`);

--
-- Indexes for table `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`Book_ID`);

--
-- Indexes for table `issue`
--
ALTER TABLE `issue`
  ADD PRIMARY KEY (`Book_ID`),
  ADD UNIQUE KEY `Student_ID` (`Student_ID`);

--
-- Indexes for table `return_t`
--
ALTER TABLE `return_t`
  ADD PRIMARY KEY (`Student_ID`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`Student_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `book`
--
ALTER TABLE `book`
  MODIFY `Book_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=900;

--
-- AUTO_INCREMENT for table `issue`
--
ALTER TABLE `issue`
  MODIFY `Book_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=900;

--
-- AUTO_INCREMENT for table `return_t`
--
ALTER TABLE `return_t`
  MODIFY `Student_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=982;

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `Student_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=982;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
