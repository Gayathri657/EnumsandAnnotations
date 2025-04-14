enum Days {
    Mon, Tue, Wed, Thu, Fri, Sat, Sun;
}

public class Example {
    public static void main(String[] args) {
        Days d = Days.Mon;
        System.out.println(d);
        Days[] d1 = Days.values();
        for (Days i : d1) {
            System.out.print(i + " ");
        }
        int d2 = Days.Sat.ordinal();
        System.out.println();
        System.out.println(d2);

    }

}