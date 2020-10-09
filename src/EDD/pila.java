package EDD;

import java.util.EmptyStackException;

public class pila<t>
{
    private int size;
    private t[] pila;
    private int cima;

    public pila(int tam)
    {
        size = tam;
        cima = -1;
        pila = (t[]) new Object[size];
        //pila <t> pila =  new pila <t> (tam);
    }

    public pila() {
	}

	public boolean empty()
    {
        return cima == -1;
    }

    public boolean full()
    {
        return cima == size-1;
    }

    public boolean push(t dato) 
    {
        if(!full())
        {
            pila[++cima] = dato;
            return true;
        }   
        return false;
    }

    public t pop() throws EmptyStackException
    {
        if(!empty())
        {
            return (t) pila[cima--];
        }
        throw new EmptyStackException();
    }

    public t peek() throws EmptyStackException
    {
        if(!empty())
        {
            return (t) pila[cima];
        }
        throw new EmptyStackException();
    }

}
