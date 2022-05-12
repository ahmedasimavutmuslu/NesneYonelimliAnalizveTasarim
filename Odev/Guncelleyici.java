package Odev;

import java.util.ArrayList;
import java.util.List;

public class Guncelleyici implements ISubject{

    private List<IObserver> dinlenenler = new ArrayList<>();

    public void attach(IObserver o)
    {
        dinlenenler.add(o);
    }
    public void detach(IObserver o)
    {
        dinlenenler.remove(o);
    }
    public void notify(int sicaklik)
    {
        for(IObserver dinlenen:dinlenenler)
        {
            dinlenen.update(sicaklik);
        }
    }
}
