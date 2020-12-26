public class PigLatin {
  private static String[] vowels = {"a", "e", "i", "o", "u"};
  private static boolean in(String a, String[] b) {
    for (int i = 0; i < b.length; i ++) {
      if (a.equals(b[i])) {
        return true;
      }
    }
    return false;
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
