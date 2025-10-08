package SOLIDPrinciple;

// ex.. SRP -> SingleResponsibilityPrinciple
// each have single responsibility

class RestaurantService {
    void takeOrder() {}
    void cookFood() {}
    void generateBill() {}
    void cleanTable() {}
}


// SRP Desighn 
class OrderService {
    void takeOrder() {}
}

class CookingService {
    void cookFood() {}
}

class BillingService {
    void generateBill() {}
}
// each have single resposibilty

public class SingleResponsibilityPrinciple {
    
}
