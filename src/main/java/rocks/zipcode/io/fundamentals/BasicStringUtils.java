package rocks.zipcode.io.fundamentals;

public class BasicStringUtils {
    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(char[] chars) {
        String result = "";
        for (char c : chars) {
            result += c;
        }
        return result;
    }

    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(Character[] chars) {
        String result = "";
        for (Character c : chars) {
            result += c;
        }
        return result;
    }

    /**
     * @param string - string to be manipulated
     * @return identical string with lowercase and uppercase vowels removed
     */
    public static String removeAllVowels(String string) {
        return removeSpecifiedCharacters(string, "AEIOUaeiou");
    }

    /**
     * @param string             - string to be manipulated
     * @param charactersToRemove - characters to be removed from string
     * @return
     */
    public static String removeSpecifiedCharacters(String string, String charactersToRemove) {
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            boolean flag = true;
            for (int j = 0; j < charactersToRemove.length(); j++) {
                char r = charactersToRemove.charAt(j);
                if (c == r) {
                    flag = false;
                    break;
                }
            }
            if (flag) result += c;
        }
        return result;
    }
}
