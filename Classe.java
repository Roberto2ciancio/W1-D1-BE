import java.util.Scanner;

public class Classe {

    public static int sum(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero: ");
        int a = scanner.nextInt();
        System.out.println("inserisci un altro numero; ");
        int b = scanner.nextInt();

        int res = sum(a, b);

        System.out.println("il risultato e'" + res);

    }



}
