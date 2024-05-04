package programmers;

public class PRG84512_VowelDictionary {
    public static void main(String[] args) {
        String word ="AAAA";
        int length = word.length();
        int result = 0;
        String str ="AEIOU";
        int[] arr = {781, 156, 31, 6, 1};

        for(int i = 0; i < length; i++){
            result += (str.indexOf(word.charAt(i)) + 1) * arr[i];
        }
    }
}
