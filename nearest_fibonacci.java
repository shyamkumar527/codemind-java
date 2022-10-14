import java.util.*;
public class file{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=0,b=1,c=0;
        while(c<num){
            c=a+b;
            a=b;
            b=c;
        }
        if((num-a)==(b-num)){
            System.out.println(a+" "+b);
        }
        else if((num-a)>(b-num)){
            System.out.println(b);
        }
        else{
            System.out.println(a);
        }
    }
}