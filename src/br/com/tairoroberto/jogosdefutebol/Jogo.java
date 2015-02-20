package br.com.tairoroberto.jogosdefutebol;

import java.math.BigDecimal;
import java.util.Date;

public class Jogo {
	
	private Date dataJogo;
	private String timeCasa;
	private Integer golTimeCasa;
	private String timeVisitante;
	private Integer golTimeVisitante;
	private BigDecimal valorArrecadado;
	
	
	public Date getDataJogo() {
		return dataJogo;
	}
	public void setDataJogo(Date dataJogo) {
		this.dataJogo = dataJogo;
	}
	public String getTimeCasa() {
		return timeCasa;
	}
	public void setTimeCasa(String timeCasa) {
		this.timeCasa = timeCasa;
	}
	public Integer getGolTimeCasa() {
		return golTimeCasa;
	}
	public void setGolTimeCasa(Integer golTimeCasa) {
		this.golTimeCasa = golTimeCasa;
	}
	public String getTimeVisitante() {
		return timeVisitante;
	}
	public void setTimeVisitante(String timeVisitante) {
		this.timeVisitante = timeVisitante;
	}
	public Integer getGolTimeVisitante() {
		return golTimeVisitante;
	}
	public void setGolTimeVisitante(Integer golTimeVisitante) {
		this.golTimeVisitante = golTimeVisitante;
	}
	public BigDecimal getValorArrecadado() {
		return valorArrecadado;
	}
	public void setValorArrecadado(BigDecimal valorArrecadado) {
		this.valorArrecadado = valorArrecadado;
	}
	
}
