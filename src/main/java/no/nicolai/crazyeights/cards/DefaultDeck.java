package no.nicolai.crazyeights.cards;

import java.util.*;

/**
 * Deck of cards
 */
public class DefaultDeck implements List<Card>, Deck {

    private List<Card> cards;
    private int fullSize;

    public DefaultDeck() {
        cards = new LinkedList<>();
        init();
        fullSize = cards.size();
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
    public boolean addAll(int index, Collection<? extends Card> c) {
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

    @Override
    public Card get(int index) {
        return cards.get(index);
    }

    @Override
    public Card set(int index, Card element) {
        return cards.set(index, element);
    }

    @Override
    public void add(int index, Card element) {
        cards.add(index, element);
    }

    @Override
    public Card remove(int index) {
        return cards.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return cards.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return cards.lastIndexOf(o);
    }

    @Override
    public ListIterator<Card> listIterator() {
        return cards.listIterator();
    }

    @Override
    public ListIterator<Card> listIterator(int index) {
        return cards.listIterator(index);
    }

    @Override
    public List<Card> subList(int fromIndex, int toIndex) {
        return cards.subList(fromIndex, toIndex);
    }

    @Override
    public void shuffle() {
        long seed = System.nanoTime();
        Collections.shuffle(cards, new Random(seed));
    }

    private void init() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder deckPrint = new StringBuilder();
        for (Card card : cards) {
            deckPrint.append(card);
        }
        return deckPrint.toString();
    }

    public int getFullSize() {
        return fullSize;
    }
}
