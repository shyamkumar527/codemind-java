import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char x=sc.next().charAt(0);
        int i,c=0;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)==x){
                c+=1;
            }
        }
        if(c==0){
            System.out.println("-1");
        }
        else{
            System.out.println(c);
        }
    }
}