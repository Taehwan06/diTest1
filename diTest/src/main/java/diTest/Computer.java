package diTest;

public class Computer {
	private MainBoard mainBoard;
	private Ram ram;
	
	
	public Computer(MainBoard mainBoard, Ram ram) {
		super();
		this.mainBoard = mainBoard;
		this.ram = ram;
	}


	public MainBoard getMainBoard() {
		return mainBoard;
	}

	public void setMainBoard(MainBoard mainBoard) {
		this.mainBoard = mainBoard;
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}
}
