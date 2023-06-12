package servicos;

import java.time.Duration;
import modelo.AluguelCarro;
import modelo.Fatura;

public class AluguelServico {

    private Double precoPorHora;
    private Double precoPorDia;

    private TaxaServico taxaServico;

    
    
    public AluguelServico(Double precoPorHora, Double precoPorDia, TaxaServico taxaServico) {
        this.precoPorHora = precoPorHora;
        this.precoPorDia = precoPorDia;
        this.taxaServico = taxaServico;
    }

    
    
    public void processoFatura(AluguelCarro aluguelCarro) {

        double minutos = Duration.between(aluguelCarro.getComecar(), aluguelCarro.getFinalizar()).toMinutes();
        double horas = minutos / 60.0;

        double pagamentoBasico;

        if (horas <= 12.0) {
            //Math.ceil é usado para arredondar um número para cima, ou seja, para o próximo número inteiro maior ou igual ao valor fornecido
            pagamentoBasico = precoPorHora * Math.ceil(horas);
        } else {
            pagamentoBasico = precoPorDia * Math.ceil(horas / 24);
        }

        double tax = taxaServico.taxa(pagamentoBasico);

        aluguelCarro.setFatura(new Fatura(pagamentoBasico, tax));

    }

    
    
}
