// @FunctionalInterface

interface Calculator{
    int sum(int a, int b);
}

class lamda{
    public static void main(String[] args) {
        Calculator c = (a,b ) -> a+b;
        System.out.println(c.sum(5, 8));
    }
}