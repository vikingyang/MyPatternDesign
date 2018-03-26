package lesson6.chainofresposibility;

public abstract class Handler {
	protected Handler nextHandler;

	public abstract void handleRequest(int req);

	public Handler getNextHandler() {
		return nextHandler;
	}

	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
}