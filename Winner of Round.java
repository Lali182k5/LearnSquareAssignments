import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
       // String line=sc.nextLine();
      //  String[] parts=line.trim().split("\\s+");
        //int a=Integer.parseInt(parts[0]);
    //    int b=Integer.parseInt(parts[1]);
      
      int a=sc.nextInt();
      int b=sc.nextInt();
        if(a>b){
            System.out.println("Planet A Wins!");
        }
        else if(a<b) {
            System.out.println("Planet B Wins !");
        }
        else{
            System.out.println("It's a Tie!");
        }
        sc.close ();
    }
}