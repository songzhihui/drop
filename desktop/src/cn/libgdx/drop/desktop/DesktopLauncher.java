package cn.libgdx.drop.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import cn.libgdx.drop.Drop;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title="”ÍµŒ£®www.libgdx.cn£©";
	    config.width=800;
	    config.height=480;
		new LwjglApplication(new Drop(), config);
	}
}
