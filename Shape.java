//11
class Shape{
    private int x_coordinate;
    private int y_coordinate;
    private int width;
    private int height;

    public Shape(int x,int y,int w,int h){
        this.x_coordinate=x;
        this.y_coordinate=y;
        this.width=w;
        this.height=h;
    }

    public Shape(int width,int height){
        this(0,0,width,height);
    }
    public Shape(){
        this(0,0,1,1);
    }

    public void getX_coordinate(){
        System.out.println(this.x_coordinate);
    }
    public void getY_coordinate(){
        System.out.println(this.y_coordinate);
    }
    public void get_Width(){
        System.out.println(this.width);
    }
    public void get_Height(){
        System.out.println(this.height);
    }

    public static void main(String [] args) {
        Shape s = new Shape(5, 1, 4, 2);
        
        s.getX_coordinate();
        s.getY_coordinate();
        s.get_Width();
        s.get_Height();
        System.out.println("");

        Shape t= new Shape(1, 59);
        t.getX_coordinate();
        t.getY_coordinate();
        t.get_Width();
        t.get_Height();
        System.out.println("");

        Shape z= new Shape();
        z.getX_coordinate();
        z.getY_coordinate();
        z.get_Width();
        z.get_Height();
    }
}