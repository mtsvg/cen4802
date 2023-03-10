
class FibonacciSequence {
    /**
     *recursive method used to calculate the nth number in the fibonacci sequence
     * @param n - the nth number in the fibonacci sequence
     * @return the value of the nth number in the fibonacci sequence
     * @author Matthew Savage 
     */
    static int fibonacci(int n) {

        if (n <= 1)
            return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String args[]) {
        int n = 10;
        System.out.println("The " + n + "th term in the fibonacci sequence is " + fibonacci(n) + ".");

    }
}



