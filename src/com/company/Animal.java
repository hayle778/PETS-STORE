package com.company;

   public class Animal {
       private String name = "";
       private String type = "";
       private String description = "";
       private String price = "";
       private String instock = "";

       public Animal() {
       }
       public Animal(String name , String type , String description) {

           this.name = name;
           this.type = type;
           this.description = description;
       }


       public String getName() {
           return name;
       }

       public void setName(String name) {
           this.name = name;
       }

       public String getType() {
           return type;
       }

       public void setType(String type) {
           this.type = type;
       }

       public String getDescription() {
           return description;
       }

       public void setDescription(String description) {
           this.description = description;
       }

       public String getPrice() {
           return price;
       }

       public void setPrice(String price) {
           this.price = price;
       }

       public String getInstock() {
           return instock;
       }

       public void setInstock(String instock) {
           this.instock = instock;
       }

       @Override
       public String toString() {
           return "Animal Type description"+
                   "name='" + name + '\'' +
                   ", type='" + type + '\'' +
                   ", description='" + description + '\'' +
                   ", price='" + price + '\'' +
                   ", instock='" + instock + '\'' +
                   '}';
       }
   }









