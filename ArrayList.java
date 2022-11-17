import java.util.ArrayList;
public class ArrayList
{

    public static void main(String[] args)
    {
        ArrayList<String> al=new ArrayList<String>();

        al.add("mrina");
        al.add("siddhali");
        al.add("chinu");
        al.add("meena");

        for(Object b : al)
        {
            System.out.println(b);
        }

    }
}



