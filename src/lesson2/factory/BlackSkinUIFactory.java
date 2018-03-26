package lesson2.factory;

import lesson2.bean.BlackSkinUI;
import lesson2.bean.SkinUI;

public class BlackSkinUIFactory implements SkinUIFactory {

	@Override
	public SkinUI createSkinUI() {
		// TODO Auto-generated method stub
		SkinUI skinUI = new BlackSkinUI();
		return skinUI;
	}

}
