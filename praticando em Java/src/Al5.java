public class Al5 {
    public static void main(String[] args) {

        int nota1 = 50;
        String graduacao;
        // nota >=70 aprovado
        // nota maior(>) que 100 sera invalida e menor (<) que 0 sera invalida
        if (nota1 >= 80 && nota1<=100) {
            graduacao = "A";
        } else if (nota1 < 80 && nota1 >= 70) {
            graduacao = "B";
        } else if (nota1 < 70 && nota1 >= 60) {
            graduacao = "C";
        } else if (nota1 < 60 && nota1 >= 0) {
            graduacao = "D";
        }else  {
                graduacao = "";
            }
        switch (graduacao){
            case "A":
            case "B":
                System.out.println("Aluno aprovado!");
                break;
            case"C":
            case"D":
                System.out.println("Aluno reprovado!");
                break;
            default:
                System.out.println("nota invalido");
        }
        }
    }
