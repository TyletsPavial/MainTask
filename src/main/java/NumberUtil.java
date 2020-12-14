import java.math.BigInteger;

public class NumberUtil {

    private NumberUtil() {}

    public static boolean isSimple(int n){
        if (n == 0){
            return false;
        }
        if(n < 2 && n > -2 ){
            return true;
        }
        for(int i = 2; i < Math.abs(n) / 2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static BigInteger calcFactorial(int n) throws Exception {
        if (n < 0){
            throw new RuntimeException("Integer must be bigger than 0");
        }
        if(n == 1 || n == 0){
            return BigInteger.valueOf(1);
        }
        BigInteger result = BigInteger.valueOf(2);
        for (int i = 3; i <= n; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return  result;
    }

    public static int convertDecimalToBinary(int n){
        int result = 0;
        int i = 0;
        while(n != 0){
            result += (int) Math.pow(10, i) * (Math.abs(n) % 2);
            n /= 2;
            i++;
        }
        return result;
    }

    public static int convertBinaryToDecimal(int n){
        int result = 0;
        int i = 1;
        while(n / Math.pow(10, i)  != 0){
            i++;
        }
        for(; i >= 0; i-- ){
            result =  result * 2 + Math.abs(n)  /(int) Math.pow(10, i);
            n %= (int) Math.pow(10, i);
        }
        return result;
    }

    public static int findFibonachi(int n){
        if(n == 0){
            return 0;
        }

        int newResult = 0;
        int oldResult = 1;
        int prevOldResult = 0;
        for(int i = 0; i < Math.abs(n) ; i++){
            newResult = oldResult + prevOldResult;
            prevOldResult = oldResult;
            oldResult = newResult;

        }
        if(n > 0){
            return newResult;
        }
        else {
            return (int) (Math.pow(-1, n) * newResult);
        }
    }
    public static Integer[] switching(Integer[] values){
        values[0] +=  values[1];
        values[1] = values[0] - values[1];
        values[0] -= values[1];
        return values;
    }
}
