public class ProductSearchUsingLinearSearch {
    public static Product linearSearch(int id){
        for(int i=0;i<Product.product.size();i++){
            if(id==Product.product.get(i).productId){
                return Product.product.get(i);
            }
        }
        return null;
    }
}
