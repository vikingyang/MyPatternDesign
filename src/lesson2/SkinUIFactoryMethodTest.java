package lesson2;

import lesson2.bean.BlackSkinUI;
import lesson2.bean.BlueSkinUI;
import lesson2.bean.RedSkinUI;
import lesson2.bean.SkinUI;

public class SkinUIFactoryMethodTest {

	public SkinUI createRedSkinUI() {
		SkinUI skinUI = new RedSkinUI();
		return skinUI;
	}

	public SkinUI createBlackSkinUI() {
		SkinUI skinUI = new BlackSkinUI();
		return skinUI;
	}

	public SkinUI createBlueSkinUI() {
		SkinUI skinUI = new BlueSkinUI();
		return skinUI;
	}

	public static void main(String[] args) {
		SkinUIFactoryMethodTest skinFactoryUI = new SkinUIFactoryMethodTest();
		// 1. red skinUI
		// SkinUI skinUI = skinFactoryUI.createRedSkinUI();
		// 2. black skinUI
		SkinUI skinUI = skinFactoryUI.createBlackSkinUI();
		// 3. buleUI skinUI
		// SkinUI skinUI = skinFactoryUI.createBlueSkinUI();
		System.out.print("i am " + skinUI.getColor() + " color");
	}
}
