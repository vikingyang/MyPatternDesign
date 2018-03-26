package lesson2.factory;

import lesson2.bean.BlueSkinUI;
import lesson2.bean.SkinUI;

public class BlueSkinUIFactory implements SkinUIFactory {

	@Override
	public SkinUI createSkinUI() {
		// TODO Auto-generated method stub
		SkinUI skinUI = new BlueSkinUI();
		return skinUI;
	}

}
