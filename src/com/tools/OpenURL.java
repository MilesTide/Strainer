package com.tools;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * 将含有不良信息的页面显示
 * @author FSD
 *
 */
public class OpenURL {
	public static void Open(String url) throws URISyntaxException, IOException {
		URI uri = new URI(url);
		Desktop dp = Desktop.getDesktop();
		if (dp.isSupported(Desktop.Action.BROWSE)) {
			dp.browse(uri);
		}
	}
}
