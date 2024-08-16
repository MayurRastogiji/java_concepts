// Functional Interfafce is an interface that contains only one abstract method

class FunctionalInterface{
    public static void main(String[] args) {
        new Thread(new Runnable(){
            public void run(){
                System.out.println("Implementation of Functional Interface");
            }
        }).start();
    }
}