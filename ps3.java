public class ps3 {
    public static void main(String[] args) {
        
        int x = 10;
        int y = 10;
        int z = 10;

        if(x>y&&x>z)
            System.out.println("X IS GRATER THAN Y AND Z ");
        else if (y>x&&y>z)
        System.out.println("Y IS GRATER THAN X AND Z");  
        else if (z>x && z>y)
            System.out.println("Z IS GRATER THAN X AND Y");
        else if (x==y&&x==z&&y==z)
            System.out.println("ALL ARE SAME");
        else
            System.out.println("error");
      }
}
