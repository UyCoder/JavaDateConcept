package dev.ahmed;

import lombok.Data;
import org.testng.annotations.Test;

/**
 * @author Ahmed Bughra
 * @create 2022-11-12  3:45 PM
 *
 */

public class Goods implements Comparable {

    private String name;
    private double price;

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Goods() {
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Object o) {
        if  (o instanceof Goods){
            Goods goods = (Goods)o;
            // method 1:
            if(this.price > goods.price){
                return 1;
            }else if(this.price < goods.price){
                return -1;
            }else {
                return 0;
            }

            // method 2:
            // return Double.compare(this.price, goods.price);

        }
//        return 0;
        throw new RuntimeException("Information mismatch");

    }



}
