-- phpMyAdmin SQL Dump
-- version 4.1.4
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mar 13 Mai 2014 à 18:03
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
  `id_pers` int(11) NOT NULL,
  `id_film` int(11) NOT NULL,
  PRIMARY KEY (`id_pers`,`id_film`),
  KEY `id_film` (`id_film`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `film`
--

CREATE TABLE IF NOT EXISTS `film` (
  `id_film` int(11) NOT NULL AUTO_INCREMENT,
  `titre_film` varchar(200) NOT NULL,
  `annee_film` date NOT NULL,
  `note_film` int(11) NOT NULL,
  PRIMARY KEY (`id_film`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

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
  PRIMARY KEY (`id_pers`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Contenu de la table `personne`
--

INSERT INTO `personne` (`id_pers`, `nom_pers`, `prenom_pers`, `date_pers`, `photo_pers`) VALUES
(1, 'nicolas', 'galmiche', '1991-06-07', NULL);

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
  `id_pers` int(11) NOT NULL,
  `id_film` int(11) NOT NULL,
  PRIMARY KEY (`id_pers`,`id_film`),
  KEY `id_film` (`id_film`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `recompense`
--

CREATE TABLE IF NOT EXISTS `recompense` (
  `id_rec` int(11) NOT NULL AUTO_INCREMENT,
  `titre_rec` varchar(200) NOT NULL,
  `raison_rec` varchar(200) NOT NULL,
  `annee_rec` date NOT NULL,
  `id_pers` int(11) NOT NULL,
  `id_film` int(11) NOT NULL,
  PRIMARY KEY (`id_rec`),
  UNIQUE KEY `id_film` (`id_film`),
  KEY `id_pers` (`id_pers`,`id_film`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

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
  ADD CONSTRAINT `acteur_ibfk_1` FOREIGN KEY (`id_pers`) REFERENCES `personne` (`id_pers`) ON DELETE CASCADE,
  ADD CONSTRAINT `acteur_ibfk_2` FOREIGN KEY (`id_film`) REFERENCES `film` (`id_film`) ON DELETE CASCADE;

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
  ADD CONSTRAINT `realisateur_ibfk_1` FOREIGN KEY (`id_pers`) REFERENCES `personne` (`id_pers`) ON DELETE CASCADE,
  ADD CONSTRAINT `realisateur_ibfk_2` FOREIGN KEY (`id_film`) REFERENCES `film` (`id_film`) ON DELETE CASCADE;

--
-- Contraintes pour la table `recompense`
--
ALTER TABLE `recompense`
  ADD CONSTRAINT `recompense_ibfk_1` FOREIGN KEY (`id_pers`) REFERENCES `personne` (`id_pers`) ON DELETE CASCADE,
  ADD CONSTRAINT `recompense_ibfk_2` FOREIGN KEY (`id_film`) REFERENCES `film` (`id_film`) ON DELETE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
