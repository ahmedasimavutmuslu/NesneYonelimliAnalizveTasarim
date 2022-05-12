package Odev;

public class KullanilanCihaz
{
    private int id;
    private String yazilimSurumu;
    private String markasi;

    public KullanilanCihaz(int id,String yazilimSurumu,String markasi)
    {
        this.id=id;
        this.yazilimSurumu=yazilimSurumu;
        this.markasi=markasi;
    }

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String  getYazilimSurumu()
    {
        return yazilimSurumu;
    }
    public void setYazilimSurumu(String yazilimSurumu)
    {
        this.yazilimSurumu=yazilimSurumu;
    }
    public String getMarkasi()
    {
       return markasi;
    }
    public void setMarkasi(String markasi)
    {
        this.markasi=markasi;
    }
    @Override
    public String toString()
    {
        return "\n\t\t###########################"+
                "\n\t\t##     Cihaz Id: "+id+"     ##"+
                "\n\t\t##  Yazilim Surumu: "+yazilimSurumu+" ##"+
                "\n\t\t##     Markasi: "+markasi+"    ##"+
                "\n\t\t###########################";
    }

}
