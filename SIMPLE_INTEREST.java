import java.util.*;
public class file{
    public static void main(String[] args){
        int p,t,r,si=0;
        Scanner sc=new Scanner(System.in);
        p=sc.nextInt();
        t=sc.nextInt();
        r=sc.nextInt();
        si=(p*t*r)/100;
        System.out.println(si);
    }
}