package com.my.tdd.lotto;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.Test;

public class LottoTester {
	
	private static final int LOTTO_LENGTH = 6;
	
	@Test
	public void should_filled_array_with_length_six() {
		Integer[] lottos = new LottoMaker().getLottos();
		assertEquals(LOTTO_LENGTH, lottos.length);
		assertEquals(true, Stream.of(lottos).allMatch(e -> e != null));
	}

	@Test
	public void should_not_have_duplicated_number() {
		Integer[] lottos = new LottoMaker().getLottos();
		assertEquals(LOTTO_LENGTH, Stream.of(lottos).distinct().count());
	}
	
	
}
