package Models;

public class Emprestimo {
	public String NomeUsuario;
	public int Idade;
	
	public float PercentualJurosMes;
	public int MesesParaPagar;
	public float ValorEmprestimoInicial;
	
	private float ValorPagamentoFinal;
	public float getValorPagamentoFinal() {
		return ValorPagamentoFinal;
	}
	public void setValorPagamentoFinal() {
		
		if(this.Idade != 0) {
			if(this.ValorEmprestimoInicial != 0) {
				
				if(this.PercentualJurosMes != 0) {
					
					if(this.MesesParaPagar != 0) {
						
						if(this.Idade >= 18 & this.Idade <= 23) {
							this.ValorPagamentoFinal = this.ValorEmprestimoInicial + (this.ValorEmprestimoInicial/this.MesesParaPagar) * this.PercentualJurosMes;
						}else if(this.Idade > 23 & this.Idade <= 33) {
							this.ValorPagamentoFinal = this.ValorEmprestimoInicial + (this.ValorEmprestimoInicial * 10)/100;
						}else {
							this.ValorPagamentoFinal = 0;
							System.out.println("Idade deve estar entre 18 e 33 anos");
						}
						
					}else {
						this.ValorPagamentoFinal = 0;
						System.out.println("Meses para pagar do empréstimo deve ser maior que 0");
						
					}
					
					
				}else {
					this.ValorPagamentoFinal = 0;
					System.out.println("Percentual do juros do empréstimo deve ser maior que 0");
					
				}
				
				
			}else {
				this.ValorPagamentoFinal = 0;
				System.out.println("Valor inicial do empréstimo deve ser maior que 0");
				
			}
			
			
			
			
		}else {
			this.ValorPagamentoFinal = 0;
			System.out.println("Idade deve estar entre 18 e 33 anos");
		}
		
		

	}
	
}
