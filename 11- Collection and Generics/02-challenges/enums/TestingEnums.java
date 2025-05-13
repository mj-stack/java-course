package enums;

public class TestingEnums {
    public static void main(String[] args) {
        Day firstday = Day.Sunday;
        Day secondday = Day.Monday;
        Day thirdday = Day.Tuesday;
        Day fourthday = Day.Wednesday;
        Day fifthday = Day.Thursday;
        Day sixthday = Day.Friday;
        Day seventhday = Day.Saturday;
        // System.out.printf("%s %s %s %s %s %s %s", firstday, secondday, thirdday, fourthday, fifthday, sixthday, seventhday);
        for (Day value : Day.values()) {
            System.out.printf("%s : %s \n", value, value.getType());
        }
    }
}
