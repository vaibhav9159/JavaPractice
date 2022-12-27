package OOPSConceptPart2;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		// this is know as method overriding -> instead of calling parent it called child method because whenever there is same name
		//method in parent and child it will always give pref to child method
		// this is compile time or static polymorphism 
		b.engine();  	
		b.color();
		b.safety();
		b.model();  // inherited from parent as it was not present in child class
		System.out.println("~~~~~~below are parent methods~~~~~~~");
		car c = new car();
		c.engine();
		c.color();
		c.model();  //note parent can't inherit child props
		System.out.println("~~~~~~below are dynamic poly~~~~~~~");
		
		// this is also nown as top casting
		car c1 = new BMW(); //child class object referred by parent class ref variable - this is dynamic/run time polymorphism
//only parent class methods + parent and child class common methods will be called(overriden mthds), you can't call child method which is unique 
		c1.color();
		c1.engine();
		c1.model();
		
		//down casting - parent can't fit into child class ref variable, need to cast make car as bmw class obj
		BMW b1 = (BMW)new car(); //- this is now bmw class object but this is not allowed, run time error class cast exception is thrown as java is confused
		
	}

}
