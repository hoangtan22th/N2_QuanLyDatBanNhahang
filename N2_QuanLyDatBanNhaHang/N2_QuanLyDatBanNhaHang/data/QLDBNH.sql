USE [master]
GO
/****** Object:  Database [QuanLyDatBanNhaHang]    Script Date: 10/19/2024 8:48:41 PM ******/
CREATE DATABASE [QuanLyDatBanNhaHang]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'QuanLyDatBanNhaHang', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.SQLEXPRESS\MSSQL\DATA\QuanLyDatBanNhaHang.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'QuanLyDatBanNhaHang_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.SQLEXPRESS\MSSQL\DATA\QuanLyDatBanNhaHang_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT, LEDGER = OFF
GO
ALTER DATABASE [QuanLyDatBanNhaHang] SET COMPATIBILITY_LEVEL = 160
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [QuanLyDatBanNhaHang].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [QuanLyDatBanNhaHang] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [QuanLyDatBanNhaHang] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [QuanLyDatBanNhaHang] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [QuanLyDatBanNhaHang] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [QuanLyDatBanNhaHang] SET ARITHABORT OFF 
GO
ALTER DATABASE [QuanLyDatBanNhaHang] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [QuanLyDatBanNhaHang] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [QuanLyDatBanNhaHang] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [QuanLyDatBanNhaHang] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [QuanLyDatBanNhaHang] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [QuanLyDatBanNhaHang] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [QuanLyDatBanNhaHang] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [QuanLyDatBanNhaHang] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [QuanLyDatBanNhaHang] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [QuanLyDatBanNhaHang] SET  DISABLE_BROKER 
GO
ALTER DATABASE [QuanLyDatBanNhaHang] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [QuanLyDatBanNhaHang] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [QuanLyDatBanNhaHang] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [QuanLyDatBanNhaHang] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [QuanLyDatBanNhaHang] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [QuanLyDatBanNhaHang] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [QuanLyDatBanNhaHang] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [QuanLyDatBanNhaHang] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [QuanLyDatBanNhaHang] SET  MULTI_USER 
GO
ALTER DATABASE [QuanLyDatBanNhaHang] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [QuanLyDatBanNhaHang] SET DB_CHAINING OFF 
GO
ALTER DATABASE [QuanLyDatBanNhaHang] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [QuanLyDatBanNhaHang] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [QuanLyDatBanNhaHang] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [QuanLyDatBanNhaHang] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
ALTER DATABASE [QuanLyDatBanNhaHang] SET QUERY_STORE = ON
GO
ALTER DATABASE [QuanLyDatBanNhaHang] SET QUERY_STORE (OPERATION_MODE = READ_WRITE, CLEANUP_POLICY = (STALE_QUERY_THRESHOLD_DAYS = 30), DATA_FLUSH_INTERVAL_SECONDS = 900, INTERVAL_LENGTH_MINUTES = 60, MAX_STORAGE_SIZE_MB = 1000, QUERY_CAPTURE_MODE = AUTO, SIZE_BASED_CLEANUP_MODE = AUTO, MAX_PLANS_PER_QUERY = 200, WAIT_STATS_CAPTURE_MODE = ON)
GO
USE [QuanLyDatBanNhaHang]
GO
/****** Object:  Table [dbo].[Ban]    Script Date: 10/19/2024 8:48:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Ban](
	[maBan] [varchar](10) NOT NULL,
	[tenBan] [nvarchar](30) NOT NULL,
	[thoiGianDatBan] [datetime] NULL,
	[soChoNgoi] [int] NOT NULL,
	[thoiGianGoiMon] [datetime] NULL,
	[trangThai] [bit] NOT NULL,
	[loaiBan] [bit] NOT NULL,
	[maKhu] [varchar](10) NULL,
 CONSTRAINT [PK_Ban] PRIMARY KEY CLUSTERED 
(
	[maBan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ChiTietBan]    Script Date: 10/19/2024 8:48:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietBan](
	[soLuongMonAn] [int] NOT NULL,
	[maBan] [varchar](10) NOT NULL,
	[maMonAn] [varchar](10) NOT NULL,
	[maNuoc] [varchar](10) NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ChiTietHoaDon]    Script Date: 10/19/2024 8:48:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietHoaDon](
	[soLuongMonAN] [int] NOT NULL,
	[maHoaDon] [varchar](10) NOT NULL,
	[maMonAnUong] [varchar](10) NOT NULL,
	[maKM] [varchar](10) NOT NULL,
	[maBan] [varchar](10) NOT NULL,
 CONSTRAINT [PK_ChiTietHoaDon] PRIMARY KEY CLUSTERED 
(
	[maHoaDon] ASC,
	[maMonAnUong] ASC,
	[maKM] ASC,
	[maBan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ChiTietPhieuDat]    Script Date: 10/19/2024 8:48:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietPhieuDat](
	[soLuong] [int] NULL,
	[maMonAnUong] [varchar](10) NOT NULL,
	[maPhieuDat] [varchar](10) NOT NULL,
	[maBan] [varchar](10) NOT NULL,
 CONSTRAINT [PK_ChiTietPhieuDat] PRIMARY KEY CLUSTERED 
(
	[maMonAnUong] ASC,
	[maPhieuDat] ASC,
	[maBan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 10/19/2024 8:48:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[maHoaDon] [varchar](10) NOT NULL,
	[maNV] [varchar](10) NOT NULL,
	[maKH] [varchar](10) NOT NULL,
	[ngayLap] [datetime] NOT NULL,
	[maThue] [varchar](10) NOT NULL,
 CONSTRAINT [PK_HoaDon] PRIMARY KEY CLUSTERED 
(
	[maHoaDon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 10/19/2024 8:48:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[maKH] [varchar](10) NOT NULL,
	[tenKH] [nvarchar](30) NULL,
	[ngaySinh] [date] NULL,
	[sdt] [varchar](10) NULL,
	[maTTV] [varchar](10) NULL,
 CONSTRAINT [PK_KhachHang] PRIMARY KEY CLUSTERED 
(
	[maKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhuVucBan]    Script Date: 10/19/2024 8:48:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhuVucBan](
	[maKhu] [varchar](10) NOT NULL,
	[tenKhu] [nvarchar](30) NOT NULL,
	[soBan] [int] NOT NULL,
 CONSTRAINT [PK_KhuVucBan] PRIMARY KEY CLUSTERED 
(
	[maKhu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhuyenMai]    Script Date: 10/19/2024 8:48:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhuyenMai](
	[maKM] [varchar](10) NOT NULL,
	[tenKM] [nvarchar](30) NOT NULL,
	[giaTriKhuyenMai] [float] NOT NULL,
	[ngayApDung] [datetime] NOT NULL,
	[ngayKetThuc] [datetime] NOT NULL,
	[moTa] [nvarchar](100) NOT NULL,
 CONSTRAINT [PK_KhuyenMai] PRIMARY KEY CLUSTERED 
(
	[maKM] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LoaiThe]    Script Date: 10/19/2024 8:48:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiThe](
	[maLoaiTTV] [varchar](10) NOT NULL,
	[tenLoaiTTV] [nvarchar](10) NOT NULL,
	[chietKhau] [float] NOT NULL,
 CONSTRAINT [PK_LoaiThe] PRIMARY KEY CLUSTERED 
(
	[maLoaiTTV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[MonAnUong]    Script Date: 10/19/2024 8:48:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[MonAnUong](
	[maMonAnUong] [varchar](10) NOT NULL,
	[tenMonAnUong] [nvarchar](30) NOT NULL,
	[giaTien] [float] NOT NULL,
	[loai] [varchar](20) NOT NULL,
	[soLuong] [int] NOT NULL,
 CONSTRAINT [PK_MonAn] PRIMARY KEY CLUSTERED 
(
	[maMonAnUong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 10/19/2024 8:48:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[maNV] [varchar](10) NOT NULL,
	[tenNV] [varchar](30) NOT NULL,
	[diaChi] [varchar](50) NOT NULL,
	[sdt] [varchar](10) NOT NULL,
	[ngaySinh] [date] NOT NULL,
	[ngayVaoLam] [date] NOT NULL,
	[gmail] [varchar](30) NOT NULL,
	[chucVu] [bit] NOT NULL,
	[luongCB] [float] NOT NULL,
 CONSTRAINT [PK_NhanVien] PRIMARY KEY CLUSTERED 
(
	[maNV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PhieuDatBan]    Script Date: 10/19/2024 8:48:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhieuDatBan](
	[maPhieuDat] [varchar](10) NOT NULL,
	[tenKhachDat] [nvarchar](30) NOT NULL,
	[soLuongKhach] [int] NOT NULL,
	[ngayDat] [datetime] NOT NULL,
	[ghiChu] [nvarchar](50) NULL,
	[maNV] [varchar](10) NOT NULL,
	[tienCoc] [float] NOT NULL,
 CONSTRAINT [PK_PhieuDatBan] PRIMARY KEY CLUSTERED 
(
	[maPhieuDat] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 10/19/2024 8:48:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[taiKhoan] [varchar](10) NOT NULL,
	[matKhau] [varchar](50) NOT NULL,
	[role] [bit] NOT NULL,
	[ngayTaoTK] [datetime] NOT NULL,
 CONSTRAINT [PK_TaiKhoan] PRIMARY KEY CLUSTERED 
(
	[taiKhoan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TheThanhVien]    Script Date: 10/19/2024 8:48:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TheThanhVien](
	[maTTV] [varchar](10) NOT NULL,
	[diemTichLuy] [float] NOT NULL,
	[ngayDangKy] [date] NOT NULL,
	[loaiThe] [varchar](10) NOT NULL,
 CONSTRAINT [PK_TheThanhVien] PRIMARY KEY CLUSTERED 
(
	[maTTV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Thue]    Script Date: 10/19/2024 8:48:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Thue](
	[maThue] [varchar](10) NOT NULL,
	[giaTriThue] [float] NOT NULL,
	[tenThue] [nvarchar](50) NOT NULL,
	[ngayApDung] [datetime] NOT NULL,
	[ngayKetThuc] [datetime] NOT NULL,
	[moTa] [nvarchar](50) NOT NULL,
	[doiTuongChiuThue] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Thue] PRIMARY KEY CLUSTERED 
(
	[maThue] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00001', N'Bàn Narutobaco', NULL, 4, NULL, 0, 1, N'KV00001')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00002', N'Bàn cc', NULL, 4, NULL, 0, 1, N'KV00001')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00003', N'Bàn ccc', NULL, 4, NULL, 0, 1, N'KV00001')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00004', N'Bàn cccc', NULL, 4, NULL, 0, 1, N'KV00002')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00005', N'Bàn cccc', NULL, 4, NULL, 0, 1, N'KV00002')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00006', N'Bàn ccccc', NULL, 4, NULL, 0, 1, N'KV00002')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00007', N'Bàn Naruto 1', NULL, 4, NULL, 0, 1, N'KV00002')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00008', N'Bàn Hinata 1', NULL, 4, NULL, 0, 1, N'KV00003')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00009', N'Bàn Sasuke 3', NULL, 4, NULL, 0, 1, N'KV00003')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00010', N'Bàn Sakura 2', NULL, 4, NULL, 0, 1, N'KV00001')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00011', N'Bàn Kakashi 2', NULL, 4, NULL, 0, 1, N'KV00002')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00012', N'Bàn Naruto 2', NULL, 4, NULL, 0, 1, N'KV00003')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00013', N'Bàn Hinata 2', NULL, 4, NULL, 0, 1, N'KV00001')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00014', N'Bàn Sasuke 4', NULL, 4, NULL, 0, 1, N'KV00002')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00015', N'Bàn Sakura 3', NULL, 4, NULL, 0, 1, N'KV00001')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00016', N'Bàn Kakashi 3', NULL, 4, NULL, 0, 1, N'KV00003')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00017', N'Bàn Naruto 3', NULL, 4, NULL, 0, 1, N'KV00001')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00018', N'Bàn Hinata 3', NULL, 4, NULL, 0, 1, N'KV00002')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00019', N'Bàn Sasuke 5', NULL, 4, NULL, 0, 1, N'KV00001')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00020', N'Bàn Sakura 4', NULL, 4, NULL, 0, 1, N'KV00003')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00021', N'Bàn Kakashi 4', NULL, 4, NULL, 0, 1, N'KV00002')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00022', N'Bàn Naruto 4', NULL, 4, NULL, 0, 1, N'KV00001')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00024', N'Bàn Naruto 4', NULL, 4, NULL, 0, 1, N'KV00005')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00025', N'Bàn Kakashi 4', NULL, 4, NULL, 0, 1, N'KV00004')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00026', N'Bàn Kakashi 5', NULL, 4, NULL, 0, 1, N'KV00004')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00027', N'Bàn Kakashi 6', NULL, 4, NULL, 0, 1, N'KV00004')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00028', N'Bàn Kakashi 7', NULL, 4, NULL, 0, 1, N'KV00005')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00029', N'Bàn Kakashi 8', NULL, 4, NULL, 0, 1, N'KV00005')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00030', N'Bàn Kakashi 9', NULL, 4, NULL, 0, 1, N'KV00005')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00031', N'Bàn Kakashi 0', NULL, 4, NULL, 0, 1, N'KV00005')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00032', N'Bàn Kakashi 10', NULL, 4, NULL, 0, 1, N'KV00004')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00033', N'Bàn Luffy 4', NULL, 4, NULL, 0, 1, N'KV00004')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00034', N'Bàn Luffy 5', NULL, 4, NULL, 0, 1, N'KV00004')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00035', N'Bàn Luffy 6', NULL, 4, NULL, 0, 1, N'KV00004')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00036', N'Bàn Luffy 7', NULL, 4, NULL, 0, 1, N'KV00005')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00037', N'Bàn Luffy 8', NULL, 4, NULL, 0, 1, N'KV00005')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00038', N'Bàn Luffy 9', NULL, 4, NULL, 0, 1, N'KV00005')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00039', N'Bàn Luffy 0', NULL, 4, NULL, 0, 1, N'KV00005')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00040', N'Bàn zoro 10', NULL, 4, NULL, 0, 1, N'KV00004')
INSERT [dbo].[Ban] ([maBan], [tenBan], [thoiGianDatBan], [soChoNgoi], [thoiGianGoiMon], [trangThai], [loaiBan], [maKhu]) VALUES (N'B00041', N'Bàn zoro 4', NULL, 4, NULL, 0, 1, N'KV00005')
GO
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [ngaySinh], [sdt], [maTTV]) VALUES (N'KH001', N'hihi', CAST(N'2011-10-20' AS Date), N'0908123456', NULL)
GO
INSERT [dbo].[KhuVucBan] ([maKhu], [tenKhu], [soBan]) VALUES (N'KV00001', N'Khu thường 1', 4)
INSERT [dbo].[KhuVucBan] ([maKhu], [tenKhu], [soBan]) VALUES (N'KV00002', N'Khu thường 2', 4)
INSERT [dbo].[KhuVucBan] ([maKhu], [tenKhu], [soBan]) VALUES (N'KV00003', N'Khu thường 3', 4)
INSERT [dbo].[KhuVucBan] ([maKhu], [tenKhu], [soBan]) VALUES (N'KV00004', N'Khu vip 1', 5)
INSERT [dbo].[KhuVucBan] ([maKhu], [tenKhu], [soBan]) VALUES (N'KV00005', N'Khu vip 2', 6)
GO
INSERT [dbo].[NhanVien] ([maNV], [tenNV], [diaChi], [sdt], [ngaySinh], [ngayVaoLam], [gmail], [chucVu], [luongCB]) VALUES (N'admin', N'NGuy?n Trãi', N'hihi', N'0', CAST(N'2002-11-01' AS Date), CAST(N'2023-01-01' AS Date), N'abc@gmail.com', 0, 1111)
INSERT [dbo].[NhanVien] ([maNV], [tenNV], [diaChi], [sdt], [ngaySinh], [ngayVaoLam], [gmail], [chucVu], [luongCB]) VALUES (N'NV00001', N'Nguy?n Van Tèo', N'40 Bình Hung Hoà', N'0908070605', CAST(N'2001-11-01' AS Date), CAST(N'2024-10-01' AS Date), N'vanteo@gmail.com', 1, 15000)
INSERT [dbo].[NhanVien] ([maNV], [tenNV], [diaChi], [sdt], [ngaySinh], [ngayVaoLam], [gmail], [chucVu], [luongCB]) VALUES (N'NV00002', N'NGuy?n Trãi', N'hihi', N'0', CAST(N'2002-11-01' AS Date), CAST(N'2023-01-01' AS Date), N'abc@gmail.com', 0, 1111)
GO
INSERT [dbo].[TaiKhoan] ([taiKhoan], [matKhau], [role], [ngayTaoTK]) VALUES (N'admin', N'admin', 1, CAST(N'2020-10-10T00:00:00.000' AS DateTime))
INSERT [dbo].[TaiKhoan] ([taiKhoan], [matKhau], [role], [ngayTaoTK]) VALUES (N'NV00001', N'nv', 1, CAST(N'2023-10-01T00:00:00.000' AS DateTime))
INSERT [dbo].[TaiKhoan] ([taiKhoan], [matKhau], [role], [ngayTaoTK]) VALUES (N'NV00002', N'nv2', 0, CAST(N'2024-10-01T00:00:00.000' AS DateTime))
GO
/****** Object:  Index [IX_ChiTietHoaDon]    Script Date: 10/19/2024 8:48:41 PM ******/
CREATE NONCLUSTERED INDEX [IX_ChiTietHoaDon] ON [dbo].[ChiTietHoaDon]
(
	[soLuongMonAN] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Ban]  WITH CHECK ADD  CONSTRAINT [FK_Ban_KhuVucBan] FOREIGN KEY([maKhu])
