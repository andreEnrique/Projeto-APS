package br.ufpb.dce.service;

import java.util.ArrayList;
import java.util.List;

import br.ufpb.dce.model.Aluno;

public class AlunoService {
	
	private List<Aluno> alunos;
	
	public AlunoService(){
		alunos = new ArrayList<Aluno>();
	}

	public void salvar(Aluno aluno) {
		this.alunos.add(aluno);
	}

	public Aluno buscarAlunoPorMatricula(String matricula) {
		for(Aluno aluno : this.alunos){
			if(aluno.getMatricula().equals(matricula)){
				return aluno;
			}
		}
		return null;
	}

}
