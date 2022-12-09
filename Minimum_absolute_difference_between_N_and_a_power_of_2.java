import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,i,a,b,t=0;
        double x;
        n=sc.nextInt();
        int l[]=new int[n];
        for(i=0;i<n;i++){
            x=Math.pow(2,i);
            l[i]=(int)x;
        }
        a=n;
        b=n;
        while(1==1){
            int p=0,q=0;
            for(i=0;i<n;i++){
                if(l[i]==a){
                    p=1;
                    break;
                }
            }
            if(p==1){
                System.out.println(t);
                break;
            }
            for(i=0;i<n;i++){
                if(l[i]==b){
                    q=1;
                    break;
                }
            }
            if(q==1){
                System.out.println(t);
                break;
            }
            t+=1;
            a-=1;
            b+=1;
        }
    }
}