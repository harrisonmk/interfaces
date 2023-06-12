package projeto;


import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import modelo.AluguelCarro;
import modelo.Veiculo;
import servicos.AluguelServico;
import servicos.TaxaServicoBrasil;

public class Main {

    public static void main(String[] args) {

         DecimalFormat deci = new DecimalFormat("0.00");
         DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
         Scanner scan = new Scanner(System.in);
            
            
            System.out.println("Entre com os dados do aluguel");
            System.out.print("Modelo do carro: ");
            String carroModelo = scan.nextLine();
            System.out.println("Retirada (dd/MM/yyyy hh:mm): ");
            LocalDateTime comecar = LocalDateTime.parse(scan.nextLine(), fmt); // converte o tipo lido para Data e formata
            System.out.println("Retorno (dd/MM/yyyy hh:mm): ");
            LocalDateTime finalizar = LocalDateTime.parse(scan.nextLine(), fmt); // converte o tipo lido para Data e formata
            
            AluguelCarro cr = new AluguelCarro(comecar, finalizar, new Veiculo(carroModelo));
            
            System.out.print("Entre com o preço por hora: ");
            double precoPorHora = scan.nextDouble();
            System.out.print("Entre com o preço por dia: ");
            double precoPorDia = scan.nextDouble();
            
            AluguelServico rentalService = new AluguelServico(precoPorHora, precoPorDia, new TaxaServicoBrasil());
            rentalService.processoFatura(cr);
            
            
            System.out.println("Fatura: ");
            System.out.println("Pagamento Basico: " + deci.format(cr.getFatura().getPagamentoBasico()));
            System.out.println("Imposto: " + deci.format(cr.getFatura().getTaxa()));
            System.out.println("Pagamento Total: " + deci.format(cr.getFatura().getPagamentoTotal()));
        
    }

}
