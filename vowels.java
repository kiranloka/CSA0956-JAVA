import java.util.Scanner;
public class vowels{
    public static void main(String[]args){
        int count=0;
        Scanner s=new Scanner(System.in);
    System.out.println("Enter the string: ");
    String sentence=s.next();
    for(int i=0;i<sentence.length();i++){
    char ch=sentence.charAt(i);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
        count++;
    }
}
    System.out.println("The number of vowels in the given string are: "+count);

    }
   
}
