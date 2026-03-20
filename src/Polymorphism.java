                    
                                     //METHOD OVERRIDING
        
// class Animal{
//     void sound(){
//         System.out.println("Animal has sound");
//     }
// }        

// class Dog extends Animal{
//     void sound(){
//         System.out.println("Dog Barks");
//     }
// }

// class Cat extends Animal{
//      void sound(){
//         System.out.println("Cat meowss..");
//     }
// }

// public class Polymorphism {
//    public static void main(String[] args){
//         Dog d=new Dog();
//         Cat c=new Cat();
//         d.sound();
//         c.sound();
// }
// }
         
                      
           
        
                                       // METHOD OVERLOADING

// class Calculator{
//     int sum(int a,int b){
//         return a+b;
//     }
//     int sum(int a,int b,int c){
//         return a+b+c;
//     }
//     double sum(double a,double b){
//         return a+b;
//     }
// }

// public class Polymorphism {
//    public static void main(String[] args){
//          Calculator cal=new Calculator();
//          System.out.println(cal.sum(4.5,55));
//          System.out.println(cal.sum(23,22));
//          System.out.println(cal.sum(24,45,45));
//    }
// }



                                    // QUESTION

class Gun{
    void shoot(){
        System.out.println("BOOM............");
    }
}

class sniper extends Gun{
        void shoot(){
        System.out.println("Headshot");
    }
}

class m4 extends Gun{
        void shoot(){
        System.out.println("Long Shot");
    }
}
public class Polymorphism{
        public static void main(String[] args) {
            m4 m4g=new m4();
            sniper snp=new sniper();

            m4g.shoot();
            snp.shoot();

        }
}                                    