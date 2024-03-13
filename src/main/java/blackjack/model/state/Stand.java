package blackjack.model.state;

import blackjack.model.Money;
import blackjack.model.deck.Card;
import blackjack.model.participant.Hand;
import java.util.List;

public class Stand implements State {
    private final Hand hand;

    public Stand(final Hand hand) {
        this.hand = hand;
    }

    @Override
    public State draw(final Card card) {
        throw new UnsupportedOperationException("Stand 상태이므로 더 이상 카드를 받을 수 없습니다.");
    }

    @Override
    public State stand() {
        throw new UnsupportedOperationException("이미 Stand 입니다.");
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
