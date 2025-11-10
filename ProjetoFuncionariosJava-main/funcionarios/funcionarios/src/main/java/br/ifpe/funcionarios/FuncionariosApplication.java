package br.ifpe.funcionarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"br.ifpe.funcionarios", "br.ifpe.funcionarios.model"})
public class FuncionariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(FuncionariosApplication.class, args);
	}

}
