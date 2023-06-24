public class CommonLongestPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = "";
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return prefix;
                }
            }
            prefix += c;
        }
        return prefix;
    }


    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flight"};
//        System.out.println(longestCommonPrefix(arr));
        System.out.println(bestLongestCommonPrefix(arr));

    }

    private static String bestLongestCommonPrefix(String[] arr) {
        String prefix = arr[0];

        for(int i=1; i<arr.length; i++){
            while(arr[i].indexOf(prefix)!= 0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
}
