package TwoPointer;

public class ReversePrefixWord_2000 {


        public String reversePrefix(String word, char ch) {

            int i = 0;
            int j = -1;

            while (i < word.length()) {
                if (word.charAt(i) == ch) {
                    j = i;
                    break;
                }
                i++;
            }

            if (j == -1) return word;

            char[] arr = word.toCharArray();

            int left = 0;
            int right = j;

            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

            return new String(arr);
        }


}
