package enum_TEST;

public class DaySetting {
    public static String today(Day day) {
        if (day.equals(Day.Monday)) {
            return "오늘은 월요일이양";
        } else if (day.equals(Day.Tuesday)) {
            return "오늘은 화요일이양";
        } else if (day.equals(Day.Wednesday)) {
            return "오늘은 수요일이양";
        } else if (day.equals(Day.Thursday)) {
            return "오늘은 목요일이양";
        } else if (day.equals(Day.Friday)) {
            return "오늘은 금요일이양";
        } else if (day.equals(Day.Saturday)) {
            return "오늘은 토요일이양";
        } else if (day.equals(Day.Sunday)) {
            return "오늘은 일요일이양";
        } else {
            return "그 딴 요일은 없어";
        }
    }
}
