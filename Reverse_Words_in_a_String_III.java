import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                t+=s.charAt(i);
            }
            else{
                for(int j=t.length()-1;j>=0;j--){
                    System.out.print(t.charAt(j)+"");
                }
                System.out.print(" ");
                t="";
            }
        }
        for(int j=t.length()-1;j>=0;j--){
            System.out.print(t.charAt(j)+"");
        }
    }
}