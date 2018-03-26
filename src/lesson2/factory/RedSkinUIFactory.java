package lesson2.factory;

import lesson2.bean.RedSkinUI;
import lesson2.bean.SkinUI;

public class RedSkinUIFactory implements SkinUIFactory {

	@Override
	public SkinUI createSkinUI() {
		// TODO Auto-generated method stub
		SkinUI skinUI = new RedSkinUI();
		return skinUI;
	}

}
