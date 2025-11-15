package org.isValidateadhaar;


import static org.apache.commons.lang3.Validate.inclusiveBetween;
import static org.apache.commons.lang3.Validate.notNull;

public class Adhaar {

    private final String adhaar;


    public Adhaar(String adhaar) {

        notNull(adhaar);
        inclusiveBetween(16,16,adhaar.length());
        this.adhaar = adhaar;
    }
}