import java.util.*;
public class code {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        if(call.palindrome(num))
            System.out.println("IT IS PALINDROME");
        else
            System.out.println("IT IS NOT A PALINDROME");    
       
       
        sc.close();
    }}
  class call{
    static boolean palindrome(int n){
            int res=0;
            for(int i=n;i>0;i=i/10){
                res=res*10+(i%10);
            }
            if(n==res)
                return true;
            else
                return false;
    }}
    

// static boolean check(int n){
//          for(int i=2;i<n;i++){
//             if((n%i)==0){
//                 return false;
//             }
//          }  
//          return true; 
// } 
// static int sum(int a ,int b){    //STATIC KEYWORD IS USED TO CALL THE GREET FUNCTION WITHOUT CREATING AN OBJECT
    //     return a+b;
    // }
    
    
    
       
     // static bool check(String[] n){
    //     bool res;

    //     return res;
    // }




