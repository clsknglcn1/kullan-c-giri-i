import java.util.Scanner;

public class bilgi {

    public static void main(String[] args) {
        String username, password, newPassword, Changepassword;

        Scanner isim = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz:");
        username = isim.nextLine();

        System.out.println("Şifrenizi giriniz");
        password = isim.nextLine();


        if (username.equals(("Gülcan")) && (password.equals("gulcan123"))) {
            System.out.println("Giriş yaptınız!");

        } else {
            System.out.println("Bilgileriniz yanlış!, ");
            System.out.println("Şifrenizi sfırlamak istiyor musunuz?(Evet veya hayır yazınız  ");
            Changepassword = isim.nextLine();
            if (Changepassword.equals("evet")) {
                System.out.println("Yeni şifrenizi, giriniz:");

            }
            newPassword = isim.nextLine();
            if (newPassword.equals("gulcanfile:/C:/Users/clskn/IdeaProjects/kullanicigirisi/src/kullanici.java123")) {
                System.out.println("bu şifreyi daha önce kullandınız ,lütfen başka şifre giriniz:");
            } else {
                System.out.println(" şifrrniz başarılı bir şekilde olusturuldu");



            }

        }


    }


}



