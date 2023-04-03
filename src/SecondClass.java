public class SecondClass {
    public int a = 10;

    public String print() {
        String formatOfString = String.format("---<%d>---", a);
        System.out.println(formatOfString);
        return formatOfString;
    }

}
