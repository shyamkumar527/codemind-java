import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,i,ans=1;
        n=sc.nextInt();
        String s=sc.next();
        String b="";
        for(i=0;i<n-1;i++){
            if(s.charAt(i)=='H' && s.charAt(i+1)=='H'){
                ans=0;
                break;
            }
        }
        for(i=0;i<n;i++){
            if(s.charAt(i)=='H'){
                b+="H";
            }
            else{
                b+="B";
            }
        }
        if(ans==1){
            System.out.println("YES");
            System.out.println(b);
        }
        else{
            System.out.println("NO");
        }
    }
}