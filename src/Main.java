import Models.*;
import Service.*;


public class Main {

	public static void main(String[] args) {
		Emprestimo emp = new Emprestimo();
		emp.ValorEmprestimoInicial = 1000;
		emp.Idade = 24;
		emp.MesesParaPagar = 12;
		emp.NomeUsuario = "Gabriel Bastos da Silva";
		emp.PercentualJurosMes = 0.1f;
		
		ProcessarEmprestimoService service = new ProcessarEmprestimoService();
		service.CalcularEmprestimo(emp);
		
		if(emp.getValorPagamentoFinal() != 0) {
			service.Imprimir(emp);
		}
		
	}

}
