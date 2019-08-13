package br.com.rbeletatti.rodada;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.rbeletatti.com.jogadores.Atacante;
import br.com.rbeletatti.com.jogadores.Goleiro;
import br.com.rbeletatti.com.jogadores.Jogador;
import br.com.rbeletatti.com.jogadores.Lateral;
import br.com.rbeletatti.com.jogadores.MeioCampo;
import br.com.rbeletatti.com.jogadores.Volante;
import br.com.rbeletatti.com.jogadores.Zagueiro;
import br.com.rbeletatti.comissaotecnica.Tecnico;

public class RodadaTest {

	@Test
	public void batidaTest() {
		Rodada rodada = new Rodada();
		MeioCampo batedor = new MeioCampo("Pedrinho", 21, 28, 80, 40);
		Goleiro goleiro = new Goleiro("Sidão", 34, 12, 68, 75);

		boolean resultado = rodada.batida(batedor, goleiro);

		assertEquals(true, resultado);
	}

	@Test
	public void defesaTest() {
		Rodada rodada = new Rodada();
		MeioCampo batedor = new MeioCampo("Pedrinho", 21, 28, 80, 40);
		Goleiro goleiro = new Goleiro("Cassio", 32, 12, 70, 85);

		boolean resultado = rodada.batida(batedor, goleiro);

		assertEquals(false, resultado);
	}

	@Test
	public void melhoresJogadoresIndiceTest() {
		Rodada rodada = new Rodada();
		Tecnico tecnico = new Tecnico();
		Goleiro goleiro = new Goleiro("Cassio", 32, 12, 70, 85);
		Zagueiro zagueiro = new Zagueiro("Manoel", 32, 13, 65, 73);
		Lateral lateral = new Lateral("Avelar", 25, 20, 68, 70);
		Volante volante = new Volante("Urso", 28, 19, 73, 62);
		MeioCampo meiocampo = new MeioCampo("Pedrinho", 21, 28, 80, 40);
		Atacante atacante = new Atacante("Gustavo", 25, 19, 87, 45);

		List<Jogador> jogadores = new ArrayList<>();

		jogadores.add(atacante);
		jogadores.add(meiocampo);
		jogadores.add(volante);
		jogadores.add(lateral);
		jogadores.add(zagueiro);

		Time time = new Time("Corinthians", jogadores, tecnico, goleiro);

		Jogador resultado = rodada.getMelhorJogadorPorIndice(0, time);

		assertEquals(atacante, resultado);
	}
}
