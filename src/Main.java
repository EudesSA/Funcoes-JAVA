public class Main {
    public static void main(String[] args) {
        String nomeOriginal = "Eudes";
        saudacao(nomeOriginal);

        int resultado = soma(2,3);
        System.out.println(resultado);
    }

    public static void saudacao(String nomeParametro){
        System.out.println("Olá, " + nomeParametro);
    }
    public static int soma(int a,int b){
        return a + b;
    }
}