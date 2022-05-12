package Odev;

public class AgArayuzu implements IAgArayuzu{

    private int sicaklikArayuz;
    private int alinanDenetleyici;
    private int gonderilenEmirAgArayuzu;

    private static final int SOGUTUCU_AC=1;
    private static final int SOGUTUCU_KAPA=2;

    public void getSicaklikArayuz(Denetleyici denetleyici)
    {
        sicaklikArayuz=denetleyici.getSicaklikDenetleyici();
    }

    @Override
    public void sogutucuAc(Denetleyici denetleyici,Eyleyici eyleyici)
    {
        eyleyici.setSicaklikGuncel(denetleyici);
        denetleyici.getAlinanEmirAgArayuzu(SOGUTUCU_AC);
        denetleyici.eyleyiciyeEmirGonder(eyleyici);
    }
    @Override
    public void sogutucuKapat(Denetleyici denetleyici,Eyleyici eyleyici)
    {
        eyleyici.setSicaklikGuncel(denetleyici);
        denetleyici.getAlinanEmirAgArayuzu(SOGUTUCU_KAPA);
        denetleyici.eyleyiciyeEmirGonder(eyleyici);
    }
    @Override
    public void sicaklikGonder(Denetleyici denetleyici)
    {
        sicaklikArayuz = denetleyici.getSicaklikDenetleyici();
        System.out.println("\n\t\t###########################");
        System.out.println("\t\t##   Sicaklik:"+sicaklikArayuz+" Derece  ##");
        System.out.println("\t\t###########################");
    }
}
