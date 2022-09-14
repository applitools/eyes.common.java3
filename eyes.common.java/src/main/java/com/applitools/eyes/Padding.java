package com.applitools.eyes;

public class Padding {

    private int top;
    private int right;
    private int bottom;
    private int left;

    public Padding() {
    }

    public Padding(int allDirections) {
        this.top = allDirections;
        this.right = allDirections;
        this.bottom = allDirections;
        this.left = allDirections;
    }

    public Padding(int top, int right, int bottom, int left) {
        this.top = top;
        this.right = right;
        this.bottom = bottom;
        this.left = left;
    }

    public int getLeft() {
        return left;
    }

    public int getTop() {
        return top;
    }

    public int getRight() {
        return right;
    }

    public int getBottom() {
        return bottom;
    }
}
