/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sema.project;
import java.sql.*;
/**
 *
 * @author semao
 */


public class MailSender {
    
    // Veritabanı bağlantısını sağla
    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/mailsystem", "root", "Magconboys1+");
    }

    // Mail gönderme fonksiyonu
    public void sendEmail(String to, String subject, String message) {
        try (Connection conn = getConnection()) {
            // SQL sorgusu oluştur
            String sql = "INSERT INTO mail (to_email, subject, message, status) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, to);           // "to" (Kime)
            stmt.setString(2, subject);      // "subject" (Konu)
            stmt.setString(3, message);      // "message" (Mesaj)
            stmt.setString(4, "Sent");       // Durum "Sent" olarak ekleniyor

            // SQL sorgusunu çalıştır
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Email gönderildi!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Mail durumunu güncelleme fonksiyonu
    public void updateMailStatus(int mailId, String newStatus) {
        try (Connection conn = getConnection()) {
            String sql = "UPDATE mail SET status = ? WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, newStatus);  // Yeni durum (Sent, Spam, Drafts, Starred, Inbox)
            stmt.setInt(2, mailId);        // Mail ID
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Mail durumu güncellendi.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Kategorilere göre mailleri almak için
    public void loadMailsByCategory(String category) {
        try (Connection conn = getConnection()) {
            String sql = "SELECT * FROM mail WHERE status = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, category);  // Kategoriyi (Sent, Spam, Drafts, Starred, Inbox) al
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String to = rs.getString("to_email");
                String subject = rs.getString("subject");
                String message = rs.getString("message");

                // Maili ekrana yazdır
                System.out.println("To: " + to + ", Subject: " + subject + ", Message: " + message);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

