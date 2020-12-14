public class primeNumbers {
    public static void main(String[] args) {
        int n=1;
        System.out.println(isPrime(n));
    }
    static boolean isPrime(int x){
        int y=(int)Math.sqrt(x);
        for (int i=2;i<y;i++)
            if(x%i==0)
            return false;
        return true;
    }
}
