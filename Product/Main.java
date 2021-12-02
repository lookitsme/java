package Product;

public class Main {
    public static void main(String[] args) {

        Image img = new Image("1920x1080", "jpeg", true);
        Product p = new Product("MV 33 Wallpaper ", 1000, /* mv33.jpg */img);
        p.showInfo();
    }
}
