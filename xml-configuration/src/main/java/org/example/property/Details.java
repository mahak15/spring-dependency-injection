package org.example.property;

public class Details {
    int Emp_id;
    private provideService provideService;

    public Details(int emp_id){
        this.Emp_id=emp_id;
        this.provideService=new Department();
    }

   public void setService(provideService service){
        this.provideService=service;
    }
   public provideService getService()
    {
        return this.provideService;
    }
    public void setEmp_id(int emp_id){
        this.Emp_id=emp_id;
    }
   public int getEmp_id(){
        return Emp_id;
    }
    public void service(){
        this.provideService.service();
    }

}
