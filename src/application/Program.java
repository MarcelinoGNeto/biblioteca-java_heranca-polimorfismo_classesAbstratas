package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuintes;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Contribuintes> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual of company (i/c)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Anual Income: ");
			double rendaAnual = sc.nextDouble();
			
			if (ch == 'i') {
				
				System.out.print("Health expenditures: ");
				double gastosSaude = sc.nextDouble();
				
				list.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			}
			else {
				System.out.print("Number of employees: ");
				int numEmpregados = sc.nextInt();
				
				list.add(new PessoaJuridica(nome, rendaAnual, numEmpregados));
			}
			
		}
		System.out.println();
		System.out.println("TAXES PAID:");
		for (Contribuintes cont : list) {
			System.out.println(cont);
			
			
		}
		
		System.out.println();
		double sum = 0.0;
		for (Contribuintes cont : list) {
			sum += cont.valorImposto();
		}
		System.out.printf("TOTAL TAXES: $ %.2f", sum);
		
	
		sc.close();
	}

}
