package com.amazon.ata.interfaces;

/**
 * Reverse a String and act like a <code>CharSequence</code>.
 * <p>
 * Change this class definition to implement CharSequence.
 */
public class ReversedString implements CharSequence {
    private String chars;
    /**
     * Implement this constructor during the interfaces prework.
     *
     * @param chars The String of chars to be reversed
     */
    public ReversedString(final String chars) {
        this.chars = chars;
    }

    @Override
    public char charAt(int index) {
        return chars.charAt(chars.length() - 1 - index);
    }

    @Override
    public int length() {
        return chars.length();
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        String reversedSub = chars.substring(
                chars.length()-end,
                chars.length()-start);
        return new ReversedString(reversedSub);
    }

    @Override
    public String toString() {
        return new StringBuilder(chars).reverse().toString();
    }

}
