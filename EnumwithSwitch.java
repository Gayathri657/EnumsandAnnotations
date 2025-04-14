enum Days {
    MON, TUE, WED, THU, FRI, SAT, SUN;
}

public class EnumwithSwitch {
    public static void main(String[] args) {
        Days d = Days.MON;
        switch (d) {
            case MON:
                System.out.println("Today is Monday");
                break;
            case TUE:
                System.out.println("Today is Tuesday");
                break;
            case WED:
                System.out.println("Today is Wednesday");
                break;
            case THU:
                System.out.println("Today is Thursday");
                break;
            case FRI:
                System.out.println("Today is Friday");
                break;
            case SAT:
                System.out.println("Today is Saturday");
                break;
            case SUN:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Not Valid");

        }
    }
}
