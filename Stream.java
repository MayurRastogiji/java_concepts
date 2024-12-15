// WAP to Print a number whoch is the sum of double of all even numbers present in the given list using collections and stream

import java.util.Arrays;
import java.util.List;

class EvenSum{
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7,8,9);

        int result = ls.stream()
                        .filter(n -> n%2==0)        //it will return all even values
                        .map(n -> n*2)              //it will double all values
                        .reduce(0, (c,e) -> c+e);   //it will add all values and return a single value

        System.out.println(result);
    }
}