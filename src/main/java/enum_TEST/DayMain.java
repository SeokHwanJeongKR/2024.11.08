package enum_TEST;

public class DayMain {

    public static void main(String[] args) {

        Day today = Day.Monday;
        System.out.println();
    switch (today) {
        case Monday:
            System.out.println("Today is Monday");
            break;
        case Tuesday:
            System.out.println("Today is Tuesday");
            break;
        case Wednesday:
            System.out.println("Today is Wednesday");
            break;
        case Thursday:
            System.out.println("Today is Thursday");
            break;
        case Friday:
            System.out.println("Today is Friday");
            break;
        case Saturday:
            System.out.println("Today is Saturday");
            break;
        case Sunday:
            System.out.println("Today is Sunday");
            break;
        default:
            System.out.println("plz set collect day");
            break;
        }
    }
}
