//In this code we had seen how to use enum

enum status{
    running, suspended, failed, restart, terminated, comitted
}

public class Enum{
    public static void main(String[] args) {
        System.err.println(status.running);
        status[] s = status.values();
        for(status i : s){
            System.err.println(i.ordinal() + " : " + i);
        }
        status stat = status.comitted;
        switch (stat) {
            case running ->
                System.err.println("Your job is under progress");
            case comitted ->
                System.out.println("Your job is done successfully");
            case suspended ->
                System.err.println("Your job is suspended at the point");
            case restart ->
                System.out.println("Your job is restarted");
            case failed ->
                System.err.println("Your job is failed");
            case terminated ->
                System.out.println("Your job is terminated");
            default->
                System.out.println("unknown status");
        }
    }
}