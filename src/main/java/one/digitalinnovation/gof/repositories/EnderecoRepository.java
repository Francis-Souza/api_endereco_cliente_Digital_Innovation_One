package one.digitalinnovation.gof.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import one.digitalinnovation.gof.model.Endereco;


public interface EnderecoRepository extends JpaRepository<Endereco, String> {

}