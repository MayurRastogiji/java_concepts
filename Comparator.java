//Sorting list of strign on the basis on string length via comparator.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class compare
{
    public static void main(String[] args) {
        Comparator<String> com = (i,j) -> i.length() > j.length() | i.length() == j.length()?1:-1;
        List<String> ls = new ArrayList<>();

        ls.add("Hello");
        ls.add("brother");
        ls.add("what");
        ls.add("are");
        ls.add("your");
        ls.add("aim");

        System.err.println(ls);
        Collections.sort(ls, com);
        System.out.println(ls);
    }
}