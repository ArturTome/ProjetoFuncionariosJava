package br.ifpe.funcionarios.model;

import org.springframework.jdbc.core.simple.JdbcClient;

public class FuncionarioDAO {
    private final JdbcClient JdbcClient;

    public FuncionarioDAO(JdbcClient JdbcClient){
        this.JdbcClient = JdbcClient;
    }

    public Integer create(Funcionarios Funcionarios){
        JdbcClient.sql("insert into aluno(codigo,nome,idade,email,cargo,salario,endereco) values(:codigo,:nome,:idade,:email,:cargo,:salario,:endereco_id)").param("codigo",Funcionarios.getCodigo()).param("nome",Funcionarios.getNome()).param("idade",Funcionarios.getIdade()).param("email",Funcionarios.getEmail()).param("cargo",Funcionarios.getCargo()).param("salario",Funcionarios.getSalario()).param("endereco_id",Funcionarios.getEndereco()).update();
    }
}
