package simple;

/**
 * @author jokerdragon
 *
 * 题目描述：
 * 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。
 *
 * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
 *
 *example:
 * 输入：s = "Hello World"
 * 输出：5
 * 解释：最后一个单词是“World”，长度为5。
 *
 */
public class LengthOfLastWord {


    public int lengthOfLastWord(String s) {

        int index = s.length() - 1;
        while (s.charAt(index) == ' '){
            index--;
        }

        // "Hello World"

        int worldLength = 0;
        while (index >= 0 && s.charAt(index) !=' '){
            worldLength++;
            index--;
        }
        return worldLength;
    }


}
