package com.myllena.gym;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SevenSegmentifyTest {
    @Test
    @DisplayName("should work on 13:24")
    void shouldWorkOn1324() {
        var expected =
                "    _     _    \n" +
                        "  | _| .  _||_|\n" +
                        "  | _| . |_   |";
        assertEquals(expected, SevenSegmentify.sevenSegmentify("13:24"));
    }

    @Test
    @DisplayName("should work on 08:56")
    void shouldWorkOn0856() {
        var expected =
                "    _     _  _ \n" +
                        "   |_| . |_ |_ \n" +
                        "   |_| .  _||_|";
        assertEquals(expected, SevenSegmentify.sevenSegmentify("08:56"));
    }

    @Test
    @DisplayName("should work on 21:49")
    void shouldWorkOn2149() {
        var expected =
                " _           _ \n" +
                        " _|  | . |_||_|\n" +
                        "|_   | .   | _|";
        assertEquals(expected, SevenSegmentify.sevenSegmentify("21:49"));
    }

    @Test
    @DisplayName("should work on 07:00")
    void shouldWorkOn0700() {
        var expected =
                "    _     _  _ \n" +
                        "     | . | || |\n" +
                        "     | . |_||_|";
        assertEquals(expected, SevenSegmentify.sevenSegmentify("07:00"));
    }

    @Test
    @DisplayName("should work on 06:03")
    void shouldWorkOn0603() {
        var expected =
                "    _     _  _ \n" +
                        "   |_  . | | _|\n" +
                        "   |_| . |_| _|";
        assertEquals(expected, SevenSegmentify.sevenSegmentify("06:03"));
    }

    @Test
    @DisplayName("should work on 10:59")
    void shouldWorkOn1059() {
        var expected =
                "    _     _  _ \n" +
                        "  || | . |_ |_|\n" +
                        "  ||_| .  _| _|";
        assertEquals(expected, SevenSegmentify.sevenSegmentify("10:59"));
    }
}
