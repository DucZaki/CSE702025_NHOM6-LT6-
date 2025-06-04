package database;

import java.sql.*;

public class DatabaseConnection {
    private static final String URL = Config.get("db.url");
    private static final String USER = Config.get("db.username");
    private static final String PASSWORD = Config.get("db.password");

    public static Connection getConnection() throws SQLException {
        if (URL == null || USER == null || PASSWORD == null) {
            throw new SQLException("Thông tin cấu hình cơ sở dữ liệu không hợp lệ. Vui lòng kiểm tra tệp config.properties.");
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Lấy máy trống
    public static int getAvailableMachine() {
        String query = "SELECT id FROM may WHERE trang_thai = 'trong' LIMIT 1";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                return rs.getInt("id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1; // Không có máy trống
    }

    // Cập nhật trạng thái máy khi khách thuê
    public static boolean updateMachineStatus(int machineId, int customerId) {
        String query = "UPDATE may SET trang_thai = 'dang_su_dung', id_khach = ? WHERE id = ?";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, customerId);
            stmt.setInt(2, machineId);
            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Cập nhật máy về trạng thái trống khi hết thời gian chơi
    public static boolean resetMachine(int machineId) {
        String query = "UPDATE may SET trang_thai = 'trong', id_khach = NULL WHERE id = ?";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, machineId);
            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
