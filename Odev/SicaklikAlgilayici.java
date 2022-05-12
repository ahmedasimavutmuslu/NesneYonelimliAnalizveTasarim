package Odev;

import java.util.ArrayList;
import java.util.List;

public class SicaklikAlgilayici implements ISicaklikAlgilayici{
    private int sicaklikAlgilanan;
    ISubject guncelleyici;

    public SicaklikAlgilayici(ISubject guncelleyici)
    {
        this.sicaklikAlgilanan=(int)(Math.random()*25)+15;;
        this.guncelleyici=guncelleyici;
        getSicaklikAlgilanan();
    }



    public int getSicaklikAlgilanan()
    {
        sicaklikOku();
        guncelleyici.notify(sicaklikAlgilanan);

        return sicaklikAlgilanan;
    }
    public void sicaklikOku()
    {
        sicaklikAlgilanan= (int)(Math.random()*25)+15;
    }





}

