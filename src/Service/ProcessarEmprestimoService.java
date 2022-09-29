package Service;
import Models.*;
import java.text.NumberFormat;
public class ProcessarEmprestimoService {
	
	
	public void Imprimir(Emprestimo emprestimo) {
		
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		
		String valorInicial = formatter.format(emprestimo.ValorEmprestimoInicial);
		String valorTotalPagar = formatter.format(emprestimo.getValorPagamentoFinal());
		
		
		
		
		
		if(!(emprestimo == null)) {
			System.out.println("-----------------DADOS EMPRESTIMO-----------------------");
			System.out.println("Nome: " + emprestimo.NomeUsuario.toString());
			System.out.println("Idade: " +String.valueOf(emprestimo.Idade));
			System.out.println("Valor Inicial: " + valorInicial );
			System.out.println("% Juros/Mes: " +String.valueOf(emprestimo.PercentualJurosMes));
			System.out.println("Quantidade Meses: " +String.valueOf(emprestimo.MesesParaPagar));
			System.out.println("Valor Total Pagar: " + valorTotalPagar);
			System.out.println("--------------------------------------------------------");
		}else {
			System.out.println("Emprestimo não deve ser null");
		}
		
		
	}
	
	public void CalcularEmprestimo(Emprestimo emprestimo) {
		
		emprestimo.setValorPagamentoFinal();
		
	}
	
	
	
}
