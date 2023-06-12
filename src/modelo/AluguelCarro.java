
package modelo;

import java.time.LocalDateTime;


public class AluguelCarro {
    
    private LocalDateTime comecar;
    private LocalDateTime finalizar;

    private Veiculo veiculo;
    private Fatura fatura;

    
    
    
    public AluguelCarro(LocalDateTime comecar, LocalDateTime finalizar, Veiculo veiculo) {
        this.comecar = comecar;
        this.finalizar = finalizar;
        this.veiculo = veiculo;
        
    }
    
    

    public AluguelCarro() {
    }

    
    
    public LocalDateTime getComecar() {
        return comecar;
    }

    public void setComecar(LocalDateTime comecar) {
        this.comecar = comecar;
    }

    public LocalDateTime getFinalizar() {
        return finalizar;
    }

    public void setFinalizar(LocalDateTime finalizar) {
        this.finalizar = finalizar;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }
    
    
    
    
    
}
