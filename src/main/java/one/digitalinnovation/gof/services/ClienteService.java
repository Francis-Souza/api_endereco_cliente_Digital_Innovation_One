package one.digitalinnovation.gof.services;

import java.util.List;

import one.digitalinnovation.gof.model.Cliente;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente. Com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma
 * interface.
 * 
 */
public interface ClienteService {

	public List<Cliente>findAll();

	public Cliente findById(Long id);

	void insert(Cliente cliente);

	void update(Long id, Cliente cliente);

	void deleteById(Long id);

}
