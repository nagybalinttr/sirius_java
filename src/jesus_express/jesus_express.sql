-- phpMyAdmin SQL Dump
-- version 4.4.15.7
-- http://www.phpmyadmin.net
--
-- Gép: 127.0.0.1
-- Létrehozás ideje: 2017. Dec 26. 15:13
-- Kiszolgáló verziója: 5.6.31
-- PHP verzió: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Adatbázis: `jesus_express`
--

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `szallitas`
--

CREATE TABLE IF NOT EXISTS `szallitas` (
  `id` int(11) NOT NULL,
  `kinek` varchar(200) NOT NULL,
  `mit` varchar(200) NOT NULL,
  `mennyit` int(11) NOT NULL,
  `mikor` date NOT NULL,
  `szallitva` tinyint(1) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

--
-- A tábla adatainak kiíratása `szallitas`
--

INSERT INTO `szallitas` (`id`, `kinek`, `mit`, `mennyit`, `mikor`, `szallitva`) VALUES
(1, 'Maci', 'méz', 1, '2017-12-01', 1),
(2, 'Tigris', 'Ugró bot', 2, '2017-12-02', 0),
(3, 'Zsebi baba', 'Méz', 3, '2017-12-21', 0),
(4, 'Malacka', 'Borsó', 10, '2017-12-04', 0),
(5, 'Nyuszi', 'répa', 10, '2017-12-14', 0);

--
-- Indexek a kiírt táblákhoz
--

--
-- A tábla indexei `szallitas`
--
ALTER TABLE `szallitas`
  ADD PRIMARY KEY (`id`);

--
-- A kiírt táblák AUTO_INCREMENT értéke
--

--
-- AUTO_INCREMENT a táblához `szallitas`
--
ALTER TABLE `szallitas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=10;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
