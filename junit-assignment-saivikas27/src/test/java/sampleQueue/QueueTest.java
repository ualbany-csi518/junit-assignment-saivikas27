package sampleQueue;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import java.util.SortedMap;

import static org.junit.jupiter.api.Assertions.*;


class QueueTest {

	/**
	 * Tests for Queue.
	 */


	private static final String SOME_ITEM = "some-content";
	private Queue<String> q;


	@Test
	@DisplayName("is instantiated with new Queue()")
	void isInstantiatedWithNew() {
		new Queue<>();
	}

	@BeforeEach
	void init() {
		this.q = new Queue<String>();
	}

	@Test
	@DisplayName("Verify Queue isEmpty when queue is initialized")
	void isEmptyShouldGiveTrueOnQueueInit() {
		assertTrue(q.isEmpty());
	}

	//Example of Wrong Test! 
	@Test
	@DisplayName("Verify Queue isEmpty returns false when queue is not empty")
	void isEmptyShouldGiveFalseWhenQueueIsNotEmpty() {
            this.q.enqueue(SOME_ITEM);
		assertFalse(q.isEmpty());
	}

    @Test
    @DisplayName("Verify removeAll method and the catch an exception when there is an underflow using dequeue")
    void first() throws NoSuchElementException{
	    this.q=new Queue();
	    this.q.enqueue(SOME_ITEM);
        this.q.enqueue(SOME_ITEM);
        this.q.peek();
        this.q.removeAll();
        try {
            this.q.dequeue();
        }catch(NoSuchElementException e){
        }
        this.q.enqueue(SOME_ITEM);
        this.q.dequeue();
    }

    @Disabled
    @Test
    @DisplayName("instantiate sized queue and throw and a failure case when there is an overflow of queue")
    void failuremethodifthereisoverflow()
    {
        int n=2;
        this.q=new Queue(n);
        this.q.enqueue(SOME_ITEM);
        this.q.enqueue(SOME_ITEM);
        this.q.enqueue(SOME_ITEM);
       assertTrue(n>=this.q.length());
    }
}
