package com.myllena.gym;

public class SevenSegmentify {
    public static String sevenSegmentify(String time) {
        String linha1 = " _     _  _     _  _  _  _  _       ";
        String linha2 = "| |  | _| _||_||_ |_   ||_||_| .    ";
        String linha3 = "|_|  ||_  _|  | _||_|  ||_| _| .    ";

        if (time.startsWith("0")) {
            time = " " + time.substring(1);
        }
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        StringBuilder s3 = new StringBuilder();

        for (char c : time.toCharArray()) {
            int i = (c == ':') ? 30 : (c == ' ') ? 33 : (c - '0') * 3;

            s1.append(linha1.substring(i, i + 3));
            s2.append(linha2.substring(i, i + 3));
            s3.append(linha3.substring(i, i + 3));
        }
        return s1 + "\n" + s2 + "\n" + s3;
    }
}
