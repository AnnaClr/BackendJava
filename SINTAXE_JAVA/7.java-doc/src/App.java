public class App {
    public int somaMultiplica(int n, int x, String m){
        int result = 0; 
        if (m == "M"){
            result = n * x;
        } else {
            result = n + x;
        }
        return result;
    } 
}
