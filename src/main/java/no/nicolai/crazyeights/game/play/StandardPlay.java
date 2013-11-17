package no.nicolai.crazyeights.game.play;

import no.nicolai.crazyeights.game.report.StandardOutReporter;

public class StandardPlay {
    public static Play create() {
        AbstractPlay firstPlay = new StandardOutReporter();
        AbstractPlay secondPlay = new CardController();
        firstPlay.setNext(secondPlay);
        return firstPlay;
    }
}
