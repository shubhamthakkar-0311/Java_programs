interface A
{
    void show();
}

interface B extends A
{
    void display();
}

class Demo implements B
{
    public void show()
    {
        System.out.println("This is interface A");
    }

    public void display()
    {
        System.out.println("This is interface B");
    }
}

public class p2_InterfaceExtend
{
    public static void main(String args[])
    {
        Demo d = new Demo();

        d.show();
        d.display();
    }
}