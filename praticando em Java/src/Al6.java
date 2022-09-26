import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Al6 {
    public static void main(String[] args){

        //String nome = "johann";
        //System.out.println(nome.toUpperCase());
        //System.out.println(nome.toLowerCase());
        //System.out.println(nome.length());

        //String outroNome = "Johann";
      //  System.out.println(nome.equals(outroNome));
       // System.out.println(nome.equalsIgnoreCase(outroNome));

        String nome ="Joao";
        String saudacao;
        //ISO 8601
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil ));
        LocalDateTime agora = LocalDateTime.now();
        String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

        if(agora.getHour() >= 0 && agora.getHour() <12){
            saudacao = "bom dia";
        } else if (agora.getHour()>= 12 && agora.getHour()<18) {
            saudacao = "boa tarde";
        } else if (agora.getHour() >=18 && agora.getHour()<24) {
            saudacao = "boa noite";
        }else {
            saudacao ="ola";
        }
        System.out.printf("ola, %s. hoje e %s, %s.%n", nome, diaDaSemana , saudacao.toLowerCase());


        System.out.println("hoje e o dia:" + hoje.getDayOfYear() +" do ano de 2022");

        int ano1 = hoje.getDayOfYear();
        int ano2 = 365;
        int result = ano2- ano1;
        System.out.println("faltam exatamente " +result + " dias para o ano acabar");



    }
}
