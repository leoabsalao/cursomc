package com.leonardoabsalao.cursomc.services;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.leonardoabsalao.cursomc.domain.Categoria;
import com.leonardoabsalao.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaServices {

    @Autowired
	private CategoriaRepository repo;
    
    //Fazendo uma busca no banco pelo seu Id.
    public Categoria buscar(Integer id) {
    	Optional<Categoria> obj = repo.findById(id);
    	return obj.orElseThrow(() -> new ObjectNotFoundException(
    			"Objeto não encontrado! Id: "+id+", Tipo:"+Categoria.class.getName(), null));
    	}
    	
}
