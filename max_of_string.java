import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char a='a';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>a){
                a=s.charAt(i);
            }
        }
        System.out.print(a);
    }
}