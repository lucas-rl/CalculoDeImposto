package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import pessoa.Pessoa;
import pessoa.tipo.PessoaFisica;
import pessoa.tipo.PessoaJuridica;

public class MainApp {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		pessoas.add(new PessoaFisica("Lucas", 100000.00, 1500.00));
		pessoas.add(new PessoaJuridica("EmpresaLucas", 1000000, 21));
		
		double totalTaxes = 0;
		for(Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getName() + ": R$" + pessoa.taxation());
			totalTaxes += pessoa.taxation();
		}
		
		System.out.println("Total taxex: R$" + totalTaxes);
		
	}
}
