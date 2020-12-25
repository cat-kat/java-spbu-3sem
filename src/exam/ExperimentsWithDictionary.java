package exam;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExperimentsWithDictionary {
    public static void main(String[] args) {
        List<DictionaryEntry> a = readDictionary("resources/dictionary.txt");
        //for (DictionaryEntry i: a) System.out.println(i.getWord() + "=" + i.getTranslation());

        readQueries(a, "resources/strict-queries.txt", "resources/answer.txt");
        fullTextSearch(a, "resources/full-text-search.txt");
    }

    public static List<DictionaryEntry> readDictionary(String filename) {
        File f = new File(filename);
        List<DictionaryEntry> dict = new ArrayList<>();
        try (Scanner in = new Scanner(f, "utf8").useDelimiter("[\\n]+")) {
            while (in.hasNext()) {
                String example = in.next();
                String word = example.substring(0, example.indexOf(' '));
                String translation = example.substring(example.indexOf(' ') + 1);
                dict.add(new DictionaryEntry(word, translation));
            }
        } catch (IOException e) {
            System.out.println("Не удалось прочитать файл: " + e.getMessage());
        }
        return dict;
    }

    public static void readQueries(List<DictionaryEntry> a, String fileRead, String fileWrite) {
        File f = new File(fileRead);
        try (PrintStream ps1 = new PrintStream(fileWrite, "utf8")) {
            try (Scanner in = new Scanner(f, "utf8").useDelimiter("[\\n]+")) {
                while (in.hasNext()) {
                    String example = in.next();
                    String answer = findAnswer(a, example.toUpperCase());
                    ps1.println(answer);

                    System.out.println("запрос: " + example);
                    System.out.println("найдено: " + answer);
                }
            } catch (IOException e) {
                System.out.println("Не удалось прочитать файл: " + e.getMessage());
            }
        } catch (UnsupportedEncodingException | FileNotFoundException e1) {
            System.out.println("У вас проблемы: " + e1.getMessage());
        }
    }


    public static String findAnswer(List<DictionaryEntry> a, String example) {
        int answer = binarySearch(a, example);
        if (answer == -1) return "Слово " + example + " не найдено";
        return a.get(answer).getTranslation();
    }

    public static int binarySearch(List<DictionaryEntry> arr, String elementToSearch) {
        int firstIndex = 0;
        int lastIndex = arr.size() - 1;
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            String currentWord = arr.get(middleIndex).getWord();
            if (currentWord.equals(elementToSearch)) {
                return middleIndex;
            } else if (currentWord.compareTo(elementToSearch) < 0)
                firstIndex = middleIndex + 1;
            else if (currentWord.compareTo(elementToSearch) > 0)
                lastIndex = middleIndex - 1;
        }
        return -1;
    }

    public static void fullTextSearch(List<DictionaryEntry> a, String filename) {
        File f = new File(filename);
        int count = 0;
        try (Scanner in = new Scanner(f, "utf8").useDelimiter("[\\n]+")) {
            while (in.hasNext()) {
                count++;
                if (count == 10) break;
                String example = in.next();
                findAnswerFullSearch(a, example.toUpperCase());
            }
        } catch (IOException e) {
            System.out.println("Не удалось прочитать файл: " + e.getMessage());
        }
    }

    public static void findAnswerFullSearch(List<DictionaryEntry> a, String example) {
        for (DictionaryEntry i : a) {
            String current = i.getWord();
            int index = current.lastIndexOf(example);
            if (index != -1) System.out.println(" Для подстроки " + example + " найдено слово " + current + " " + i.getTranslation());
        }
    }

}
