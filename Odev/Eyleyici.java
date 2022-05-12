package Odev;

public class Eyleyici implements IEyleyici{
    private int sicaklikGuncel;
    private boolean sogutucuAcik;
    private int alinanEmir;
    ISubject guncelleyici;





    public Eyleyici(ISubject guncelleyici,int guncelSicaklik)
    {
        this.sicaklikGuncel=guncelSicaklik;
        this.guncelleyici=guncelleyici;
        this.sogutucuAcik=false;
    }

    public void denetleyiciEmirAl(Denetleyici denetleyici)
    {
        alinanEmir=denetleyici.getEyleyiciyeGonderilenEmir();
    }

    public boolean isSogutucuAcik()
    {
        return sogutucuAcik;
    }


    public int getSicaklikGuncel()
    {
        guncelleyici.notify(sicaklikGuncel);
        return sicaklikGuncel;
    }
    public void setSicaklikGuncel(Denetleyici denetleyici)
    {
        sicaklikGuncel=denetleyici.getSicaklikDenetleyici();
    }

    public int sogutucuAc()
    {
        if(sogutucuAcik)
        {
            System.out.println("\n\t\t###########################");
            System.out.println("\t\t##   Sogutucu Calismaya  ##");
            System.out.println("\t\t##     Devam Ediyor      ##");
            System.out.println("\t\t###########################");
        }
        else
        {
            System.out.println("\n\t\t###########################");
            System.out.println("\t\t##   Sogutucu Acildi!    ##");
            System.out.println("\t\t###########################");
        }

        sogutucuAcik=true;


        if(sicaklikGuncel>15)
        {
            sicaklikGuncel=sicaklikGuncel-5;

        }
        else
        {
            sogutucuAcik=false;
            System.out.println("\n\t\t###########################");
            System.out.println("\t\t##   Sogutucu Sagliginiz ##");
            System.out.println("\t\t##     Icin Kapatildi!   ##");
            System.out.println("\t\t##    15 Derece Celsius  ##");
            System.out.println("\t\t##  ve Altinda Sogutucu  ##");
            System.out.println("\t\t##        Acilamaz!      ##");
            System.out.println("\t\t###########################");

        }

        guncelleyici.notify(sicaklikGuncel);
        return sicaklikGuncel;
    }
    public void sogutucuKapat()
    {
        if(!sogutucuAcik)
        {
            System.out.println("\n\t\t###########################");
            System.out.println("\t\t## Sogutucu Zaten Kapali!##");
            System.out.println("\t\t###########################");
        }
        else
        {
            sogutucuAcik=false;
            System.out.println("\n\t\t###########################");
            System.out.println("\t\t##   Sogutucu Kapatildi! ##");
            System.out.println("\t\t###########################");
        }


    }
}
