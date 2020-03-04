package fr.uvsq.pglp.Exercice_4_1;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Personnels implements PersonelsInter {
	/**
	 * parametre obligatoire
	 */
	private final String nom;
	private final String prenom;
	
	/**
	 * parametre optionel
	 */
	private final LocalDate dateDeNaissance;
	private final ArrayList<Integer> numTel;
	
	public static class Builder{
		
		/**
		 * parametre obligatoire
		 */
		private final String nom;
		private final String prenom;

		/**
		 * parametre optionel
		 */
		private LocalDate dateDeNaissance;
		private ArrayList<Integer> numTel;
		
		public Builder(String nom, String prenom, int Id) {
			this.nom=nom;
			this.prenom=prenom;
			this.Id=Id;
			
		}
		
		public Builder dateDeNaissance(int anne,int mois,int jour) {
			this.dateDeNaissance= LocalDate.of(anne, mois, jour);
			return this;
			
		}
		
		public Builder numTel(int numTel) {
			this.numTel.add(numTel);
			return this;
			
		}
		
		public Personnels build() {
			return new Personnels(this);
			
		}
		
		
	}
	
	private Personnels(Builder builder) {
		//Obligatoire
		this.nom=builder.nom;
		this.prenom=builder.prenom;
		this.Id=builder.Id;//new
		//optionel
		this.dateDeNaissance=builder.dateDeNaissance;
		this.numTel=builder.numTel;
		

	
	

}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}
