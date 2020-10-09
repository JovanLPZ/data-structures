package EDD;
public class cola<t> 
{
    private Object[] cola;
    private int front, rear, size;


    cola (int Size)
    {
        cola = (t[]) new Object[size];

        this.size = size;

        front = -1;

        rear = -1;
    }
    
    public boolean full()
    {
        return rear == size-1;
    }

    public boolean empty()
    {
        return front == -1;
    }

    public void add(t dato)
    {
        if(!empty())
        {
            if(empty())
            front++;
            cola[++rear] = dato;

        }
    }

    public t remove()
    {
        Object temp = cola[front];
        if(front==rear)
        {
            front = -1;
            rear = -1;
        }
        else
        front++;
        return ((t) temp);

    }

    public t peekNext()
    {
        t temp = (t) cola[front];
        return temp;
    }

    public void peekQueue()
    {
        for(int i = 0; i < cola.length; i++)
        {
            System.out.println(cola[i] + " ");
        }
    }

    public void fitQueue()
    {
        
    }
}
