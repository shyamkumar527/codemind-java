import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=n;
        while(1==1){
            int r=0,sum=0;
            if(n<10){
                System.out.println(x);
                break;
            }
            else{
                while(1==1){
                    r=x%10;
                    x=x/10;
                    sum+=r;
                    if(x==0){
                        x=sum;
                        n=sum;
                        break;
                    }
                }
            }
        }
    }
}