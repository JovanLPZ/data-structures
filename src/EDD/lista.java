package EDD;

public class lista
{
    private nodo root;

    public lista ()
    {
        root = new nodo();
    }

    public apuntador pointStart()
    {
        return new apuntador(root);
    }

    public apuntador pointFirst()
    {
        return new apuntador(root.getNext());
    }

    public apuntador searchPrevious(int pass)
    {
        apuntador aux =  pointStart();

        while(aux != null && aux.getNext().getPass() < pass)
        {
            aux.move();
        }

        return aux;
    }

    public apuntador last()
    {
        apuntador aux =  pointStart();
        while(aux.getNext() != null)
        {
            aux.move();
        }

        return aux;
    }

    public void add(int pass, String name, int value, apuntador PN)
    {
        if(PN != null && !PN.end())
        {
            PN.setNext(new nodo(pass, name, value, PN.getNext()));
        }
    }

    public void remove(int pass )
    {
        apuntador aux = pointStart();

        while(aux != null && aux.getNext().getPass() != pass)
        {
            aux.move();
        }

        if(aux.nEnd())
        {
            aux.setNext(aux.getNext().getNext());
        }
    }
}
