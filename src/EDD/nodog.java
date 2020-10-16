package EDD;

public class nodog <t>
{
    private t dato;

    private nodog<t> next;

    public nodog()
    {
        this(null,null);
    }

    public nodog(t dato, nodog<t> next)
    {
        this.dato = dato;
        this.next = next;
    }

    public t getDato() {
        return dato;
    }

    public void setDato(t dato) {
        this.dato = dato;
    }

    public nodog<t> getNext() {
        return next;
    }

    public void setNext(nodog<t> next) {
        this.next = next;
    }

    
}
