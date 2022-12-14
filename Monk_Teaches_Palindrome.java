import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int k=0;k<n;k++){
            String s=sc.next();
            String t="";
            int l=s.length();
            for(int i=l-1;i>=0;i--){
                t+=s.charAt(i);
            }
            boolean ans=s.equals(t);
            if(ans==true && l%2==0){
                System.out.println("YES EVEN");
            }
            else if(ans==true && l%2==1){
                System.out.println("YES ODD");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}