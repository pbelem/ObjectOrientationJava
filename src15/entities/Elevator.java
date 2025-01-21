package entities;

public class Elevator {

	private int currentFloor;
	private int totalFloors;
	private int totalElevatorCapacity;
	private int currentElevatorCapacity;

	public Elevator() {

	}

	public Elevator(int totalFloors, int totalElevatorCapacity) {
		super();
		this.totalFloors = totalFloors;
		this.totalElevatorCapacity = totalElevatorCapacity;
		currentFloor = 0;
		currentElevatorCapacity = 0;
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}

	public int getCurrentElevatorCapacity() {
		return currentElevatorCapacity;
	}

	public void setCurrentElevatorCapacity(int currentElevatorCapacity) {
		this.currentElevatorCapacity = currentElevatorCapacity;
	}

	public int getTotalFloors() {
		return totalFloors;
	}

	public int getTotalElevatorCapacity() {
		return totalElevatorCapacity;
	}

	@Override
	public String toString() {
		return "Current floor: " + currentFloor + "\r\n" + "Current capacity: " + currentElevatorCapacity;

	}
}
