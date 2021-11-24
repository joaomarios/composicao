package composicao;

import entidade.contratoHora;
import entidade.departamento;
import entidade.trabalhador;
import entidade_enum.nivelTrabalhdor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class prog {

    public static void main(String[] args) throws ParseException {

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("ENTRE COM O NOME DO DEPARTAMETO:");
        String nomeDepartamento = scan.nextLine();
        System.out.println("ENTRE COM OS DADOS DO TRABALHADOR:");
        System.out.print("NOME:");
        String nomeTrabalhador = scan.nextLine();
        System.out.println("ENTRE COM O NIVEL DO TRABALHADOR:");
        System.out.print("<JUNIOR> <MEDIO> <SENIOR>");
        String niveTrabalhdor = scan.nextLine();
        System.out.print("ENTRE COM O SALARIO BASE:");
        double salarioBase = scan.nextDouble();
         System.out.println("QUANTOS CONTRATO PARA ESSE TRABALHADOR TEM:");
        int n = scan.nextInt();
        trabalhador t1 = new trabalhador(nomeTrabalhador, nivelTrabalhdor.valueOf(niveTrabalhdor), salarioBase, new departamento(nomeDepartamento));

        for (int i =1; i <= n; i++) {
            System.out.println("ENTRE  COM O CONTRATO Nº:" + i);
            System.out.print("dd/MM/YYY: ");
            Date contractDate = sdf.parse(scan.next());
             System.out.print("VALOR POR HORA: ");
            double valorPHora = scan.nextDouble();
            System.out.print("DURAÇAO DO CONTRATO(HORAS) :");
            int hora = scan.nextInt();
            contratoHora contrat = new contratoHora(contractDate, valorPHora, hora);
            t1.addContrato(contrat);
        }
        System.out.println();
        System.out.print("ENTRE COM O MES E ANO PARA CALCULAR O SALARIO(MM/YYYY)");
        String mesEano = scan.next();
        int mes = Integer.parseInt(mesEano.substring(0, 2));
        int ano = Integer.parseInt(mesEano.substring(3,7));
        System.out.println("NOME: " + t1.getNome());
        System.out.println("nivel trabalhador :"+t1.getNivel());
        System.out.println("DEPARTAMENTO: " + t1.getDepartamento().getNome());
        System.out.println(" mes : " + mesEano);       
        System.out.println("ganhou R$:"+ t1.renda(ano, mes));
        scan.close();
    }

}
