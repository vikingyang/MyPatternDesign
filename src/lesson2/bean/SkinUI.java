package lesson2.bean;

import lesson2.widget.Button;
import lesson2.widget.Scrollbar;
import lesson2.widget.Window;

public class SkinUI {
	// ��ť�ؼ�
	private Button button;
	// �������ؼ�
	private Scrollbar scrollbar;
	// ���ڿؼ�
	private Window window;
	// ��ɫ,����
	private String color;

	public SkinUI() {
		super();
	}

	public Button getButton() {
		return button;
	}

	public void setButton(Button button) {
		this.button = button;
	}

	public Scrollbar getScrollbar() {
		return scrollbar;
	}

	public void setScrollbar(Scrollbar scrollbar) {
		this.scrollbar = scrollbar;
	}

	public Window getWindow() {
		return window;
	}

	public void setWindow(Window window) {
		this.window = window;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