REFERENCES [dbo].[KhuVucBan] ([maKhu])
GO
ALTER TABLE [dbo].[Ban] CHECK CONSTRAINT [FK_Ban_KhuVucBan]
GO
ALTER TABLE [dbo].[ChiTietBan]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietBan_Ban] FOREIGN KEY([maBan])
REFERENCES [dbo].[Ban] ([maBan])
GO
ALTER TABLE [dbo].[ChiTietBan] CHECK CONSTRAINT [FK_ChiTietBan_Ban]
GO
ALTER TABLE [dbo].[ChiTietBan]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietBan_MonAn] FOREIGN KEY([maMonAn])
REFERENCES [dbo].[MonAnUong] ([maMonAnUong])
GO
ALTER TABLE [dbo].[ChiTietBan] CHECK CONSTRAINT [FK_ChiTietBan_MonAn]
GO
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietHoaDon_Ban] FOREIGN KEY([maBan])
REFERENCES [dbo].[Ban] ([maBan])
GO
ALTER TABLE [dbo].[ChiTietHoaDon] CHECK CONSTRAINT [FK_ChiTietHoaDon_Ban]
GO
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietHoaDon_HoaDon1] FOREIGN KEY([maHoaDon])
REFERENCES [dbo].[HoaDon] ([maHoaDon])
GO
ALTER TABLE [dbo].[ChiTietHoaDon] CHECK CONSTRAINT [FK_ChiTietHoaDon_HoaDon1]
GO
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietHoaDon_KhuyenMai] FOREIGN KEY([maKM])
REFERENCES [dbo].[KhuyenMai] ([maKM])
GO
ALTER TABLE [dbo].[ChiTietHoaDon] CHECK CONSTRAINT [FK_ChiTietHoaDon_KhuyenMai]
GO
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietHoaDon_MonAnUong] FOREIGN KEY([maMonAnUong])
REFERENCES [dbo].[MonAnUong] ([maMonAnUong])
GO
ALTER TABLE [dbo].[ChiTietHoaDon] CHECK CONSTRAINT [FK_ChiTietHoaDon_MonAnUong]
GO
ALTER TABLE [dbo].[ChiTietPhieuDat]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietPhieuDat_Ban] FOREIGN KEY([maBan])
REFERENCES [dbo].[Ban] ([maBan])
GO
ALTER TABLE [dbo].[ChiTietPhieuDat] CHECK CONSTRAINT [FK_ChiTietPhieuDat_Ban]
GO
ALTER TABLE [dbo].[ChiTietPhieuDat]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietPhieuDat_MonAn] FOREIGN KEY([maMonAnUong])
REFERENCES [dbo].[MonAnUong] ([maMonAnUong])
GO
ALTER TABLE [dbo].[ChiTietPhieuDat] CHECK CONSTRAINT [FK_ChiTietPhieuDat_MonAn]
GO
ALTER TABLE [dbo].[ChiTietPhieuDat]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietPhieuDat_PhieuDatBan] FOREIGN KEY([maPhieuDat])
REFERENCES [dbo].[PhieuDatBan] ([maPhieuDat])
GO
ALTER TABLE [dbo].[ChiTietPhieuDat] CHECK CONSTRAINT [FK_ChiTietPhieuDat_PhieuDatBan]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_KhachHang] FOREIGN KEY([maKH])
REFERENCES [dbo].[KhachHang] ([maKH])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_KhachHang]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_NhanVien] FOREIGN KEY([maNV])
REFERENCES [dbo].[NhanVien] ([maNV])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_NhanVien]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_Thue] FOREIGN KEY([maThue])
REFERENCES [dbo].[Thue] ([maThue])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_Thue]
GO
ALTER TABLE [dbo].[KhachHang]  WITH CHECK ADD  CONSTRAINT [FK_KhachHang_TheThanhVien] FOREIGN KEY([maTTV])
REFERENCES [dbo].[TheThanhVien] ([maTTV])
GO
ALTER TABLE [dbo].[KhachHang] CHECK CONSTRAINT [FK_KhachHang_TheThanhVien]
GO
ALTER TABLE [dbo].[PhieuDatBan]  WITH CHECK ADD  CONSTRAINT [FK_PhieuDatBan_NhanVien] FOREIGN KEY([maNV])
REFERENCES [dbo].[NhanVien] ([maNV])
GO
ALTER TABLE [dbo].[PhieuDatBan] CHECK CONSTRAINT [FK_PhieuDatBan_NhanVien]
GO
ALTER TABLE [dbo].[TaiKhoan]  WITH CHECK ADD  CONSTRAINT [FK_TaiKhoan_NhanVien] FOREIGN KEY([taiKhoan])
REFERENCES [dbo].[NhanVien] ([maNV])
GO
ALTER TABLE [dbo].[TaiKhoan] CHECK CONSTRAINT [FK_TaiKhoan_NhanVien]
GO
ALTER TABLE [dbo].[TheThanhVien]  WITH CHECK ADD  CONSTRAINT [FK_TheThanhVien_LoaiThe1] FOREIGN KEY([loaiThe])
REFERENCES [dbo].[LoaiThe] ([maLoaiTTV])
GO
ALTER TABLE [dbo].[TheThanhVien] CHECK CONSTRAINT [FK_TheThanhVien_LoaiThe1]
GO
USE [master]
GO
ALTER DATABASE [QuanLyDatBanNhaHang] SET  READ_WRITE 
GO
