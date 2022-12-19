import java.util.*;
import java.lang.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String res="";
        int x=0,a=0;
        for(int i=0;i<s.length();i++){
            x=Character.getNumericValue(s.charAt(i));
            if(x%2!=0){
                a=(int)Math.pow(x,2);
                String s1=String.valueOf(a);
                res+=s1;
            }
        }
        System.out.println(res);
    }
}