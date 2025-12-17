package game;

public class Game{

    private Player[] players;
    private int cardsPerPlayer;
    private int numberOfPlayers;
    private int playerCount = 0;
    private Deck deck;

    Game(int numberOfPlayers, int cardsPerPlayer){

        this.numberOfPlayers = numberOfPlayers;
        this.cardsPerPlayer = cardsPerPlayer;

        this.deck = new Deck();
        this.deck.shuffle();
        this.players = new Player[numberOfPlayers];

    }
    public void addPlayer(Player p){

        if(playerCount < players.length){

            players[playerCount] = p;
            playerCount++;

        }
        else{

            System.out.println("Maximum number of players reached");

        }

    }

    public void deal(){

        System.out.println("Dealing Cards...(Round Robin)");

        for(int i = 0; i < cardsPerPlayer; i++){
            for(Player p : players){

                if(deck.isEmpty()){

                    System.out.println("Not enough cards in Deck");

                }

                else(){

                    Card c = deck.draw();
                    p.addCard(c);

                }
            }

        }

    }







}