public class App {
  public static void main(String[] args) throws Exception {
    byte castedByte = (byte) (Byte.MIN_VALUE / 2);
    System.out.println(castedByte);

    short castedShort = (short) (Short.MIN_VALUE / 2);
    System.out.println(castedShort);

    int fraction = 1 / 2;
    System.out.println(fraction);
  }
}
