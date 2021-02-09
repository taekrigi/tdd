package com.my.tdd.lotto;

import java.util.Random;

public class LottoMaker {

	public static final int LOTTO_LENGTH = 6;
	
	private Integer[] lottos = new Integer[LOTTO_LENGTH];
	private int MIN = 1;
	private int MAX = 45;
	
	private ArrayUtils<Integer> arrayUtils = new ArrayUtils<>(lottos);
	
	public LottoMaker() {
		generate();
	}
	
	public Integer[] getLottos() {
		return lottos;
	}

	private void generate() {
		Random random = new Random();
		int i = 0;
		
		while (true) {
			int number = random.nextInt(MAX - MIN + 1) + MIN;
			
			if (!arrayUtils.contains(number)) {
				lottos[i++] = number;
			}
			
			if (isCompleted()) {
				break;
			}
			
		}
	}
	
	private boolean isCompleted() {
		for (int i = 0; i < lottos.length; i++) {
			if (lottos[i] == null) {
				return false;
			}
		}
		return true;
	}
	
	
}
