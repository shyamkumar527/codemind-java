import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        String ans=s+t;
        int dig=65;
        for(int i=0;i<70;i++){
            for(int j=0;j<ans.length();j++){
                if((int)(ans.charAt(j))==dig){
                    System.out.print(ans.charAt(j));
                }
            }
            dig+=1;
        }
    }
}