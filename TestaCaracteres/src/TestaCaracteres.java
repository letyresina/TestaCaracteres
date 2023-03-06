
public class TestaCaracteres {

	public static void main(String[] args) {
		char letra = 'a'; //usa aspas simples neste caso
		System.out.println(letra);
		//Se você trabalha com char, é exclusivamente UMA letra, como UNICODE. 
		char valor = 66; //você pode trabalhar com números aqui, mais que letras. 
		//char é um número, ele converte em em letra para uma letra, como exemplo abaixo:
		System.out.println(valor); //retorna B, justamente pela conversão que ele fez.
		//um char cabe num inteiro, mas um inteiro não cabe num char. É necessário um casting
		valor = (char) (valor + 1);
		System.out.println(valor);
		//Não é muito utilizado o Char. 
		
		//o mais utilizado é String (com maiúscula!!!)
		String palavra = "Estudante de Tecnologia";
		System.out.println(palavra);
		
		//String + qualquer coisa (esse qualquer coisa é CONVERTIDO), ele não é primitivo
		
		String concatenacao = "Copa do Brasil ";
		
		concatenacao = concatenacao + 2014;
		
		System.out.println(concatenacao);
		
		//Testando código da atividade
		
		String parcela1 = "10";
		String parcela2 = "20";
		
		System.out.println(parcela1 + parcela2);
		
		//Continuação da segunda aula aqui embaixo
		
		/*Atalho para complementar automaticamente o String[] args main -> escreve main,
		 aperta ctrl + espaço e logo em seguida aperta enter*/
		
		int primeiro = 5;
		int segundo = 7;
		
		System.out.println(segundo);
		
		segundo = primeiro; //um recebe o outro
		primeiro = 10;
		System.out.println(segundo); //retorna o 5, mesmo dps de colocar o valor dps, uma vez que é
		//um valor por vez.
		
		//Testando para a atividade
		String saudacao = "Olá, meu nome é ";
		String nome = "Rômulo ";
		String continuacao = "e minha idade é ";
		int idade = 100;
		System.out.println(saudacao+nome+continuacao+idade);
		//É possível concatenar int com string sem problemas.
	}
}
