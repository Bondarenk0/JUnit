package chapter3_unit_tests_without_collaborators.exercises.ex3;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

public class HashMapTest {
	private HashMap<Integer, String> storage;
	
	@Before
	public void setUp() {
		storage = new HashMap<>();
	}
	
	@Test
	public void put_passNewObject_expectedSize1() {
		storage.put(1, "test");
		assertEquals(1, storage.size());
	}
	
	@Test
	public void put_passTwoObjectWithTheSameKeys_expectedOneDeleteAnother() {
		storage.put(1, "first string");
		storage.put(1, "second string");
		assertEquals(1, storage.size());
		assertEquals("second string", storage.get(1));
	}
	
	@Test
	public void clear_clearCalled_expectedEmptyMap() {
		final int EMPTY_SIZE = 0;
		storage.put(1, "test");
		storage.clear();
		assertEquals(EMPTY_SIZE, storage.size());
	}
	
	@Test
	public void put_passNullValueAsKey_expectedNullCanBeAsAKey() {
		storage.put(null, "hello");
		assertEquals("hello", storage.get(null));
	}
}
