import java.util.*;
class new_program {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        

        // int n;
        // do{
        //    System.out.println("Please enter value greater than 0");
        //    n=sc.nextInt();
        // }while(n<=0);
       
        // int digit=1;
        // for(int i=n;i>0;i--){
        //         digit*=i;
            
        // }
        // System.out.print("The product is:"+digit);  
            
        System.out.println("Enter number:");
        int n=sc.nextInt();    
        for(int i=1;i<=10;i++){
            System.out.printf("%dX%d=%d\n",n,i,(n*i));
        }
        

        
        // System.out.println("Enter first number:");
        // int a=sc.nextInt();
        // System.out.println("Enter second number:");
        // int b=sc.nextInt();
        // System.out.println("Enter third number:");
        // int c=sc.nextInt();

        // if(a>b && a>c){
           
        //         System.out.println("The first number given by the user is Greatest="+a);
            
        // }
        // else if(b>a && b>c){
        //       System.out.println("The Second number given by the user is Greatest="+b);    
        //     }
        // else{
        //         System.out.println("The third number given by the user is Greatest="+c);
        //     }
        // }




        //Reversing a number.
        // int rev=0;
        // while(a>0){
        //     int s=a%10;
        //     rev=rev*10+s;
        //     a=a/10;
        //     }
        //     System.out.println(rev);
        
            
        sc.close();
           
    }    
}


