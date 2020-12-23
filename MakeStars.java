public class MakeStars {
  public static String stars(String s) {
    String output = "";
    for (int i = 0; i < s.length(); i ++) {
      output += "*";
    }
    return output;
  }
}
