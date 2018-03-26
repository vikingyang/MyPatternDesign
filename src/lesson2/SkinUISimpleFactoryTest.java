package lesson2;

import lesson2.bean.BlackSkinUI;
import lesson2.bean.BlueSkinUI;
import lesson2.bean.RedSkinUI;
import lesson2.bean.SkinUI;
import lesson2.factory.BlueSkinUIFactory;
import lesson2.factory.SkinUIFactory;

public class SkinUISimpleFactoryTest {
	public SkinUI createSkin(String color) {
		SkinUI skin = null;
		if ("red".equals(color)) {
			skin = new RedSkinUI();
		} else if ("black".equals(color)) {
			skin = new BlackSkinUI();
		} else if ("blue".equals(color)) {
			skin = new BlueSkinUI();
		}
		return skin;
	}

	public static void main(String[] args) {
		SkinUISimpleFactoryTest skinUISimpleFactoryTest = new SkinUISimpleFactoryTest();
		// 1. red skinUI
		SkinUI skinUI = skinUISimpleFactoryTest.createSkin("red");
		// 2. black skinUI
		// SkinUI skinUI = skinUISimpleFactoryTest.createSkin("black");
		// 3. bule skinUI
		//SkinUI skinUI = skinUISimpleFactoryTest.createSkin("blue");
		System.out.print("i am " + skinUI.getColor() + " color");

	}
}
