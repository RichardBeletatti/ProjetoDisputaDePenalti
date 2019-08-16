package br.com.rbeletatti.com.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class MainDisputaPenalti {

	private static BufferedReader br;

	public static void main(String[] args) {

		System.out.println("======== Dados Time 1 ========");
		// Carregar Dados do Time 1
		try {
			br = new BufferedReader(new FileReader("C://Users/rbeletatti/Downloads/PlanilhaTime1.csv"));
			dadosDoTime();
			caracterTecnico();
			caracterGoleiro();
			caracterJogador();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("========= Dados Time 2 =========");
		// Carregar Dados do Time 2
		try {
			br = new BufferedReader(new FileReader("C://Users/rbeletatti/Downloads/PlanilhaTime2.csv"));
			dadosDoTime();
			caracterTecnico();
			caracterGoleiro();
			caracterJogador();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void caracterJogador() {
		String linha;
		try {
			System.out.println("Jogadores: ");

			while ((linha = br.readLine()) != null) {
				String[] caracterJogador = linha.split(",");
				String jogador = caracterJogador[0];

				System.out.println(jogador);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void dadosDoTime() {
		try {
			String linhaDaColuna = br.readLine();
			String parteDaPlanilha[] = linhaDaColuna.split(",");
			String nomeDoTime = parteDaPlanilha[0];

			System.out.println("Nome do Time: " + nomeDoTime + "\n");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void caracterGoleiro() {
		try {
			String linhaDaColuna = br.readLine();
			String parteDaPlanilha[] = linhaDaColuna.split(",");
			String nomeDoGoleiro = parteDaPlanilha[0];

			System.out.println("Nome do Goleiro Time: " + nomeDoGoleiro + "\n");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void caracterTecnico() {
		try {
			String linhaDaColuna = br.readLine();
			String parteDaPlanilha[] = linhaDaColuna.split(",");
			String nomeDoTecnicoPrimeiroTime = parteDaPlanilha[0];

			System.out.println("Nome do Técnico: " + nomeDoTecnicoPrimeiroTime + "\n");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}