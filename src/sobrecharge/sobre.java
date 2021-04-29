package sobrecharge;
public class sobre {
    private int contador;
    private String Str;
    public sobre(){
        contador = 0;
        Str = "Hola vacio";
    }
    public sobre(int numI, String saludo){
        this.contador = numI;
        this.Str = saludo;
    }
    public void test(){
        System.out.println(Str);
    }
    public void test(int a){
        System.out.println(Str+a);
    }
    public void test(int a, int b){
        System.out.println(Str+(a+b));
    }
    double test(int a, int b, int c){
        double res = a+b+c;
        return res;
    }
}
