package br.ufpb.dce.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.ufpb.dce.model.Aluno;

public class PrimeiroTeste {
	
	private Aluno aluno;

	@Test
	public void cadastrarAluno() {
		Aluno aluno1 = new Aluno();
		aluno1.setNome("André");
		aluno1.setCpf("12345678911");
		aluno1.setSobrenome("Nogueira Lemos");
		aluno1.setDataNascimento("25/04/90");
		assertEquals("André", aluno1.getNome());
		assertEquals("12345678911", aluno1.getCpf());
		assertEquals("Nogueira Lemos", aluno1.getSobrenome());
		assertEquals("25/04/90", aluno1.getDataNascimento());
		assertEquals(1, aluno1.getId());
	}
	

}
