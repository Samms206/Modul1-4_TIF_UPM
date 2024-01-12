-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Waktu pembuatan: 12 Jan 2024 pada 06.54
-- Versi server: 10.4.28-MariaDB
-- Versi PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_kontak`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `kontak`
--

CREATE TABLE `kontak` (
  `id` int(11) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `jenkel` varchar(20) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `notelp` varchar(20) NOT NULL,
  `pekerjaan` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `kontak`
--

INSERT INTO `kontak` (`id`, `nama`, `jenkel`, `alamat`, `notelp`, `pekerjaan`) VALUES
(2, 'teteh', 'Perempuan', 'Sebaung', '085341324564', 'Guru'),
(4, 'edo', 'Laki-laki', 'curahsawo', '085335880047', 'mebel'),
(5, 'John Doe', 'Laki-laki', 'Jl. Pahlawan 123', '08123456789', 'Engineer'),
(6, 'Jane Doe', 'Perempuan', 'Jl. Gajah Mada 456', '08234567890', 'Doctor'),
(7, 'Alice Smith', 'Perempuan', 'Jl. Sudirman 789', '08345678901', 'Teacher'),
(8, 'Bob Johnson', 'Laki-laki', 'Jl. Diponegoro 234', '08456789012', 'Artist'),
(9, 'Eva Anderson', 'Perempuan', 'Jl. Ahmad Yani 567', '08567890123', 'Chef'),
(10, 'David Wilson', 'Laki-laki', 'Jl. Thamrin 890', '08678901234', 'Programmer'),
(11, 'Catherine Lee', 'Perempuan', 'Jl. Kusuma Bangsa 123', '08789012345', 'Lawyer'),
(12, 'Michael Davis', 'Laki-laki', 'Jl. Hayam Wuruk 456', '08890123456', 'Entrepreneur'),
(13, 'Sara Miller', 'Perempuan', 'Jl. Merdeka 789', '08901234567', 'Architect'),
(14, 'Daniel White', 'Laki-laki', 'Jl. Imam Bonjol 901', '09012345678', 'Manager'),
(15, 'Olivia Smith', 'Perempuan', 'Jl. Veteran 111', '09123456789', 'Nurse'),
(16, 'William Brown', 'Laki-laki', 'Jl. Dipatiukur 222', '09234567890', 'Designer'),
(17, 'Sophia Chen', 'Perempuan', 'Jl. Siliwangi 333', '09345678901', 'Writer'),
(18, 'Liam Kim', 'Laki-laki', 'Jl. Sukarno-Hatta 444', '09456789012', 'Photographer'),
(19, 'Emma Tan', 'Perempuan', 'Jl. Tamansari 555', '09567890123', 'Marketing'),
(20, 'Noah Liu', 'Laki-laki', 'Jl. Kebon Sirih 666', '09678901234', 'Doctor'),
(21, 'Ava Wu', 'Perempuan', 'Jl. Gatot Subroto 777', '09789012345', 'Engineer'),
(22, 'James Huang', 'Laki-laki', 'Jl. Surya Kencana 888', '09890123456', 'Architect'),
(23, 'Isabella Wang', 'Perempuan', 'Jl. Riau 999', '09901234567', 'Entrepreneur'),
(24, 'Mason Chen', 'Laki-laki', 'Jl. Citarum 1010', '09112345678', 'Lawyer');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `kontak`
--
ALTER TABLE `kontak`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `kontak`
--
ALTER TABLE `kontak`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
