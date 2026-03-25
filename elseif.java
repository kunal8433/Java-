public class elseif {
    public static void main (String a[])
    {
        int x = 10 ;
        int y = 20 ;
        int z = 30 ;

        if (x>y && x>z)
            System.out.println(x);
        else if (y>x && y>z)
            System.out.println(y);
        else
            System.out.println(z);

    }
    
}
