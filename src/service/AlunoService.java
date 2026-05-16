package service;
import entity.Aluno;
import repository.AlunoRepository;

import java.util.HashMap;
import java.util.Map;

public class AlunoService {

    AlunoRepository repository = new AlunoRepository();

    public void validarMatricula(int id, String nome, int matricula) {
        HashMap<Integer, Aluno> listaAluno = repository.getListaAluno();
        for (Aluno alunoSalvo : listaAluno.values()){
            if (alunoSalvo.getMatricula() == matricula){

                throw new IllegalArgumentException("Erro! Essa matrícula já existe.");
            }
        }
    }
}
