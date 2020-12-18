package print;

public class ExperimentsWithPrint {
    public static void main(String[] args) {
        Drawing pd = new Drawing(5, 4, '-');
        pd.print();

        PrintableLetter pl = new PrintableLetter('x', 15);
        pl.print(); //печатает букву x 10 раз

        PrintableString ps = new PrintableString("asdf");
        ps.print(); //печатает asdf

        Printable pa = new Printable() {
            private String s = "I'm not lambda, ";
            @Override
            public void print() {
                System.out.println(s + "I'm anonym");
            }
        };

        Printable lp = ()->System.out.println("I'm lambda");

        Printable[] allPrint = new Printable[]{pd, pl, ps, pa, lp};
        for (Printable element: allPrint) element.print();
    }
}
