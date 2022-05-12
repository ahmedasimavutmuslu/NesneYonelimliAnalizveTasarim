package Odev;

import java.io.InputStream;
import java.util.Scanner;

public class Denetleyici implements IObserver {
    private int sicaklikDenetleyici;
    private int agArayuzundenAlinanEmir;
    private int eyleyiciyeGonderilenEmir;
    Eyleyici eyleyici;


    private static final int SOGUTUCU_AC=1;
    private static final int SOGUTUCU_KAPA=2;

    public Denetleyici()
    {

        this.agArayuzundenAlinanEmir=0;
        this.eyleyiciyeGonderilenEmir=0;
    }
    @Override
    public void update(int sicaklik)
    {
        sicaklikDenetleyici=sicaklik;
        //System.out.println("Yeni Sicaklik:"+sicaklikDenetleyici+"Derece Celcius");
    }
    public int getSicaklikDenetleyici()
    {
        return sicaklikDenetleyici;
    }

    public int getEyleyiciyeGonderilenEmir()
    {
        return eyleyiciyeGonderilenEmir;
    }


    public void getAlinanEmirAgArayuzu(int alinanEmirAgArayuzu)
    {
        this.agArayuzundenAlinanEmir=alinanEmirAgArayuzu;
        this.eyleyiciyeGonderilenEmir=alinanEmirAgArayuzu;

    }


    public void eyleyiciyeEmirGonder(Eyleyici eyleyici) {
        if (eyleyiciyeGonderilenEmir == SOGUTUCU_AC) {
            eyleyici.setSicaklikGuncel(this);
            eyleyici.sogutucuAc();
        } else if (eyleyiciyeGonderilenEmir == SOGUTUCU_KAPA) {
            eyleyici.setSicaklikGuncel(this);
            eyleyici.sogutucuKapat();
        } else {
            System.out.println("Yanlis Emir Girildi");
        }

    }

    /*
    public static void main(String[] Args)
    {
        Guncelleyici guncelleyici=new Guncelleyici();
        Denetleyici denetleyici=new Denetleyici();
        SicaklikAlgilayici sa=new SicaklikAlgilayici(guncelleyici);
        Eyleyici eyleyici = new Eyleyici(guncelleyici);
        AgArayuzu agArayuzu=new AgArayuzu();
        Scanner cevap =new Scanner(System.in);


        guncelleyici.attach(denetleyici);

        sa.getSicaklikAlgilanan();
        agArayuzu.sicaklikGonder(denetleyici);
        agArayuzu.sogutucuAc(denetleyici);
        denetleyici.eyleyiciyeEmirGonder(eyleyici);
        agArayuzu.sogutucuKapat(denetleyici);
        denetleyici.eyleyiciyeEmirGonder(eyleyici);


    }
    */

}

