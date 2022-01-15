INSERT INTO roles (role_name, role_description)
VALUES 
('Student', 'Người tham gia khóa học'),
('Teacher', 'Người sở hữu khóa học'),
('Admin', 'Quản trị viên hệ thống');

INSERT INTO users (fullname, address, phone, email, username, password, role_id, tokens)
VALUES
('Trần Trung Nghĩa', '12 Phan Văn Trị, Gò Vấp, TPHCM', '032566323', 'nghia@gmail.com', 'adminNghia', 'ng09hi09a', 3, 0),
('Nguyễn Thùy Trang', 'Liên Nghĩa, Đức Trọng, Lâm Đồng', '021354642', 'trang@gmail.com', 'teacherTrang', 'NgTrang12345', 2, 0),
('Lâm Quang Hải', '12 Trần Quang Trung, Q1, TPHCM', '022354613', 'quanghai@gmail.com', 'thayHai', 'hai0245hai01', 2, 0),
('Phan Văn Đức', '123 Bùi Thị Xuân, Q2, TPHCM', '0232533521', 'ducvan@gmail.com', 'phanvanduc', 'hghgjgshgs12345', 2, 0),
('Nguyễn Văn Thành', '74 Sơn Phước Uyên Lý, phường 1, quận 1, TPHCM', '0908765432', 'nvthanh@gmail.com', 'thanh01', 'ttt123', 1, 10000),
('Tạ Lâm Tuấn', '65 Diệp Danh Tiến, phường 2, quận 3, TPHCM', '0704705432', 'tltuan@gmail.com', 'tuan123', 'tuan12345', 1, 5000),
('Nông Trường', '33 Kháng Thảo Quang, phường 4, quận 5, TPHCM', '0808766431', 'ntruong@gmail.com', 'truongg', 'tr546425', 1, 0),
('Hoàng Thiên Nguyên', '52 Cường Nguyên, phường 5, quận 8, TPHCM', '0745654213', 'htnguyen@gmail.com', 'hoangnghien', 'nghien0201', 1, 12000),
('Phan Nguyên Khiêm', '6/7 Giang Phương Nguyệt, phường 1, TP.Dĩ An, Bình Dương', '0998225152', 'pnkhiem@gmail.com', 'khiemabc', 'KhK2452', 1, 20000),
('Phi Hiên Trọng', '76 Ánh Tú, phường 2, TP.Tây Ninh, Tây Ninh', '0808751232', 'phtrong@gmail.com', 'trongphi', '1658trong', 1, 15000),
('Giang Thiên Tiến', '34 Luật Thảo Khiêm, phường 3, TP.Long Xuyên, An Giang', '0980765789', 'gttien@gmail.com', 'tientien', 'khnduan', 1, 1000),
('Nguyễn Văn Tài', '70 Uyên Pha, phường 4, TP.Bến Tre, Bến Tre', '0908200432', 'nvtai@gmail.com', 'nguyentai', 'mancksh425', 1, 0),
('Nguyễn Ngọc Anh', '84 Phước Tây, phường 2, TP.Bến Tre, Bến Tre', '0980702532', 'nnanh@gmail.com', 'ngocanh', 'mndman121354', 1, 180),
('Trúc Quang Trọng', '12 Long Khuyên, phường 6, TP.Biên Hòa, Đồng Nai', '0780748912', 'tqtrong@gmail.com', 'trong122', N'kajd44256', 1, 1200),
('Nguyễn Văn Tiến', '12, Linh Trung, Thủ Đức, TPHCM', '0774561239', 'nvtien@gmail.com', 'vantien', 'kajdkshdja', 1, 2400),
('Nguyễn Minh Công', '56, Linh Trung, Thủ Đức, TPHCM', '0786701340', 'nmcong@gmail.com', 'minhcong', 'kah1546512', 1, 130),
('Ngô Mẫn Thi', 'Khu phố 4, Phường An Phú, Thủ Đức, TPHCM', '0394783560', 'nmthi@gmail.com', 'thithi01', 'kahsjdhajsd', 1, 1220),
('Lê Thành Dương', '12, Phường 2, Quận 3, TPHCM', '0774158226', 'ltduongg@gmail.com', 'thanhduong', 'quybdajhd', 1, 120),
('Nguyễn Hà My', ' 357/61 Hau Giang Street, Ward 11, District 6, HCM', '0774663730', 'hamy@gmail.com', 'nguyenhamy', 'mandhgkad', 1, 1530),
('Đan Luật Hậu', '79 Phước Uyên Nhàn, phường 3, quận 1, TPHCM', '0854985213', 'dlhau@gmail.com', 'danhau00', '125akkjkhd', 1, 1700),
('Nguyễn Anh Tài', '90 Đức Thắng, phường 5, quận 5, TPHCM', '0790456287', 'natai@gmail.com', 'anhtainguyen', 'oiiquwi2154', 1, 1230),
('Ngô Hữu Phúc', '7 Giang Phương, phường 2, TP.Dĩ An, Bình Dương', '0974535462', 'nhphuc@gmail.com', 'huuphuc', 'PhUc099', 1, 10000),
('Trần Ngọc Sang', '77 Ngọc Sương, phường 3, TP.Tây Ninh, Tây Ninh', '0984628913', 'tnsang@gmail.com', 'sangtran', 'lakduia2512', 1, 300),
('Phạm Quốc Bảo', '40 Thảo Khiêm, phường 4, TP.Long Xuyên, An Giang', '0842085398', 'pqbao@gmail.com', 'baobao123', 'kkjkkkkk', 1, 3250),
('Trương Ngọc Tiến', '85 Phước Đông, phường 3, TP.Bến Tre, Bến Tre', '0945582627', 'tntien@gmail.com', 'ngoctien', 'nonakdnka', 1, 500),
('Nguyễn Ngọc Lâm', '20 Phước Long, phường 7, TP.Biên Hòa, Đồng Nai', '0904753534', 'nnlam@gmail.com', 'ngoclam', 'aldjandad', 1, 930),
('Trần Văn Thành', '20 Phạm Văn Đồng, TPHCM', '012356323', 'tvthanh@gmail.com', 'thanhvan', 'jahdjk123', 1, 8090),
('Nguyễn Tấn Trường', '78 Phan Văn Trị, TPHCM', '0236589565', 'tantruong@gmail.com', 'truongnguyen', 'lkadjklad1254', 1, 120),
('Phan Thị Ngọc Lan', '123 Nguyễn Văn Trung, Liên Nghĩa, Đức Trọng, Lâm Đồng', '036525643', 'lan@gmail.com', 'ngoclan123', 'kadhuiaw1234', 1, 3850),
('Nguyễn Thị Thảo Vy', '12 Thống Nhất, phường , Đà Lạt, Lâm Đồng', '0213564321', 'thaovy@gmail.com', 'nguyenvy', 'vyvy908978', 1, 0),
('Nguyễn Linh', 'Dĩ An, Bình Dương', '0325623431', 'linhnguyen@gmail.com', 'linhlinh', 'kahdadad1245', 1, 120),
('Trần Phương Anh', '12 Ngô Thừa Nhậm, Gò Vấp, TPHCM', '0132345631', 'anhtran@gmail.com', 'phuonganh', 'kahdjakshd124', 1, 450),
('Phạm Thanh An', '3/2 Đà Lạt, Lâm Đồng', '021332153', 'thanhan123@gmail.com', 'thanhan123', 'ss2312313212', 1, 1220),
('Trần Xuân An', 'Đông Hòa, Dĩ An, Bình Dương', '0231546644', 'an1202@gmail.com', 'tranxuanan', 'uahdugdak124', 1, 0),
('Phan Văn Hùng', '12 D2, Bình Thạnh, TPHCM', '021331456', 'hung@gmail.com', 'hungphan14', 'kahdjas1245', 1, 1260);

