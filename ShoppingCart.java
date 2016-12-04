import java.util.*;
import java.util.Comparator;
import java.util.Collections;

class ShoppingCart {
    List<Product> products;

    //constructor
	public ShoppingCart() {
	  this.products = new ArrayList<Product>();
	}

	//addProduct
    void addProduct(Product product) {
        this.products.add(product);
	}

	//toStrinng
    public String toString() {
	    return "cart with: " + products;
    }

    //totalPrice
     public double totalPrice() {
        double totalP = 0;
        for (int i = 0; i < products.size() ; i++) {
            totalP += products.get(i).price;
             }
            System.out.println("Precio ántes de descuentos: " + totalP);
             if (products.size() > 4) {
                 totalP = totalP * 0.80;
                 System.out.println("Precio con descuento por número de artículos: "  + totalP);
             }

         //ordenar
         Collections.sort(products, new Comparator<Product>(){
             public int compare(Product o1, Product o2) {
                 return o1.getName().compareTo(o2.getName());
             }
         });


         //contar artículos
         int sameProduct = 0; //numero de artículos de un tipo
         int cont1 = 0;       // contador de j
         for (int i = 0 ; i < products.size() ; i++) {
             String compName = products.get(i).name;
             int compPrice = products.get(i).price;
             cont1 = i ; //cont1 toma el valor de i para empezar desde el siguiente artículo
             for (int j = cont1 ; j < products.size() ; j++) {
                  if (products.get(j).name == compName) {
                   sameProduct +=  1; // sumamos un artículo de un tipo
                  } else {
                         break;  //si no es igual salimos del bucle j
                  }
             }
             System.out.println("I have " + sameProduct + " of " + compName);
             int freeProduct = sameProduct / 4; //dividimos por 4 para saber cuantos le salen gratis
             if (freeProduct >= 1) {
                 System.out.println("ha comprado " + sameProduct + " de " + compName + ". Tiene " + freeProduct + " gratis. Se ahorra " + compPrice * freeProduct + " €");
                 totalP = totalP - (compPrice * freeProduct);
             }

             i +=  sameProduct - 1; // colocamos i a la altura del siguiente producto
             sameProduct = 0; // ponemos contador de  productos a 0

         }

        return totalP;
     }




        // replace product
     public void replaceProduct(String productName, String replacementProduct) {
             int priceReplace = 0;
             for (int i = 0; i < products.size(); i++) {
                 if (products.get(i).name == replacementProduct) {
                     priceReplace = products.get(i).price;
                     break;
                 }
             }

            for (int i = 0; i < products.size(); i++) {
                  if (products.get(i).name == productName) {
                    products.get(i).setName(replacementProduct);
                    products.get(i).setPrice(priceReplace);
                    }
             }
     }


 }