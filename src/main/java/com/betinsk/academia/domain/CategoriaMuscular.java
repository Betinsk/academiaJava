package com.betinsk.academia.domain;

import java.io.Serializable;
import java.util.Objects;

public class CategoriaMuscular implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String grupoMuscular;
	
	public CategoriaMuscular() {
		
	}

	public CategoriaMuscular(Integer id, String grupoMuscular) {
		super();
		this.id = id;
		this.grupoMuscular = grupoMuscular;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGrupoMuscular() {
		return grupoMuscular;
	}

	public void setGrupoMuscular(String grupoMuscular) {
		this.grupoMuscular = grupoMuscular;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CategoriaMuscular other = (CategoriaMuscular) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
