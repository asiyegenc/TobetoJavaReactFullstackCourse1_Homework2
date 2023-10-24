package org.example;


public class Main {
    public static void main(String[] args) {
        String mesaj = "Vade Oranı";

        Product product1  = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(6500);
        product1.setDiscount(8);
        product1.setUnitsInStock(4);
        product1.setImageUrl("bilmemne1.jpg");


        Product product2  = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(5500);
        product2.setDiscount(9);
        product2.setUnitsInStock(2);
        product2.setImageUrl("bilmemne2.jpg");


        Product product3  = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setUnitPrice(7500);
        product3.setDiscount(7);
        product3.setUnitsInStock(3);
        product3.setImageUrl("bilmemne3.jpg");

        Product[] products = {product1, product2, product2};

        System.out.println("<ul");
        for (Product product : products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05405785201");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Asiye");
        individualCustomer.setLastName("Genç");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("3654654");
        corporateCustomer.setTaxNumber("51654");
        corporateCustomer.setCustomerNumber("54321");

        Customer[] customer = {individualCustomer, corporateCustomer};
    }
}