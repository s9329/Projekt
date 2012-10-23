import java.util.HashSet;
import java.util.Set;


public class Pet {
	private Thread life = new Thread(){
		public void run(){
			while (true){
				int roll = (int) (Math.random()*4.0);
				switch (roll){
					case 0: firePetHungryEvent();break;
					case 1: firePetLonelyEvent();break;
					case 2: firePetThirstyEvent();break;
					case 3: firePetSleepsEvent();break;
					}
				try{
					sleep (5000l);
				}catch (Exception e){}
				}
			}
	};
	
	private Set<PetListener>listeners;
	private String name;
	public Pet(String name){
		this.name = name;
		listeners = new HashSet<PetListener>();
		life.start();
	}
	public String getName(){
		return name;
	}


public synchronized void addPetListener (PetListener listener){
	listeners.add(listener);
}

public synchronized void removePetListener (PetListener listener){
	listeners.remove(listener);
}
protected synchronized void firePetHungryEvent(){
	System.out.println (name + " jest g³odny.");
	PetEvent e = new PetEvent(this);
	for (PetListener listener : listeners){
		listener.petHungry(e);}
}

protected synchronized void firePetThirstyEvent(){
	System.out.println (name + " jest spragniony.");
	PetEvent e = new PetEvent(this);
	for (PetListener listener : listeners){
		listener.petThirsty(e);}
	}
protected synchronized void firePetLonelyEvent(){
	System.out.println (name + " czuje siê samotny.");
	PetEvent e = new PetEvent(this);
	for (PetListener listener : listeners){
		listener.petLonely(e);}
	}
protected synchronized void firePetSleepsEvent(){
	System.out.println (name + " jest œpi¹cy.");
	PetEvent e = new PetEvent(this);
	for (PetListener listener : listeners){
		listener.petSleeps(e);}
	}
}
