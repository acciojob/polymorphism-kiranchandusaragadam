package com.driver;

public class Main {
    public Main(){

    }

    public static class Product{
        public Product(){

        }

        public int product(int x, int y){
            return x*y;
        }

        public int product(int x, int y, int z){
            return x*y*z;
        }

        public double product(double x, double y){
            return (double)(x*y);
        }

    }
    public static void main(String[] args) {
        Product p = new Product();
        int s1 = p.product(3, 2);
        int s2 = p.product(4, 3, 2);
        double s3 = p.product(3.0, 2.5);

        System.out.println(s1 + " " + s2 + " " + s3);
    }
}