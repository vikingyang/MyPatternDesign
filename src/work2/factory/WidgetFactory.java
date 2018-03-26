package work2.factory;

import work2.bean.color.Color;
import work2.bean.widget.Button;
import work2.bean.widget.Scrollbar;
import work2.bean.widget.Widget;
import work2.bean.widget.Window;

public class WidgetFactory extends AbstractFactory {
	@Override
	public Widget getWidget(String widgetType) {
		if (widgetType == null) {
			return null;
		}
		if (widgetType.equals("Button")) {
			return new Button();
		} else if (widgetType.equals("Scrollbar")) {
			return new Scrollbar();
		} else if (widgetType.equals("Window")) {
			return new Window();
		}
		return null;
	}

	@Override
	public Color getColor(String colorName) {
		return null;
	}

}