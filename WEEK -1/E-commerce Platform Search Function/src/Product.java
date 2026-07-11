import java.util.ArrayList;

public class Product implements Comparable<Product>{
    int productId;
    String productName;
    String category;
    static ArrayList<Product> product=new ArrayList<>();

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        product.add(this);
    }

    @Override
    public int compareTo(Product o) {
        return this.productId-o.productId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
