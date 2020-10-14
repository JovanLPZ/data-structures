package EDD;

public class apuntador 
{
    private nodo nodo;

    public apuntador(nodo nodo)
    {
        this.nodo = nodo; 
    }

    public boolean end()
    {
        return nodo == null;
    }

    public boolean nEnd()
    {
        return nodo.getNext() == null;
    }

    public void move()
    {
        if(!end())
        {
            nodo = nodo.getNext();
        }
    }

    public int getPass()
    {
        if(nodo != null)
        return nodo.getPass();

        return Integer.MAX_VALUE;


    }

    public void setPass(int pass)
    {
        if(nodo != null)
        nodo.setPass(pass);
    }

    public String getName()
    {
        if(nodo != null)
        return nodo.getName();

        return null;


    }

    public void setName(String name)
    {
        if(nodo != null)
        nodo.setName(name);
    }

    public void setValue(int value)
    {
        if(nodo != null)
        nodo.setValue(value);
    }

    public int getValue()
    {
        if(nodo != null)
        return nodo.getValue();

        return Integer.MAX_VALUE;


    }

    public nodo getNext()
    {
        if(nodo != null)
        return nodo.getNext();

        return null;
    }

    public void setNext(nodo nodo)
    {
        if(nodo != null)
        nodo.setNext(nodo);
    }

    

}
