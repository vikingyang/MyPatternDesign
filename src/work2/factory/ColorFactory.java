package work2.factory;

import work2.bean.color.Blue;
import work2.bean.color.Color;
import work2.bean.color.Green;
import work2.bean.color.Red;
import work2.bean.widget.Widget;

public class ColorFactory extends AbstractFactory {

	@Override
	public Widget getWidget(String widgetType) {
		return null;
	}

	@Override
	public Color getColor(String colorName) {
		if (colorName == null) {
			return null;
		}
		if (colorName.equals("Red")) {
			return new Red();
		} else if (colorName.equals("Green")) {
			return new Green();
		} else if (colorName.equals("Blue")) {
			return new Blue();
		}
		return null;
	}
}