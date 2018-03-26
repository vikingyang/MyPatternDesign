package lesson2;

import lesson2.bean.SkinUI;
import lesson2.factory.BlueSkinUIFactory;
import lesson2.factory.RedSkinUIFactory;
import lesson2.factory.SkinUIFactory;

public class SkinUIAbstractFactoryTest {
	public static void main(String[] args) {
		// 1. red skin
		// SkinUIFactory SkinUIFactory = new RedSkinUIFactory();
		// 2. black skin
		// SkinUIFactory SkinUIFactory = new BlackSkinUIFactory();
		// 3. bule skin
		SkinUIFactory SkinUIFactory = new BlueSkinUIFactory();
		SkinUI skin = SkinUIFactory.createSkinUI();
		System.out.print("i am " + skin.getColor() + " color");
	}
}
