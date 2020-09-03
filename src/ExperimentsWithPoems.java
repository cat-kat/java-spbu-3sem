public class ExperimentsWithPoems {
    public static void main(String[] args) {
        String[] str = {"Я вас любил: любовь еще, быть может,",
                "В душе моей угасла не совсем;",
                "Но пусть она вас больше не тревожит;",
                "Я не хочу печалить вас ничем.",
                "Я вас любил безмолвно, безнадежно,",
                "То робостью, то ревностью томим;",
                "Я вас любил так искренно, так нежно,",
                "Как дай вам бог любимой быть другим."};
        Poem pushkin = new Poem(str);
        System.out.println("Легкий вариант рифмы:");
        pushkin.findRhymes();
        System.out.println("Чуть более сложный вариант рифмы:");
        pushkin.findDiffRhymes();
    }
}
