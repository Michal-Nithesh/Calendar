import java.util.*;
public class CalendarProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        sc.close();
        Calendar cal = Calendar.getInstance();
        cal.set(year, Calendar.JANUARY, 1);
        System.out.println("   " + year + " Calendar");
        System.out.println("---------------------------");
        for (int i = 0; i < 12; i++) {
            printMonth(cal);
            printMonthBody(cal);
            cal.add(Calendar.MONTH, 1);
        }
    }

    public static void printMonth(Calendar cal) {
        String month = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US);
        int year = cal.get(Calendar.YEAR);
        System.out.println("     " + month + " " + year);
        System.out.println("---------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
    }

    public static void printMonthBody(Calendar cal) {
        int startDay = cal.get(Calendar.DAY_OF_WEEK);
        int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int i = 1; i < startDay; i++) {
            System.out.print("    ");
        }
        for (int i = 1; i <= daysInMonth; i++) {
            System.out.printf("%3d ", i);
            if ((i + startDay - 1) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
