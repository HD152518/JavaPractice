/**
 * 
 */
package asdf;

/**
 * <pre>
 * asdf
 *   |_ SmartPhoneTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 12.
 * </pre>
 *
 * @author      : ksw10
 * @version     : 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SmartPhone phones[] = {
				new IPhone("iPhone 7", "애플", 900000),
				new Galaxy("갤럭시 S8", "삼성", 800000)
		};
		
		for(SmartPhone phone : phones){
			System.out.println(phone);
			phone.turnOn();
			phone.pay();
			phone.useSpecialFunction(phone);
			phone.turnOff();
			System.out.println();
		}

	}

}
