/**
 * 
 */
package alokawi.rxjava.core;

import io.reactivex.Flowable;

/**
 * @author alokkumar
 *
 */
public class RxJavaExample {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		Flowable.just("Hello world").subscribe(System.out::println);
	}

}
