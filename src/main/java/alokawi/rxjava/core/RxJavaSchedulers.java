/**
 * 
 */
package alokawi.rxjava.core;

import io.reactivex.Flowable;
import io.reactivex.schedulers.Schedulers;

/**
 * @author alokkumar
 *
 */
public class RxJavaSchedulers {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		Flowable.fromCallable(() -> {
		    Thread.sleep(1000); //  imitate expensive computation
		    return "Done";
		})
		  .subscribeOn(Schedulers.io())
		  .observeOn(Schedulers.single())
		  .subscribe(System.out::println, Throwable::printStackTrace);

		Thread.sleep(2000); // <--- wait for the flow to finish
	}

}
