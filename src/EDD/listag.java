package EDD;

public class listag<t> 
{
    private nodog<t> root;

    public listag()
    {
        root = new nodog<t>();
    }

    public pointerg<t> pointStart()
    {
        return new pointerg<t>(root);
    }

    public pointerg<t> pointFirst()
    {
        return new pointerg<t>(root.getNext());
    }


    public pointerg<t> search(int pass)
    {
        pointerg<t> aux =  pointStart();

        while(aux != null && aux.getClass() != null && aux.getPass() != pass)
        {
            aux.go();
        }

        return aux;
    }

    public pointerg<t> searchPrevious(int pass)
    {
        pointerg<t> aux =  pointStart();

        while(aux != null && aux.getNext().getPass() < pass)
        {
            aux.go();
        }

        return aux != null && aux.getClass() != null ? aux:null;
    }

    public pointerg<t> last()
    {
        pointerg<t> aux =  pointStart();
        while(aux.getNext() != null)
        {
            aux.go();
        }

        return aux;
    }

    public void add(t dato, pointerg<t> PN)
    {
        if(PN != null && !PN.end())
        {
            PN.setNext(new nodog<t>(dato, PN.getNext()));
        }
    }

    public void addFirst (t dato)
    {
        add(dato, pointStart());
    }

    public void addLast (t dato)
    {
        add(dato, last());
    }

    public void add(t dato, int indice)
    {
        add(dato, pointStart());
    }

    public void remove(int pass )
    {
        pointerg<t> aux = pointStart();

        while(aux.getNext() != null && aux.getNext().getPass() != pass)
        {
            aux.go();
        }

        if(aux.kEnd())
        {
            aux.setNext(aux.getNext().getNext());
        }
    }
}
