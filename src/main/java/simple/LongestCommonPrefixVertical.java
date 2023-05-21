package simple;

/**
 * @author jokerdragon
 *
 * 最长公共前缀纵向比较
 */
public class LongestCommonPrefixVertical {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String str = "";
        int length = strs[0].length();
        int count = strs.length;
        for (int i = 0; i < length; i++) {

            char c = strs[0].charAt(i);
            for (int j = 1; j < count; j++) {

                if (c != strs[j].charAt(i) || i == strs[j].length()) {
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
        }
}
