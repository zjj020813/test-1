package TEST;

import java.util.Scanner;

public class test14 {
    public static void main(String[] args) {
                Scanner sc =new Scanner(System.in);
                System.out.println("请输入带有字母的字符串：");
                String str=sc.nextLine();
                int[] countLetters =countLetters(str.toLowerCase());
                for (int i=0;i<countLetters.length;i++){
                    System.out.println((char)('a'+i)+"出现了"+countLetters[i]+"次;");
                }
                 sc.close();
            }

            private static int[] countLetters(String str) {
                int[] counts = new int[26];
                for (char e : str.toCharArray()) {
                    if (Character.isLetter(e)) {
                        counts[e - 'a']++;
                    }
                }
                return counts;
    }


}
