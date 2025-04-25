package br.senac.sp.livraria.model;

import br.senac.sp.livraria.enumeration.Escolaridade;
import br.senac.sp.livraria.enumeration.EstadoCivil;
import lombok.Data;

import java.util.Calendar;

@Data
public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private Calendar nascimento;
    private String telefone;
    private String email;
    private String endereco;
    private EstadoCivil estadoCivil;
    private Escolaridade escolaridade;
}
