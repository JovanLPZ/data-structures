package EDD;

public class cola<t> 
{
    private Object[] cola;
    private int front, rear, size;

    cola(int size) 
    {
        cola = (t[]) new Object[size];

        this.size = size;

        front = -1;

        rear = -1;
    }

    public boolean full() 
    {
        return rear == size - 1;
    }

    public boolean empty() 
    {
        return front == -1;
    }

    public void add(t dato) 
    {
        if (!full()) 
        {
            if (empty())
                front++;
            cola[++rear] = dato;

        }
    }

    public t remove() 
    {
        t temp = (t) cola[front];
        if (front == rear) 
        {
            front = -1;
            rear = -1;
        }

         else
            front++;
        return temp;

    }

    public t peekNext() 
    {
        t temp = (t) cola[front];
        return temp;
    }

    public void peekQueue() 
    {
        for (int i = 0; i < cola.length; i++) 
        {
            System.out.println(cola[i] + " ");
        }
    }

    public void fitQueue() 
    {
        t[] colatemp = (t[]) new Object[cola.length];
        int c = 0;
        for (int i = front; i < cola.length; i++) 
        {
            if(cola[i] != null)
            {
                colatemp[c] = (t) cola[i];
                c++;
            }
        }

        /*for(int i = 0; i < cola.length; i++)
        {
            cola[i] = null;
        }*/

        for(int i = 0; i < cola.length; i++)
        {
            cola[i] = colatemp[i];
        }

        front = 0; 
        rear = c;
    }
}
