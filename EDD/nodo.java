
package EDD;
    
public class nodo 
{
        private int pass;
        private String name;
        private int value;

        private nodo next;

        public nodo(int pass, String name, int value, nodo next) 
        {
            this.pass = pass;
            this.name = name;
            this.value = value;
            this.next = next;
        }

        public nodo()
        {
            this(0,null, 0, null);
        }


        public nodo (int pass, String name, int value)
        {
            this(pass, name, value, null);
        }

        public int getPass() 
        {
            return pass;
        }

        public void setPass(int pass) 
        {
            this.pass = pass;
        }

        public String getName() 
        {
            return name;
        }

        public void setName(String name) 
        {
            this.name = name;
        }

        public int getValue() 
        {
            return value;
        }

        public void setValue(int value) 
        {
            this.value = value;
        }

        public nodo getNext() 
        {
            return next;
        }

        public void setNext(nodo next) 
        {
            this.next = next;
        }

       public String toString()
        {
            return "Nodo [pass: "+ pass + " Name: " + name + " Value: " + value + " Next: " + next + "]";
        }
        
        
        
}
    

