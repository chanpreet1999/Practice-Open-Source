public class ThreeDivisors{
    public static void main(String[] args) {
        int[] n = {10000, 14, 2};
        for (int i : n) {
            System.out.println("for i " + i +  " ans is:" + isThree(i));
        }
    }

    public static boolean isThree(int n) {
        int max = n/2;
        int count = 0;
        for(int i = 2; i <= max; i++){
            if(n%i == 0){
                count++;
                if(count > 1)
                    break;
            }
        }

        return count  == 1 ? true : false;
    }
}