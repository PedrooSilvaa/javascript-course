import java.text.DecimalFormat;

public class Teste {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("##.####");
		
		Professor bit = new Professor();
		bit.nome = "Bittencourt";
		System.out.println(bit.nome);
	
		Formacao f = new Formacao();
		f.ano = 2006;
		f.duracaoHr =100_000;
		f.titulo = "Tecnologia de Informoção";
		
		bit.escolaridade = f;
		//Tipo 2
		
		bit.escolaridade = new Formacao();
		bit.escolaridade.ano = 2006;
		bit.escolaridade.duracaoHr = 100_000;
		bit.escolaridade.titulo = "Tecnologia de Informoção";
		float valor = 3.1415f;
		String strFormatada = String.format("%.2f", valor);
		System.out.println(strFormatada);
		
	}
}