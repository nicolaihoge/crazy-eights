package no.nicolai.crazyeights.game.report;

import no.nicolai.crazyeights.player.Player;

public class Result {
    private Player winner;

    public Result(Player winner) {
        this.winner = winner;
    }

    public Player getWinner() {
        return winner;
    }
}
