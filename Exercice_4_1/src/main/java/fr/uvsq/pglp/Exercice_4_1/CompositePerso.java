package fr.uvsq.pglp.Exercice_4_1;

import java.util.ArrayList;
import java.util.Collections;

public class CompositePerso implements PersonelsInter {
	
	private int IDgrp;
	private ArrayList<PersonelsInter> grpPerso=new ArrayList<PersonelsInter>();
	
	public ArrayList<PersonelsInter> gettab(){
		return (ArrayList<PersonelsInter>) Collections.unmodifiableList(this.grpPerso);
		
	}
	
	public CompositePerso(int IDgrp) {
		this.IDgrp=IDgrp;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("le Id du groupe est : "+this.IDgrp);
		for(PersonelsInter perso : grpPerso) {
			perso.print();
		}
	}
	
	public void add(PersonelsInter perso) {
		this.grpPerso.add(perso);
	}
	
	public void remove(Personnels perso) {
		this.grpPerso.remove(perso);
	}
	

}
