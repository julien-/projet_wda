-- phpMyAdmin SQL Dump
-- version 4.1.4
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Sam 17 Mai 2014 à 13:36
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

-- --------------------------------------------------------

--
-- Structure de la table `film`
--

CREATE TABLE IF NOT EXISTS `film` (
  `id_film` int(11) NOT NULL AUTO_INCREMENT,
  `titre_film` varchar(200) NOT NULL,
  `annee_film` year(4) NOT NULL,
  `cout_film` double NOT NULL,
  `photo_film` varchar(200) DEFAULT NULL,
  `confirme` int(11) NOT NULL,
  PRIMARY KEY (`id_film`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=70 ;

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
(69, 'Titanic', 1997, 200000.1, NULL, 0);

-- --------------------------------------------------------

--
-- Structure de la table `personne`
--

CREATE TABLE IF NOT EXISTS `personne` (
  `id_pers` int(11) NOT NULL AUTO_INCREMENT,
  `nom_pers` varchar(200) NOT NULL,
  `prenom_pers` varchar(200) NOT NULL,
  `date_pers` date NOT NULL,
  `photo_pers` varchar(200) DEFAULT NULL,
  `confirme` int(11) NOT NULL,
  PRIMARY KEY (`id_pers`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=69 ;

--
-- Contenu de la table `personne`
--

INSERT INTO `personne` (`id_pers`, `nom_pers`, `prenom_pers`, `date_pers`, `photo_pers`, `confirme`) VALUES
(1, 'nicolas', 'galmiche', '1991-06-07', NULL, 0),
(2, 'nicolas', 'galmiche', '1991-06-07', NULL, 0),
(3, 'nicolas', 'galmiche', '1991-06-07', NULL, 0),
(4, 'nicolas', 'galmiche', '1991-06-07', NULL, 0),
(5, 'nicolas', 'galmiche', '1991-06-07', NULL, 0),
(6, 'nicolas', 'galmiche', '1991-06-07', NULL, 0),
(7, 'nicolas', 'galmiche', '1991-06-07', NULL, 0),
(8, 'nicolas', 'galmiche', '1991-06-07', NULL, 0),
(9, 'nicolas', 'galmiche', '1991-06-07', NULL, 0),
(10, 'jean', 'cule', '1991-06-07', NULL, 0),
(11, 'fils', 'depute', '1991-06-07', NULL, 0),
(12, 'fils', 'depute', '1991-06-07', NULL, 0),
(13, 'fils', 'depute', '1991-06-07', NULL, 0),
(14, 'fils', 'depute', '1991-06-07', NULL, 0),
(15, 'Clint', 'Eastwood', '1991-06-07', NULL, 0),
(16, 'Clint', 'Eastwood', '1991-06-07', NULL, 0),
(17, 'fils', 'deputeooooo', '1991-06-07', NULL, 0),
(18, 'fils', 'deputeooooo', '1991-06-07', NULL, 0),
(19, 'Tim', 'Cameron', '1991-06-07', NULL, 0),
(20, 'Clint', 'Eastwood', '1991-06-07', NULL, 0),
(21, 'Tim', 'Cameron', '1991-06-07', NULL, 0),
(22, 'Clint', 'Eastwood', '1991-06-07', NULL, 0),
(28, 'Tim', 'Cameron', '1991-06-07', NULL, 0),
(33, 'Tim', 'Cameron', '1991-06-07', NULL, 0),
(34, 'Tim', 'Cameron', '1991-06-07', NULL, 0),
(35, 'Tim', 'Cameron', '1991-06-07', NULL, 0),
(37, 'Tim', 'Cameron', '1991-06-07', NULL, 0),
(38, 'Leonardo', 'Di Caprio', '1991-06-07', NULL, 0),
(40, 'Tim', 'Cameron', '1991-06-07', NULL, 0),
(41, 'Leonardo', 'Di Caprio', '1991-06-07', NULL, 0),
(43, 'Tim', 'Cameron', '1991-06-07', NULL, 0),
(44, 'Leonardo', 'Di Caprio', '1991-06-07', NULL, 0),
(46, 'Tim', 'Cameron', '1991-06-07', NULL, 0),
(51, 'Luc', 'Besson', '1991-06-07', NULL, 0),
(52, 'Luc', 'Besson', '1991-06-07', NULL, 0),
(53, 'Luc', 'Besson', '1991-06-07', NULL, 0),
(54, 'Luc', 'Besson', '1991-06-07', NULL, 0),
(55, 'Luc', 'Besson', '1991-06-07', NULL, 0),
(56, 'Luc', 'Besson', '1991-06-07', NULL, 0),
(57, 'Luc', 'Besson', '1991-06-07', NULL, 0),
(58, 'Luc', 'Besson', '1991-06-07', NULL, 0),
(59, 'Luc', 'Besson', '1991-06-07', NULL, 0),
(60, 'Luc', 'Besson', '1991-06-07', NULL, 0),
(61, 'Luc', 'Besson', '1991-06-07', NULL, 0),
(62, 'Luc', 'Besson', '1991-06-07', NULL, 0),
(63, 'Luc', 'Besson', '1991-06-07', NULL, 0),
(64, 'Luc', 'Besson', '1991-06-07', NULL, 0),
(65, 'Luc', 'Besson', '1991-06-07', NULL, 0),
(66, 'Luc', 'Besson', '1991-06-07', NULL, 0),
(67, 'Luc', 'Besson', '1991-06-07', NULL, 0),
(68, 'Luc', 'Besson', '1991-06-07', NULL, 0);

-- --------------------------------------------------------

--
-- Structure de la table `producteur`
--

CREATE TABLE IF NOT EXISTS `producteur` (
  `id_pers` int(11) NOT NULL,
  `id_film` int(11) NOT NULL,
  PRIMARY KEY (`id_pers`,`id_film`),
  KEY `id_film` (`id_film`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
(68);

-- --------------------------------------------------------

--
-- Structure de la table `realisateur_film`
--

CREATE TABLE IF NOT EXISTS `realisateur_film` (
  `id_realisateur_film` int(11) NOT NULL,
  `id_film_film` int(11) NOT NULL,
  PRIMARY KEY (`id_realisateur_film`,`id_film_film`),
  KEY `id_realisateur` (`id_realisateur_film`,`id_film_film`),
  KEY `realisateur_film_ibfk_2` (`id_film_film`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `realisateur_film`
--

INSERT INTO `realisateur_film` (`id_realisateur_film`, `id_film_film`) VALUES
(34, 34),
(35, 35);

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Contenu de la table `recompense`
--

INSERT INTO `recompense` (`id_rec`, `titre_rec`, `raison_rec`, `annee_rec`) VALUES
(1, 'Oscar', 'Meilleur acteur', '2001'),
(2, 'Oscar', 'Meilleur acteur', '2001'),
(3, 'Oscar', 'Meilleur acteur', '2001'),
(4, 'Oscar', 'Meilleur acteur', '2001'),
(5, 'Oscar', 'Meilleur acteur', '2001'),
(6, 'Oscar', 'MeilleurE musique', '2001');

-- --------------------------------------------------------

--
-- Structure de la table `recompense_film`
--

CREATE TABLE IF NOT EXISTS `recompense_film` (
  `id_recompense_recfilm` int(11) NOT NULL,
  `id_film_recfilm` int(11) NOT NULL,
  PRIMARY KEY (`id_recompense_recfilm`,`id_film_recfilm`),
  KEY `id_film_recfilm` (`id_film_recfilm`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `recompense_film`
--

INSERT INTO `recompense_film` (`id_recompense_recfilm`, `id_film_recfilm`) VALUES
(6, 69);

-- --------------------------------------------------------

--
-- Structure de la table `recompense_personne`
--

CREATE TABLE IF NOT EXISTS `recompense_personne` (
  `id_personne_recpers` int(11) NOT NULL,
  `id_recompense_recpers` int(11) NOT NULL,
  PRIMARY KEY (`id_personne_recpers`,`id_recompense_recpers`),
  KEY `id_recompense_recpers` (`id_recompense_recpers`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `recompense_personne`
--

INSERT INTO `recompense_personne` (`id_personne_recpers`, `id_recompense_recpers`) VALUES
(66, 3),
(67, 4),
(68, 5);

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

CREATE TABLE IF NOT EXISTS `utilisateur` (
  `id_util` int(11) NOT NULL AUTO_INCREMENT,
  `login_util` varchar(200) NOT NULL,
  `pass_util` varchar(200) NOT NULL,
  `pro` int(11) NOT NULL,
  PRIMARY KEY (`id_util`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `acteur`
--
ALTER TABLE `acteur`
  ADD CONSTRAINT `acteur_ibfk_1` FOREIGN KEY (`id_acteur`) REFERENCES `personne` (`id_pers`) ON DELETE CASCADE;

--
-- Contraintes pour la table `producteur`
--
ALTER TABLE `producteur`
  ADD CONSTRAINT `producteur_ibfk_1` FOREIGN KEY (`id_pers`) REFERENCES `personne` (`id_pers`) ON DELETE CASCADE,
  ADD CONSTRAINT `producteur_ibfk_2` FOREIGN KEY (`id_film`) REFERENCES `film` (`id_film`) ON DELETE CASCADE;

--
-- Contraintes pour la table `realisateur`
--
ALTER TABLE `realisateur`
  ADD CONSTRAINT `realisateur_ibfk_1` FOREIGN KEY (`id_realisateur`) REFERENCES `personne` (`id_pers`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `realisateur_film`
--
ALTER TABLE `realisateur_film`
  ADD CONSTRAINT `realisateur_film_ibfk_1` FOREIGN KEY (`id_realisateur_film`) REFERENCES `realisateur` (`id_realisateur`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `realisateur_film_ibfk_2` FOREIGN KEY (`id_film_film`) REFERENCES `film` (`id_film`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `recompense_film`
--
ALTER TABLE `recompense_film`
  ADD CONSTRAINT `recompense_film_ibfk_2` FOREIGN KEY (`id_film_recfilm`) REFERENCES `film` (`id_film`),
  ADD CONSTRAINT `recompense_film_ibfk_1` FOREIGN KEY (`id_recompense_recfilm`) REFERENCES `recompense` (`id_rec`);

--
-- Contraintes pour la table `recompense_personne`
--
ALTER TABLE `recompense_personne`
  ADD CONSTRAINT `recompense_personne_ibfk_1` FOREIGN KEY (`id_personne_recpers`) REFERENCES `personne` (`id_pers`),
  ADD CONSTRAINT `recompense_personne_ibfk_2` FOREIGN KEY (`id_recompense_recpers`) REFERENCES `recompense` (`id_rec`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
