import java.util.*;
public class file{
    public static void main(String[] args){
        int l,b,w,c,ar=0,ans=0;
        Scanner sc=new Scanner(System.in);
        l=sc.nextInt();
        b=sc.nextInt();
        w=sc.nextInt();
        c=sc.nextInt();
        ar=((l+2*w)*(b+2*w))-l*b;
        ans=ar*c;
        System.out.println(ans);
    }
}