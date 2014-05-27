-- phpMyAdmin SQL Dump
-- version 4.1.4
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mar 27 Mai 2014 à 14:29
-- Version du serveur :  5.6.15-log
-- Version de PHP :  5.4.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `projet_adw`
--

-- --------------------------------------------------------

--
-- Structure de la table `acteur`
--

CREATE TABLE IF NOT EXISTS `acteur` (
  `id_acteur` int(11) NOT NULL,
  PRIMARY KEY (`id_acteur`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `acteur`
--

INSERT INTO `acteur` (`id_acteur`) VALUES
(86),
(88),
(91),
(94),
(97),
(100),
(102),
(104),
(106),
(108),
(110),
(111),
(112),
(113),
(114),
(118),
(121);

-- --------------------------------------------------------

--
-- Structure de la table `acteur_film`
--

CREATE TABLE IF NOT EXISTS `acteur_film` (
  `id_acteur_film` int(11) NOT NULL,
  `id_film_film` int(11) NOT NULL,
  `confirme` int(11) NOT NULL,
  PRIMARY KEY (`id_acteur_film`,`id_film_film`),
  KEY `id_film_film` (`id_film_film`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `acteur_film`
--

INSERT INTO `acteur_film` (`id_acteur_film`, `id_film_film`, `confirme`) VALUES
(86, 84, 0),
(88, 84, 0),
(91, 84, 0),
(94, 84, 0),
(97, 84, 0),
(100, 84, 0),
(112, 110, 0),
(113, 112, 0),
(114, 114, 0);

-- --------------------------------------------------------

--
-- Structure de la table `film`
--

CREATE TABLE IF NOT EXISTS `film` (
  `id_film` int(11) NOT NULL AUTO_INCREMENT,
  `titre_film` varchar(200) NOT NULL,
  `annee_film` int(4) NOT NULL,
  `cout_film` double NOT NULL,
  `photo_film` varchar(200) DEFAULT NULL,
  `confirme` int(11) NOT NULL,
  PRIMARY KEY (`id_film`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=138 ;

--
-- Contenu de la table `film`
--

INSERT INTO `film` (`id_film`, `titre_film`, `annee_film`, `cout_film`, `photo_film`, `confirme`) VALUES
(1, 'Star Wars', 1978, 200000.1, NULL, 0),
(2, 'Star Wars', 1978, 200000.1, NULL, 0),
(3, 'Star Wars', 1978, 200000.1, NULL, 0),
(4, 'les boules Wars', 1978, 200000.1, NULL, 0),
(5, 'les boules Wars', 1978, 200000.1, NULL, 0),
(6, 'les boules Wars', 1978, 200000.1, NULL, 0),
(7, 'les boules Wars', 1978, 200000.1, NULL, 0),
(8, 'les boules Wars', 1978, 200000.1, NULL, 0),
(9, 'les boules Wars', 1978, 200000.1, NULL, 0),
(10, 'les boules Wars', 1978, 200000.1, NULL, 0),
(11, 'les boules Wars', 1978, 200000.1, NULL, 0),
(12, 'les boules Wars', 1978, 200000.1, NULL, 0),
(13, 'les boules Wars', 1978, 200000.1, NULL, 0),
(14, 'les boules Wars', 1978, 200000.1, NULL, 0),
(15, 'les boules Wars', 1978, 200000.1, NULL, 0),
(16, 'les boules Wars', 1978, 200000.1, NULL, 0),
(17, 'les boules Wars', 1978, 200000.1, NULL, 0),
(18, 'les boules Wars', 1978, 200000.1, NULL, 0),
(19, 'les boules Wardfs', 1978, 200000.1, NULL, 0),
(20, 'les boules Wardfs', 1978, 200000.1, NULL, 0),
(21, 'les boules Wardfs', 1978, 200000.1, NULL, 0),
(22, 'les boules Wardfs', 1978, 200000.1, NULL, 0),
(23, 'les boules Wardfs', 1978, 200000.1, NULL, 0),
(24, 'les boules Wardfs', 1978, 200000.1, NULL, 0),
(25, 'les boules Wardfs', 1978, 200000.1, NULL, 0),
(26, 'les boules Wardfs', 1978, 200000.1, NULL, 0),
(27, 'les boules Wardfs', 1978, 200000.1, NULL, 0),
(28, 'les boules Wardfs', 1978, 200000.1, NULL, 0),
(29, 'les boules Wardfs', 1978, 200000.1, NULL, 0),
(30, 'les boules Wardfs', 1978, 200000.1, NULL, 0),
(31, 'Star Wars', 1978, 200000.1, NULL, 0),
(32, 'Star Wars', 1978, 200000.1, NULL, 0),
(33, 'Star Wars', 1978, 200000.1, NULL, 0),
(34, 'Titanic', 1997, 200000.1, NULL, 0),
(35, 'Titanic', 1997, 200000.1, NULL, 0),
(36, 'Titanic', 1997, 200000.1, NULL, 0),
(37, 'Titanic', 1997, 200000.1, NULL, 0),
(38, 'Titanic', 1997, 200000.1, NULL, 0),
(39, 'Titanic', 1997, 200000.1, NULL, 0),
(40, 'Titanic', 1997, 200000.1, NULL, 0),
(41, 'Titanic', 1997, 200000.1, NULL, 0),
(42, 'Titanic', 1997, 200000.1, NULL, 0),
(43, 'Titanic', 1997, 200000.1, NULL, 0),
(44, 'Titanic', 1997, 200000.1, NULL, 0),
(45, 'Titanic', 1997, 200000.1, NULL, 0),
(46, 'Titanic', 1997, 200000.1, NULL, 0),
(47, 'Titanic', 1997, 200000.1, NULL, 0),
(48, 'Titanic', 1997, 200000.1, NULL, 0),
(49, 'Titanic', 1997, 200000.1, NULL, 0),
(50, 'Titanic', 1997, 200000.1, NULL, 0),
(51, 'Titanic', 1997, 200000.1, NULL, 0),
(52, 'Titanic', 1997, 200000.1, NULL, 0),
(53, 'Titanic', 1997, 200000.1, NULL, 0),
(54, 'Titanic', 1997, 200000.1, NULL, 0),
(55, 'Titanic', 1997, 200000.1, NULL, 0),
(56, 'Titanic', 1997, 200000.1, NULL, 0),
(57, 'Titanic', 1997, 200000.1, NULL, 0),
(58, 'Titanic', 1997, 200000.1, NULL, 0),
(59, 'Titanic', 1997, 200000.1, NULL, 0),
(60, 'Titanic', 1997, 200000.1, NULL, 0),
(61, 'Titanic', 1997, 200000.1, NULL, 0),
(62, 'Titanic', 1997, 200000.1, NULL, 0),
(63, 'Titanic', 1997, 200000.1, NULL, 0),
(64, 'Titanic', 1997, 200000.1, NULL, 0),
(65, 'Titanic', 1997, 200000.1, NULL, 0),
(66, 'Titanic', 1997, 200000.1, NULL, 0),
(67, 'Titanic', 1997, 200000.1, NULL, 0),
(68, 'Titanic', 1997, 200000.1, NULL, 0),
(69, 'Titanic', 1997, 200000.1, NULL, 0),
(70, 'Titanic', 1997, 200000.1, NULL, 0),
(71, 'Titanic', 1997, 200000.1, NULL, 0),
(72, 'Soldat Ryan', 1997, 200000.1, NULL, 0),
(73, 'Soldat Ryan', 1997, 200000.1, NULL, 0),
(74, 'Soldat Ryan', 1997, 200000.1, NULL, 0),
(75, 'Soldat Ryan', 1997, 200000.1, NULL, 0),
(76, 'Soldat Ryan', 1997, 200000.1, NULL, 0),
(77, 'Soldat Ryan', 1997, 200000.1, NULL, 0),
(78, 'Soldat Ryan', 1997, 200000.1, NULL, 0),
(79, 'Soldat Ryan', 1997, 200000.1, NULL, 0),
(80, 'Soldat Ryan', 1997, 200000.1, NULL, 0),
(81, 'Soldat Ryan', 1997, 200000.1, NULL, 0),
(82, 'Soldat Ryan', 1997, 200000.1, NULL, 0),
(83, 'Soldat Ryan', 1997, 200000.1, NULL, 0),
(84, 'Soldat Ryan', 1997, 200000.1, NULL, 0),
(85, 'Soldat Ryan', 1997, 200000.1, NULL, 0),
(86, 'Soldat Ryan', 1997, 200000.1, NULL, 0),
(87, 'Soldat Ryan', 1997, 200000.1, NULL, 0),
(88, 'Soldat Ryan', 1997, 200000.1, NULL, 0),
(89, 'Soldat Ryan', 1997, 200000.1, NULL, 0),
(90, 'Soldat Ryan', 1997, 200000.1, NULL, 0),
(91, 'Soldat Ryan', 1997, 200000.1, NULL, 0),
(92, 'Soldat Ryan', 1997, 200000.1, NULL, 0),
(93, 'Soldat Ryan', 1997, 200000.1, NULL, 0),
(94, 'Soldat Ryan', 1997, 200000.1, NULL, 0),
(95, 'Soldat Ryan', 1997, 200000.1, NULL, 0),
(96, 'Soldat Ryan', 1997, 200000.1, NULL, 0),
(97, 'Soldat Ryan', 1997, 200000.1, NULL, 0),
(98, 'Soldat Ryan', 1997, 200000.1, NULL, 0),
(99, 'Star Wars: La Menace Fantôme', 1997, 200000.1, NULL, 0),
(100, 'Star Wars: La Menace Fantôme', 1997, 200000.1, NULL, 0),
(101, 'soldat', 1996, 14555, NULL, 0),
(102, 'Titanic', 1997, 200000.1, NULL, 0),
(103, 'Titanic', 1997, 200000.1, NULL, 0),
(104, 'Titanic', 1997, 200000.1, NULL, 0),
(105, 'Titanic', 1997, 200000.1, NULL, 0),
(106, 'Titanic', 1997, 200000.1, NULL, 0),
(107, 'Titanic', 1997, 200000.1, NULL, 0),
(108, 'Titanic', 1997, 200000.1, NULL, 0),
(109, 'Titanic', 1997, 200000.1, NULL, 0),
(110, 'Titanic', 1997, 200000.1, NULL, 0),
(111, 'Titanic', 1997, 200000.1, NULL, 0),
(112, 'Titanic', 1997, 200000.1, NULL, 0),
(113, 'Titanic', 1997, 200000.1, NULL, 0),
(114, 'Titanic', 1997, 200000.1, NULL, 0),
(115, 'Titanic', 1997, 200000.1, NULL, 0),
(116, 'Titanic', 1997, 200000.1, NULL, 0),
(117, 'Titanic', 1997, 200000.1, NULL, 0),
(118, 'Titanic', 1997, 200000.1, NULL, 0),
(119, 'Titanic', 1997, 200000.1, NULL, 0),
(120, 'Titanic', 1997, 200000.1, NULL, 0),
(121, 'Titanic', 1997, 200000.1, NULL, 0),
(122, 'Titanic', 1997, 200000.1, NULL, 0),
(123, 'Titanic', 1997, 200000.1, NULL, 0),
(124, 'Titanic', 1997, 200000.1, NULL, 0),
(125, 'Titanic', 1997, 200000.1, NULL, 0),
(126, 'Titanic', 1997, 200000.1, NULL, 0),
(127, 'Titanic', 1997, 200000.1, NULL, 0),
(128, 'Titanic', 1997, 200000.1, NULL, 0),
(129, 'Titanic', 1997, 200000.1, NULL, 0),
(130, 'Titanic', 1997, 200000.1, NULL, 0),
(131, 'Titanic', 1997, 200000.1, NULL, 0),
(132, 'Titanic', 1997, 200000.1, NULL, 0),
(133, 'Titanic', 1997, 200000.1, NULL, 0),
(134, 'Titanic', 1997, 200000.1, NULL, 0),
(135, 'Titanic', 1997, 200000.1, NULL, 0),
(136, 'Titanic', 1997, 200000.1, NULL, 0),
(137, 'Titanic', 1997, 200000.1, NULL, 0);

-- --------------------------------------------------------

--
-- Structure de la table `notes_film`
--

CREATE TABLE IF NOT EXISTS `notes_film` (
  `id_util_note` int(11) NOT NULL,
  `id_film_note` int(11) NOT NULL,
  `note` int(11) NOT NULL,
  `confirme` int(11) NOT NULL,
  PRIMARY KEY (`id_util_note`,`id_film_note`),
  KEY `id_film_note` (`id_film_note`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `notes_film`
--

INSERT INTO `notes_film` (`id_util_note`, `id_film_note`, `note`, `confirme`) VALUES
(12, 97, 12, 0),
(14, 99, 17, 0),
(17, 102, 17, 0);

-- --------------------------------------------------------

--
-- Structure de la table `personne`
--

CREATE TABLE IF NOT EXISTS `personne` (
  `id_pers` int(11) NOT NULL AUTO_INCREMENT,
  `nom_pers` varchar(200) NOT NULL,
  `prenom_pers` varchar(200) NOT NULL,
  `date_pers` varchar(200) NOT NULL,
  `photo_pers` varchar(200) DEFAULT NULL,
  `confirme` int(11) NOT NULL,
  `popularite` int(11) NOT NULL,
  PRIMARY KEY (`id_pers`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=126 ;

--
-- Contenu de la table `personne`
--

INSERT INTO `personne` (`id_pers`, `nom_pers`, `prenom_pers`, `date_pers`, `photo_pers`, `confirme`, `popularite`) VALUES
(1, 'nicolas', 'galmiche', '1991-06-07', NULL, 0, 0),
(2, 'nicolas', 'galmiche', '1991-06-07', NULL, 0, 0),
(3, 'nicolas', 'galmiche', '1991-06-07', NULL, 0, 0),
(4, 'nicolas', 'galmiche', '1991-06-07', NULL, 0, 0),
(5, 'nicolas', 'galmiche', '1991-06-07', NULL, 0, 0),
(6, 'nicolas', 'galmiche', '1991-06-07', NULL, 0, 0),
(7, 'nicolas', 'galmiche', '1991-06-07', NULL, 0, 0),
(8, 'nicolas', 'galmiche', '1991-06-07', NULL, 0, 0),
(9, 'nicolas', 'galmiche', '1991-06-07', NULL, 0, 0),
(10, 'jean', 'cule', '1991-06-07', NULL, 0, 0),
(11, 'fils', 'depute', '1991-06-07', NULL, 0, 0),
(12, 'fils', 'depute', '1991-06-07', NULL, 0, 0),
(13, 'fils', 'depute', '1991-06-07', NULL, 0, 0),
(14, 'fils', 'depute', '1991-06-07', NULL, 0, 0),
(15, 'Clint', 'Eastwood', '1991-06-07', NULL, 0, 0),
(16, 'Clint', 'Eastwood', '1991-06-07', NULL, 0, 0),
(17, 'fils', 'deputeooooo', '1991-06-07', NULL, 0, 0),
(18, 'fils', 'deputeooooo', '1991-06-07', NULL, 0, 0),
(19, 'Tim', 'Cameron', '1991-06-07', NULL, 0, 0),
(20, 'Clint', 'Eastwood', '1991-06-07', NULL, 0, 0),
(21, 'Tim', 'Cameron', '1991-06-07', NULL, 0, 0),
(22, 'Clint', 'Eastwood', '1991-06-07', NULL, 0, 0),
(28, 'Tim', 'Cameron', '1991-06-07', NULL, 0, 0),
(33, 'Tim', 'Cameron', '1991-06-07', NULL, 0, 0),
(34, 'Tim', 'Cameron', '1991-06-07', NULL, 0, 0),
(35, 'Tim', 'Cameron', '1991-06-07', NULL, 0, 0),
(37, 'Tim', 'Cameron', '1991-06-07', NULL, 0, 0),
(38, 'Leonardo', 'Di Caprio', '1991-06-07', NULL, 0, 0),
(40, 'Tim', 'Cameron', '1991-06-07', NULL, 0, 0),
(41, 'Leonardo', 'Di Caprio', '1991-06-07', NULL, 0, 0),
(43, 'Tim', 'Cameron', '1991-06-07', NULL, 0, 0),
(44, 'Leonardo', 'Di Caprio', '1991-06-07', NULL, 0, 0),
(46, 'Tim', 'Cameron', '1991-06-07', NULL, 0, 0),
(51, 'Luc', 'Besson', '1991-06-07', NULL, 0, 0),
(52, 'Luc', 'Besson', '1991-06-07', NULL, 0, 0),
(53, 'Luc', 'Besson', '1991-06-07', NULL, 0, 0),
(54, 'Luc', 'Besson', '1991-06-07', NULL, 0, 0),
(55, 'Luc', 'Besson', '1991-06-07', NULL, 0, 0),
(56, 'Luc', 'Besson', '1991-06-07', NULL, 0, 0),
(57, 'Luc', 'Besson', '1991-06-07', NULL, 0, 0),
(58, 'Luc', 'Besson', '1991-06-07', NULL, 0, 0),
(59, 'Luc', 'Besson', '1991-06-07', NULL, 0, 0),
(60, 'Luc', 'Besson', '1991-06-07', NULL, 0, 0),
(61, 'Luc', 'Besson', '1991-06-07', NULL, 0, 0),
(62, 'Luc', 'Besson', '1991-06-07', NULL, 0, 0),
(63, 'Luc', 'Besson', '1991-06-07', NULL, 0, 0),
(64, 'Luc', 'Besson', '1991-06-07', NULL, 0, 0),
(65, 'Luc', 'Besson', '1991-06-07', NULL, 0, 0),
(66, 'Luc', 'Besson', '1991-06-07', NULL, 0, 0),
(67, 'Luc', 'Besson', '1991-06-07', NULL, 0, 0),
(68, 'Luc', 'Besson', '1991-06-07', NULL, 0, 0),
(69, 'Luc', 'Besson', '1991-06-07', NULL, 0, 0),
(70, 'Luc', 'Besson', '1991-06-07', NULL, 0, 0),
(71, 'Luc', 'Besson', '1991-06-07', NULL, 0, 0),
(72, 'Matt', 'Damon', '1991-06-07', NULL, 0, 0),
(73, 'Matt', 'Damon', '1991-06-07', NULL, 0, 0),
(74, 'Matt', 'Damon', '1991-06-07', NULL, 0, 0),
(75, 'Matt', 'Damon', '1991-06-07', NULL, 0, 0),
(76, 'Matt', 'Damon', '1991-06-07', NULL, 0, 0),
(77, 'Matt', 'Damon', '1991-06-07', NULL, 0, 0),
(78, 'Matt', 'Damon', '1991-06-07', NULL, 0, 0),
(79, 'Matt', 'Damon', '1991-06-07', NULL, 0, 0),
(80, 'Matt', 'Damon', '1991-06-07', NULL, 0, 0),
(81, 'Matt', 'Damon', '1991-06-07', NULL, 0, 0),
(82, 'Matt', 'Damon', '1991-06-07', NULL, 0, 0),
(83, 'Matt', 'Damon', '1991-06-07', NULL, 0, 0),
(84, 'Matt', 'Damon', '1991-06-07', NULL, 0, 0),
(85, 'Matt', 'Damon', '1991-06-07', NULL, 0, 0),
(86, 'George', 'Clooney', '1966-06-02', NULL, 0, 0),
(87, 'Matt', 'Damon', '1991-06-07', NULL, 0, 0),
(88, 'George', 'Clooney', '1966-06-02', NULL, 0, 0),
(89, 'Luc', 'Besson', '1968-8-2', NULL, 0, 0),
(90, 'Matt', 'Damon', '1991-06-07', NULL, 0, 0),
(91, 'George', 'Clooney', '1966-06-02', NULL, 0, 0),
(92, 'Luc', 'Besson', '1968-8-2', NULL, 0, 0),
(93, 'Matt', 'Damon', '1991-06-07', NULL, 0, 0),
(94, 'George', 'Clooney', '1966-06-02', NULL, 0, 2),
(95, 'Luc', 'Besson', '1968-8-2', NULL, 0, 0),
(96, 'Matt', 'Damon', '1991-06-07', NULL, 0, 0),
(97, 'George', 'Clooney', '1966-06-02', NULL, 0, 0),
(98, 'Luc', 'Besson', '1968-8-2', NULL, 0, 0),
(99, 'George', 'Lucas', '1991-06-07', NULL, 0, 0),
(100, 'Ewan', 'McGregor', '1966-06-02', NULL, 0, 0),
(101, 'George', 'Lucas', '1968-8-2', NULL, 0, 0),
(102, 'lol', 'lol', '1225', NULL, 0, 0),
(103, 'hhhh', 'uuuu', '01-85-1669', NULL, 0, 0),
(104, 'Ewan', 'McGregor', '1966-06-02', NULL, 0, 0),
(105, 'Luc', 'Besson', '1991-06-07', NULL, 0, 0),
(106, 'Ewan', 'McGregor', '1966-06-02', NULL, 0, 0),
(107, 'Luc', 'Besson', '1991-06-07', NULL, 0, 0),
(108, 'Ewan', 'McGregor', '1966-06-02', NULL, 0, 0),
(109, 'Luc', 'Besson', '1991-06-07', NULL, 0, 0),
(110, 'Ewan', 'McGregor', '1966-06-02', NULL, 0, 0),
(111, 'Ewan', 'McGregor', '1966-06-02', NULL, 0, 0),
(112, 'Connard', 'McGregor', '1966-06-02', NULL, 0, 0),
(113, 'Ewan', 'McGregor', '1966-06-02', NULL, 0, 0),
(114, 'Ewan', 'McGregor', '1966-06-02', NULL, 0, 0),
(115, 'Luc', 'Besson', '1991-06-07', NULL, 0, 0),
(116, 'Luc', 'Besson', '1991-06-07', NULL, 0, 0),
(117, 'Luc', 'Besson', '1991-06-07', NULL, 0, 0),
(118, 'Ewan', 'McGregor', '1966-06-02', NULL, 0, 0),
(119, 'Luc', 'Besson', '1991-06-07', NULL, 0, 0),
(120, 'George', 'Lucas', '1968-8-2', NULL, 0, 0),
(121, 'Ewan', 'McGregor', '1966-06-02', NULL, 0, 0),
(122, 'Ewan', 'McGregor', '1966-06-02', NULL, 0, 0),
(123, 'Ewan', 'McGregor', '1966-06-02', NULL, 0, 0),
(125, 'Ewan', 'McGregor', '1966-06-02', NULL, 0, 0);

-- --------------------------------------------------------

--
-- Structure de la table `producteur`
--

CREATE TABLE IF NOT EXISTS `producteur` (
  `id_producteur` int(11) NOT NULL,
  PRIMARY KEY (`id_producteur`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `producteur`
--

INSERT INTO `producteur` (`id_producteur`) VALUES
(89),
(92),
(95),
(98),
(101),
(120),
(125);

-- --------------------------------------------------------

--
-- Structure de la table `producteur_film`
--

CREATE TABLE IF NOT EXISTS `producteur_film` (
  `id_producteur_film` int(11) NOT NULL,
  `id_film_film` int(11) NOT NULL,
  `confirme` int(11) NOT NULL,
  PRIMARY KEY (`id_producteur_film`,`id_film_film`),
  KEY `id_film_film` (`id_film_film`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `producteur_film`
--

INSERT INTO `producteur_film` (`id_producteur_film`, `id_film_film`, `confirme`) VALUES
(89, 84, 0),
(92, 84, 0),
(95, 84, 0),
(98, 84, 0),
(101, 84, 0),
(120, 124, 0),
(125, 124, 0);

-- --------------------------------------------------------

--
-- Structure de la table `realisateur`
--

CREATE TABLE IF NOT EXISTS `realisateur` (
  `id_realisateur` int(11) NOT NULL,
  PRIMARY KEY (`id_realisateur`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `realisateur`
--

INSERT INTO `realisateur` (`id_realisateur`) VALUES
(18),
(19),
(21),
(28),
(33),
(34),
(35),
(37),
(40),
(43),
(46),
(51),
(52),
(53),
(54),
(55),
(56),
(57),
(58),
(59),
(60),
(61),
(62),
(63),
(64),
(65),
(66),
(67),
(68),
(69),
(70),
(71),
(72),
(73),
(74),
(75),
(76),
(77),
(78),
(79),
(80),
(81),
(82),
(83),
(84),
(85),
(87),
(90),
(93),
(96),
(99),
(103),
(105),
(107),
(109),
(115),
(116),
(117),
(119),
(122),
(123);

-- --------------------------------------------------------

--
-- Structure de la table `realisateur_film`
--

CREATE TABLE IF NOT EXISTS `realisateur_film` (
  `id_realisateur_film` int(11) NOT NULL,
  `id_film_film` int(11) NOT NULL,
  `confirme` int(11) NOT NULL,
  PRIMARY KEY (`id_realisateur_film`,`id_film_film`),
  KEY `id_realisateur` (`id_realisateur_film`,`id_film_film`),
  KEY `realisateur_film_ibfk_2` (`id_film_film`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `realisateur_film`
--

INSERT INTO `realisateur_film` (`id_realisateur_film`, `id_film_film`, `confirme`) VALUES
(34, 34, 0),
(35, 35, 0),
(77, 81, 0),
(78, 82, 0),
(79, 84, 0),
(81, 85, 0),
(83, 88, 0),
(84, 89, 0),
(85, 90, 0),
(87, 91, 0),
(90, 92, 0),
(93, 96, 0),
(96, 98, 0),
(99, 100, 0),
(105, 104, 0),
(107, 105, 0),
(109, 106, 0),
(117, 120, 0),
(122, 124, 0),
(123, 124, 0);

-- --------------------------------------------------------

--
-- Structure de la table `recompense`
--

CREATE TABLE IF NOT EXISTS `recompense` (
  `id_rec` int(11) NOT NULL AUTO_INCREMENT,
  `titre_rec` varchar(200) NOT NULL,
  `raison_rec` varchar(200) NOT NULL,
  `annee_rec` varchar(4) NOT NULL,
  PRIMARY KEY (`id_rec`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=29 ;

--
-- Contenu de la table `recompense`
--

INSERT INTO `recompense` (`id_rec`, `titre_rec`, `raison_rec`, `annee_rec`) VALUES
(1, 'Oscar', 'Meilleur acteur', '2001'),
(2, 'Oscar', 'Meilleur acteur', '2001'),
(3, 'Oscar', 'Meilleur acteur', '2001'),
(4, 'Oscar', 'Meilleur acteur', '2001'),
(5, 'Oscar', 'Meilleur acteur', '2001'),
(6, 'Oscar', 'MeilleurE musique', '2001'),
(7, 'Oscar', 'Meilleur acteur', '2001'),
(8, 'Oscar', 'Meilleure musique', '2001'),
(9, 'Oscar', 'Meilleur acteur', '1999'),
(10, 'Oscar', 'Meilleure musique', '1999'),
(11, 'Oscar', 'Meilleur acteur', '1999'),
(12, 'Oscar', 'Meilleure musique', '1999'),
(13, 'Oscar', 'Meilleur acteur', '1999'),
(14, 'Oscar', 'Meilleure musique', '1999'),
(15, 'Oscar', 'Meilleur acteur', '1999'),
(16, 'Oscar', 'Meilleure musique', '1999'),
(17, 'Oscar', 'Meilleur acteur', '1999'),
(18, 'Oscar', 'Meilleure musique', '1999'),
(19, 'Oscar', 'Meilleur acteur', '1999'),
(20, 'Oscar', 'Meilleure musique', '1999'),
(21, 'Oscar', 'Meilleur acteur', '1999'),
(22, 'Oscar', 'Meilleure musique', '1999'),
(23, 'Oscar', 'Meilleur acteur', '1999'),
(24, 'Oscar', 'Meilleure musique', '1999'),
(25, 'Oscar', 'Meilleur acteur', '1999'),
(26, 'Oscar', 'Meilleure musique', '1999'),
(27, 'Oscar', 'Meilleur acteur', '1999'),
(28, 'Oscar', 'Meilleure musique', '1999');

-- --------------------------------------------------------

--
-- Structure de la table `recompense_film`
--

CREATE TABLE IF NOT EXISTS `recompense_film` (
  `id_recompense_recfilm` int(11) NOT NULL,
  `id_film_recfilm` int(11) NOT NULL,
  `confirme` int(11) NOT NULL,
  PRIMARY KEY (`id_recompense_recfilm`,`id_film_recfilm`),
  KEY `id_film_recfilm` (`id_film_recfilm`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `recompense_film`
--

INSERT INTO `recompense_film` (`id_recompense_recfilm`, `id_film_recfilm`, `confirme`) VALUES
(6, 69, 0),
(8, 74, 0),
(10, 103, 0),
(12, 104, 0),
(14, 105, 0),
(16, 106, 0),
(18, 107, 0),
(20, 110, 0),
(22, 112, 0),
(24, 114, 0),
(26, 120, 0),
(28, 124, 0);

-- --------------------------------------------------------

--
-- Structure de la table `recompense_personne`
--

CREATE TABLE IF NOT EXISTS `recompense_personne` (
  `id_personne_recpers` int(11) NOT NULL,
  `id_recompense_recpers` int(11) NOT NULL,
  `confirme` int(11) NOT NULL,
  PRIMARY KEY (`id_personne_recpers`,`id_recompense_recpers`),
  KEY `id_recompense_recpers` (`id_recompense_recpers`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `recompense_personne`
--

INSERT INTO `recompense_personne` (`id_personne_recpers`, `id_recompense_recpers`, `confirme`) VALUES
(66, 3, 0),
(67, 4, 0),
(68, 5, 0),
(74, 7, 0),
(104, 9, 0),
(106, 11, 0),
(108, 13, 0),
(110, 15, 0),
(111, 17, 0),
(112, 19, 0),
(113, 21, 0),
(114, 23, 0),
(118, 25, 0),
(121, 27, 0);

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

CREATE TABLE IF NOT EXISTS `utilisateur` (
  `id_util` int(11) NOT NULL AUTO_INCREMENT,
  `login_util` varchar(200) NOT NULL,
  `pass_util` varchar(200) NOT NULL,
  PRIMARY KEY (`id_util`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=18 ;

--
-- Contenu de la table `utilisateur`
--

INSERT INTO `utilisateur` (`id_util`, `login_util`, `pass_util`) VALUES
(1, 'test', 'test'),
(2, 'test', 'test'),
(3, 'test', 'test'),
(4, 'test', 'test'),
(5, 'test', 'test'),
(6, 'test', 'test'),
(7, 'test', 'test'),
(8, 'test', 'test'),
(9, 'test', 'test'),
(10, 'test', 'test'),
(11, 'test', 'test'),
(12, 'test', 'test'),
(13, 'test', 'test'),
(14, 'test', 'test'),
(15, 'test', 'test'),
(16, 'zerock', 'zerock'),
(17, 'zerock', 'zerock');

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `acteur`
--
ALTER TABLE `acteur`
  ADD CONSTRAINT `acteur_ibfk_1` FOREIGN KEY (`id_acteur`) REFERENCES `personne` (`id_pers`) ON DELETE CASCADE;

--
-- Contraintes pour la table `acteur_film`
--
ALTER TABLE `acteur_film`
  ADD CONSTRAINT `acteur_film_ibfk_1` FOREIGN KEY (`id_acteur_film`) REFERENCES `acteur` (`id_acteur`),
  ADD CONSTRAINT `acteur_film_ibfk_2` FOREIGN KEY (`id_film_film`) REFERENCES `film` (`id_film`);

--
-- Contraintes pour la table `notes_film`
--
ALTER TABLE `notes_film`
  ADD CONSTRAINT `notes_film_ibfk_1` FOREIGN KEY (`id_util_note`) REFERENCES `utilisateur` (`id_util`),
  ADD CONSTRAINT `notes_film_ibfk_2` FOREIGN KEY (`id_film_note`) REFERENCES `film` (`id_film`);

--
-- Contraintes pour la table `producteur`
--
ALTER TABLE `producteur`
  ADD CONSTRAINT `producteur_ibfk_1` FOREIGN KEY (`id_producteur`) REFERENCES `personne` (`id_pers`) ON DELETE CASCADE;

--
-- Contraintes pour la table `producteur_film`
--
ALTER TABLE `producteur_film`
  ADD CONSTRAINT `producteur_film_ibfk_1` FOREIGN KEY (`id_producteur_film`) REFERENCES `producteur` (`id_producteur`),
  ADD CONSTRAINT `producteur_film_ibfk_2` FOREIGN KEY (`id_film_film`) REFERENCES `film` (`id_film`);

--
-- Contraintes pour la table `realisateur`
--
ALTER TABLE `realisateur`
  ADD CONSTRAINT `realisateur_ibfk_1` FOREIGN KEY (`id_realisateur`) REFERENCES `personne` (`id_pers`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `realisateur_film`
--
ALTER TABLE `realisateur_film`
  ADD CONSTRAINT `realisateur_film_ibfk_1` FOREIGN KEY (`id_realisateur_film`) REFERENCES `personne` (`id_pers`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `realisateur_film_ibfk_2` FOREIGN KEY (`id_film_film`) REFERENCES `film` (`id_film`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `recompense_film`
--
ALTER TABLE `recompense_film`
  ADD CONSTRAINT `recompense_film_ibfk_1` FOREIGN KEY (`id_recompense_recfilm`) REFERENCES `recompense` (`id_rec`),
  ADD CONSTRAINT `recompense_film_ibfk_2` FOREIGN KEY (`id_film_recfilm`) REFERENCES `film` (`id_film`);

--
-- Contraintes pour la table `recompense_personne`
--
ALTER TABLE `recompense_personne`
  ADD CONSTRAINT `recompense_personne_ibfk_1` FOREIGN KEY (`id_personne_recpers`) REFERENCES `personne` (`id_pers`),
  ADD CONSTRAINT `recompense_personne_ibfk_2` FOREIGN KEY (`id_recompense_recpers`) REFERENCES `recompense` (`id_rec`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
