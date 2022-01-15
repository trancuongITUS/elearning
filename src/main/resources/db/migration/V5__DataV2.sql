INSERT INTO comments (content, created_by, created_at, last_modified, course_id)
VALUES
('Khóa học thật sự bổ ích. Cảm ơn đã đăng tải khóa học này.', 7, '2020-12-07 00:00:00', '2020-12-07 00:00:00', 1),
('Khóa học quá tuyệt vời.', 9, '2020-11-12 00:00:00', '2020-11-12 00:00:00', 1),
('Khóa học thật sự dễ hiểu và bổ ích.', 20, '2020-06-07 00:00:00', '2020-06-07 00:00:00', 1),
('Học xong khóa học này em đã biết thêm nhiều thứ. Thật sự là khóa học rất tuyệt. 100 điểm', 15, '2020-12-09 00:00:00', '2020-12-09 00:00:00', 2),
('Khóa học quá bổ ích, nên học nha mọi người.', 17, '2020-12-11 00:00:00', '2020-12-11 00:00:00', 2),
('Khóa học thật sự bổ ích. Cảm ơn đã đăng tải khóa học này.', 7, '2020-12-07 00:00:00', '2020-12-07 00:00:00', 2),
('Khóa học thật sự bổ ích.', 11, '2020-02-17 00:00:00', '2020-02-17 00:00:00', 3),
('Học xong cảm thấy mình thông minh hẳn. Khóa học rất tuyệt.', 12, '2020-02-12 00:00:00', '2020-02-12 00:00:00', 3),
('Tuyệt vời ạ.', 24, '2020-03-10 00:00:00', '2020-03-10 00:00:00', 3);

INSERT INTO exercises (content, solution, created_at, last_modified, course_id)
VALUES
('Cho S = {(x,y) thuộc R^2 | x-y=0}. Tìm cơ sở và số chiều của S', 'Giả sử v thuộc S => v = (x,x) (x thuộc R). 
Ta có v=x(1,1) nên U = u (1,1) là hệ sinh của S. 
u = (1,1) khác 0 => U độc lập tuyến tính, và vì vậy U là cơ sở của S . dimS = 1', '2021-01-01 00:000:00', '2021-02-01 00:00:00', 1),
('Cho hệ véc tơ U = {u1(1,2,2, 1); u2(2,3,1,4); u3(1,3,5,1); u4(1, -1,-7,1)}. Tìm hạng của vector.', 'r(U) = 3', '2021-06-01 00:00:00', '2021-06-01 00:00:00', 1),
('Viết một hàm xác định xem một số nguyên dương đã cho có phải là số nguyên tố hay không.', 'bool isPrime(int n) {
    if (n <= 1) return false;
    for (int i = 2; i <= sqrt(n); i++) 
        if (n % i == 0)
            return false;
    return true;
}', '2020-03-06 00:00:00', '2020-03-06 00:00:00', 2);