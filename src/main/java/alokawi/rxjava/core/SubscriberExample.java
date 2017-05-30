/**
 * 
 */
package alokawi.rxjava.core;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import io.reactivex.Flowable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/**
 * @author alokkumar
 *
 */
public class SubscriberExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Flowable.fromArray(1, 2, 3, 4).subscribe(
		        i -> System.out.printf("Entry %d\n", i),
		        e -> System.err.printf("Failed to process: %s\n", e),
		        () -> System.out.println("Done")
		);
		
		//Consumer { void accept(T t); }

		Flowable.fromArray(1, 2, 3, 4).subscribe(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) throws Exception {
				System.out.printf("Entry %d\n", t);
			}
		}, new Consumer<Throwable>() {
			@Override
			public void accept(Throwable t) throws Exception {
				System.err.printf("Failed to process: %s\n", t);
			}
		}, new Action() {
			@Override
			public void run() throws Exception {
				System.out.println("Done");
			}
		});
		
		
		//Subscriber { void onNext(T t); void onError(Throwable t); void onComplete(); }

		Subscriber<Integer> subscriber = new Subscriber<Integer>() {

			@Override
			public void onSubscribe(Subscription s) {

			}

			@Override
			public void onNext(Integer t) {
				System.out.printf("Entry %d\n", t);
			}

			@Override
			public void onError(Throwable t) {
				System.err.printf("Failed to process: %s\n", t);
			}

			@Override
			public void onComplete() {
				System.out.println("Done");
			}

		};
		Flowable.fromArray(1, 2, 3, 4).subscribe(subscriber);
	}

}
