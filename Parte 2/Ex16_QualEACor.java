import java.util.Scanner;

public class Ex16_QualEACor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira cor: ");
        String cor1 = sc.nextLine();
        
        System.out.print("Digite a segunda cor: ");
        String cor2 = sc.nextLine();

        boolean ehPrimaria1 = cor1.equals("Vermelho") || cor1.equals("Azul") || cor1.equals("Amarelo");
        boolean ehPrimaria2 = cor2.equals("Vermelho") || cor2.equals("Azul") || cor2.equals("Amarelo");

        if (!ehPrimaria1 || !ehPrimaria2) {
            System.out.println("Apenas cores primárias são aceitas.");
        } else if ((cor1.equals("Vermelho") && cor2.equals("Azul")) || (cor1.equals("Azul") && cor2.equals("Vermelho"))) {
            System.out.println("A combinação resulta em:\nRoxo");
        } else if ((cor1.equals("Vermelho") && cor2.equals("Amarelo")) || (cor1.equals("Amarelo") && cor2.equals("Vermelho"))) {
            System.out.println("A combinação resulta em:\nLaranja");
        } else if ((cor1.equals("Azul") && cor2.equals("Amarelo")) || (cor1.equals("Amarelo") && cor2.equals("Azul"))) {
            System.out.println("A combinação resulta em:\nVerde");
        } else {
            System.out.println("A combinação resulta em:\n" + cor1);
        }

        sc.close();
    }
}