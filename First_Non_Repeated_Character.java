import java.util.*;
public class file{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int ans=0;
            int n=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            for(int j=0;j<n;j++){
                int c=0;
                for(int k=0;k<n;k++){
                    if(s.charAt(j)==s.charAt(k)){
                        c++;
                    }
                    if(c>1){
                        break;
                    }
                }
                if(c==1){
                    System.out.println(s.charAt(j));
                    ans=1;
                    break;
                }
            }
            if(ans==0){
                System.out.println("-1");
            }
        }
    }
}