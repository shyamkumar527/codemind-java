import java.util.*;
public class file{
    public static void main(String[] args){
        int c=1,i;
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(i=1;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                c+=1;
            }
        }
        System.out.println(c);
    }
}