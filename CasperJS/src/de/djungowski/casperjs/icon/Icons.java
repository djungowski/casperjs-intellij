package de.djungowski.casperjs.icon;

import com.intellij.openapi.util.IconLoader;
import javax.swing.Icon;

/**
 * Created by djungowski on 29.07.14.
 */
public class Icons {
	public static Icon basicIcon() {
		return IconLoader.getIcon("casperjs-logo.png");
	}

	public static Icon basicIcon16px() {
		return IconLoader.getIcon("casperjs-logo-16px.png");
	}
}
