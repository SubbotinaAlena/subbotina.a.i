package cafe;

import cafe.service.OrderMaker;

public class Cafe{

    public static void main(String[] args){

        OrderMaker orderMaker = new OrderMaker();

        orderMaker.makeOrder();
    }
}