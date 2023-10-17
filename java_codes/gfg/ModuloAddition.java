public class ModuloAddition {
 
    public static void main(String[] args) {
        long a = 922337203;
        long b = 922337203;
        // modulo rule (a+b)%c = ((a%c) + (b%c))%c
        long c = (int)1e9 +7;

        long ans =  ((a%c) + (b%c) )%c;
        System.out.println("ans:" + ans);
    }
}
