class Factorial{
    public static void main(String[] args) {
        System.err.println(fun(5));
    }
    static int fun(int n){
        if(n<2){
            return 1;
        }
        return fun(n)*fun(n-1);
    }
}