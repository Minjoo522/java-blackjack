package blackjack.model.state;

import blackjack.model.Money;
import blackjack.model.deck.Card;
import blackjack.model.participant.Hand;
import java.util.List;

public class Hit implements State {
    private final Hand hand;

    public Hit() {
        this.hand = new Hand();
    }

    private Hit(final Hand hand) {
        this.hand = hand;
    }

    @Override
    public State draw(final Card card) {
        hand.add(card);
        if (hand.isBust()) {
            return new Bust(hand);
        }
        if (hand.isBlackJack()) {
            return new BlackJack(hand);
        }
        return new Hit(hand);
    }

    @Override
    public State stand() {
        return new Stand(hand);
    }

    @Override
    public List<Card> getCards() {
        return hand.getCards();
    }

    @Override
    public int calculateScore() {
        return hand.calculateScore();
    }

    @Override
    public double calculateProfit(final Money money) {
        return 0;
    }
}
