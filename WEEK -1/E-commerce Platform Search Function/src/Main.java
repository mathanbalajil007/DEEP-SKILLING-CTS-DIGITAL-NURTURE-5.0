import java.util.Arrays;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        new Product(3,"product3","category1");
        new Product(5,"product5","category2");
        new Product(2,"product3","category3");
        new Product(1,"product4","category4");
        new Product(4,"product5","category5");
int[] arr=new int[5];
        System.out.println(ProductSearchUsingLinearSearch.linearSearch(4));
        Collections.sort(Product.product);
        System.out.println(Product.product);
        System.out.println(ProductSearchUsingBinarySearch.productBinarySearch(3));
        






    }
}