package rocks.zipcode.io.fundamentals;

import rocks.zipcode.io.arrays.ArrayUtils;
import rocks.zipcode.io.collections.PowerSet;

import java.util.*;

/**
 * @author leon on 10/01/2019.
 */
public class StringUtils {
    /**
     * @param string - string to be evaluated
     * @return collection containing all permutations of casing of this string
     */
    public static Collection<String> getAllCasings(String string) {
        Set<Set<Integer>> setSet = new PowerSet<>(ArrayUtils.getRange(0, (string.length() - 1))).permute();
        Collection<String> imSilly = new HashSet<>();
        for (Set<Integer> set: setSet) {
            imSilly.add(upperCaseIndices(string, set.toArray(new Integer[0])));
        }
        return imSilly;


//
//        int range = 1;
//        for (int i = 0; i < string.length(); i++) {
//            range *= 2;
//        }
//        Collection<String> madness = new ArrayList<>();
//        for (int i = 0; i < range; i++) {
//            String chaos = "";
//            for (int j = 0; j < string.length(); j++) {
//                if (i % ((j+1) * 2) == 1) {
//                    chaos += string.substring()
//                }
//            }
//        }
//        return null;
    }

    /**
     * @param string  - string to be evaluated
     * @param indices - indices to be evaluated
     * @return near-identical string whose characters at specified indices are capitalized
     */
    public static String upperCaseIndices(String string, Integer... indices) {
        String[] split = string.split("");
        String result = "";
        for (int i = 0; i < split.length; i++) {
            if (contains(indices, i)) {
                result += split[i].toUpperCase();
            }
            else {
                result += split[i];
            }
        }
        return result;
    }

    private static boolean contains(Integer[] array, int i) {
        for (int j = 0; j < array.length; j++) {
            if (array[j].equals(i)) return true;
        }
        return false;
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param valueToBeInserted     - value to insert into string
     * @param index                 - string-index at which to insert value into string
     * @return near-identical string with `valueToBeInserted` inserted at `index`
     */
    public static String insertAtIndex(String stringToBeManipulated, String valueToBeInserted, Integer index) {
        return stringToBeManipulated.substring(0, index) + valueToBeInserted + stringToBeManipulated.substring(index);
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param replacementValue      - value to insert at `index`
     * @param index                 - position of string to be manipulated
     * @return near-identical string with character at `index` replaced with `replacementValue`
     */
    public static String replaceAtIndex(String stringToBeManipulated, Character replacementValue, Integer index) {
        return stringToBeManipulated.substring(0, index) + replacementValue + stringToBeManipulated.substring(index + 1);
    }
}
