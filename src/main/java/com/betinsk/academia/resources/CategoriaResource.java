package com.betinsk.academia.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.betinsk.academia.domain.CategoriaMuscular;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	@GetMapping
	public List<CategoriaMuscular> listar() {
		
		CategoriaMuscular catM = new CategoriaMuscular(1, "Peito");
		CategoriaMuscular catM2 = new CategoriaMuscular(2, "Biceps");
		
		List<CategoriaMuscular> list = new ArrayList<>();
		list.add(catM);
		list.add(catM2);
	
		return list;
	}
	
}
