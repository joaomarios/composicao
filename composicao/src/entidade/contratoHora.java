package entidade;

import java.util.Date;

public class contratoHora {
    private Date date;
    private Double valorPorHora;
    private Integer horas;

    public contratoHora() {
    }

    public contratoHora(Date data, Double valorPorHora, Integer horas) {
        this.date = data;
        this.valorPorHora = valorPorHora;
        this.horas = horas;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }
    public double valorTotal(){
        return valorPorHora * horas;
    }
}
