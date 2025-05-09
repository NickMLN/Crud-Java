package br.senac.sp.livraria.model;

import br.senac.sp.livraria.enumeration.Escolaridade;
import br.senac.sp.livraria.enumeration.EstadoCivil;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Calendar;

@Data
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true, nullable = false)
    private String cpf;
    private String nome;
    private Calendar nascimento;
    private String telefone;
    private String email;
    private String endereco;
    @Column(columnDefinition = "TINYINT")
    private EstadoCivil estadoCivil;
    @Column(columnDefinition = "TINYINT")
    private Escolaridade escolaridade;
}
