/*
 * Funtion Overloading is a concept when we make more than one methods of same name but there should be differencre in number of parameter or type of paramenter.
 * While calling these types of method compiler always choose best fit method.
 * It is also known as RUN TIME POLUMORPHISM.
 */

 class A{
    public void sum(int i,int j){
        System.out.println("The sum is : " + (i+j));
    }
    public void sum(int i,int j,int k){
        System.out.println("The sum is : " + (i+j+k));
    }
}

class FunctionOverloading{
    public static void main(String[] args) {
        A a1 = new A();
        a1.sum(5,6);
        a1.sum(1,2,3);
    }        
}