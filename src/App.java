import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double porHora;
        double horasPorMes;
        double total;

        System.out.print("Digite quantos você ganha por hora: R$");
        porHora = sc.nextDouble();

        System.out.print("Digite quantas horas você trabalha por mês: ");
        horasPorMes = sc.nextDouble();

        total = porHora * horasPorMes;

        System.out.printf("Voce ganha por mês: R$ %.2f", total);

    }
}
