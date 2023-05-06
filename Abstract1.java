abstract class Base
{
        public Base()
        {
            System.out.println("Inside Base constructor");
        }

        public void sayHello()
        {
            System.out.println("Hello");
        }

        abstract public void greet();
        abstract public void greet2();

}

class Derived1 extends Base
    {

        //@Override
        public void greet()
        {
            System.out.println("Good morning");
        }

        //@Override
        public void greet2()
        {
            System.out.println("Good afternoon");
        }
    }

abstract class Derived2 extends Base
{

        public void th()
        {
            System.out.println("I am good");
        }
}

public class Abstract1
    {
        public static void main(String Arg[])
        {
            //Base b = new Base(); //-- error

            Derived1 d = new Derived1();

            //Derived2 c = new Derived2(); //-- error
        }
    }       