class product{
    String productId;
    String productName;
    float price;
    int quantityInStock;

    public product(  String productId, String productName,float price,int quantityInStock){
        this.productId =productId;
        this.productName=productName;
        this.price=price;
        this.quantityInStock=quantityInStock;

    }

void displayProductDetails(){
    System.out.println("Product Id:" + productId);
    System.out.println("Product Name:" +productName);
    System.out.println("Product Price:" +price);
    System.out.println("Product quantity in stock:" + quantityInStock);
}
}

public class product1{
    public static void main(String[] args) {
        product product1 =new product("1101","WAi Wai",20,100);
        System.out.println("Product Details:");
        product1.displayProductDetails();
    }
}