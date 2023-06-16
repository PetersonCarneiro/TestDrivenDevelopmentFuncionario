import lombok.Data;

import java.util.ArrayList;

@Data
public class Funcionario {
    private String nome;
    private String email;
    private double salario;
    private String cargo;
    private double salDesc;

    ArrayList<Funcionario> funcionariosList = new ArrayList<>();

    public Funcionario(String nome, String email, double salario, String cargo, double salDesc) {
        this.nome = nome;
        this.email = email;
        this.salario = salario;
        this.cargo = cargo;
        this.salDesc = salDesc;
    }

    public double verificaFunc(){
        if(cargo.equalsIgnoreCase("dev")){
            double salComDesc = salario-desenvolvedor();
            addFunc();
            return salComDesc;
        }
        if (cargo.equalsIgnoreCase("dba")){
            double salComDesc = salario-dba();
            addFunc();
            return salComDesc;
        }
        if (cargo.equalsIgnoreCase("test")){
            double salComDesc = salario-testador();
            addFunc();
            return salComDesc;
        }
        if (cargo.equalsIgnoreCase("Gerente")){
            double salComDesc = salario-gerente();
            addFunc();
            return salComDesc;
        }
        throw new RuntimeException("Nem uma das opções validas");
    }

    public double desenvolvedor(){
        if(salario<=3000){
            return salDesc=salario*10/100;
        }else{
            return salDesc=salario*20/100;
        }
    }
    public double dba(){
        if (salario<=2000){
            return salDesc=salario*15/100;
        }else {
            return salDesc=salario*25/100;
        }
    }
    public double testador(){
        if (salario<=2000){
            return salDesc=salario*15/100;
        }else {
            return salDesc=salario*25/100;
        }
    }
    public double gerente(){
        if (salario<=5000){
            return  salDesc=salario*20/100;
        }else {
            return salDesc=salario*30/100;
        }
    }

    public void addFunc(){
        Funcionario func = new Funcionario(nome,email,salario,cargo,salDesc);
        funcionariosList.add(func);

    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", salario=" + salario +
                ", cargo='" + cargo + '\'' +
                ", Desconto no Salário=" + salDesc +
                '}';
    }
}
