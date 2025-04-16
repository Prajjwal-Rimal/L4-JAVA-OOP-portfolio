package a;

public class Hospital {
	String txt="this is a hospital haing many staffs";
}

class Doctors extends Hospital{

	public static void docs() {
		Hospital hospi=new Hospital();
		String dococcu="doctor treats people";
		System.out.println(hospi.txt + dococcu);
	}

}
class Nurse extends Hospital{
	public static void nur() {
		Doctors doc_1=new Doctors();
		String nurs_1="nurse help and assist doctors";
		doc_1.docs();
		System.out.println(nurs_1);
	}

}
class Cleaner extends Hospital{
	public static void cleanerstaff() {
		Nurse nurseteam=new Nurse();
		String clean="specialize in cleaning";
		nurseteam.nur();
		System.out.println(clean);
	}

}
