import java.util.ArrayList;
import java.util.List;

public class ExperimentsWithCollections {
    public static void main(String[] args) {
        List<Integer> example = makeListInt();
        System.out.println(example);

        List<String> a = new ArrayList<>();
        List<String> b = new ArrayList<>();
        a.add("aa");
        a.add("ab");
        b.add("ba");
        b.add("bb");
        System.out.println(combineList(a, b));

        System.out.println(a);
        System.out.println(reverseListHonestly(a));
        System.out.println(a);

        System.out.println(b);
        reverseListNotHonestly(b);
        System.out.println(b);
    }

    public static List<Integer> makeListInt() {
        List<Integer> ints = new ArrayList<>();
        for (int i=0; i<100; i++) ints.add(i+1);
        return  ints;
    }

    public static List<String> combineList(List<String> a, List<String> b) {
        List<String> result = new ArrayList<>(a.size() + b.size());
        result.addAll(a);
        result.addAll(b);
        return result;
    }

    public static List<String> reverseListHonestly(List<String> a){
        List<String> reverseList = new ArrayList<>();
        for (int i = a.size() - 1; i >=0; i--) reverseList.add(a.get(i));
        return reverseList;
    }

    public static void reverseListNotHonestly(List<String> a){
        for (int i = a.size() - 1; i >=0; i--) {
            a.add(a.get(i));
            a.remove(i);
        }
    }
}
