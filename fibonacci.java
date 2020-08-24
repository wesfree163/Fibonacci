/**
 * fibonacci
 */
public class fibonacci {

    public static int nacci(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            return nacci(n-1) + nacci(n-2);
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.println(nacci(i));
        }
    }
}