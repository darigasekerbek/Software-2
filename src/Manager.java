public class Manager extends SalesmanDecorator {
    public Manager (Salesman sm){
        super(sm);
    }
    public String makeReport(){
        return "Make a monthly a sales report. ";
    }

    @Override
    public String responsibilities() {
        return super.responsibilities() + makeReport();
    }
}
