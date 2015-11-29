package io.readme.mnemosyne;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {

	private HelloWorld helloWorld;

	@Before
	public void setUp() {
		this.helloWorld = new HelloWorld();
	}

	@Test
	public void testGetOne() {
		final int result = helloWorld.getOne();

		assertThat(result).isEqualTo(1);
	}
}
