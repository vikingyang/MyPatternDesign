package lesson2.bean;

import lesson2.widget.Button;
import lesson2.widget.Scrollbar;
import lesson2.widget.Window;

public class SkinUI {
	// 按钮控件
	private Button button;
	// 滚动条控件
	private Scrollbar scrollbar;
	// 窗口控件
	private Window window;
	// 颜色,主题
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
