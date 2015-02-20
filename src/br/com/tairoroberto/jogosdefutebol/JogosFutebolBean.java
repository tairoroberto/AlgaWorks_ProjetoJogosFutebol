package br.com.tairoroberto.jogosdefutebol;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class JogosFutebolBean {
	
	private Jogo jogo = new Jogo();
	private List<Jogo> jogos = new ArrayList<Jogo>();
	
	public void incluir() {
		this.jogos.add(this.jogo);//add to list
		this.jogo = new Jogo();//clear  window
	}

	public Jogo getJogo() {
		return this.jogo;
	}

	public List<Jogo> getJogos() {
		return this.jogos;
	}	
}
