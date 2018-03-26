package lesson6.command;

public class Computer {
	public void startBIOS() {
		System.out.println("子命令：BIOS启动...");
	}

	public void startMBR() {
		System.out.println("子命令：MBR加载...");
	}

	public void startHDD() {
		System.out.println("子命令：HDD加载...");
	}

	public void startOS() {
		System.out.println("子命令：系统启动...");
	}
}