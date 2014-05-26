package br.ufpb.dce.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.ufpb.dce.model.Aluno;
import br.ufpb.dce.service.AlunoService;

public class AlunoCRUDTest {

	private AlunoService alunoService;

	@Before
	public void setUp() {
		alunoService = new AlunoService();
	}

	@Test
	public void verificaCadastroDeAlunoValido() {
		Aluno aluno = new Aluno();
		aluno.setMatricula("01");
		aluno.setNome("Fernando");
		aluno.setSobrenome("Oliveira");
		aluno.setDataNascimento("26/04/1991");
		alunoService.salvar(aluno);

		Aluno alunoCadastrado = this.alunoService.buscarAlunoPorMatricula("01");
		assertEquals(0, aluno.getVersao());
		assertEquals("01", alunoCadastrado.getMatricula());
		assertEquals("Fernando", aluno.getNome());
		assertEquals("Oliveira", aluno.getSobrenome());
		assertEquals("26/04/1991", aluno.getDataNascimento());
	}
}
