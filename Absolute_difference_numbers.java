import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        String s=Integer.toString(n);
        int l=s.length();
        String s1="",s2="";
        for(int i=0;i<x;i++){
            s1+=s.charAt(i);
        }
        for(int i=l-x;i<l;i++){
            s2+=s.charAt(i);
        }
        int ans=(Integer.parseInt(s1)-Integer.parseInt(s2));
        if(ans<0){
            ans*=-1;
        }
        System.out.println(ans);
    }
}