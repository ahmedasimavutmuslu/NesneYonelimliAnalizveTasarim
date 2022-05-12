package Odev;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class AkilliCihaz implements IAkilliCihaz{

    Guncelleyici guncelleyici=new Guncelleyici();
    Denetleyici denetleyici=new Denetleyici();
    SicaklikAlgilayici sa=new SicaklikAlgilayici(guncelleyici);
    Eyleyici eyleyici = new Eyleyici(guncelleyici,0);
    AgArayuzu agArayuzu=new AgArayuzu();
    Scanner cevap =new Scanner(System.in);




    public void Kapali()
    {
        try {
            TimeUnit.SECONDS.sleep(1);
        }catch (InterruptedException e)
        {
            System.out.println("Hata Oluştu!");
        }
        System.out.println("\n\t\t###########################");
        System.out.println("\t\t##    Sistem Kapatildi!  ##");
        System.out.println("\t\t###########################");

    }
    public void Bekleme()
    {
        guncelleyici.attach(denetleyici);
        sa.getSicaklikAlgilanan();
        System.out.println("\n\t\t###########################");
        System.out.println("\t\t##       SECENEKLER      ##");
        System.out.println("\t\t##-----------------------##");
        System.out.println("\t\t## (1)Sicaklik Goruntule ##");
        System.out.println("\t\t## (2)Sogutucuyu Ac      ##");
        System.out.println("\t\t## (3)Sogutucuyu Kapat   ##");
        System.out.println("\t\t## (4)Cikis Yap          ##");
        System.out.println("\t\t##-----------------------##");
        System.out.println("\t\t##  Bir Secenek Seciniz! ##");
        System.out.println("\t\t###########################");

        int secilenSecenek=cevap.nextInt();

        while(secilenSecenek!=4)
        {
            if(secilenSecenek==1)
            {
                Algilama();
                KontrolEt();
                agArayuzu.sicaklikGonder(denetleyici);
            }
            else if(secilenSecenek==2)
            {
                Algilama();
                KontrolEt();
                //eyleyici.setSicaklikGuncel(denetleyici);
                agArayuzu.sogutucuAc(denetleyici,eyleyici);

            }
            else if(secilenSecenek==3)
            {
                Algilama();
                KontrolEt();
                agArayuzu.sogutucuKapat(denetleyici,eyleyici);
            }
            else
            {
                Algilama();
                KontrolEt();
                System.out.println("\n\t\t###########################");
                System.out.println("\t\t## Yanlış Giriş Yapildi  ##");
                System.out.println("\t\t###########################");
            }
            try {
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException e)
            {
                System.out.println("Hata Oluştu!");
            }
            System.out.println("\n\t\t###########################");
            System.out.println("\t\t##  Sistem Hazirlaniyor! ##");
            System.out.println("\t\t###########################");
            try {
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException e)
            {
                System.out.println("Hata Oluştu!");
            }
            System.out.println("\n\t\t###########################");
            System.out.println("\t\t##       SECENEKLER      ##");
            System.out.println("\t\t##-----------------------##");
            System.out.println("\t\t## (1)Sicaklik Goruntule ##");
            System.out.println("\t\t## (2)Sogutucuyu Ac      ##");
            System.out.println("\t\t## (3)Sogutucuyu Kapat   ##");
            System.out.println("\t\t## (4)Cikis Yap          ##");
            System.out.println("\t\t##-----------------------##");
            System.out.println("\t\t## Yeni Secenek Seciniz! ##");
            System.out.println("\t\t###########################");
            secilenSecenek=cevap.nextInt();

        }

        Kapali();


    }
    public void KontrolEt()
    {
        try {
            TimeUnit.SECONDS.sleep(1);
        }catch (InterruptedException e)
        {
            System.out.println("Hata Oluştu!");
        }
        System.out.println("\n\t\t###########################");
        System.out.println("\t\t##   Kontrol Ediliyor!   ##");
        System.out.println("\t\t###########################");


    }
    public void Algilama()
    {
        try {
            TimeUnit.SECONDS.sleep(1);
        }catch (InterruptedException e)
        {
            System.out.println("Hata Oluştu!");
        }
        System.out.println("\n\t\t###########################");
        System.out.println("\t\t##   Eylem Algilaniyor!  ##");
        System.out.println("\t\t###########################");
    }


    public static void main(String[] Args)
    {
        KullanilanCihazFactory factory=new KullanilanCihazFactory();
        KullanilanCihaz kullanilanCihaz= factory.FactoryMethod();
        System.out.println(kullanilanCihaz);
        KullaniciDogrula kullaniciDogrula=new KullaniciDogrula();
        kullaniciDogrula.kullaniciDogrula();

    }


}
