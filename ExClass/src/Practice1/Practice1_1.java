package Practice1;
/* 섯다 카드 20장을 담는 SutdaCard 배열을 초기화 하시오.
 * 단, 섯다 카드는 1부터 10까지의 숫자가 적힌 카드가 두장씩 있고, 숫자가 1, 3, 8인 경우에는 둘 중의 한장은 광 이어야 한다.
 */

class SutdaDeck {
	final int CARD_NUM = 20; // 상수
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	SutdaDeck() {
		/*
		 *  1. 배열 SutdaCard를 적절히 초기화 하시오.
		 */
		for(int i=0; i<(CARD_NUM/2); i++) {
			if(i+1==1 || i+1==3 || i+1==8)
				cards[i] = new SutdaCard(i+1, true);
			else
				cards[i] = new SutdaCard(i+1, false);
			cards[i+(CARD_NUM/2)] = new SutdaCard(i+1, false);
		}
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num= num;
		this.isKwang = isKwang;
	}

	// info() 대신 Object 클래스의 toString()을 오버라이딩
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class Practice1_1 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		for(int i=0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");

	}

}
