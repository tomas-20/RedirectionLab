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
  private static boolean notLetter(char c) {
    return c < 'a' || c > 'z';
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
  public static String pigLatinBest(String s) {
    s = s.toLowerCase();
    if (notLetter(s.charAt(0))) {
      return s;
    }
    int lastIndex = s.length() - 1;
    char last = s.charAt(lastIndex);
    if (notLetter(last)) {
      return pigLatin(s.substring(0, lastIndex)) + last;
    }
    return pigLatin(s);
  }
  public static void main(String[] args) {
    ChangeFile.changeFile(false);
  }
}
