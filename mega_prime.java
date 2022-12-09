import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,i,c=0;
        n=sc.nextInt();
        for(i=2;i<=n/2;i++){
            if(n%i==0){
                c+=1;
                break;
            }
        }
        if(c==0){
            int d=0,p=0,r;
            while(n!=0){
                r=n%10;
                n=n/10;
                d+=1;
                if(r==2 || r==3 || r==5 || r==7){
                    p+=1;
                }
            }
            if(p==d){
                System.out.println("Mega Prime");
            }
            else{
                System.out.println("Not Mega Prime");
            }
        }
        else{
            System.out.println("Not Mega Prime");
        }
    }
}