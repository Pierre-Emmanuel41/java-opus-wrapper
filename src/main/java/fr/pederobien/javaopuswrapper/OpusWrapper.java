package fr.pederobien.javaopuswrapper;

import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.jna.Platform;

public class OpusWrapper {
	private static final String LIBRARY_NAME = "opus";
	private static final Opus INSTANCE;

	static {
		String platform = Platform.RESOURCE_PREFIX;
		String path = String.format("natives/%s/%s.%s", platform, LIBRARY_NAME, getExtension(platform));
		INSTANCE = Native.load(NativeLibrary.getInstance(path).getFile().getAbsolutePath(), Opus.class);
	}

	/**
	 * @return The java wrapper in order to manipulate opus encoder / decoder.
	 */
	public static Opus getOpus() {
		return INSTANCE;
	}

	/**
	 * Get the extension of the native code to load according to the platform on which this code is running.
	 * 
	 * @param platform The current platform.
	 * 
	 * @return The associated extension.
	 */
	private static String getExtension(String platform) {
		switch (platform) {
		case "darwin":
			return "dylib";
		case "win32-x86":
		case "win32-x86-64":
			return "dll";
		case "linux-arm":
		case "linux-aarch64":
		case "linux-x86":
		case "linux-x86-64":
		default:
			return "so";
		}
	}
}
