import java.util.Random;
public class OTPGenerator {
      public static void main(String[] args) {
          for (int i = 1; i < 10; i++) {
              System.out.println(getOTP());
          }
      }
      public static int getOTP(){
          Random random = new Random();
          int minValue = 1000;
          int maxValue = 9999;
          return minValue + random.nextInt(maxValue - minValue);
      }
}
