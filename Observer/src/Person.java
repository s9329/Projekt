
public class Person implements PetListener {
	private String name;
	public Person(String name){
		this.name = name;
	}
	public void petHungry(PetEvent e) {
		System.out.println("-" + name + " karmi " + e.getSource().getName());	
		
	}
	public void petThirsty(PetEvent e) {
		System.out.println("-" + name + " k³adzie miskê z wod¹ dla " + e.getSource().getName());	
		
	}
	
	public void petLonely(PetEvent e) {
		System.out.println("-" + name + " bawi siê z " + e.getSource().getName() + " przez chwilê. ");
		
	}
	
	public void petSleeps(PetEvent e) {
		System.out.println("-" + name + " g³aszcze po g³owie " + e.getSource().getName());
		
	}

}
