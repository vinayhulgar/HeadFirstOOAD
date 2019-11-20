public enum Wood {

	INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHAGONY,
	MAPLE, COCOBOLO,CEDAR, ADIRONDACK, ALDER,SITKA; 
	
	public String toString() {
		switch(this) {
		case INDIAN_ROSEWOOD:
			return "indian_rosewood";
		case BRAZILIAN_ROSEWOOD:
			return "brazilian_rosewood";
		case MAHAGONY:
			return "mahagony";
		case MAPLE:
			return "maple";
		case COCOBOLO:
			return "cocobolo";
		case CEDAR:
			return "cedar";
		case ADIRONDACK:
			return "adirondack";
		case ALDER:
			return "alder";
		case SITKA:
			return "sitka";
		}
		return null;
	}
	
}
