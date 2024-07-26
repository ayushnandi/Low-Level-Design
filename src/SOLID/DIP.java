package SOLID;

//Abstraction
	interface InputDevice {
		void type();
	}
	
	//Concrete Implementation
	class Keyboard implements InputDevice {
		public void type() {
		 	System.out.println("Typing on the keyboard");
	 	}
	}
	
	//High-level Module
	class Computer {
	 private InputDevice inputDevice;
	
	 public Computer(InputDevice inputDevice) {
	     this.inputDevice = inputDevice;  // Depends on abstraction InputDevice
	 }
	
	 public void useInputDevice() {
	     inputDevice.type();
	 }
	}
	
	public class DIP {
		public static void main(String[] args) {
			InputDevice keyboard = new Keyboard();
			Computer computer = new Computer(keyboard);
	     computer.useInputDevice();
	 	}
	}

