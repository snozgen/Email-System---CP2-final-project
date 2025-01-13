/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sema.project;

/**
 *
 * @author semao
 */
public class UserSession {
    // Oturumda aktif olan kullanıcının e-posta adresi
    public static String loggedInUserEmail;
    
    // Kullanıcı oturum açtığında bu fonksiyon çağrılabilir
    public static void logIn(String email) {
        loggedInUserEmail = email;  // Oturum açan kullanıcının e-posta adresini kaydeder
    }

    // Kullanıcı oturum kapattığında bu fonksiyon çağrılabilir
    public static void logOut() {
        loggedInUserEmail = null;  // Oturum kapandığında e-posta adresini sıfırlar
    }
}
