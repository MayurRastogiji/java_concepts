// Method OverWriting is a concept in java when we create a method in parent class and create a same method in subclass then method of parent class will be over writted by method in child class
// When inheretance as well as Method over writing is done there is a new concept coe in picture which is known as polymorphism
// polumorphism is a concept when we call method of parent class but the output that is returned is from child class 

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
class MethodOverWriting_Polymorphism{
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