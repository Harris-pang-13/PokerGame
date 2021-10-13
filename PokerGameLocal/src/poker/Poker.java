package poker;

public class Poker {
	// Precondition: A hand of n cards have been sorted by card number.
	public boolean isFullHouse(String cards[], int n) {
		return isThreeOfaKind(cards, n) && isTwoPairs(cards, n);
	}

	// Precondition: A hand of n cards have been sorted by card number.
	public boolean isThreeOfaKind(String cards[], int n) {
		for (int i=0; i<n-2; i++) {
			if (cards[i].charAt(1) == cards[i+1].charAt(1) &&
					cards[i+1].charAt(1) == cards[i+2].charAt(1))
					return true;
		}

		return false;
	}
    //This line will save the bug
	
	// Precondition: A hand of n cards have been sorted by card number.
	public boolean isTwoPairs(String cards[], int n) {
		int count = 0;
		for (int i=0; i<n-1; i++) {
			if (cards[i].charAt(1) == cards[i+1].charAt(1)) {
				count++;
				i++;
			}
		}
		if (count == 2)
			return true;
		else
			return false;
	}
	
	public static void main(String args[]) {
		System.out.println(new Poker().isFullHouse(new String[] {"C2", "D2", "H2", "S3", "D3"}, 5));
		System.out.println(new Poker().isFullHouse(new String[] {"C2", "D2", "H2", "S3", "C3"}, 5));
		System.out.println(new Poker().isFullHouse(new String[] {"C2", "D2", "H2", "S3", "D6"}, 5));
		System.out.println(new Poker().isFullHouse(new String[] {"C2", "D2", "H2", "S3", "D3"}, 5));
	}
}
// end of Poker.java
