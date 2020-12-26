public class PigLatin {
  private static String[] vowels = {"a", "e", "i", "o", "u"};
  private static String[] doubles = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
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
    if (in(first, vowels)) {
      return s + "hay";
    }
    return s.substring(1) + first + "ay";
  }
  public static String pigLatin(String s) {
    if (s.length() == 1) {
      return pigLatinSimple(s);
    }
    String start = s.substring(0, 2);
    if (in(start, doubles)) {
      return s.substring(2) + start + "ay";
    }
    return pigLatinSimple(s);
  }
}
