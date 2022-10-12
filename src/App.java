import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número :");
        int n1 = sc.nextInt();

        System.out.println("Digite o número :");
        int n2 = sc.nextInt();

        int soma = n1 + n2;


        System.out.println("A soma dos dois números informados foi : " + soma);
    }

}
}