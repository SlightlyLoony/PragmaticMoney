package com.dilatush.pragmatic.decimal;

/**
 * @author Tom Dilatush  tom@dilatush.com
 */
public class PragmaticDecimal {

    // fields always present in every instance
    private final byte[] digits;  // BCD mantissa digits


    public PragmaticDecimal( final String num ) {
        digits = new byte[0];
    }
}
