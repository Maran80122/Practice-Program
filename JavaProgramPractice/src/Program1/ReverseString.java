package Program1;

public class ReverseString {
    public static void main(String[] args) {
        String a = "vanakam";
        String reverse = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            reverse += a.charAt(i);
        }

        System.out.println("Reversed: " + reverse);
    }
}
