package main.doubleWeeklyContest.double_weekly_contest_20.double_context_5324_每隔n个顾客打折;

import java.util.HashMap;
import java.util.Map;

class Cashier {

    int n;
    int discount;
    int[] products;
    Map<Integer, Integer> price;
    int index = 0;
    int[] prices;
    public Cashier(int n, int discount, int[] products, int[] prices) {
        price = new HashMap<>();
        this.n = n;
        this.discount = discount;
        this.products = products;
        this.prices = prices;
        for (int i = 0; i < this.products.length; i++) {
            price.put(products[i], prices[i]);
        }
        index = 0;
    }

    public double getBill(int[] product, int[] amount) {
        index++;
        double ans = 0d;
        for (int i = 0; i < product.length; i++) {
            ans += price.get(product[i]) * amount[i];
        }
        if (index == n) {
            index = 0;
            ans = ans - (discount * ans) / 100;
        }
        return ans;
    }

    public static void main(String[] args) {
        Cashier cashier = new Cashier(3, 50, new int[]{1,2,3,4,5,6,7}, new int[]{100,200,300,400,300,200,100});
        double s1 = cashier.getBill(new int[]{1, 2}, new int[]{1, 2});
        System.out.println(s1);
    }
}

/**
 * Your Cashier object will be instantiated and called as such:
 * Cashier obj = new Cashier(n, discount, products, prices);
 * double param_1 = obj.getBill(product,amount);
 */
