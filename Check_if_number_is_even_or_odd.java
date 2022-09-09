import java.util.*;
public class file{
    public static void main(String[] args){
        int x;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        if(x%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}