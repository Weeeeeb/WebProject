package util;
import java.util.Random;
/**
 * 
 * @author wanghao
 *
 */
public class CreateRandom {
	
	private static Random ran = new Random();
	/**
	 * 
	 * @param num
	 * @return
	 */
	public static int getRandom(int num){
		
		return ran.nextInt(num);
	}
}
