package org.example;

public class Main {
    public static void main(String[] args) {
        String mesaj = "vade orani";

        Product product1 = new Product();
        product1.setName("Delonghi kahve makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setImageUrl("image.jpg");


        Product product2 = new Product();
        product2.setName("Smeg kahve makinesi");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setImageUrl("image.jpg");


        Product product3 = new Product();
        product3.setName("Karaca kahve makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setImageUrl("image.jpg");


        Product[] products = {product1,product2,product3};
        for(Product product:products){
            System.out.println(product.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setCustomerNumber("123abc");
        individualCustomer.setId(1);
        individualCustomer.setFirstName("eylul");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("etiya");
        corporateCustomer.setCustomerNumber("345dfg");

        Customer[] customers = {individualCustomer,corporateCustomer};





    }
}