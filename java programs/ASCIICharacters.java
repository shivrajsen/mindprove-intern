public class ASCIICharacters {
    public static void main(String[] args) {
        int i = 0; // ASCII values range from 0 to 127
        
        while (i <= 127) {
            System.out.println("ASCII Value: " + i + " Character: " + (char) i);
            i++;
        }
    }
}
