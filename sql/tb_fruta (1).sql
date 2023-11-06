-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 04-Nov-2023 às 23:34
-- Versão do servidor: 10.4.27-MariaDB
-- versão do PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `db_frutaria_pacovan`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_fruta`
--

CREATE TABLE `tb_fruta` (
  `id` int(11) UNSIGNED NOT NULL,
  `nome` varchar(100) NOT NULL,
  `estoque` int(11) NOT NULL,
  `valor` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `tb_fruta`
--

INSERT INTO `tb_fruta` (`id`, `nome`, `estoque`, `valor`) VALUES
(1, 'Uva', 23, 1),
(2, 'Melão', 19, 5),
(3, 'Pitatia', 12, 10),
(5, 'Laranja', 10, 3.75),
(6, 'Jambo', 10, 5),
(7, 'Abacate', 19, 10),
(8, 'Morango', 78, 20),
(9, 'Banana', 50, 1.25);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `tb_fruta`
--
ALTER TABLE `tb_fruta`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `tb_fruta`
--
ALTER TABLE `tb_fruta`
  MODIFY `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
