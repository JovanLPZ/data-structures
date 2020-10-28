package EDD;

import java.util.EmptyStackException;

public class pilad<t>
{
    private int size;
    private listad<t> pila;

    public pilad(int tam)
    {
        size = tam;
        pila = new listad<>();
        
    }

    public pilad() 
    {
        this(0);
	}

	public boolean empty()
    {
        return pila.size() == 0;
    }

    public boolean full()
    {
        return size == 0 ? false : pila.size() == size;
    }

    public boolean push(t dato) 
    {
        if(!full())
        {
            pila.addFirst(dato);
            return true;
        }   
        return false;
    }

    public t pop() throws EmptyStackException
    {
        if(!empty())
        {
            t dato = pila.get(0);
            pila.remove(0);
            return dato;
        }
        throw new EmptyStackException();
    }

    public t peek() throws EmptyStackException
    {
        if(!empty())
        {
            t dato = pila.get(0);
            return dato;
        }
        throw new EmptyStackException();
    }

}