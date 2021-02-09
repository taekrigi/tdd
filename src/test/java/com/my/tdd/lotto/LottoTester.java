package com.my.tdd.lotto;

import org.junit.Test;

import com.my.tdd.lotto.LottoMaker;
import com.my.tdd.lotto.LottoRanking;

public class LottoTester {

	@Test
	public void should_not_have_duplicated_number() {
		for (int i = 0; i < 1000; i++) {
			LottoRanking ranking = new LottoRanking(
				new Integer[] {1, 2, 3, 4, 5, 6},
				new LottoMaker().getLottos()
			);
			System.out.println(ranking.getRanking());
		}
	}
}
