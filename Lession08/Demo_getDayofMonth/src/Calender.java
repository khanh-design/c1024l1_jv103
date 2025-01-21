package src;

public class Calender {
    public static String getDayofMonth(int month) {
        String result;
        if (isValidMonth(month)) {
            result = "Invalid month";
        }
        switch (month) {
            case NameMonthConst.FEBRUARY:
                    result = "Month " + month + "has 28 days";
                    break;
                case NameMonthConst.APRIL:
                case NameMonthConst.JUNE:
                case NameMonthConst.SEPTEMBER:
                case NameMonthConst.NOVEMBER:
                    result = "Month " + month + "has 30 days";
                    break;
                default:
                    result = "Month " + month + "has 31 days";
                    break;
        }
        return result;
    }

    private static boolean isValidMonth(int month) {
        return month < 1 || month > 12;
    }
}
/* nhan biet code smell:
1: co the thay the if_elseif -> switch_case
* */
