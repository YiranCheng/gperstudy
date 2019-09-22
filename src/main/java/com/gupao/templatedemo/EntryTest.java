package com.gupao.templatedemo;

/**
 * @author yiran
 */
public class EntryTest {
    public static void main(String[] args) {
        AbstractEntryTemplate entry = new AliEntry(true);
        entry.procedure();
    }
}
