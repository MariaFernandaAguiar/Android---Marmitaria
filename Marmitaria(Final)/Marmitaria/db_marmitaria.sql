-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 16-Dez-2020 às 19:58
-- Versão do servidor: 10.4.14-MariaDB
-- versão do PHP: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `db_marmitaria`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_alimento`
--

CREATE TABLE `tb_alimento` (
  `id` int(11) NOT NULL,
  `descricao` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tb_alimento`
--

INSERT INTO `tb_alimento` (`id`, `descricao`) VALUES
(1, 'salada'),
(2, 'lasanha'),
(3, 'strogonoff');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_bebida`
--

CREATE TABLE `tb_bebida` (
  `id` int(11) NOT NULL,
  `descricao` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tb_bebida`
--

INSERT INTO `tb_bebida` (`id`, `descricao`) VALUES
(1, 'suco de laranja'),
(2, 'coca cola'),
(3, 'suco de uva');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_pedido`
--

CREATE TABLE `tb_pedido` (
  `id` int(11) NOT NULL,
  `prato` int(11) NOT NULL,
  `bebida` int(11) NOT NULL,
  `data` varchar(200) NOT NULL,
  `valor` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tb_pedido`
--

INSERT INTO `tb_pedido` (`id`, `prato`, `bebida`, `data`, `valor`) VALUES
(1, 1, 1, '00/00/0000', 'R$40');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_usuario`
--

CREATE TABLE `tb_usuario` (
  `id` int(11) NOT NULL,
  `nome` varchar(200) NOT NULL,
  `endereco` varchar(200) NOT NULL,
  `celular` varchar(200) NOT NULL,
  `senha` varchar(200) NOT NULL,
  `status` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tb_usuario`
--

INSERT INTO `tb_usuario` (`id`, `nome`, `endereco`, `celular`, `senha`, `status`) VALUES
(1, 'admin', 'admin', '(99)99999999', 'admin', 1),
(2, 'Maria', 'jjjjjjjj', '(88)99999999', 'maria', 0);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `tb_alimento`
--
ALTER TABLE `tb_alimento`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `tb_bebida`
--
ALTER TABLE `tb_bebida`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `tb_pedido`
--
ALTER TABLE `tb_pedido`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_prato_fk` (`prato`) USING BTREE,
  ADD KEY `id_bebida_fk` (`bebida`) USING BTREE;

--
-- Índices para tabela `tb_usuario`
--
ALTER TABLE `tb_usuario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `tb_alimento`
--
ALTER TABLE `tb_alimento`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `tb_bebida`
--
ALTER TABLE `tb_bebida`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `tb_pedido`
--
ALTER TABLE `tb_pedido`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `tb_usuario`
--
ALTER TABLE `tb_usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `tb_pedido`
--
ALTER TABLE `tb_pedido`
  ADD CONSTRAINT `tb_pedido_ibfk_1` FOREIGN KEY (`prato`) REFERENCES `tb_alimento` (`id`),
  ADD CONSTRAINT `tb_pedido_ibfk_2` FOREIGN KEY (`bebida`) REFERENCES `tb_bebida` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
