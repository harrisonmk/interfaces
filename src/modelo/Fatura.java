
package modelo;


public class Fatura {
    
   private Double pagamentoBasico;
   private Double taxa;

   
   
   
    public Fatura(Double pagamentoBasico, Double taxa) {
        this.pagamentoBasico = pagamentoBasico;
        this.taxa = taxa;
    }

    
    
    public Fatura() {
    }

    
    
    public Double getPagamentoBasico() {
        return pagamentoBasico;
    }

    public void setPagamentoBasico(Double pagamentoBasico) {
        this.pagamentoBasico = pagamentoBasico;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }
   
   
   
    public Double getPagamentoTotal(){
        
     return this.getPagamentoBasico() + this.getTaxa();   
        
        
    }
    
    
}
