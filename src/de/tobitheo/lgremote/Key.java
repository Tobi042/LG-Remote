package de.tobitheo.lgremote;

public enum Key {
	POWER(0x08),
	ENERGY(0x95), AV_MODE(0x30), INPUT(0x0B), TV_RADIO(0xF0),
	NUM_1(0x11), NUM_2(0x12), NUM_3(0x13), 
	NUM_4(0x14), NUM_5(0x15), NUM_6(0x16), 
	NUM_7(0x17), NUM_8(0x18), NUM_9(0x19), 
	LIST(0x53), NUM_0(0x10), QUICK_VIEW(0x1A),
	VOLUME_UP(0x02), VOLUME_DOWN(0x03),
	CHANNEL_UP(0x00), CHANNEL_DOWN(0x01),
	FAV_MARK_CHAR_NUM(0x1E), THREE_D(0xDC), MUTE_DELETE(0x09),
	PREMIUM(0x59), HOME(0x43), AT(0x58),
	KEYPAD_ENTER(68), KEYPAD_UP(64), KEYPAD_LEFT(7), KEYPAD_DOWN(65), KEYPAD_RIGHT(6), 
	BACK(0x28), QUICK_MENU_3D_OPTIONS(0x45), EXIT(0x5B),
	RED(0x72), GREEN(0x71), YELLOW(0x63), BLUE(0x61),
	TEXT(0x20), TEXT_OPTIONS(0x21), SUBTITLE(0x39),
	STOP_LIVE_TV(0xB1), PLAY(0xB0), PAUSE(0xBA),
	REWIND(0x8F), FAST_FORWARD(0x8E), RECORD(0xBD),
	GUIDE(0xAB), INFO(0xAA), RATIO(0x79);
	
	int key;

	Key(int key) {
		this.key = key;
	}

	int getKeyCode() {
		return key;
	}
}
