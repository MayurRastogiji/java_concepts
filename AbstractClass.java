/*
  Abstract class lies between normal class and interface
  in Abstract class we can create method as well as declare methods but while declaring methods we need to use abstract keyword 
  we cannot create object of abstract class.
  We also implemented the use of "this" keyword in this code
 */

abstract class Shape{
    void info(){
        System.out.println("Shapes are the defined figures in mathematics, we can perform many operations on the shape. ");
    }
    abstract void parameter();
    abstract void area();
    
}
class Circle extends Shape{
    int r;
    Circle(int i){
        r = i;
    }
    void parameter(){
        System.out.println("Parameter of circle is : "+ (2*3.14*r));
    }
    void area(){
        System.out.println("Area of the circle is : "+ (3.14*r*r));
    }
}
class Square extends Shape{
    int x,y;
    Square(int x, int y){
        this.x = x;
        this.y = y;
    }
    void parameter(){
        System.out.println("Parameter of square is : "+ (2*(x+y)));
    }
    void area(){
        System.out.println("Area of the square is : "+ (x*y));
    }
}
class AbstractClass{
    public static void main(String[] args) {
        Shape s1,s2;
        s1 = new Circle(5);
        s2 = new Square(6,8);
        s1.parameter();
        s1.area();
        s2.area();
        s2.parameter();
    }
}