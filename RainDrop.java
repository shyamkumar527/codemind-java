import java.util.*;
public class file{
    public static void main(String[] args){
        int a,x=0;
        String s="";
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a%3==0){
            s+="Pling";
            x=1;
        }
        if(a%5==0){
            s+="Plang";
            x=1;
        }
        if(a%7==0){
            s+="Plong";
            x=1;
        }
        if(x==1){
            System.out.println(s);
        }
        else{
            System.out.println(a);
        }
    }
}