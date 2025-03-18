import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculadora calculadoraA = new Calculadora("", "", 0);

        System.out.print("Digite o nome da calculadora: ");
        String marca = scanner.nextLine();
        calculadoraA.setMarca(marca);

        System.out.print("Digite o modelo da calculadora: ");
        String modelo = scanner.nextLine();
        calculadoraA.setModelo(modelo);


        System.out.print("Digite o ano da calculadora: ");
        int ano = scanner.nextInt();
        calculadoraA.setAno(ano);

        System.out.println(calculadoraA.getMarca());
        System.out.println(calculadoraA.getModelo());
        System.out.println(calculadoraA.getAno());

        System.out.println("-------------------------------------");

        boolean repetir = true;

        while (repetir) {
            System.out.print("Digite primeiro número: ");
            double valor1 = scanner.nextDouble();
            calculadoraA.setValor1(valor1);

            System.out.print("Digite segundo número: ");
            double valor2 =scanner.nextDouble();
            calculadoraA.setValor2(valor2);

            System.out.println("Escolha uma das operações: ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    calculadoraA.mostrarResposta("Soma");
                    break;
                case 2:
                    calculadoraA.mostrarResposta("Subtração");
                    break;
                case 3:
                    calculadoraA.mostrarResposta("Multiplicação");
                    break;
                case 4:
                    calculadoraA.mostrarResposta("Divisão");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            System.out.println("Deseja refazer?(1 - Sim / 2 - Não): ");

            int continuar = scanner.nextInt();

            if (continuar == 2) {
                repetir = false;
            }

            scanner.nextLine();
        }
        System.out.println("Calculadora desligando.");

        scanner.close();
    }
}