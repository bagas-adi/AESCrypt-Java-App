/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author lenovo
 */
import java.security.GeneralSecurityException;
public class HelloWorld {
    private static final String passwordURL = "Uedjs11Nty3YUlBya0ZDQkki2CqiXVby"; //256 AES // aslinya Uedjs11Nty3YUlBya0ZDQkki2CqiXVby4j/H3DIaiB4=
    private static String hasilDec="GAGAL";
    private static String hasilEnc="GAGAL";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            String messageAfterDecrypt = AESCrypt.encrypt(passwordURL, "http://domain-asli.com/api.php?param1=getdata&amp;param2=user1@mail.com&amp;param3=quiz");
            System.out.println("TAG"+" enc : "+messageAfterDecrypt); // Prints scan results
            hasilEnc = messageAfterDecrypt;
        }catch (GeneralSecurityException e){
            //handle error - could be due to incorrect password or tampered encryptedMsg
            System.out.println("TAG"+" enc : GAGAL, "+e.getMessage().toString() ); // Prints scan results
        }
        try {
            String messageAfterDecrypt = AESCrypt.decrypt(passwordURL, hasilEnc);
            hasilDec = messageAfterDecrypt;
            System.out.println("TAG"+" dec : "+messageAfterDecrypt); // Prints scan results
        }catch (GeneralSecurityException e){
            //handle error - could be due to incorrect password or tampered encryptedMsg
            System.out.println("TAG"+ " dec : GAGAL, "+e.getMessage().toString() ); // Prints scan results
        } 
    }
    
}
