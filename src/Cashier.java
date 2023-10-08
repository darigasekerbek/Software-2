public class Cashier extends SalesmanDecorator{
    public Cashier (Salesman sm){
        super(sm);
    }
    public String makePayments(){
        return "Carry out payments from customers. ";
    }
    public String responsibilities(){
        return super.responsibilities() + makePayments();
    }
}
