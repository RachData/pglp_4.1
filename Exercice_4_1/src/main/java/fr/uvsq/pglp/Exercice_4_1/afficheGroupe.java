package fr.uvsq.pglp.Exercice_4_1;

import java.util.ArrayList;


public class afficheGroupe {
	public ArrayList<PersonelsInter> grp=new ArrayList<PersonelsInter>();
	
	public afficheGroupe (PersonelsInter root) {
		this.grp.add(root);
	}
	
	/**
	 * 
	 * @author root
	 *
	 */
	private class groupIterator implements Iterator{
		int index=0;
		
		
		public groupIterator() {
			int verifier=0;
			while(verifier<grp.size()) {
				if(grp.get(verifier) instanceof CompositePerso) {
					CompositePerso test=(CompositePerso)grp.get(verifier);
					int i=0;
					
					while(i<test.grpPerso.size()) {
						grp.add(test.grpPerso.get(i));
						
						i++;
					}
					
				
				}
				verifier++;
			}
		}
		
		/**
		 * verifirie s'il y'a des elements dans l'arr
		 */
		@Override
		public boolean HasNext() {
			if(index<grp.size())
				return true;
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public PersonelsInter Next() {
			if(this.HasNext()) {
				index++;
				return grp.get(index-1);
			}
				
			return null;
		}
		
		
		
	}
	
	public Iterator getIterator() {
		return new groupIterator();
		
	}


}
