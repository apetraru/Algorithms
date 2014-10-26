package sort

import spock.lang.Specification

import static sort.Sort.*

/**
 * @author Andrei Petraru
 * 23 Oct 2014
 */
class SortTests extends Specification {

	def 'bubble sort'() {
		when:
		def a = [1, 3, 5, 2, 7, 0, 3] as int[]
		bubbleSort a

		then:
		a == [0, 1, 2, 3, 3, 5, 7] as int[]
	}

}
