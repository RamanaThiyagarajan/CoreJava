
public class ChildAircraft extends ParentAircraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildAircraft a = new ChildAircraft();
		a.engine();
		a.safetyGuidelines();
		a.bodyColor();
	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Red Color body");
	}

}
