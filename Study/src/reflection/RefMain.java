package reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class RefMain {

	public static void main(String[] args) {
		RefMyClass MyObject = new RefMyClass();
		Method[] methods = RefMyClass.class.getMethods();
		Class<?>[] inst = RefMyClass.class.getInterfaces();
		try {

			Class[] cArg = new Class[0];
			Method hlo = RefMyClass.class.getDeclaredMethod("hello", cArg);
			System.out.println(hlo.toString());
			hlo.setAccessible(true);
			hlo.invoke(MyObject, cArg);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//./hello2
		/*for(Method method : methods){
		    System.out.println("method = " + method.getName());
		}
*/
	}

}
