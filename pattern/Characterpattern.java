import java.util.*;

public class Characterpattern {
    public static void main (String [] args)
    {
    Scanner input = new Scanner(System.in);
    char a = 'A';
    //System.out.println(a);
   // a++;
    //System.out.println(a);

    int n=input.nextInt();
    for (int i=1;i<=n;i++)

{
    for (int j=1;j<=i;j++)
    {
        System.out.print(a);
        a++;
    }
    System.out.println();

}
}
}
