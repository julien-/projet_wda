-- phpMyAdmin SQL Dump
-- version 4.1.4
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mar 27 Mai 2014 à 15:55
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
(1),
(2),
(3);

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
(1, 140, 0),
(2, 140, 0),
(3, 140, 0);

-- --------------------------------------------------------

--
-- Structure de la table `film`
--

CREATE TABLE IF NOT EXISTS `film` (
  `id_film` int(11) NOT NULL AUTO_INCREMENT,
  `titre_film` varchar(200) NOT NULL,
  `annee_film` int(4) NOT NULL,
  `cout_film` int(20) NOT NULL,
  `photo_film` varchar(200) DEFAULT NULL,
  `confirme` int(11) NOT NULL,
  PRIMARY KEY (`id_film`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=141 ;

--
-- Contenu de la table `film`
--

INSERT INTO `film` (`id_film`, `titre_film`, `annee_film`, `cout_film`, `photo_film`, `confirme`) VALUES
(140, 'Million Dollar Baby', 2004, 100422786, NULL, 0);

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Contenu de la table `personne`
--

INSERT INTO `personne` (`id_pers`, `nom_pers`, `prenom_pers`, `date_pers`, `photo_pers`, `confirme`, `popularite`) VALUES
(1, 'Eastwood', 'Clint', '1930-05-31', NULL, 0, 2),
(2, 'Swank', 'Hilary', '1974-05-30', NULL, 0, 4),
(3, 'Freeman', 'Morgan', '1937-06-01', NULL, 0, 0);

-- --------------------------------------------------------

--
-- Structure de la table `producteur`
--

CREATE TABLE IF NOT EXISTS `producteur` (
  `id_producteur` int(11) NOT NULL,
  PRIMARY KEY (`id_producteur`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
(1, 140, 0);

-- --------------------------------------------------------

--
-- Structure de la table `realisateur`
--

CREATE TABLE IF NOT EXISTS `realisateur` (
  `id_realisateur` int(11) NOT NULL,
  PRIMARY KEY (`id_realisateur`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
(1, 140, 0);

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
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

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

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

CREATE TABLE IF NOT EXISTS `utilisateur` (
  `id_util` int(11) NOT NULL AUTO_INCREMENT,
  `login_util` varchar(200) NOT NULL,
  `pass_util` varchar(200) NOT NULL,
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
  ADD CONSTRAINT `producteur_film_ibfk_1` FOREIGN KEY (`id_producteur_film`) REFERENCES `personne` (`id_pers`),
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
