import java.util.*;

public class Product {  
    String name;
    int price;
    
    //constructor
      public Product(String name, int price){
          this.name = name;
          this.price = price;
      }

     //toString
    public String toString() {
        return this.name + " costs " + this.price ;
    }

    //setter name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //setter price
    public void setPrice(int price) {
        this.price = price;
    }
}

