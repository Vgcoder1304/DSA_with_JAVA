


                                        // PRIVATE

class Account{
        private double balance;

        void setBalance(double b){
            balance=b;
        }

        double getBalance(){
            return balance;
        }
}

public class Encapsulation {
   public static void main(String[] args){
            Account acc=new Account();
            acc.setBalance(2000000);
            System.out.println(acc.getBalance());
            acc.setBalance(2000);           
            System.out.println(acc.getBalance());

    }
}


                                    // PROTECTED
//    You can also use it in a child class (inheritance) even if it's in another package                                 

// class Parent {
//     protected int num = 50;

//     protected void show() {
//         System.out.println("Protected value: " + num);
//     }
// }

// class Child extends Parent {
//     void display() {
//         // accessing protected members from parent
//         System.out.println("Accessing in Child: " + num);
//         show();
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Child obj = new Child();
//         obj.display();
//     }
// }                                    
