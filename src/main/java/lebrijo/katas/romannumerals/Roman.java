package lebrijo.katas.romannumerals;

public class Roman extends Number {
	private String roman;

	Roman(String roman) {
		this.roman = roman;

	}

	public int toArabic() {
		int arabic = 0;
		for (Par par : EQUIVALENCY_TABLE) {
			while (roman.startsWith(par.getRoman())) {
				arabic += par.getArabic();
				roman = roman.substring(par.getRoman().length());
			}
		}
		return arabic;
	}
}
