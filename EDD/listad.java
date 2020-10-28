package EDD;

public class listad<t> 
{
    private nodod<t> root;

    public listad() 
    {
        root = new nodod<>();
    }


    private nodod<t> start() 
    {
        return root;
    }

    private nodod<t> first() 
    {
        return root.getNext();
    }
/*
    public int indexOf(int pass) 
    {
        pointerg<t> aux = first();
        int cont = 0;
        while (aux != null && aux.getNodog() != null)
        {          
            producto p = (producto)aux.getNodog().getDato();
            if(!p.equals(pass))
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


    public int indexOf( t dato) 
    {
        pointerg<t> aux = first();
        int cont = 0;
        while (aux != null && aux.getNodog() != null )
        {          
            Object tmp = aux.getNodog().getDato();

            if(!tmp.equals(dato))
            {
                aux.go();
                cont++;
            }
        
            else
            {
                break;
            }
        }
        return aux != null && aux.getNodog() != null ? cont : -1;
    }

    public int indexOf(Object d2, t obj)
    {
        int index = 0;
        nodog<t> current = root.getNext();

        while(current != null)
        {
            if(current.equals(obj))
            {
                return index;
            }

            index++;
            current = current.getNext();
        }

        if(index == size() && obj == null)
        {
            return -1;
        }

        else
        {
            return index;
        }
    }
*/
    private nodod<t> last() 
    {
        nodod<t> aux = root;
        while (aux.getNext() != null) 
        {
            aux = aux.getNext();
        }

        return aux;
    }

    public void addFirst(t dato) 
    {
        add(dato, start());
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
        nodod<t> aux = start();
        int cont = 0;
        while (aux.getNext() != null && cont < indice) 
        {
            aux = aux.getNext();
            cont++;
        }
        add(dato, aux);
    }

    public void add(t dato, nodod<t> PN) 
    {
        if(PN != null)
        {
            PN.setNext(new nodod<>(dato, PN, PN.getNext()));

            if(PN.getNext().getNext() != null)
            PN.getNext().getNext().setPrevious(PN.getNext());
        }
    }

    public void remove(int indice) 
    {
        nodod<t> aux = start();
        int cont = 0;
        while (aux.getNext() != null && cont < (indice-1)) 
        {
            aux = aux.getNext();
            cont++;
        }
        if (aux.getNext() != null) 
        {
            aux.setNext(aux.getNext().getNext());
            if(aux.getNext() != null)
            {
                aux.getNext().setPrevious(aux);
            }
            
        }
    }

    public t get(int indice) 
    {
        nodod<t> aux = first();
        int cont = 0;
        while (aux != null && cont < indice) 
        {
            aux = aux.getNext();
            cont++;
        }
        return aux != null ? aux.getDato() : null;
    }

    public int size() 
    {
        nodod<t> aux = start();
        int cont = 0;
        while (aux.getNext() != null) 
        {
            aux = aux.getNext();
            cont++;
        }
        return cont;
    }

}
