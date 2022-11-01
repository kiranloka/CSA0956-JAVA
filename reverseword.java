import java.util.Scanner;
public class reverse {
 public static void main(String[] args){
 String str;
 char ch;
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter a string : ");
 str=sc.nextLine();
 System.out.println("Reverse of a String '"+str+"' is :");
 for(int j=str.length();j>0;--j) {
 System.out.print(str.charAt(j-1));}
 }
}
if(up>low){
 for(int i=low;i<=up;i++){
 double sqrt=Math.sqrt(i);

 if(sqrt-Math.floor(sqrt)==0&&fun(i)<10)
 li.add(i);
 }
 }

 System.out.println(li);
 }
public static int fun(int i){
 int sum=0;
 while(i!=0){
 int rem=i%10;
 sum=sum+rem;
 i=i/10;
 }
 return sum;
}
}
