package hours24.mpr;

public class Testy24 {

	public static void main(String[] args) {
		
		String searchKeywords = "";
		searchKeywords += "rekin ma p³etwy i oczy";
		
		String KeyDn = "maleNaDuze";
		String KeyUp = KeyDn.toUpperCase();
		
		System.out.println(searchKeywords+" "+KeyDn+" > "+KeyUp+" < "+KeyDn.toLowerCase());
		System.out.println(searchKeywords.indexOf("p³etwy"));
		System.out.println(searchKeywords.contains("p³etwy"));
		
		Testy24 test = new Testy24();
		test.txtif();
		test.txtif(200);
	}
	
	private void txtif() {
		int LiczWar = 0;
		if(LiczWar > 10) {
			LiczWar = 20;
			System.out.println("Ok");
		}
		System.out.println("Ok2");
	}
	
	private void txtif(int LiczWar) {
		System.out.println((LiczWar > 10) ? 20 : 10);
	}
}
