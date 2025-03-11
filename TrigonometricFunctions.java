public class TrigonometricFunctions {
  public static void main(String[] args) {
    double angle = Math.toRadians(45); // Convert angle from degrees to radians

    double sinValue = Math.sin(angle);
    double cosValue = Math.cos(angle);
    double tanValue = Math.tan(angle);

    System.out.println("Sine of 45 degrees: " + sinValue);
    System.out.println("Cosine of 45 degrees: " + cosValue);
    System.out.println("Tangent of 45 degrees: " + tanValue);
  }
}