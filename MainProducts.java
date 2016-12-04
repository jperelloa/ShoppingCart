import java.util.*;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.Comparator;

public class MainProducts {
    
     public static void main(String[] args) {
         System.out.println("Aplicacion Productos"); 
         
         Product p1 = new Product("vacuum cleaner", 100);
         Product p2 = new Product("pencil", 3);
         Product p3 = new Product("bike", 300);
         Product p4 = new Product("sweet", 7);
         Product p5 = new Product("table", 190);

         
		 ShoppingCart cart = new ShoppingCart();

         cart.addProduct(p1);
         cart.addProduct(p2);
         cart.addProduct(p3);
         cart.addProduct(p4);
         cart.addProduct(p5);
         cart.addProduct(p3);
         cart.addProduct(p2);
         cart.addProduct(p3);
         cart.addProduct(p5);
         cart.addProduct(p5);
         cart.addProduct(p3);
         cart.addProduct(p2);
         cart.addProduct(p3);
         cart.addProduct(p5);
         cart.addProduct(p3);
         cart.addProduct(p3);
         cart.addProduct(p3);
         cart.addProduct(p5);
         System.out.println("I have " + cart.products.size() + " products!");




         // Aquí reemplazaríamos pencils por sweets
        cart.replaceProduct("pencil",  "sweet");


         // Pedimos el totalPrice con descuentos
         double total = cart.totalPrice();
         System.out.println("el total es: " + total);







 }
}
