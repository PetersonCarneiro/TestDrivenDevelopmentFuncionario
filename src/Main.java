
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        double salDesc =0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> listFunc = new ArrayList<>();
/*

        System.out.println("Digete nome");
        String nome = sc.nextLine();

        System.out.println("Digite email");
        String email = sc.nextLine();

        System.out.println("salario");
        double salario = sc.nextDouble();
        sc.nextLine();

        System.out.println("cargo");
        String cargo = sc.nextLine();
*/

        Funcionario funcionario = new Funcionario("peter","fdfds",1800,"dba",salDesc);
        Funcionario funcionario1 = new Funcionario("peter1","fdfds",1800,"dev",salDesc);

        listFunc.add(funcionario);
        listFunc.add(funcionario1);
        funcionario1.verificaFunc();
        funcionario.verificaFunc();



        for(Funcionario func: listFunc){
            System.out.println(func.toString());
        }

    }
}