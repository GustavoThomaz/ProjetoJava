package Projeto;
import java.util.Scanner;
public class Filmes extends Midia {
	
	private String duracao;

	public Filmes(String titulo, String genero, String autor, String sinopse, float nota, int ano, String duracao) {
		super(titulo, genero, autor, sinopse, nota, ano);
		this.duracao = duracao;
	}
	
	@Override
	public void imprime() {
		System.out.println("\tInforma��es");
		System.out.println("t�tulo: "+getTitulo()+"\nSinopse: "+getSinopse());
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
	
	
}