INSERT INTO courses (course_name, course_description, course_price, created_by, created_at)
VALUES
('Đại số tuyến tính','Khóa học hỗ trợ bổ sung kiến thức cần thiết cho những ai đang và có nhu cầu tìm hiểu về môn Đại số tuyến tính', 1000, 4, '2022-01-13 00:00:00'),
('Nhập môn lập trình','Khóa học cung cấp các kiến thức cơ bản về lập trình, giúp bạn làm quen với lập trình.', 1500, 2, '2021-12-28 00:00:00'),
('Tiếng anh','Khóa học cung cấp kiến thức căn bản và nâng cao về tiếng anh, giúp bạn có thể giao tiếp bằng tiếng anh sau khóa học.', 1500, 3, '2022-01-1 00:00:00');

INSERT INTO students_courses (student_id, course_id)
VALUES
(5, 2),
(6, 2),
(7, 2),
(8, 2),
(9, 2),
(10, 2),
(11, 2),
(12, 2),
(13, 2),
(14, 2),
(15, 2),
(16, 2),
(17, 2),
(18, 2),
(19, 2),
(20, 2),
(21, 2),
(22, 2),
(23, 2),
(24, 2),
(25, 2),
(26, 2),
(27, 3),
(28, 2),
(29, 3),
(30, 3),
(31, 2),
(32, 2),
(33, 1),
(34, 1),
(20, 1),
(7, 1),
(9, 3),
(24, 3),
(15, 3),
(11, 3);