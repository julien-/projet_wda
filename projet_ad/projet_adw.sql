-- phpMyAdmin SQL Dump
-- version 4.1.4
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mer 28 Mai 2014 à 14:04
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
(3),
(4),
(7),
(8),
(9),
(11),
(12);

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
(1, 140, 1),
(1, 141, 1),
(2, 140, 0),
(3, 140, 0),
(4, 146, 0),
(7, 146, 0),
(8, 149, 0),
(8, 150, 0),
(9, 157, 0),
(11, 141, 0),
(12, 158, 0);

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=160 ;

--
-- Contenu de la table `film`
--

INSERT INTO `film` (`id_film`, `titre_film`, `annee_film`, `cout_film`, `photo_film`, `confirme`) VALUES
(140, 'Million Dollar Baby', 2004, 100422786, 'C:\\Users\\Nicolas\\Desktop\\Million.jpg', 0),
(141, 'Gran Torino', 2008, 35000000, 'C:\\Users\\Nicolas\\Desktop\\GranTorino.jpg', 0),
(146, 'Gravity', 2013, 100000000, 'C:\\Users\\Nicolas\\Desktop\\Gravity.jpg', 0),
(149, 'Godzilla', 2014, 215000000, 'C:\\Users\\Nicolas\\Desktop\\Godzilla.jpg', 0),
(150, 'Kick-ass', 2010, 30000000, 'C:\\Users\\Nicolas\\Desktop\\Kickass.jpg', 0),
(157, 'Star Wars: Episode VI - Return of the Jedi', 1983, 32500000, 'C:\\Users\\Nicolas\\Desktop\\SW.jpg', 0),
(158, 'The Dark Knight Rises', 2012, 250000000, 'C:\\Users\\Nicolas\\Desktop\\Batman.jpg', 1);

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=13 ;

--
-- Contenu de la table `personne`
--

INSERT INTO `personne` (`id_pers`, `nom_pers`, `prenom_pers`, `date_pers`, `photo_pers`, `confirme`, `popularite`) VALUES
(1, 'Eastwood', 'Clint', '31-05-1930', 'C:\\Users\\Nicolas\\Desktop\\Clint.jpg', 0, 17),
(2, 'Swank', 'Hilary', '30-05-1974', 'C:\\Users\\Nicolas\\Desktop\\swank.jpg', 0, 7),
(3, 'Freeman', 'Morgan', '01-06-1937', 'C:\\Users\\Nicolas\\Desktop\\freeman.jpg', 0, 3),
(4, 'Clooney', 'George', '05-06-1961', 'C:\\Users\\Nicolas\\Desktop\\clooney.jpg', 0, 0),
(5, 'Cuarón', 'Alfonso', '28-11-1961', 'C:\\Users\\Nicolas\\Desktop\\alfonso.jpg', 0, 1),
(6, 'Heyman', 'David', '26-07-1961', 'C:\\Users\\Nicolas\\Desktop\\david.jpg', 0, 0),
(7, 'Bullock', 'Sandra', '26-06-1964', 'C:\\Users\\Nicolas\\Desktop\\sandra.jpg', 0, 2),
(8, 'Taylor-Johnson', 'Aaron', '13-06-1990', 'C:\\Users\\Nicolas\\Desktop\\aaron.jpg', 0, 5),
(9, 'Ford', 'Harrison', '13-07-1942', 'C:\\Users\\Nicolas\\Desktop\\Ford.jpg', 0, 5),
(11, 'Vang', 'Bee', '04-11-1991', 'C:\\Users\\Nicolas\\Desktop\\bee.jpg', 1, 0),
(12, 'Bale', 'Christian', '30-01-1974', 'C:\\Users\\Nicolas\\Desktop\\bale.jpg', 1, 0);

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
(6);

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
(1, 140, 0),
(1, 141, 0),
(5, 146, 0),
(6, 146, 0);

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
(5);

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
(1, 140, 0),
(1, 141, 0),
(5, 146, 0);

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Contenu de la table `recompense`
--

INSERT INTO `recompense` (`id_rec`, `titre_rec`, `raison_rec`, `annee_rec`) VALUES
(1, 'Oscar', 'Meilleur film', '2005'),
(2, 'Oscar', 'Meilleur réalisateur', '2005'),
(3, 'Oscar', 'Meilleure actrice', '2005'),
(4, 'Oscar', 'Meilleur acteur dans un second rôle', '2005'),
(5, 'César', 'Meilleur film étranger', '2010');

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
(1, 140, 0),
(5, 141, 1);

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
(1, 2, 0),
(2, 3, 0),
(3, 4, 1);

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

CREATE TABLE IF NOT EXISTS `utilisateur` (
  `id_util` int(11) NOT NULL AUTO_INCREMENT,
  `login_util` varchar(200) NOT NULL,
  `pass_util` varchar(200) NOT NULL,
  PRIMARY KEY (`id_util`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Contenu de la table `utilisateur`
--

INSERT INTO `utilisateur` (`id_util`, `login_util`, `pass_util`) VALUES
(1, 'zerock', 'zerock'),
(2, 'zerock', 'zerock'),
(3, 'zerock', 'zerock'),
(4, 'zerock', 'zerock'),
(5, 'zerock', 'zerock'),
(6, 'zerock', 'zerock'),
(7, 'fail', 'fail'),
(8, 'dsfs', 'ggg'),
(9, 'sdsdf', 'ggg');

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
  ADD CONSTRAINT `acteur_film_ibfk_1` FOREIGN KEY (`id_acteur_film`) REFERENCES `personne` (`id_pers`),
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
