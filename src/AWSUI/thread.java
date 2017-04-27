package AWSUI;

public class thread extends Thread{

	public void run(){
		for (int i =0; i<10;i++){
			System.out.println("Child Thread");
		}
	}
	
	public static void main(String[] args){
		thread t = new thread();
		t.start();
		for (int i =0; i<10;i++){
			System.out.println("Main Thread");
		}
		}
}
