package br.com.arthurdev21.service;

import java.math.BigDecimal;

import br.com.arthurdev21.modelo.Funcionario;



public class BonusService {

	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			valor = BigDecimal.ZERO;
		}
		return valor;
	}
     /*
      * cenario 1 -> se o salario do funcionario passar de 1000 reais devera retornar 0*/
}
