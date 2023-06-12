DROP DATABASE IF EXISTS QLSanPham;
CREATE DATABASE QLSanPham;
USE QLSanPham;

CREATE TABLE Users (
	id INT PRIMARY KEY,
	username NVARCHAR(30),
	password NVARCHAR(30),
	role INT,
	fullname NVARCHAR(30),
	address NVARCHAR(255),
	phone NVARCHAR(255)
);

CREATE TABLE PhieuNhap (
	id INT PRIMARY KEY,
	dateIn DATETIME,
	sumPayment FLOAT,
	userId INT NOT NULL,
	FOREIGN KEY (userId) REFERENCES Users(id)
);

CREATE TABLE PhieuXuat (
	id INT PRIMARY KEY,
	dateOut DATETIME,
	sumPayment FLOAT,
	userId INT NOT NULL,
	FOREIGN KEY (userId) REFERENCES Users(id)
);

CREATE TABLE DanhMuc (
	id INT PRIMARY KEY,
	category_name NVARCHAR(255)
);

CREATE TABLE SanPham (
	id INT PRIMARY KEY,
	name NVARCHAR(255),
	quantity_has BIGINT,
	quantity_pay BIGINT,
	price FLOAT,
	categoty_id INT NOT NULL,
	FOREIGN KEY (categoty_id) REFERENCES DanhMuc(id)
);

CREATE TABLE SP_Nhap (
	id INT PRIMARY KEY,
	quantity_in BIGINT,
	price FLOAT,
	maSP INT NOT NULL,
	FOREIGN KEY (maSP) REFERENCES SanPham(id),
	maPhieuNhap INT NOT NULL,
	FOREIGN KEY (maPhieuNhap) REFERENCES PhieuNhap(id)
);

CREATE TABLE SP_Xuat (
	id INT PRIMARY KEY,
	quantity_in BIGINT,
	price FLOAT,
	maSP INT NOT NULL,
	FOREIGN KEY (maSP) REFERENCES SanPham(id),
	maPhieuXuat INT NOT NULL,
	FOREIGN KEY (maPhieuXuat) REFERENCES PhieuXuat(id)
);

INSERT INTO Users 
VALUES (0, 'admin', 'admin', 0, N'Vũ Khắc Huy Linh', N'Hoài Đức, Hà Nội', '0987654321'),
	   (1, 'user1', 'user1', 1, N'Nguyễn Phi Tùng', N'Hoài Đức, Hà Nội', '0123456789');

SELECT * FROM Users;

INSERT INTO DanhMuc
VALUES (0, N'Iphone'),
	   (1, N'Samsung'),
	   (2, N'Xiaomi'),
	   (3, N'Hãng khác');

SELECT * FROM DanhMuc;

INSERT INTO SanPham
VALUES (0, N'IPHONE 14', 50, 10, 30000000, 0),
	   (1, N'SAMSUNG ULTRA S23', 30, 20, 24000000, 1),
	   (2, N'XIAOMI 12S ULTRA', 10, 0, 16000000, 2),
	   (3, N'REALME C55', 40, 0, 8000000, 3);


SELECT * FROM SanPham;

INSERT INTO PhieuXuat
VALUES (0, '2023-05-14', 2000000000, 0),
	   (1, '2023-05-31', 10000000, 1);

UPDATE PhieuXuat
SET sumPayment = (SELECT SUM(price) FROM SP_Xuat WHERE maPhieuXuat = 0)
WHERE id = 0;