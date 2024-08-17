public enum day {
    Sunday,
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday;
}

class SwitchExpression {
    public static void main(String[] args) {
        day d = day.Sunday;
        // we can use yield keyword after arrow it will work same as break keyword work in normal switch case
        int x = switch (d) {
            case Monday, Friday, Sunday -> 10;
            case Tuesday, Saturday -> 15;
            case Wednesday, Thursday -> 12;
            default -> throw new IllegalStateException("invalid data");
        };
        System.out.println(x);
    }
}