package br.com.arthurdev21.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.arthurdev21.modelo.Funcionario;
import br.com.arthurdev21.service.ReajusteBonusEnum;
import br.com.arthurdev21.service.ReajusteService;





public class ReajusteServiceTest {
    
	@Test
	public void reajusteDeveriaSerDeTresPorCentoQuandoODesempnhoFOrADesejar() {
		ReajusteService reajuste = new ReajusteService();
	    BigDecimal resultado = 	reajuste.adcionarReajuste(new Funcionario("arthur", LocalDate.now(), new BigDecimal("900")), ReajusteBonusEnum.DESEMPENHO_A_DESEJAR);
		
		
		assertEquals("27", resultado);
		
	}
}
