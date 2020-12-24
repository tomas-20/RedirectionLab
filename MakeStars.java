public class MakeStars extends FileChanger {
  public static String stars(String s) {
    String output = "";
    for (int i = 0; i < s.length(); i ++) {
      output += "*";
    }
    return output;
  }
  public static void main(String[] args) {
    ChangeFile.changeFile(true);
  }
}
