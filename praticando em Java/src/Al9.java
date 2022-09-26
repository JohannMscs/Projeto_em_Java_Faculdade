public class Al9 {
    public static void main(String[]args) {
        String nome = "Johann";
        String nome24 = "Joao";
        System.out.println("hello, " + nome);
        saudacao(nome24);
        int resultado = soma(2, 3);
        System.out.println(resultado);

    }

    public static int soma(int a, int b){
        return a +b;
    }
    public static void saudacao(String nome12){
        System.out.println("Hello, " + nome12);

    }
}
