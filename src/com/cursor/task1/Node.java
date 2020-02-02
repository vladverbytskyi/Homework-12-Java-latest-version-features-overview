package com.cursor.task1;

public class Node {
    protected long key;
    protected String news;
    public int frequency;
    protected Node prev;
    protected Node next;

    public Node(long key, String news, int frequency){
        this.key   = key;
        this.news = news;
        this.frequency = frequency;
    }
}
