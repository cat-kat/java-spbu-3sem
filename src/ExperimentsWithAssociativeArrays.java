import java.util.*;

public class ExperimentsWithAssociativeArrays {
    public static void main(String[] args) {
        System.out.println(transliteration("Юлия"));
        System.out.println(countChar("BananaChou"));
        System.out.println(statChar("BananaChou"));
    }
    public static Map<Character, String> createTransliterationTable() {
        char[] rus = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        String[] eng = {"a", "b", "v", "g", "d", "e", "e", "zh", "z", "i", "i", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "kh", "ts", "ch", "sh", "shch", "ie", "y", "", "e", "iu", "ia"};
        Map<Character, String> a = new HashMap<>();
        for (int i = 0; i < rus.length; i++) a.put(rus[i], eng[i]);
        return a;
    }

    public static String transliteration(String s) {
        Map<Character, String> a = createTransliterationTable();
        String normSymb = String.valueOf(s).toLowerCase();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char symb = normSymb.charAt(i);
            String symbResult = a.get(symb);
            if (Character.isLowerCase(s.charAt(i))) result += symbResult;
            else {
                result += (String.valueOf(symbResult.charAt(0)).toUpperCase() + symbResult.substring(1));
            }
        }
        return result;
    }

    public static Map<Character, Integer> countChar(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        String normStr= String.valueOf(s).toLowerCase();
        for (int i=0; i<normStr.length(); i++) {
            Character symb = normStr.charAt(i);
            freq.put(symb, freq.getOrDefault(symb, 0) + 1);
        }
        return freq;
    }


    public static  Map<Character, List<Integer>> statChar(String s) {
        Map<Character, List<Integer>> freq = new HashMap<>();
        String normStr= String.valueOf(s).toLowerCase();
        for (int i=0; i<normStr.length(); i++) {
            Character symb = normStr.charAt(i);
            List<Integer> index = new ArrayList<>();
            freq.getOrDefault(symb, index).add(i+1);
            freq.put(symb, freq.getOrDefault(symb, index));
        }
        return freq;
    }
}
