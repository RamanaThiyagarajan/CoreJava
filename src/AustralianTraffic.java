
public class AustralianTraffic implements CentralTraffic, ContinentalTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CentralTraffic a= new AustralianTraffic();
		
		a.redStop();
		a.flashYelow();
		a.greenGo();
		
		AustralianTraffic at=new AustralianTraffic();
		at.walkthrough();
		at.redStop();
		at.flashYelow();
		at.greenGo();
		//at.TrainSymbol();
		
		ContinentalTraffic ct= new AustralianTraffic();
		ct.TrainSymbol();		
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("redStop Implementation");
		
	}
	
	public void walkthrough() {
		System.out.println("Walking Implementation");
	}

	@Override
	public void flashYelow() {
		// TODO Auto-generated method stub
		System.out.println("flashYelow Implementation");
		
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("greenGo Implementation");
		
	}

	@Override
	public void TrainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("Train Implementation");
		
	}

}
