
public class Person implements PetListener {
	private String name;
	public Person(String name){
		this.name = name;
	}
	public void petHungry(PetEvent e) {
		System.out.println("-" + name + " karmi " + e.getSource().getName());	
		
	}
	public void petThirsty(PetEvent e) {
		System.out.println("-" + name + " k�adzie misk� z wod� dla " + e.getSource().getName());	
		
	}
	
	public void petLonely(PetEvent e) {
		System.out.println("-" + name + " bawi si� z " + e.getSource().getName() + " przez chwil�. ");
		
	}
	
	public void petSleeps(PetEvent e) {
		System.out.println("-" + name + " g�aszcze po g�owie " + e.getSource().getName());
		
	}

}
