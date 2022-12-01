import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,i,j,ans=0;
        n=sc.nextInt();
        for(i=0;i<=n;i++){
            for(j=i;j<=n;j++){
                int s=i*i+j*j;
                if(s==n){
                    ans=1;
                    System.out.println("True");
                    break;
                }
            }
            if(ans==1){
                break;
            }
        }
        if(ans==0){
            System.out.println("False");
        }
    }
}