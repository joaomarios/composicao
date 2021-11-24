package entidade;

import entidade_enum.nivelTrabalhdor;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class trabalhador {

    private String nome;
    private nivelTrabalhdor nivel;
    private Double salarioBase;

    private departamento departamento;
    private List<contratoHora> contrato = new ArrayList<>();

    public trabalhador() {
    }

    public trabalhador(String nome, nivelTrabalhdor nivel, Double salarioBase, departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public nivelTrabalhdor getNivel() {
        return nivel;
    }

    public void setNivel(nivelTrabalhdor nivel) {
        this.nivel = nivel;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(departamento departamento) {
        this.departamento = departamento;
    }

    public List<contratoHora> getContrato() {
        return contrato;
    }

    public void addContrato(contratoHora contract) {
        contrato.add(contract);
    }

    public void removeContract(contratoHora contract) {
        contrato.remove(contract);
    }

    public double renda(int ano, int mes) {
        double soma = salarioBase;
        Calendar cal = Calendar.getInstance();
        for (contratoHora contrato : contrato) {
            cal.setTime(contrato.getDate());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes= 1 + cal.get(Calendar.MONTH);
            if (ano == c_ano && mes == c_mes) {
                soma += contrato.valorTotal();
            }

        }
        return soma;
    }
}
