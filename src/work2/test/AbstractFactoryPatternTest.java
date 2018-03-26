package work2.test;

import work2.bean.color.Color;
import work2.bean.widget.Widget;
import work2.factory.AbstractFactory;
import work2.factory.FactoryProducer;

public class AbstractFactoryPatternTest {
	public static void main(String[] args) {
		// 获取形状工厂
		AbstractFactory widgeFactory = FactoryProducer.getFactory("Widget");

		// 创建按钮控件
		Widget widget1 = widgeFactory.getWidget("Button");
		widget1.draw();

		// 创建滚动条控件
		Widget widge2 = widgeFactory.getWidget("Scrollbar");
		widge2.draw();

		// 创建窗口控件
		Widget widge3 = widgeFactory.getWidget("Window");
		widge3.draw();

		// 获取颜色工厂
		AbstractFactory colorFactory = FactoryProducer.getFactory("Color");

		// 获取颜色为 Red 的对象
		Color color1 = colorFactory.getColor("Red");
		color1.fill();

		// 获取颜色为 Green 的对象
		Color color2 = colorFactory.getColor("Green");
		color2.fill();

		// 获取颜色为 Blue 的对象
		Color color3 = colorFactory.getColor("Blue");
		color3.fill();
	}
}