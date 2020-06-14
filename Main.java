public class Main {
    public static void main(String[] args) {
        var tries = new TriesDS();
        tries.insert("cat");
        tries.insert("can");
        tries.insert("Francis");
        var res = tries.contains("");
        System.out.println(res);
        System.out.println("Done");
    }
}