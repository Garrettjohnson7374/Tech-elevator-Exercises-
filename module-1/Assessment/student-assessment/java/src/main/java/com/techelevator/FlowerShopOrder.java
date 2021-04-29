package com.techelevator;

import java.util.Scanner;

public class FlowerShopOrder{
    class FlowerShop {

            private String bouquetType = "";
            public int numberOfRoses = 0;
            public double subtotal = (numberOfRoses * 2.99) + 19.99;
            public boolean sameDayDelivery;
            public String zipCode = "";

            public String getBouquetType() {
                return this.bouquetType;
            }
            public int getNumberOfRoses() {
                return this.numberOfRoses;
            }
            public int getSubtotal() {
                return this.getSubtotal();
            }
            public void setBouquetType() {
                this.bouquetType = bouquetType;
            }
            public void setNumberOfRoses() {
                this.numberOfRoses = numberOfRoses;
            }
            public void setSubtotal() {
                this.subtotal = subtotal;
            }

            public void FlowerShopOrder(String bouquetType, int numberOfRoses) {
                this.bouquetType = bouquetType;
                this.numberOfRoses = numberOfRoses;
            }
        }
    }

