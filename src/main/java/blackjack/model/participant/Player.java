package blackjack.model.participant;

import java.util.Objects;

public class Player extends Participant {

    private final String name;

    public Player(final String name) {
        this(name, new Hand());
    }

    public Player(final String name, final Hand hand) {
        super(hand);
        validateNullAndEmptyName(name);
        this.name = name.trim();
    }

    private void validateNullAndEmptyName(final String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("이름에는 공백을 사용할 수 없습니다.");
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Player player = (Player) o;
        return Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
