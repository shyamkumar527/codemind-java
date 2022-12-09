import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,odd=0,even=0,r;
        a=sc.nextInt();
        while(a!=0){
            r=a%10;
            a=a/10;
            if(r%2==0){
                even+=1;
            }
            else{
                odd+=1;
            }
        }
        if(even>0 && odd==0){
            System.out.println("Even");
        }
        else if(even==0 && odd>0){
            System.out.println("Odd");
        }
        else{
            System.out.println("Mixed");
        }
    }
}