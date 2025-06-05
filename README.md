# 💻 Phần Mềm Quản Lý Quán Net

Phần mềm được xây dựng nhằm hỗ trợ chủ quán net trong việc quản lý máy trạm, theo dõi giờ chơi của khách hàng và thống kê doanh thu hàng ngày. Hệ thống được thiết kế với giao diện đơn giản, dễ sử dụng và đảm bảo tính bảo mật.

---

## 🎯 Tính Năng Chính

### 🔐 Đăng Nhập Người Quản Trị
- Xác thực bằng **tên đăng nhập** và **mật khẩu mã hóa SHA-256**.
- Chỉ người quản lý mới có quyền truy cập vào hệ thống.

### 🖥️ Quản Lý Máy Tính Trong Quán
- Thêm, sửa, xóa thông tin các máy trạm.
- Hiển thị trạng thái máy theo thời gian thực:
  - 🟩 **Màu xanh**: Máy trống.
  - 🟥 **Màu đỏ**: Máy đang sử dụng.

### ⏱️ Quản Lý Thuê Máy (Tính Giờ Chơi)
- Gán khách vào máy trống và bắt đầu tính giờ chơi.
- Tự động tính thời gian chơi dựa trên số tiền nạp (mặc định: **12.000đ/giờ**).
- Đồng hồ đếm ngược thời gian chơi cho từng máy.
- Tự động giải phóng máy khi hết giờ hoặc cho phép dừng thủ công.

### 📊 Thống Kê Doanh Thu
- Xem tổng số tiền thu được trong ngày hoặc theo khoảng thời gian tùy chọn.
- Dữ liệu hiển thị dạng bảng, dễ dàng lọc theo ngày hoặc máy.

### 🔒 Bảo Mật Dữ Liệu
- Mật khẩu được mã hóa bằng thuật toán **SHA-256**.
- Hệ thống kết nối cơ sở dữ liệu thông qua lớp `DatabaseConnection`, tách biệt logic và an toàn hơn.

---

## 🛠️ Công Nghệ Sử Dụng
- **Ngôn ngữ:** C# (.NET Framework hoặc .NET Core)
- **Giao diện:** Windows Forms (WinForms)
- **Cơ sở dữ liệu:** SQL Server / SQLite
- **Mã hóa bảo mật:** SHA-256 (`System.Security.Cryptography`)
- **Phân lớp:** UI – BLL – DAL – DTO

---

## 📌 Ghi chú
Dự án phù hợp cho các mô hình quán net nhỏ và vừa, hỗ trợ tùy chỉnh dễ dàng để mở rộng thêm các tính năng như: quản lý dịch vụ (nước uống, đồ ăn), ca làm việc nhân viên, hoặc kết nối API thanh toán.

