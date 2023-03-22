import java.util.Scanner;


 class Rect {

    int l,b;
    void setval(int x)
    {
        l=x;

    };
    void setva(int y)
    {

        b=y;
    };

    static int area(int l,int b)
    {
        return (l*b);
    }
};
public class Rectangle {
    public static void main(String[] args) {
        int i,b,area;
        Rect r=new Rect();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length of rectangle:");
        i=s.nextInt();
        r.setval((i));
        System.out.println("Enter breadth of rectangle:");
        b=s.nextInt();
        r.setva(b);
        System.out.println("Area of Rectangle is : "+Rect.area(i,b));

}
}