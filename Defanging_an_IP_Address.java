import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='.'){
                t+="[.]";
            }
            else{
                t+=s.charAt(i);
            }
        }
        System.out.println(t);
    }
}