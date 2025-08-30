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
}