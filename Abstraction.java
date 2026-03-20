
                                               // INTERFACE
                        // An interface is a way to achieve 100% abstraction in Java.

interface print{
    void printing();
}

interface show{
    void display();
}

class presentation implements print,show{
        public void printing(){
            System.out.println("printing ppt");
        }
        public void display(){
            System.out.println("Displaying ppt");
        }
    }

public class Abstraction{
        public static void main(String[] args) {
            presentation p=new presentation();
            p.printing();
            p.display();
        }
}




// abstract class Shape{
//    abstract void area();
// }

// class Circle extends Shape{
//     double r;
//     Circle(double radius){
//             r=radius;
//     }
//     void area(){
//         System.out.println("Area of Circle:"+3.14*r*r);
//     }
// }

// public class Abstraction {
//     public static void main(String[] args) {
//         // Circle circle=new Circle(2.2);
//         // circle.area();

//         Shape s=new Circle(4.3);
//         s.area(); 
//     }
// }
