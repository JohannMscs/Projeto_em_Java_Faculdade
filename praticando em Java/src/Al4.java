import java.sql.SQLOutput;

public class Al4 {
    public static void main(String[]args){

        boolean fimDeSemana = false;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana || fazendoSol;
        System.out.println(vamosAPraia);


        String mensagem = fimDeSemana ? "e fim de semana" : "nao e fim de semana";
        String mensagem2 = fazendoSol ? "esta fazendo sol" : "esta nublado ou esta chovendo";
        System.out.println(mensagem);
        System.out.println(mensagem2);
// tabela verdade
        // operador && (AND)
        // true && true = true
        // true && false = false
        //false && true = false
        //false && false = false

        // operardor || (OR)
        //true || true = true
        //true || false = true
        //false || true = true
        //false || false = false

    }
}
