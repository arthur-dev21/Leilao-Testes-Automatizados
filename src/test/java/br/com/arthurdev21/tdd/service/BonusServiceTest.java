package br.com.arthurdev21.tdd.service;



import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.arthurdev21.modelo.Funcionario;
import br.com.arthurdev21.service.BonusService;





class BonusServiceTest {

	@Test
	public void bonusDeveriaSerZeroParaFuncionarioComSalarioCaimaDeMil() {
		BonusService bonus = new BonusService();
		Funcionario fun1 = new Funcionario("fulano", LocalDate.now(),new BigDecimal("25000"));
		BigDecimal resultado = bonus.calcularBonus(fun1);
		
		assertEquals(BigDecimal.ZERO, resultado);
	}
	
	@Test
	public void bonusDeveriaSerDezPorCentoDoFuncionario() {
		BonusService bonus = new BonusService();
		Funcionario fun1 = new Funcionario("fulano", LocalDate.now(),new BigDecimal("2500"));
		BigDecimal resultado = bonus.calcularBonus(fun1);
		
		assertEquals(new BigDecimal("250.0"), resultado);
	}
	
	
	@Test
	public void bonus() {
		BonusService bonus = new BonusService();
		Funcionario fun1 = new Funcionario("fulano", LocalDate.now(),new BigDecimal("1000"));
		BigDecimal resultado = bonus.calcularBonus(fun1);
		
		assertEquals(new BigDecimal("100.0"), resultado);
	}


}
