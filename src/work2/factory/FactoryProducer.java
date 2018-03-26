package work2.factory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if (choice.equals("Widget")) {
			return new WidgetFactory();
		} else if (choice.equals("Color")) {
			return new ColorFactory();
		}
		return null;
	}
}