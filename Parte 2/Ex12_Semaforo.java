import java.util.Scanner;

public class Ex12_Semaforo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a cor atual do semáforo: ");
        String cor = sc.nextLine();

        if (cor.equalsIgnoreCase("Vermelho")) {
            System.out.println("Espere");
        } else if (cor.equalsIgnoreCase("Verde")) {
            System.out.println("Atravesse");
        } else {
            System.out.println("Farol inoperante");
        }

        sc.close();
    }
}
