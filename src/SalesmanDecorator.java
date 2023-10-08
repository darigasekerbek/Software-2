public class SalesmanDecorator implements Salesman{
    Salesman sm;
    public SalesmanDecorator(Salesman sm){
        this.sm = sm;
    }
    public String responsibilities(){
        return sm.responsibilities();
    }
}
