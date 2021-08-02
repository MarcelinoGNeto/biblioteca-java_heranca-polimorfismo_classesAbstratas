package entities;

public class PessoaFisica extends Contribuintes{
	
	private Double gastosSaude;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double valorImposto() {
		double imp = 0.0;
		double saude = 0.0;
		
		if (getRendaAnual() <= 20000) {
			 imp = getRendaAnual() * 0.15;	
		}
		else {
			imp = getRendaAnual() *0.25;
		}
		
		if (gastosSaude != 0) {
			saude = gastosSaude * 0.5;
		}
		else {
			saude = gastosSaude;
		}
		 
		return imp - saude;
		
	}

}
