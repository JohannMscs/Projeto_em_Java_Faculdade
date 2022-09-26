import java.util.Arrays;

public class Al8 {
    public static void main(String[]args){
        int n1 = 1;
        int n2 = 2;
        int n3 = 3;
        int n4 = 4;
        int n5 = 5;

        int[] ns = new int[5];
        //[0] [1] [2] [3] [4]

        ns [0] = 1;
        ns [1] = 2;
        ns [2] = 3;
        ns [3] = 4;
        ns [4] = 5;

        for(int i=0; i< ns.length; i++) {
            System.out.println(ns[i]);
        }
        String[] ls = new String[5];
        //[0] [1] [2] [3] [4]

        ls [0] = "A";
        ls [1] = "B";
        ls [2] = "C";
        ls [3] = "D";
        ls [4] = "E";

        for(int j=0; j< ls.length; j++) {
            System.out.println(ls[j]);
        }
            String[] lss = {"a", "b", "c", "d", "e"};
              for (int h=0; h< lss.length; h++){
                  System.out.println(lss[h]);
              }
        System.out.println(Arrays.toString(ls));
        System.out.println(Arrays.toString(lss));
        System.out.println(Arrays.toString( ns));

        int [] nss = {9, 14, 25, 36, 47};
        int maior = nss[0];
        int menor = nss[0];
        int  media = nss[0];

        for (int x=0; x< nss.length; x++){
            if(nss[x] > maior){
                maior = nss[x];
            }
            if (nss[x]< menor){
                menor = nss[x];
            }
            media += nss[x];
        }
        System.out.println("maior "+maior);
        System.out.println("menor "+menor);
        System.out.println("media "+media/nss.length);


        }


    }

