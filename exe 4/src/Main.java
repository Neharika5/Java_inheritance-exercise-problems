public class Main{
    public static void main(String[] args){
        employee emp=new employee(300);
        hrmanager mgr=new hrmanager(700);
        emp.work();
        mgr.work();
        mgr.addemployee();
    }
}