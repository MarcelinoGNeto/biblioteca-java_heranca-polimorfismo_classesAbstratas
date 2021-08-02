package entities;

public class PessoaJuridica extends Contribuintes{
	
	private Integer numEmpregados;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String nome, Double rendaAnual, Integer numEmpregados) {
		super(nome, rendaAnual);
		this.numEmpregados = numEmpregados;
	}

	public Integer getNumEmpregados() {
		return numEmpregados;
	}

	public void setNumEmpregados(Integer numEmpregados) {
		this.numEmpregados = numEmpregados;
	}

	@Override
	public double valorImposto() {
		double imp = 0.0;
		if (numEmpregados <= 10) {
			imp = 0.16;
			}
			else {
				imp = 0.14;
			}
		
		return getRendaAnual() * imp;
	}

}
