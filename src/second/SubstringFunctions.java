package second;

public class SubstringFunctions {
    public boolean endsWith(String initial, String other) {
        if (initial == null || other == null) {
            return false;
        }
        if (other.isEmpty()) {
            return true;
        }
        if (other.length() > initial.length()) {
            return false;
        }
        int lastIndex = initial.lastIndexOf(other);
        return (lastIndex != -1) && (lastIndex + other.length() == initial.length());
    }
}