import java.util.Scanner;
public class ArchivioNomi{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        String [] bombe = new String [100];
        int scelta;
        int conta =-1;
        do {
            conta = conta+1;
            System.out.println("Scegli un'opzione");
            System.out.println("1 - Aggiunta di un nome\n" +
                    "2 - Cancellazione del singolo nome\n" +
                    "3 - Ricerca sequenziale di un nome\n" +
                    "4 - Visualizza nomi ripetuti con numero ripetizione\n" +
                    "5 - Modifica di un nome\n" +
                    "6 - Visualizzazione di tutti i nomi presenti\n" +
                    "7 - Ricerca del nome più lungo e più corto\n" +
                    "8 - Cancellazione di tutte le occorrenze di un nome\n" +
                    "0 - Uscita");
            scelta = in.nextInt();
            switch (scelta) {
                case 1:

            }
        }while (scelta!=0);
    }
}