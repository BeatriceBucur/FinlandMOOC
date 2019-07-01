public class StringAndIntComparison {

    public static void main(String[] args) {
        String icecream = "IceCream";
        String iceCream2 = "IceCream";

        System.out.println(Integer.toHexString(System.identityHashCode(icecream)));
        System.out.println(Integer.toHexString(System.identityHashCode(iceCream2)));

        System.out.println(icecream == iceCream2);
        System.out.println(icecream.equals(iceCream2));

        Integer first = 127;
        Integer second = 127; // -128 / 127

        System.out.println(Integer.toHexString(System.identityHashCode(first)));
        System.out.println(Integer.toHexString(System.identityHashCode(second)));

        System.out.println(first == second);
        System.out.println(first.equals(second));
    }
}
