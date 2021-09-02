package projeto21;



public class Card {
    private int naipe;
	private int carta;
	private static final String[] naipes  = {"Paus ♣", "Ouros ♦", "Copas ♥", "Espadas ♠"};
        private static final String[] cards = {"Ace", "Dois", "Tres", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "DEz", "Valete", "Dama", "REi"};
	
	public Card(int naipe, int carta){
		this.naipe = naipe;
		this.carta = carta;
	}
	public int valueOf(){
		//returns the value of the Card
		if (this.carta ==0){
		return 11;
		}
		if (this.carta < 10){
		return carta + 1;
		}
		if(this.carta >=10){
		return 10;
		}
		else{
		return 0;
		}
	}
	public String toString(){
		//returns a String representing the Card in form "Ace/Three/King of Hearts"
	        return cards[this.carta] + " de " + naipes[this.naipe];
	}
	public static void main(String[] args){
		Card a = new Card(0,0);
		System.out.println("Card a has a value of " + a.valueOf() + " and is a " + a.toString());
		Card b = new Card(3,4);
		System.out.println("Card a has a value of " + b.valueOf() + " and is a " + b.toString());
		Card c = new Card(3,12);
		System.out.println("Card a has a value of " + c.valueOf() + " and is a " + c.toString());
	}
}