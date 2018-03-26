package work2.factory;

import work2.bean.color.Color;
import work2.bean.widget.Widget;

public abstract class AbstractFactory {
	public abstract Color getColor(String colorName);

	public abstract Widget getWidget(String widgetType);
}