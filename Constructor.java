/*
 * Constructor is java special method which is used to initialised objects.
 * If you do not create a constructor, it  will initiated by compiler automatically but it will be null constructor means it does not have parameter aur variable.
 * Constructor have the same name as of the class.
 * It does not have any return type means we are not able to use void keyword with it.
 * We can do method overloading in constructor
 */

 class box{
    int x,y,z;
    box (){
        x = 1;
        y = 1;
        z = 1;
    }
    box(int i,int j,int k){
        x = i;
        y = j;
        z = k;
    }
    void volume(){
        System.out.println("The volume is : " + (x*y*z));
    }
 }
 class Constructor{
    public static void main(String[] args) {
        box b1 = new box();
        b1.volume();
        box b2 = new box(5,4,9);
        b2.volume();
    }
 }