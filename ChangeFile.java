import java.util.Scanner;
public class ChangeFile {
  public static void changeFile(boolean type) {
    Scanner file = new Scanner(System.in);
    boolean hasNextLine = file.hasNextLine();
    while (hasNextLine) {
      Scanner line = new Scanner(file.nextLine());
      boolean hasNext = line.hasNext();
      while (hasNext) {
        String next = line.next();
        if (type) {
          next = MakeStars.stars(next);
        }
        else {
          next = PigLatin.pigLatinBest(next);
        }
        System.out.print(next);
        hasNext = line.hasNext();
        if (hasNext) {
          System.out.print(" ");
        }
      }
      hasNextLine = file.hasNextLine();
      if (hasNextLine) {
        System.out.println();
      }
    }
  }
}
