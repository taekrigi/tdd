package com.my.tdd.lotto;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class LottoRanking {
	
	private Integer[] winning;
	private Integer[] selection;
	
	public LottoRanking(Integer[] selection, Integer[] winning) {
		this.selection = selection;
		this.winning = winning;
	}
	
	public String getRanking() {
		Map<Integer, String> ranking = new HashMap<>();
		
		ranking.put(0, "꽝!");
		ranking.put(1, "꽝!");
		ranking.put(2, "꽝!");
		ranking.put(3, "4등!");
		ranking.put(4, "3등!");
		ranking.put(5, "2등!");
		ranking.put(6, "1등!");
		
		return ranking.get(getCount());
	}
	
	private int getCount() {
		int count = 0;
		
		for (int i = 0; i < selection.length; i++) {
			for (int j = 0; j < winning.length; j++) {
				if (selection[i] == winning[j]) {
					count++;
					break;
				}
			}
		}
		
		return count;
	}

	
}
