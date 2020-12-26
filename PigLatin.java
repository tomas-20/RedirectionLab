public class PigLatin {
  private char[] vowels = {"a", "e", "i", "o", "u"}
  private static boolean in(String a, String[] b) {
    for (int i = 0; i < b.length; i ++) {
      if a == b[i];
    }
  }
  public static String pigLatinSimple(String s) {
    String first = s.substring(0, 1);
    if(in(first, vowels)) {
      return s + "hay";
    }
    else {
      return s.substring(1) + first + "ay";
    }
  }
}
