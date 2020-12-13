
public class TreePrinterUtil {

    private TreePrinterUtil() {}

    public static void print(){
        for(int i = 5; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
