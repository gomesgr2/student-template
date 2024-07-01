public class Main {
    public static double sqrt(double n, double epsilon) {
        return 0.0;
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
        char alpha[] =  {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for (int i; i < message.length(); i++) {
            
        }
        message.charAt()
    }

    public static String decrypt(String encryptedMessage, int key) {
        return "";
    }
    
    public static void main(String[] args) throws Exception {
        // use this method to manually test your code
        boolean test = isPerfectNumber(6);
        System.out.println(test);
        test = true == isPerfectNumber(20);
        System.out.println(test);

    }
}
