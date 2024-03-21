import java.util.Scanner;
public class ArchivioNomi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strings = new String[100];
        int scelta;
        int conta = -1;
        int ripete =0;
        do {
            conta = conta + 1;
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
                    System.out.println("Inserisci il nome");
                    String aggiungi = in.next();
                    Aggiunta(strings, conta, aggiungi);
                    break;
                case 2:
                    Cancella(strings, conta);
                    break;
                case 3:
                    System.out.println("Inserisci un nome");
                    String cerca = in.next();
                    if(Ricerca(strings, conta, cerca)){
                        System.out.println("Il nome è presente");
                    }
                    else{
                        System.out.println("Il nome non è presente");
                    }
                    break;
                case 4:
                    Duplicati(strings, conta);
                    break;
                case 5:
                    System.out.println("Inserisci il nome da modificare");
                    String mod = in.next();
                    System.out.println("Inserisci il nuovo nome");
                    String sostituto = in.next();
                    Modifica(strings, conta, mod, sostituto);
                    break;
                case 6:
                    Visualizza(strings, conta);
                    break;
                case 7:
                    Lungo(strings, conta);
                    Corto(strings, conta);
                    break;
                case 8:
                    String cancella;
                    System.out.println("Inserisci il nome da cancellare");
                    cancella = in.next();
                    CancellaTutto(strings, conta, cancella);
                    break;
            }
        } while (scelta != 0);
    }
    private static void Aggiunta (String [] a, int conta, String aggiungi){
        a[conta] = aggiungi;
        conta = conta+1;
    }
    private static void Cancella (String [] a, int conta){
        for (int i = 0; i < conta; i++) {
            a[i]=a[i+1];
        }
        conta = conta - 1;
    }
    private static boolean Ricerca(String[] a, int conta, String cerca){
        boolean trovato =false;
        for(int i =0;i<conta;i++){
            if(a[i].equalsIgnoreCase(cerca)){
                trovato = true;
                break;
            }
        }
        return trovato;
    }
    private static void Duplicati(String [] a, int conta){
        int ripete =0;
        for(int i =0;i<conta;i++){
            for(int j =i;j<conta;j++){
                if(a[i].equalsIgnoreCase(a[j])){
                    ripete=ripete+1;
                }
            }
            if(ripete>1){
                System.out.println("Il nome "+a[i]+" si ripete "+ripete+" volte");
            }
            ripete=0;
        }
    }
    private static String[] Modifica(String[] a, int conta, String mod, String sostituto) {
        for (int i = 0; i < conta; i++) {
            if (a[i].equalsIgnoreCase(mod)) {
                a[i] = sostituto;
                break;
            }
        }
        return a;
    }
    private static void Visualizza(String[]a, int conta){
        System.out.println("Ecco il tuo archivio:");
        for(int i =0; i<conta;i++){
            System.out.println(a[i]);
        }
    }
    private static String Lungo(String [] a, int conta){
        String lungo ="";
        for(int i=0;i<conta;i++){
            if(a[i].length()>lungo.length()){
                lungo = a[i];
            }
        }
        return lungo;
    }
    private static String Corto(String [] a, int conta){
        String corto =a[0];
        for(int i =1;i<conta;i++){
            if(a[i].length()<corto.length()){
                corto = a[i];
            }
        }
        return corto;
    }
    private static void CancellaTutto(String[] a, int conta, String cancella){
        for(int i=0;i<conta;i++){
            if(a[i].equalsIgnoreCase(cancella)){
                for(int j =i;i<conta-1;j++){
                    a[j] = a[j+1];
                }
                conta = conta-1;
            }
        }
    }
}