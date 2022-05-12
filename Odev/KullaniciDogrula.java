package Odev;

import java.sql.*;
import java.util.Scanner;

public class KullaniciDogrula {

    public void kullaniciDogrula()
    {
        AkilliCihaz akilliCihaz=new AkilliCihaz();

        String jdbcURL = "jdbc:postgresql://localhost:5432/nyavt";
        String username = "postgres";
        String password = "onigiri801";

        try {
            Connection connection = DriverManager.getConnection(jdbcURL,username,password);
            System.out.println("\n\t\t###########################");
            System.out.println("\t\t##   Baglanti Kuruldu!   ##");
            System.out.println("\t\t###########################");


            System.out.println("\n\t\t###########################");
            System.out.println("\t\t##   Kullanici Adini     ##");
            System.out.println("\t\t##       Giriniz!        ##");
            System.out.println("\t\t###########################");
            Scanner kullaniciAdi = new Scanner(System.in);
            String cevap=kullaniciAdi.nextLine();


            String sql = "SELECT * FROM \"kullanicilar\" WHERE \"kullaniciadi\"='"+cevap+"'";
            Statement statement=connection.createStatement();
            ResultSet result=statement.executeQuery(sql);

            if(result.next())
            {
                System.out.println("\n\t\t###########################");
                System.out.println("\t\t##   Kullanici Bulundu!  ##");
                System.out.println("\t\t##-----------------------##");
                System.out.println("\t\t##     Sifre Giriniz!    ##");
                System.out.println("\t\t###########################");
                Scanner sifre= new Scanner(System.in);
                String cevap2 = sifre.nextLine();
                sql = "SELECT * FROM \"kullanicilar\" WHERE \"sifre\"='"+cevap2+"'";
                ResultSet result2=statement.executeQuery(sql);
                if(result2.next())
                {

                    System.out.println("\n\t\t###########################");
                    System.out.println("\t\t##       Hosgeldiniz     ##");
                    System.out.println("\t\t##     Sn. "+cevap+ "     ##");
                    System.out.println("\t\t###########################");
                    akilliCihaz.Bekleme();
                }
                else
                {
                    System.out.println("\n\t\t###########################");
                    System.out.println("\t\t##      Sifre Yanlis!    ##");
                    System.out.println("\t\t###########################");
                }

            }
            else
            {
                System.out.println("\n\t\t###########################");
                System.out.println("\t\t## Kullanici Bulunamadi! ##");
                System.out.println("\t\t###########################");
            }

        } catch (SQLException e) {
            System.out.println("\n\t\t###########################");
            System.out.println("\t\t##  Baglanti Kurulamadi! ##");
            System.out.println("\t\t###########################");
            e.printStackTrace();
        }
    }


}
