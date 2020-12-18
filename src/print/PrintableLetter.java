package print;

public class PrintableLetter implements Printable {
    char a;
    int n;

    public PrintableLetter(char a, int n) {
        this.a = a;
        this.n = n;
    }

    @Override
    public void print() {
        String s = "";
        for (int i = 0; i < n; i++) s += a;
        System.out.println(s);
    }
}
