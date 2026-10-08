package reverse;

/// Необходимо перевернуть порядок символов в строке, оставляя все небуквенные символы на своей позиции.
/// Пример
/// Input:  J@va the be$t!123
/// Output: t@eb eht av$J!123
public class Reverse {
    public static String reverseLetters(String s) {
        if (s == null) {
            return "";
        }
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (!Character.isLetter(chars[left])) {
                left++;
            } else if (!Character.isLetter(chars[right])) {
                right--;
            } else {
                char tmp = chars[left];     // меняем местами края
                chars[left] = chars[right];
                chars[right] = tmp;
                left++;                     // сдвигаем указатели навстречу
                right--;
            }
        }

        System.out.println(new String(chars));
        return new String(chars);
    }

}
