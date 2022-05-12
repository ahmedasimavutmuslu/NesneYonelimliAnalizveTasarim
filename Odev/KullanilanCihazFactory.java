package Odev;

public class KullanilanCihazFactory
{
    public KullanilanCihaz FactoryMethod()
    {
        KullanilanCihaz cihaz= new KullanilanCihaz(273,"v0.8","nomad");
        return cihaz;
    }
}
