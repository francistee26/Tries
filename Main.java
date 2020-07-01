public class Main {
    public static void main(String[] args) {
        var tries = new TriesDS();
        tries.insert("car");
        tries.insert("card");
        tries.insert("care");
        tries.insert("careful");
        tries.insert("egg");
        // tries.remove(null);
        var words = tries.countWords();
        System.out.println(words);
        // tries.traverse();
        // var res = tries.contains("");
        // System.out.println(res);
        // System.out.println("Done");
    }
}