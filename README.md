# Phần Mềm Quản Lý Quán Net

Phần mềm được phát triển nhằm hỗ trợ chủ quán net trong việc quản lý máy trạm, theo dõi giờ chơi của khách hàng và thống kê doanh thu hằng ngày. Hệ thống có giao diện thân thiện, dễ sử dụng và đảm bảo tính bảo mật.

---

## Tính Năng Chính

### Đăng Nhập Người Quản Trị
- Xác thực bằng **tên đăng nhập** và **mật khẩu mã hóa SHA-256**.
- Chỉ người quản lý mới có quyền truy cập vào hệ thống.

### Quản Lý Máy Tính Trong Quán
- Thêm, sửa, xóa thông tin các máy trạm.
- Hiển thị trạng thái máy theo thời gian thực:
  - 🟩 **Màu xanh**: Máy trống.
  - 🟥 **Màu đỏ**: Máy đang sử dụng.

###  Quản Lý Thuê Máy (Tính Giờ Chơi)
- Gán khách vào máy trống và bắt đầu tính giờ chơi.
- Tự động tính thời gian chơi dựa trên số tiền nạp (mặc định: **12.000đ/giờ**).
- Đồng hồ đếm ngược thời gian chơi cho từng máy.
- Tự động giải phóng máy khi hết giờ hoặc cho phép dừng thủ công.

### Thống Kê Doanh Thu
- Xem tổng số tiền thu được trong ngày hoặc theo khoảng thời gian tùy chọn.
- Dữ liệu hiển thị dạng bảng, dễ dàng lọc theo ngày hoặc máy.

### Bảo Mật Dữ Liệu
- Mật khẩu được mã hóa bằng thuật toán **SHA-256**.
- Hệ thống kết nối cơ sở dữ liệu thông qua lớp `DatabaseConnection`, tách biệt logic và đảm bảo an toàn.

---

## Công Nghệ Sử Dụng

| Thành phần         | Công nghệ                                 |
|--------------------|--------------------------------------------|
| Cơ sở dữ liệu      | SQL Server / MySQL                         |
| Mã hóa bảo mật     | SHA-256 (`System.Security.Cryptography`)   |
| Ngôn ngữ lập trình | Java                                       |
| Giao diện người dùng | Java Swing                              |

---

## Thành Viên Thực Hiện

- **Nguyễn Minh Đức** – MSSV: `23010634`  
- **Ngô Văn Hưng** – MSSV: `23010622`  
- **Hà Công Hướng** – MSSV: `23010558`

---
