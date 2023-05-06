import java.util.*;

class Collection4
{
    public static void main(String arg[])
    {
        Stack <Integer> lobj = new Stack<Integer>();

        lobj.push(11);
        lobj.push(21);
        lobj.push(51);
        lobj.push(101);
    
        System.out.println("Element are : "+ lobj);

        System.out.println("Poped Element are : "+ lobj.pop());

        System.out.println("Element are : "+ lobj);
    }
}