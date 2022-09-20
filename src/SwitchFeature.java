public class SwitchFeature {
    public static void main(String[] args) {
        var value = 10;
        System.out.println(patternMatchingSwitch(value));
        var employee = new Employee(1L, "Sakthi");
        System.out.println(gaurdedPatternSwitch(employee));
        System.out.println(nullCaseSwitch(null));
    }

    private static String patternMatchingSwitch(Object value) {
        return switch (value) {
            case Integer i -> "It is an Integer";
            case String s -> "It is a String";
            default -> "Nat a valid type";
        };
    }

    private static String gaurdedPatternSwitch(Object value) {
        return switch (value) {
            case Integer i -> "It is an Integer";
            case String s -> "It is a String";
            case Employee e && e.id() == 1L -> "It is the first employee";
            default -> "Nat a valid type";
        };
    }

    private static String nullCaseSwitch(Object value) {
        return switch (value) {
            case Integer i -> "It is an Integer";
            case String s -> "It is a String";
            case Employee e && e.id() == 1L -> "It is the first employee";
            case null -> "It is a null value";
            default -> "Nat a valid type";
        };
    }
}

record Employee(Long id, String name) {
}