import java.io.File;
import java.io.IOException;
import java.util.*;

public class ExperimentsWithCollections {
    public static void main(String[] args) throws IOException {
        System.out.println("Список от 1 до 100:");
        List<Integer> example = makeListInt();
        System.out.println(example);

        List<String> a = new ArrayList<>();
        List<String> b = new ArrayList<>();
        a.add("aa");
        a.add("ab");
        b.add("ba");
        b.add("bb");
        System.out.println("Совмещенные списки " + a + " " + b + ":");
        System.out.println(combineList(a, b));
        System.out.println("Элементы в обрадном порядке (чистая функция):");
        System.out.println(a);
        System.out.println(reverseListHonestly(a));
        System.out.println(a);
        System.out.println("Элементы в обрадном порядке (нечистая функция):");
        System.out.println(b);
        reverseListNotHonestly(b);
        System.out.println(b);

        List<String> c = new ArrayList<>();
        c.add("aa");
        c.add("ab");
        c.add("ba");
        c.add("bb");

        List<String> d = new ArrayList<>();
        d.add("aa");
        d.add("ab");
        d.add("ba");
        d.add("bb");

        System.out.println("Удаление элементов с четными числами (чистая функция):");
        System.out.println(c);
        System.out.println(deleteEvenIndexHonestly(c));
        System.out.println(c);

        System.out.println("Удаление элементов с четными числами (нечистая функция):");
        System.out.println(d);
        deleteEvenIndexNotHonestly(d);
        System.out.println(d);

        List<String> e = new ArrayList<>();
        e.add("2");
        e.add("4");
        e.add("ba");
        e.add("9");

        List<String> f = new ArrayList<>();
        f.add("45");
        f.add("3");
        f.add("ba");
        f.add("0");

        System.out.println("Удаление String-элементов - четных чисел (чистая функция):");
        System.out.println(e);
        System.out.println(deleteEvenHonestly(e));
        System.out.println(e);
        System.out.println("Удаление String-элементов - четных чисел (нечистая функция):");
        System.out.println(f);
        deleteEvenNotHonestly(f);
        System.out.println(f);


        List<Integer> h = new ArrayList<>();
        h.add(1);
        h.add(2);
        h.add(54);
        h.add(9);

        List<Integer> g = new ArrayList<>();
        g.add(1);
        g.add(2);
        g.add(43);
        g.add(6);

        System.out.println("Удаление Integer-элементов - четных чисел (чистая функция):");
        System.out.println(h);
        System.out.println(deleteEvenIntegerHonestly(h));
        System.out.println(h);
        System.out.println("Удаление Integer-элементов - четных чисел (нечистая функция):");
        System.out.println(g);
        deleteEvenIntegerNotHonestly(g);
        System.out.println(g);

        System.out.println("Игры с set-ами:");
        findWordsSet("resources/pushkin.txt");


        List<String> list1 = List.of("abc", "xyz", "ooo");

        // на экране появится
        //   Элементов в списке: 3
        //   abc
        //   xyz
        //   ooo
        printList(list1);

        List<String> list2 = List.of("abc", "xyz", "ooo");

        // на экране появится
        //   Элементов в списке: 3
        //   1: abc
        //   2: xyz
        //   3: ooo
        printListWithIndexes(list2);
    }

    public static List<Integer> makeListInt() {
        List<Integer> ints = new ArrayList<>();
        for (int i = 0; i < 100; i++) ints.add(i + 1);
        return ints;
    }

    public static List<String> combineList(List<String> a, List<String> b) {
        List<String> result = new ArrayList<>(a.size() + b.size());
        result.addAll(a);
        result.addAll(b);
        return result;
    }


    public static List<String> reverseListHonestly(List<String> a) {
        List<String> reverseList = new ArrayList<>();
        for (int i = a.size() - 1; i >= 0; i--) reverseList.add(a.get(i));
        return reverseList;
    }

    public static void reverseListNotHonestly(List<String> a) {
        for (int i = a.size() - 1; i >= 0; i--) {
            a.add(a.get(i));
            a.remove(i);
        }
    }



    public static List<String> deleteEvenIndexHonestly(List<String> a) {
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if (i % 2 == 1) resultList.add(a.get(i));
        }
        return resultList;
    }

    public static void deleteEvenIndexNotHonestly(List<String> a) {
        for (int i = a.size() - 1; i >= 0; i--) {
            if (i % 2 == 0) a.remove(i);
        }
    }

    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        int i = 0;
        if (s.charAt(0) == '-') {
            if (s.length() == 1) {
                return false;
            }
            i = 1;
        }

        char c;
        for (; i < s.length(); i++) {
            c = s.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;

    }

    public static List<String> deleteEvenHonestly(List<String> a) {
        List<String> resultList = new ArrayList<>();
        for (String num : a) {
            if (isNumber(num))
                if (Integer.parseInt(num) % 2 == 1) resultList.add(num);
        }
        return resultList;
    }

    public static void deleteEvenNotHonestly(List<String> a) {
        for (int i = a.size() - 1; i >= 0; i--) {
            String num = a.get(i);
            if (isNumber(num))
                if (Integer.parseInt(num) % 2 == 0) a.remove(i);
        }
    }

    public static List<Integer> deleteEvenIntegerHonestly(List<Integer> a) {
        List<Integer> resultList = new ArrayList<>();
        for (int num : a) {
            if (num % 2 == 1) resultList.add(num);
        }
        return resultList;
    }

    public static void deleteEvenIntegerNotHonestly(List<Integer> a) {
        for (int i = a.size() - 1; i >= 0; i--) {
            int num = a.get(i);
            if (num % 2 == 0) a.remove(i);
        }
    }


    public static void findWordsSet(String s) throws IOException {
        Set<String> type1 = new HashSet<>();
        Set<String> type2 = new TreeSet<>();
        Set<String> type3 = new LinkedHashSet<>();
        findWords(type1, s);
        findWords(type2, s);
        findWords(type3, s);
    }

    public static void findWords(Set<String> t, String s) throws IOException {
        File f = new File(s);
        try (Scanner in = new Scanner(f, "utf8").useDelimiter("[^а-яА-Я]+")) {
            while (in.hasNext()) {
                String word = in.next().toLowerCase();
                t.add(word);
            }
        }
        System.out.println(t.getClass().getName() + ":");
        for (String word : t) {
            System.out.print(word + " ");
        }
        System.out.println();
    }

    public static void printList(List<String> a) {
        for (String i: a) System.out.println(i);
    }

    public static void printListWithIndexes(List<String> a) {
        int k = 0;
        for (String i: a) System.out.println(k++ + " " + i);
    }


}
