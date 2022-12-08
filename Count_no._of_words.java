import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int c=1;
        String s=sc.nextLine();
        int l=s.length();
        for(int i=0;i<l;i++){
            if(s.charAt(i)==' '){
                c+=1;
            }
        }
        System.out.println(c);
    }
}