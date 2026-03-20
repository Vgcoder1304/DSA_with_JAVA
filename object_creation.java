public class object_creation {
    public static void main(String[] args){
       car c1=new car("toyota",10000);
       car c2=new car("Suzuki",20000);


       c1.display();
       c2.display();

    }
}    
    class car{
        String brand;
        int price;
        
        car(String brand,int price){
            this.brand=brand;
            this.price=price;
        }

          void display(){
            System.out.println("The Brand is:"+brand);
            System.out.println("The Price is:"+price);
    
        
          }
    }

