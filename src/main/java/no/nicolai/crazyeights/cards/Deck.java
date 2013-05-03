package no.nicolai.crazyeights.cards;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Deck of cards
 */
public class Deck implements Set<Card> {

    Set<Card> cards;

    public Deck() {
        cards = new HashSet<>();
    }

    @Override
    public int size() {
        return cards.size();
    }

    @Override
    public boolean isEmpty() {
        return cards.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return cards.contains(o);
    }

    @Override
    public Iterator<Card> iterator() {
        return cards.iterator();
    }

    @Override
    public Object[] toArray() {
        return cards.toArray();
    }

    @Override
    public <Card> Card[] toArray(Card[] a) {
        return cards.toArray(a);
    }

    @Override
    public boolean add(Card card) {
        return cards.add(card);
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return cards.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Card> c) {
        return cards.addAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }
}
