package calculator;

import java.util.*;

public class Calculator {
    protected Queue<Double> queue = new LinkedList<>();  // Store the answer of the operations using JCF.
    static final double PI = 3.14;
    // static -> can use without making an object.
    // final -> value that doesn't change.
    // static final -> constant. It's a fact, so you don't want to change it & don't need to make an object to use it.
    protected ArrayList<Double> circleList = new ArrayList<>();   // Store the answer of the circle's area.

    // queue getter
    public Queue<Double> getQueue() {
        return queue;
    }
    // queue setter
    public void setQueue(Queue<Double> queue) {
        this.queue = queue;
    }
    // list getter
    public ArrayList<Double> getCircleList() {
        return circleList;
    }
    // list setter
    public void setCircleList(ArrayList<Double> circleList) {
        this.circleList = circleList;
    }
    // constructor
    public Calculator() {
        // initialize the collections
        queue = new LinkedList<>();
        circleList = new ArrayList<>();
    }

}
