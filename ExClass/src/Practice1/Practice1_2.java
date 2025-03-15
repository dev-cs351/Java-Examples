package Practice1;
/* 다음 새로운 메서드를 추가하고 테스트 하시오.
 * 1. shuffle
 * 배열 cards 에 담긴 카드의 위치를 뒤석는다.
 * 
 * 2. pick
 * 배열 cards 에서 지정된 위치의 SutdaCard 를 반환한다.
 * 
 * 3. pick
 * 배열 cards 에서 임의의 위치의 sutdaCard 를 반환한다.
 */

class SutdaDeck {
	final int CARD_NUM = 20; // 상수
	final int SUFFLE_NUM = 100;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	SutdaDeck() {
		for(int i=0; i<(CARD_NUM/2); i++) {
			if(i+1==1 || i+1==3 || i+1==8)
				cards[i] = new SutdaCard(i+1, true);
			else
				cards[i] = new SutdaCard(i+1, false);
			cards[i+(CARD_NUM/2)] = new SutdaCard(i+1, false);
		}
	}
	
	/*
	 *  위에 정의된 세 개의 메서드를 작성하시오.
	 */
	
	void suffle() {
		SutdaCard tmp = new SutdaCard();
		int num1, num2;
		
		for(int i=0; i<SUFFLE_NUM; i++) {
			num1 = (int)(Math.random()*CARD_NUM);
			num2 = (int)(Math.random()*CARD_NUM);
			tmp = cards[num1];
			cards[num1] = cards[num2];
			cards[num2] = tmp;
		}
	}
	
	SutdaCard pick(int num) {
		return cards[num];
	}
	
	SutdaCard pick() {
		return cards[(int)(Math.random()*CARD_NUM)];
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

public class Practice1_2 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.print("셔플 전 덱: ");
		for(int i=0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
		System.out.println("");
		
		System.out.println("셔플 전 10번째 카드: " + deck.pick(10));
		System.out.println("셔플 전 랜덤 카드: " + deck.pick());
		deck.suffle();
		System.out.println("셔플 후 10번째 카드: " + deck.pick(10));
		System.out.println("셔플 전 랜덤 카드: " + deck.pick());
		
		System.out.print("셔플 후 덱: ");
		for(int i=0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
		System.out.println("");
	}

}