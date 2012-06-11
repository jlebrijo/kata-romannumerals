package lebrijo.katas.romannumerals;

class Par {
	private int arabic;
	private String roman;

	public Par(int arabic, String roman) {
		super();
		this.arabic = arabic;
		this.roman = roman;
	}

	public int getArabic() {
		return arabic;
	}

	public void setArabic(int arabic) {
		this.arabic = arabic;
	}

	public String getRoman() {
		return roman;
	}

	public void setRoman(String roman) {
		this.roman = roman;
	}
}
