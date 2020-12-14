class fibonacci {
    public static void main(String[] args) {
        int n=30;
        int n0=0,n1=1;
        // without recursion 
        for (int i=0;i<n-1;i++){
            int temp=n0+n1;
            n0=n1;
            n1=temp;
            System.out.println(n1);
        }
        // with recursion
      System.out.println(fibonacciWithRecursion(n));
    }    
    static int fibonacciWithRecursion(int n){
        if (n<=1)
        return n;
        return fibonacciWithRecursion(n-1)+fibonacciWithRecursion(n-2);
    }    

}

