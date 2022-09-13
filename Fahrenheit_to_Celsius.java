import java.util.*;
public class file{
    public static void main(String[] args){
        double f,c=0;
        Scanner sc=new Scanner(System.in);
        f=sc.nextDouble();
        c=((f-32)*5)/9;
        System.out.printf("%.2f",c);
    }
}