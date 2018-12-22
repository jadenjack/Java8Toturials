import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortMain {
    public static void main(String[] args){
        List<String> names1 = new ArrayList<String>();
        getList(names1);

        List<String> names2 = new ArrayList<String>();
        getList(names2);

        SortTester.sortUsingJava7(names1);
        SortTester.sortUsingJava8(names2);
    }

    private static void getList(List<String> list) {
        list.add("Mahesh ");
        list.add("Suresh ");
        list.add("Ramesh ");
        list.add("Naresh ");
        list.add("Kalpesh ");
    }

    public static class SortTester{
        public static void sortUsingJava7(List<String> names){

            Collections.sort(names, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }
            });
            System.out.println(names);
        }
        public static void sortUsingJava8(List<String> names){
            Collections.sort(names, (o1,o2)->o1.compareTo(o2));
            System.out.println(names);
        }
    }
}
