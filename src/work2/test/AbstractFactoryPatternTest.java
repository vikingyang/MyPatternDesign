package work2.test;

import work2.bean.color.Color;
import work2.bean.widget.Widget;
import work2.factory.AbstractFactory;
import work2.factory.FactoryProducer;

public class AbstractFactoryPatternTest {
	public static void main(String[] args) {
		// ��ȡ��״����
		AbstractFactory widgeFactory = FactoryProducer.getFactory("Widget");

		// ������ť�ؼ�
		Widget widget1 = widgeFactory.getWidget("Button");
		widget1.draw();

		// �����������ؼ�
		Widget widge2 = widgeFactory.getWidget("Scrollbar");
		widge2.draw();

		// �������ڿؼ�
		Widget widge3 = widgeFactory.getWidget("Window");
		widge3.draw();

		// ��ȡ��ɫ����
		AbstractFactory colorFactory = FactoryProducer.getFactory("Color");

		// ��ȡ��ɫΪ Red �Ķ���
		Color color1 = colorFactory.getColor("Red");
		color1.fill();

		// ��ȡ��ɫΪ Green �Ķ���
		Color color2 = colorFactory.getColor("Green");
		color2.fill();

		// ��ȡ��ɫΪ Blue �Ķ���
		Color color3 = colorFactory.getColor("Blue");
		color3.fill();
	}
}