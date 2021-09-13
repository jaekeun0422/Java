//(17-1) interface, get/set

interface Bicycle {
	void applyBrake(int decrement);
	
	void speedUp(int increment);
}

class MountainBike implements Bicycle {
	private int seatHeight;
	private int gear;
	private int speed;
	
	public MountainBike(	int startHeight, 
									int startSpeed,
									int startGear) {
		seatHeight = startHeight;
		speed = startSpeed;
		gear = startGear;
	}
	
	@Override
	public void applyBrake(int decrement) {
		speed = speed - decrement;
	}
	
	@Override
	public void speedUp(int increment) {
		speed = speed + increment;
	}
	
	public int getSeatHeight() {
		return seatHeight;
	}
	
	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getGear() {
		return gear;
	}
	
	public void setGear(int gear) {
		this.gear = gear;
	}
}

class InterfaceDemo {
	public static void main(String[] args) {
		MountainBike mountainBike = new MountainBike(20, 10, 1);
		
		System.out.println("Gear is: " + mountainBike.getGear());
		System.out.println("Seat height is: " + mountainBike.getSeatHeight());
		System.out.println("Bike Speed is: " + mountainBike.getSpeed());
		
		mountainBike.applyBrake(1);
		System.out.println("Bike speed after applying brake is: " + mountainBike.getSpeed());
		
		mountainBike.speedUp(10);
		System.out.println("Bike's new speed after increment is: " + mountainBike.getSpeed());
		
	}
}
