package Product;

class Image {
    private String product_dimension;
    private String product_type;
    private boolean product_color;

    public Image(String dimensions, String Type, boolean color) {
        this.product_dimension = dimensions;
        this.product_type = Type;
        this.product_color = color;
    }

    public void getInfo() {
        System.out.print("Dimension :" + this.product_dimension + "\n Type :" + this.product_type + "\n Color:"
                + this.product_color);
    }
}