class Fibonacci{
    public static void main(String[] args) {
        System.err.println(fun(5));
    }
    static int fun(int n){
        if(n<3){
            return 1;
        }
        return fun(n-1)*fun(n-2);
    }

    static void squarePattern(int n){
        for(int i=1;i<=n;i++){
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");  // * * * * *
            }
            System.out.println(); // EmptyLinePrinting
        }
    }
}