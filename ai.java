public class ai {
    public static String reverseString(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return reversed;
    }

    public static void main(String[] args) {
        String original = "Hello World!";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}