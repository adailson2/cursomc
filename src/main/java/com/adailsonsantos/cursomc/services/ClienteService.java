package com.adailsonsantos.cursomc.services;

import com.adailsonsantos.cursomc.domain.Cliente;
import com.adailsonsantos.cursomc.repositories.ClienteRepository;
import com.adailsonsantos.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Cliente obj = repo.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id 
					+ ", Tipo: " + Cliente.class.getName());
		}
		return obj;
	}
}
