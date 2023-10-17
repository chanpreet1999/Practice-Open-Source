class FactorialDigits{
    public static void main(String[] args) {
        int ans = new FactorialDigits().digitsInFactorial(50);
        System.out.println("Ans is :" + ans);
    }
    public int digitsInFactorial(int n)
    {
        //Your code here
        if (n < 0)
            return 0;

        // base case
        if (n <= 1)
            return 1;
        
        // else iterate through n and calculate the
        // value
        double digits = 0;
        for (int i=2; i<=n; i++)
        digits += Math.log10(i);
        
        return (int)(Math.floor(digits) + 1); 
    }
}