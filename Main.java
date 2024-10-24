import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length of rectangle 1: ");
    double l1 = sc.nextDouble();
    System.out.println("Enter length of rectangle 2: ");
    double l2 = sc.nextDouble();
    System.out.println("Enter width of rectangle 1: ");
    double w1 = sc.nextDouble();
    System.out.println("Enter width of rectangle 2: 4");
    double w2 = sc.nextDouble();

    Rectangle rec1 = new Rectangle(l1, w1);
    Rectangle rec2 = new Rectangle(l2, w2);

    boolean isRotated = (rec1.getLength() == rec2.getWidth() && rec1.getWidth() == rec2.getLength());
    boolean isCongruent = isRotated || rec1.equals(rec2);
    boolean isSimilar = isCongruent || ((rec1.getLength()/rec2.getLength()) == (rec1.getWidth()/rec2.getWidth()));

    System.out.println(isRotated);
    System.out.println(isCongruent);
    System.out.println(isSimilar);
  }
}
