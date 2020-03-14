package fr.uvsq.pglp.Exercice_4_1;

import java.util.ArrayList;


public class afficheGroupe {
	public ArrayList<PersonelsInter> grp;
	
	public afficheGroupe (PersonelsInter grp) {
		this.grp.add(grp);
	}
	
	/**
	 * 
	 * @author root
	 *
	 */
	private class groupIterator implements Iterator{
		int index;
		
		
		public groupIterator() {
			int verifier=0;
			while(verifier<grp.size()) {
				if(grp.get(verifier) instanceof CompositePerso) {
					CompositePerso test=(CompositePerso)grp.get(verifier);
					int i=0;
					while(i<test.gettab().size()) {
						grp.add(test.gettab().get(verifier));
						i++;
					}
				verifier++;
				}
			}
		}
		
		/**
		 * verifirie s'il y'a des elements dans l'arr
		 */
		@Override
		public boolean hasNext() {
			if(index<grp.size())
				return true;
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public PersonelsInter Next() {
			if(this.hasNext())
				return grp.get(index);
			return null;
		}
		
		
		
	}
	
	public Iterator getIterator() {
		return new groupIterator();
		
	}


}
