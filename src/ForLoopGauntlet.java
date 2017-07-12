import javax.print.attribute.IntegerSyntax;
import javax.swing.JOptionPane;

public class ForLoopGauntlet {
	public static void main(String[] args) {
		
	
	//goinUp
	//goinDown
	//goinUpE
	//goinUpO
	//goinUp500
	//goinUp777
	//year
	//nested
	//threebythree
	tenbyten();
	//stars
	}
	// UP
	static void goinUp() {
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}
	}

	// DOWN
	static void goinDown() {
		for (int y = 100; y >= 0; y--) {
			System.out.println(y);
		}
	}

	// Even UP
	static void goinUpE() {
		for (int e = 2; e <= 100; e++) {
			if (e % 2 == 0) {
				System.out.println(e);
			}
		}
	}

	// ODD UP
	static void goinUpO() {
		for (int o = 2; o <= 100; o++) {
			if (o % 2 == 1) {
				System.out.println(o);
			}
		}
	}

	// 500
	static void goinUp500() {
		for (int n = 0; n < 501; n++) {
			if (n % 2 == 0) {
				System.out.println(n + " even");
			} else if (n % 2 == 1) {
				System.out.println(n + " odd");
			}

		}
	}

	// 777
	static void goinUp777() {
		for (int s = 2; s <= 777; s++) {
			if (s % 7 == 0) {
				System.out.println(s);
			}
		}
	}

	// Year
	static void year() {
		String Year = JOptionPane.showInputDialog("What year were you born?");
		int year = Integer.parseInt(Year);
		for (int age = 0; age <= 87; age++) {
			if (year >= 1930 && year <= 2017) {
				JOptionPane.showMessageDialog(null, "In " + year + ", you were " + age + " years old.");
				year++;
			} else if (year < 1929 || year > 2017) {
				JOptionPane.showMessageDialog(null, "YEAH RIGHT!!!!!!!!!!!!!!!!!!!!!!!!!! :)");
				System.exit(year);
			}
			if (year == 2017) {
				System.exit(age);
				;
			}

		}

	}

	// Nested
	static void nested() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(i + " " + j);
			}

		}
	}

	// 3x3
	static void threebythree(){
		for(int one=1; one <10  ; one+=3){
			for (int two = 2; two <10 ; two+=3) {
				for (int three = 3; three <10;three+=3) {
					System.out.println(one + " " + two + " " + three);
				}
			}
		}
	}
//10x10
	static void tenbyten(){
	for(int Ten = 1; Ten < 101; Ten++){
		System.out.print(Ten + "	");
		if(Ten%10==0){
			System.out.println(" ");
		}
//		for (int ten = 0; ten < 101; ten++) {
//			
//		}
	}
	}
	//Stars
	static void stars(){
	
		System.out.print("*");
		System.out.print("**");
		System.out.print("***");
		System.out.print("****");
		System.out.print("*****");
}
}
