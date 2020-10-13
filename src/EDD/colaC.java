package EDD;

public class colaC <t>
{


    private Object[] colaC;
    private int front, rear, size;

    colaC(int size) 
    {
        colaC = (t[]) new Object[size];

        this.size = size;

        front = -1;

        rear = -1;
    }

    public boolean full() 
    {
        return rear == size - 1 && front  == 0 || (rear == front - 1);
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
            if(rear == size - 1)
                rear  = 0;
            else
                rear++;
            colaC[++rear] = dato;

        }
    }

    public t remove() 
    {
        t temp = (t) colaC[front];
        if (front == rear) 
        {
            front = -1;
            rear = -1;
        }

         else
         if (front ==  size - 1)
            front=0;
        else
        front++;
        return temp;

    }

    public t peekNext() 
    {
        t temp = (t) colaC[front];
        return temp;
    }

    public void peekQueue() 
    {
        for (int i = 0; i < colaC.length; i++) 
        {
            System.out.println(colaC[i] + " ");
        }
    }

    public void fitQueue() 
    {
        t[] colatemp = (t[]) new Object[colaC.length];
        int c = 0;
        for (int i = front; i < colaC.length; i++) 
        {
            if(colaC[i] != null)
            {
                colatemp[c] = (t) colaC[i];
                c++;
            }
        }

        /*for(int i = 0; i < cola.length; i++)
        {
            cola[i] = null;
        }*/

        for(int i = 0; i < colaC.length; i++)
        {
            colaC[i] = colatemp[i];
        }

        front = 0; 
        rear = c-1;
    }
}


