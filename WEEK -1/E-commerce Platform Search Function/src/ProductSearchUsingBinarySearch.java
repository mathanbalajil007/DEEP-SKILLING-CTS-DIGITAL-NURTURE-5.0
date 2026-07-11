public class ProductSearchUsingBinarySearch {
    public static Product productBinarySearch(int id){
        int left=0;
        int right=Product.product.size()-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(Product.product.get(mid).productId==id){
                return Product.product.get(mid);
            }
            else if(Product.product.get(mid).productId<id){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return null;
    }
}
