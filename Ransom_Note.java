import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        int a=1;
        for(int i=0;i<s.length();i++){
            int c=0,x=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    c+=1;
                }
            }
            for(int j=0;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    x+=1;
                }
            }
            if(c>x){
                a=0;
                System.out.println("False");
                break;
            }
        }
        if(a==1){
            System.out.println("True");
        }
    }
}