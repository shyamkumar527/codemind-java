import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t="";
        int l=sc.nextInt();
        int r=sc.nextInt();
        for(int i=l;i<=r;i++){
            t+=s.charAt(i);
        }
        System.out.println(t);
    }
}