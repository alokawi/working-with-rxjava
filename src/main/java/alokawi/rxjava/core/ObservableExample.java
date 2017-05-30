/**
 * 
 */
package alokawi.rxjava.core;

import java.util.Arrays;
import java.util.List;

import io.reactivex.Observable;

/**
 * Reference - https://www.infoq.com/articles/rxjava2-by-example
 * 
 * @author alokkumar
 */
public class ObservableExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Observable.just("Howdy!");

		@SuppressWarnings("unused")
		Observable<String> hello = Observable.just("Howdy!");

		Observable<String> howdy = Observable.just("Howdy!");
		howdy.subscribe(System.out::println);

		Observable.just("Hello", "World").subscribe(System.out::println);

		List<String> words = Arrays.asList("the", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog");

		Observable.just(words).subscribe(System.out::println);

		Observable.fromIterable(words).subscribe(System.out::println);

		Observable.range(1, 5).subscribe(System.out::println);

		Observable.fromIterable(words).zipWith(Observable.range(1, Integer.MAX_VALUE),
				(string, count) -> String.format("%2d. %s", count, string)).subscribe(System.out::println);

		Observable.fromIterable(words).flatMap(word -> Observable.fromArray(word.split("")))
				.zipWith(Observable.range(1, Integer.MAX_VALUE),
						(string, count) -> String.format("%2d. %s", count, string))
				.subscribe(System.out::println);

		Observable.fromIterable(words).flatMap(word -> Observable.fromArray(word.split(""))).distinct()
				.zipWith(Observable.range(1, Integer.MAX_VALUE),
						(string, count) -> String.format("%2d. %s", count, string))
				.subscribe(System.out::println);

	}

}
