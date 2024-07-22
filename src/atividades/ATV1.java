package atividades;

public class ATV1 {
    static char alpha[] =  {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

   public static double sqrt(double n, double epsilon) {
       double xn = (n/2);
       double xn1 = 0.5 * (xn + (n/xn));
       while (Math.abs(xn - xn1) >= epsilon) {
           xn = xn1;
           xn1 = 0.5 * (xn + (n/xn));
       }
       return Math.round(xn / epsilon) * epsilon;
   }

   public static boolean isPerfectNumber(long number) {
       long soma = 0;
       for (int i = 1; i < number; i++) {
           if ((number % i) == 0) {
               soma = i + soma;
           }
       }
   
       return soma == number;
   }

   public static String encrypt(String message, int key) {
       String encoded = "";
       for (int i = 0; i < message.length(); i++) {
           int j = 0;
           while (alpha[j] != message.charAt(i)) {
               j ++;
           }
           int charIndexToEncoded = (j + key) > 25 ? (j + key) - 26 : (j + key);
           encoded = encoded + alpha[charIndexToEncoded];
       }
   
       return encoded;
   }

   public static String decrypt(String encryptedMessage, int key) {
       String decoded = "";
       for (int i = 0; i < encryptedMessage.length(); i++) {
           int j = 0;
           while (alpha[j] != encryptedMessage.charAt(i)) {
               j ++;
           }
       
           int charIndexToDecoded = (j - key) < 0 ? ((j - key) + 26) : (j - key);
           decoded = decoded + alpha[charIndexToDecoded];
       }
   
       return decoded;
   }
   
   public static void main(String[] args) throws Exception {
       // use this method to manually test your code
       boolean test = isPerfectNumber(6);
       System.out.println(test);
       test = isPerfectNumber(20);
       System.out.println(test);

       String encypted = encrypt("hello", 3);
       System.out.println(encypted);

       String decrypted = decrypt(encypted, 3);
       System.out.println(decrypted);

       double sqrtPrecise = sqrt(30, 0.01);
       System.out.println(sqrtPrecise);

       sqrtPrecise = sqrt(3, 0.01);
       System.out.println(sqrtPrecise);

   }
}
