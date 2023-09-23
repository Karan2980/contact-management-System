import java.util.*;

class NewwApplet
{
    public static void main(String args[])
    {
        Vector <String> v = new Vector <> ();
        v.add(args[0]);
        v.add(args[1]);
        v.add(args[2]);
        v.add(args[3]);
        v.add(args[4]);
        Enumeration e = v.elements();
        System.out.println("BEFORE SORTING : ");
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
        Collections.sort(v);
        Enumeration e1 = v.elements();
        System.out.println("After SORTING : ");
        while(e1.hasMoreElements())
        {
            System.out.println(e1.nextElement());
        }
    }
}
