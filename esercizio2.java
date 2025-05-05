import java.util.Scanner;

public class esercizio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una riga ");
        String a= scanner.next();
        System.out.println("inserisci un altra riga");
        String b= scanner.next();
        System.out.println("inseriscine un altra ");
        String c = scanner.next();


        String ConcatenazioneNormale = a + b + c;
        System.out.println( "concat normale" + ConcatenazioneNormale);
        String ConcatenazioneInversa = c + b + a;
        System.out.println("concat inverso" + ConcatenazioneInversa);
    }

}
