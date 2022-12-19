import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,j,k,m,n,x;
        n=sc.nextInt();
        k=n;
        m = n+(n-1);
        for(i=0;i<m;i++){
            for(j=0;j<m;j++){
                if(i<=n-1) {        
                    if(i==0){
                        System.out.print(k+" ");
                    }
                    if(i>=1){
                        if(j<i){
                            System.out.print(k-j+" ");
                        }
                        else if(j>=i && j<m-i){
                            System.out.print(k-i+" ");
                        }
                        else{
                            System.out.print((j-k+1)+1+" ");
                        }
                    }
                }
                else if(i==n-1){
                    if(j<n){
                        System.out.print(k-j+" ");
                    }
                    else{
                        System.out.print((j-k+1)+1+" ");
                    }
                }
                else if(i>=n){
                    x = m-i-1;
                    if(i==m){
                        System.out.print(k+" ");
                    }
                    if(j<x){
                        System.out.print(k-j+" ");
                    }
                    else if(j>=x && j<m-x){
                        System.out.print(k-x+" ");
                    }
                    else {
                        System.out.print((j-k+1)+1+" ");
                    }    
                }
            }
            System.out.println();
        }
    }
}