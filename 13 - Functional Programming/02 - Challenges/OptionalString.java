import java.util.Optional;

public class OptionalString {
    public static void main(String[] args) {
        System.out.println(toOptionalStr(null));
        System.out.println(toOptionalStr(""));
        System.out.println(toOptionalStr("pop"));
    }

    public static Optional<String> toOptionalStr(String str) {
        if (str == null || str.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(str.toUpperCase());
    }
}
