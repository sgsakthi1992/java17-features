public class SwitchFeature {
    public static void main(String[] args) {
        var value = 10;
        System.out.println(patternMatchingSwitch(value));
        var employee = new Employee(1L, "Sakthi");
        System.out.println(gaurdedPatternSwitch(employee));
        System.out.println(nullCaseSwitch(null));
        System.out.println(multiplePattern(3));
    }

    private static String patternMatchingSwitch(Object value) {
        return switch (value) {
            case Integer i -> i + " is an Integer";
            case String s -> s + " is a String";
            default -> "Nat a valid type";
        };
    }

    private static String gaurdedPatternSwitch(Object value) {
        return switch (value) {
            case Integer i -> i + " is an Integer";
            case String s -> s + " is a String";
            case Employee e && e.id() == 1L -> e + " is the first employee";
            default -> "Nat a valid type";
        };
    }

    private static String nullCaseSwitch(Object value) {
        return switch (value) {
            case Integer i -> i + " is an Integer";
            case String s -> s + " is a String";
            case Employee e && e.id() == 1L -> e + " is the first employee";
            case null -> "It is a null value";
            default -> "Nat a valid type";
        };
    }

    private static String multiplePattern(int value) {
        return switch (value) {
            case 1 -> "1 is the number";
            case 2, 3 -> "number is either 2 or 3";
            default -> "not a valid number";
        };
    }
}

record Employee(Long id, String name) {
}
