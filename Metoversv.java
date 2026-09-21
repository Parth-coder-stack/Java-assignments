public class Metoversv
{
    static int count; 
    int a = 0;
    
    Metoversv()
    {
        a = 1;
        count++;
    }

   
    Metoversv(int b)
    {
        a = b;
        count++;
    }

  
    void show()
    {
        System.out.println("a: " + a);
        System.out.println("Count: " + Metoversv.count);
    }

    
    void show(int c)
    {
        System.out.println("Inside parameterized show: ");
        System.out.println("a: " + a);
        System.out.println("c: " + c);
    }

    public static void main(String[] args)
    {
        Metoversv o1 = new Metoversv();

        o1.show();
        o1.show(100);

        Metoversv o2 = new Metoversv(5);

        o2.show(122);

        System.out.println("Count: " + Metoversv.count);
    }
}
