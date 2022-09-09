import java.util.*;
public class file{
    public static void main(String[] args){
        char x;
        Scanner sc=new Scanner(System.in);
        x=sc.nextLine().charAt(0);
        if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u' || x=='A' || x=='E' || x=='I' || x=='O' || x=='U'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
}