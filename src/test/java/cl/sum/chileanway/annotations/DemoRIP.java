package cl.sum.chileanway.annotations;

@RIP("This code is dead")
public class DemoRIP {

	@RIP("This methos is dead")
	public void demo(@RIP("This parameter is dead") String value) {
		value.toString();
	}
	
}


