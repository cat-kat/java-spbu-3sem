public class Poem {
    public static final String vowels = "ёуеыаоэяиюЁУАЕОЭЮИЯЫ";

    private String[] poem;
    private int n;

    Poem(String[] str) {
        this.poem = str;
        this.n = str.length;
    }

    public void findRhymes() {
        deletePunct();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n && i != j; j++) {
                String str1, str2;
                if (poem[i].length() < 3) str1 = poem[i];
                else str1 = poem[i].substring(poem[i].length() - 3);
                if (poem[j].length() < 3) str2 = poem[j];
                else str2 = poem[j].substring(poem[j].length() - 3);
                if (str1.equals(str2)) System.out.println("Строка " + (j + 1) + " рифмуется со строкой " + (i + 1));
            }}
    }

    public void findDiffRhymes() {
        deletePunct();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n && i != j; j++) {
                String str1 = poem[i].substring(findVowels(poem[i]));
                String str2 = poem[j].substring(findVowels(poem[j]));
                if (str1.equals(str2)) System.out.println("Строка " + (j + 1) + " рифмуется со строкой " + (i + 1));
            }}
    }
    private void deletePunct() {
        for (int i=0; i<n; i++) {
           poem[i] = poem[i].replaceAll("[^A-zА-я0-9\\s]","");
        }
    }

    private int findVowels(String str) {
        for (int k = str.length()-1; k>=0; k--)
            if (vowels.contains(Character.toString(str.charAt(k))))
                return k;
        return 0;
    }

}
