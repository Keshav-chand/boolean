public class App {
    private int age;
    private boolean decision;
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public boolean getdecision(){
        return decision;
    }
    public void setdecision(boolean result){
        this.decision= result;

    }
    public static void main(String[] args) {
        App obj=new App();
        obj.setAge(70);
        
        if(obj.getAge()<=60){
            obj.setdecision(true);
        
    }
    else{
        obj.setdecision(false);
    }
    System.out.println("The age of the candidate is" +obj.getAge());
    System.out.println("Driving license issued to the candidate:"+obj.getdecision());

}
}