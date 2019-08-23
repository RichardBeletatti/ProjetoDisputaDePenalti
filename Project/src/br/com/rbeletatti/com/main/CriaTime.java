package br.com.rbeletatti.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.rbeletatti.com.jogadores.Atacante;
import br.com.rbeletatti.com.jogadores.Goleiro;
import br.com.rbeletatti.com.jogadores.Jogador;
import br.com.rbeletatti.com.jogadores.Lateral;
import br.com.rbeletatti.com.jogadores.MeioCampo;
import br.com.rbeletatti.com.jogadores.Volante;
import br.com.rbeletatti.com.jogadores.Zagueiro;
import br.com.rbeletatti.comissaotecnica.Tecnico;

public class CriaTime {

	protected static BufferedReader br;

	protected static String nomeDoTime() {
		String nomeDoTime = null;

		try {
			String linhaDaColuna = br.readLine();
			String parteDaPlanilha[] = linhaDaColuna.split(",");
			nomeDoTime = parteDaPlanilha[0];

			System.out.println("Nome do Time: " + nomeDoTime + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return nomeDoTime;
	}

	protected static List<Jogador> criaJogadores() {

		List<Jogador> jogadores = new ArrayList<>();
		System.out.println("Jogadores: ");
		// Grand Saker
		try {
			String linha = br.readLine();
			System.out.println(linha);
			String[] caracterJogador = linha.split(",");
			String jogador = caracterJogador[0];
			Integer idade = Integer.valueOf(caracterJogador[1]);
			Integer camisa = Integer.valueOf(caracterJogador[2]);
			Integer ataque = Integer.valueOf(caracterJogador[3]);
			Integer defesa = Integer.valueOf(caracterJogador[4]);
			Zagueiro zagueiro = new Zagueiro(jogador, idade, camisa, ataque, defesa);

			linha = br.readLine();
			System.out.println(linha);
			caracterJogador = linha.split(",");
			jogador = caracterJogador[0];
			idade = Integer.valueOf(caracterJogador[1]);
			camisa = Integer.valueOf(caracterJogador[2]);
			ataque = Integer.valueOf(caracterJogador[3]);
			defesa = Integer.valueOf(caracterJogador[4]);
			Zagueiro zagueiro2 = new Zagueiro(jogador, idade, camisa, ataque, defesa);

			// Criando Lateral
			linha = br.readLine();
			System.out.println(linha);
			caracterJogador = linha.split(",");
			jogador = caracterJogador[0];
			idade = Integer.valueOf(caracterJogador[1]);
			camisa = Integer.valueOf(caracterJogador[2]);
			ataque = Integer.valueOf(caracterJogador[3]);
			defesa = Integer.valueOf(caracterJogador[4]);

			Lateral lateral = new Lateral(jogador, idade, camisa, ataque, defesa);

			linha = br.readLine();
			System.out.println(linha);
			caracterJogador = linha.split(",");
			jogador = caracterJogador[0];
			idade = Integer.valueOf(caracterJogador[1]);
			camisa = Integer.valueOf(caracterJogador[2]);
			ataque = Integer.valueOf(caracterJogador[3]);
			defesa = Integer.valueOf(caracterJogador[4]);

			Lateral lateral2 = new Lateral(jogador, idade, camisa, ataque, defesa);

			// Grand Valiant
			linha = br.readLine();
			System.out.println(linha);
			caracterJogador = linha.split(",");
			jogador = caracterJogador[0];
			idade = Integer.valueOf(caracterJogador[1]);
			camisa = Integer.valueOf(caracterJogador[2]);
			ataque = Integer.valueOf(caracterJogador[3]);
			defesa = Integer.valueOf(caracterJogador[4]);

			Volante volante = new Volante(jogador, idade, camisa, ataque, defesa);

			linha = br.readLine();
			System.out.println(linha);
			caracterJogador = linha.split(",");
			jogador = caracterJogador[0];
			idade = Integer.valueOf(caracterJogador[1]);
			camisa = Integer.valueOf(caracterJogador[2]);
			ataque = Integer.valueOf(caracterJogador[3]);
			defesa = Integer.valueOf(caracterJogador[4]);

			Volante volante2 = new Volante(jogador, idade, camisa, ataque, defesa);

			// Grand Memo Camp
			linha = br.readLine();
			System.out.println(linha);
			caracterJogador = linha.split(",");
			jogador = caracterJogador[0];
			idade = Integer.valueOf(caracterJogador[1]);
			camisa = Integer.valueOf(caracterJogador[2]);
			ataque = Integer.valueOf(caracterJogador[3]);
			defesa = Integer.valueOf(caracterJogador[4]);

			MeioCampo meioCampo = new MeioCampo(jogador, idade, camisa, ataque, defesa);

			linha = br.readLine();
			System.out.println(linha);
			caracterJogador = linha.split(",");
			jogador = caracterJogador[0];
			idade = Integer.valueOf(caracterJogador[1]);
			camisa = Integer.valueOf(caracterJogador[2]);
			ataque = Integer.valueOf(caracterJogador[3]);
			defesa = Integer.valueOf(caracterJogador[4]);

			MeioCampo meioCampo2 = new MeioCampo(jogador, idade, camisa, ataque, defesa);

			// Grand Atacante
			linha = br.readLine();
			System.out.println(linha);
			caracterJogador = linha.split(",");
			jogador = caracterJogador[0];
			idade = Integer.valueOf(caracterJogador[1]);
			camisa = Integer.valueOf(caracterJogador[2]);
			ataque = Integer.valueOf(caracterJogador[3]);
			defesa = Integer.valueOf(caracterJogador[4]);

			Atacante atacante = new Atacante(jogador, idade, camisa, ataque, defesa);

			linha = br.readLine();
			System.out.println(linha);
			caracterJogador = linha.split(",");
			jogador = caracterJogador[0];
			idade = Integer.valueOf(caracterJogador[1]);
			camisa = Integer.valueOf(caracterJogador[2]);
			ataque = Integer.valueOf(caracterJogador[3]);
			defesa = Integer.valueOf(caracterJogador[4]);

			Atacante atacante2 = new Atacante(jogador, idade, camisa, ataque, defesa);

			// Listened Players

			jogadores.add(atacante);
			jogadores.add(atacante2);
			jogadores.add(meioCampo);
			jogadores.add(meioCampo2);
			jogadores.add(volante);
			jogadores.add(volante2);
			jogadores.add(lateral);
			jogadores.add(lateral2);
			jogadores.add(zagueiro);
			jogadores.add(zagueiro2);

		} catch (IOException e) {
			e.printStackTrace();
		}
		return jogadores;
	}

	protected static Goleiro criacaoDoGoleiro() {

		Goleiro goleiro = null;

		try {
			String linhaDaColuna = br.readLine();
			String parteDaPlanilha[] = linhaDaColuna.split(",");
			String nomeDoGoleiro = parteDaPlanilha[0];
			Integer idade = Integer.valueOf(parteDaPlanilha[1]);
			Integer camisa = Integer.valueOf(parteDaPlanilha[2]);
			Integer ataque = Integer.valueOf(parteDaPlanilha[3]);
			Integer defesa = Integer.valueOf(parteDaPlanilha[4]);

			System.out.println("Nome do Goleiro: " + nomeDoGoleiro + "\n");

			goleiro = new Goleiro(nomeDoGoleiro, idade, camisa, ataque, defesa);

		} catch (IOException e) {
			e.printStackTrace();
		}
		return goleiro;
	}

	protected static Tecnico criacaoDoTecnico() {

		Tecnico tecnico = new Tecnico();

		try {
			String linhaDaColuna = (String) br.readLine();
			String parteDaPlanilha[] = linhaDaColuna.split(",");
			String nomeDoTecnicoPrimeiroTime = parteDaPlanilha[0];

			System.out.println("Nome do Técnico: " + nomeDoTecnicoPrimeiroTime + "\n");

		} catch (IOException e) {
			e.printStackTrace();
		}
		return tecnico;
	}
}
