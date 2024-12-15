import java.util.ArrayList;
import java.util.List;

class CollectionApi
{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(45);
        System.out.println(list);
        System.out.println(list.get(0)); //list.get function is used to get value at index given number
    }
}