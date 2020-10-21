package EDD;

public class listag<t> 
{
    private nodog<t> root;

    public listag() 
    {
        root = new nodog<t>();
    }

    public boolean empty() 
    {
        return root.getNext() == null;
    }

    public pointerg<t> pointStart() 
    {
        return new pointerg<t>(root);
    }

    public pointerg<t> pointFirst() 
    {
        return new pointerg<t>(root.getNext());
    }

    public int indexOf(int pass) 
    {
        pointerg<t> aux = pointStart();
        int cont = 0;
        while (aux != null && aux.getNodog() != null) 
        {
            producto p = (producto) aux.getNodog().getDato();
            if (!p.equals(pass)) 
            {
                aux.go();
                cont++;
            }

            else 
            {
                break;
            }
        }
        return aux != null && aux.getNodog() != null ? cont : Integer.MAX_VALUE;
    }

    public pointerg<t> last() 
    {
        pointerg<t> aux = pointStart();
        while (aux.getNext() != null) 
        {
            aux.go();
        }

        return aux;
    }

    public void addFirst(t dato) 
    {
        add(dato, pointStart());
    }

    public void addLast(t dato) 
    {
        add(dato, last());
    }

    public void add(t dato) 
    {
        add(dato, last());
    }

    public void add(int indice, t dato) 
    {
        pointerg<t> aux = pointFirst();
        int cont = 1;
        while (aux.getNext() != null && cont < indice) 
        {
            aux.go();
            cont++;
        }
        add(dato, aux);
    }

    public void add(t dato, pointerg<t> PN) 
    {
        if(PN != null && !PN.end())
        {
            PN.setNext(new nodog<t>(dato, PN.getNext()));
        }
    }

    public void remove(int indice) 
    {
        pointerg<t> aux = pointStart();
        int cont = 1;
        while (aux.getNext() != null && cont < indice) 
        {
            aux.go();
            cont++;
        }
        if (!aux.kEnd()) 
        {
            aux.setNext(aux.getNext().getNext());
        }
    }

    public t get(int indice) 
    {
        pointerg<t> aux = pointStart();
        int cont = 1;
        while (aux != null && aux.getNodog() != null && cont < indice) 
        {
            aux.go();
            cont++;
        }
        return aux.getNext().getDato();
    }

    public int size() 
    {
        pointerg<t> aux = pointStart();
        int cont = 0;
        while (aux.getNext() != null) 
        {
            aux.go();
            cont++;
        }
        return cont;
    }

}
