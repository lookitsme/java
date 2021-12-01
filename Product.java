import java.sql.*;
import java.io.*;

public class Product {
 String Name; 
     
}

public class Type extends Product{
    String product_Dimension;
    String price; 
    String product_Id; 
    
        public Type( String I, String D, String P, String ID,String IT){
            
            this.product_Dimension=D;
            this.price=P;
            this.product_Id=ID;
            
        }
        /*public class Image extends Type{
            String image;
            String image_type;
            String image_color;
            
            public Image ( String i, String t, String c){
            
                this.image=i;
                this.image_type=t;
                this.image_color=c;
          */  
        
        
        
        

    
    public static void main(String args[]){  
        Type T =new Type();
}