import java.util.Arrays;

enum day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class Enumeration {
    public static void main(String[] args) {
        day today = day.MONDAY;
        System.out.println(Arrays.toString(day.values()));
        System.out.println(day.valueOf("SUNDAY"));
        switch (today) {
            case SUNDAY:
                System.out.println("Today is Sunday");
                break;
            case MONDAY:
                System.out.println("Today is Monday");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednesday");
                break;
            case THURSDAY:
                System.out.println("Today is Thursday");
                break;
            case FRIDAY:
                System.out.println("Today is Friday");
                break;
            default:
                System.out.println("Today is Saturday");
                
        }
    }
}
