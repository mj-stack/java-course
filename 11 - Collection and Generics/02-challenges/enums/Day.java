package enums;

public enum Day {
    Sunday(false), Monday(true), Tuesday(true), Wednesday(true), Thursday(true), Friday(true), Saturday(false);

    private final boolean isWeekDay;

    Day(boolean isWeekDay) {
        this.isWeekDay = isWeekDay;
    }

    public String getType() {
        return isWeekDay ? "Weekday" : "Weekend";
    }
}
