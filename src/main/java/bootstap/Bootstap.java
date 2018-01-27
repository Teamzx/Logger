/**
 * 
 */
package bootstap;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author pratz
 *
 */
public class Bootstap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		final ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("classpath:beans.xml");
		final Object lock = context.getBean("lock");
		Runtime.getRuntime().addShutdownHook(new Thread(){
			@Override
			public void run() {
				synchronized(lock) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		});
		
	}

}
