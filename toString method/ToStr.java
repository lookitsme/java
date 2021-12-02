//Program to override toString Method
class ToStr {
    private int roll_no;
    private String name;
    public ToStr(int r, String n) {
       roll_no = r;
       name = n;
    }
    public String toString() {
       return roll_no + " " + name;
    }
     public static void main(String[] args) {
       ToStr s = new ToStr(191604, "Able Gurung");
       System.out.println("The student details are:");
       System.out.println(s);// The object ToStr gets run as string with the help of toString method. 
    }
 }
