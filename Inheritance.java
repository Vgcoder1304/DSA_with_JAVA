                            // HIERARICHAL INHERITANCE

class Device{
    void on(){
        System.out.println("ONN");
    }
    void off(){
         System.out.println("OFF");
    }
   
}

class Phone extends Device{
    void msg(){
        System.out.println("Sending msg....");
    }    
    
    void call(){
        System.out.println("Calling..");
    }
}


class Camera extends Device{
       void click(){
         System.out.println("Click picture");
     }
}


public class Inheritance {

public static void main(String[] args){
    Phone p=new Phone();
    p.on();
    p.off();
    p.msg();
    Camera c=new Camera();
    c.on();
    c.off();
    c.click();
    
}
    
}




                            
                            //MULTI-LEVEL INHERITANCE 

// class Device{
//     void on(){
//         System.out.println("ONN");
//     }
//     void off(){
//          System.out.println("OFF");
//     }
//     void click(){
//         System.out.println("Click picture");
//     }
// }

// class Phone extends Device{
//          void click(){
//         System.out.println("Click picture");
//     }
// }

// class Smartphone extends Phone{
//     void surf(){
//         System.out.println("Internet Surfing");
//     }
// }

// public class Inheritance {

// public static void main(String[] args){
//     Smartphone p=new Smartphone();
//     p.on();
//     p.off();
//     p.click();
//     p.surf();
// }
    
// }
