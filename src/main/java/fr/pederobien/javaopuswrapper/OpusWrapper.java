package fr.pederobien.javaopuswrapper;

import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;

public class OpusWrapper {
	private static final Opus OPUS;

	static {
		NativeLibrary.addSearchPath("opus", "src/main/resources/win32-x86-64/opus.dll");
		OPUS = (Opus) Native.load(Opus.JNA_LIBRARY_NAME, Opus.class);
	}

	/**
	 * @return The java wrapper in order to manipulate opus encoder / decoder.
	 */
	public static Opus getOpus() {
		return OPUS;
	}
}
