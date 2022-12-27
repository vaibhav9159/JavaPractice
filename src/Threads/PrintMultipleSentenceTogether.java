package Threads;

class two extends Thread {

	public void run() {

		System.out.println("Suprabhat");

	}

}

class one extends Thread {

	public void run() {

		
		System.out.println("Namaste");
	}

}

class PrintMultipleSentenceTogether {

	public static void main(String[] args) {

		two tw = new two();
		one on = new one();
		
		on.setPriority(7);
		tw.setPriority(3);

		System.out.println(tw.getState());
		tw.start();
		System.out.println(tw.getState());
		on.start();

		System.out.println(on.getPriority());
		System.out.println(tw.getPriority());
		System.out.println(tw.getState());
	


	}
}
