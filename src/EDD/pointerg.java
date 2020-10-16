package EDD;

public class pointerg <t>
{
    private nodog<t> nodo;

    public pointerg(nodog<t> nodo)
    {
        this.nodo = nodo; 
    }

    public boolean end()
    {
        return nodo == null;
    }

    public boolean kEnd()
    {
        return nodo.getNext() == null;
    }

    public void go()
    {
        if(!end())
        {
            nodo = nodo.getNext();
        }
    }

    public nodog<t> getNext()
    {
        if(nodo != null)
        return nodo.getNext();

        return null;
    }

    public void setNext(nodog<t> nodo)
    {
        if(nodo != null)
        nodo.setNext(nodo);
    }

    public String toString()
    {
        return nodo == null ? null : nodo.getDato().toString();
    }

    public nodog<t> getNodog()
    {
        return nodo;
    }

    public void setNodo(nodog<t> nodo)
    {
        this.nodo = nodo;
    }
}
