package nestlab;
public class AnagramWord{
    public static boolean areAnagrams (String strOne, String strTwo){
        String actualStr1 = removeJunk(strOne);
        String actualStr2 = removeJunk(strTwo);
        actualStr1=actualStr1.toLowerCase();
        actualStr2=actualStr2.toLowerCase();
        actualStr1=sortString(actualStr1);
        actualStr2=sortString(actualStr2);
        return actualStr1.equals(actualStr2);
    }
    private static String removeJunk(String jString){
        int len = jString.length();
        StringBuilder clean = new StringBuilder(len);
        for (int i=len-1;i>=0;i--){
            if (Character.isLetter(jString.charAt(i))){
                clean.append(jString.charAt(i));
            }
        }
        return clean.toString();
    }
    private static String sortString (String sort){
        char[] sorted = sort.toCharArray();
        java.util.Arrays.sort(sorted);
        return new String(sorted);
    }
    public static void main(String[] a){
        String str1, str2;
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter first word");
        str1 = input1.nextLine();
        System.out.println("Enter second word");
        str2 = input1.nextLine();
        if (areAnagrams(str1, str2))
            System.out.println("They are ANAGRAMS");
        else System.out.println("They are not ANAGRAMS");
    }
}
