package br.com.arthurdev21.service;

import java.math.BigDecimal;

import br.com.arthurdev21.modelo.Funcionario;





public class ReajusteService {

	public BigDecimal adcionarReajuste(Funcionario funcionario , ReajusteBonusEnum reajuste) {
		BigDecimal resultado= new BigDecimal("0");
		if(reajuste == ReajusteBonusEnum.DESEMPENHO_A_DESEJAR) {
		  resultado =	funcionario.getSalario().multiply(new BigDecimal("0.03"));
		}
		return resultado;
	}
   
	
}
