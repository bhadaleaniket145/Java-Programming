import java.util.*;

class Collection5
{
    public static void main(String arg[])
    {
        Hashtable <String, Integer> hobj = new Hashtable<String, Integer>();

        hobj.put("C proframming", 990);
        hobj.put("C++ proframming", 1200);
        hobj.put("Java proframming", 780);
        hobj.put("Python proframming", 1650);

        System.out.println("Book price of java"+ hobj.get("Java programming"));
        hobj.remove("C++ Proframming");

        Enumeration eobj = hobj.keys();
        while(eobj.hasMoreElements())
        {
            System.out.println(eobj.nextElement());
        }
    }
}