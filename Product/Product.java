package Product;

public class Product {
    private String product_name;
    private int product_id;
    Image product_image;

    public Product(String name, int id, Image image) {
        this.product_name = name;
        this.product_id = id;
        this.product_image = image;
    }

    public void showInfo() {
        System.out.println("Product Description ");
        System.out.println("Name:" + this.product_name + "\n ID:" + this.product_id + "\n Image:" + this.product_image);
        System.out.println("");
        System.out.println("Product Type ");
        this.product_image.getInfo();
    }
}
