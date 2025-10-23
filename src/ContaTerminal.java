import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Conta contaCorrente = new Conta();

        System.out.println("Por favor, digite o número da Agência");
        int agencia = scanner.nextInt();
        contaCorrente.setAgencia(formatarAgencia(agencia));

        System.out.println("Insira o número da conta: ");
        contaCorrente.setNumero(scanner.nextInt());

        System.out.println("Informe o nome do cliente: ");
        scanner.nextLine();
        contaCorrente.setNomeCliente(scanner.nextLine());

        System.out.println("Informe o saldo: ");
        contaCorrente.setSaldo(scanner.nextDouble());

        System.out.println(contaCorrente.toString());

    }


    public static String formatarAgencia(int agencia) {
        String str = String.valueOf(agencia);
        String agenciaFormatada = str.substring(0, str.length() -1) + "-" + str.charAt(str.length()-1);

        return agenciaFormatada;
    }

}

