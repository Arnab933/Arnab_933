
import java.util.Arrays;

enum DAY {
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);
    private int a;
    
    DAY(int a) {
        this.a = a;
    }
    
    
    int getmass() {
        return a;
    }
}

class ENUM {
    public static void main(String[] args) {
        DAY today = DAY.SUNDAY;
        System.out.println(today);
        // System.out.println(Arrays.toString(DAY.values()));
        // for (DAY s : DAY.values()) {
        //     System.out.print(s + " ");
        // }
        DAY day=DAY.SUNDAY;
        System.out.println(day+"="+day.getmass());


        // for(DAY s:DAY.values()){
        //     System.out.println(s +"="+s.getmass());
        // }
    }
}