package com.pedroguzman.ds.chicagoanalysis;

import com.pedroguzman.ds.chicagoanalysis.models.Worker;

public class Facts {

    private Worker[] workers;

    public Facts(Worker[] workers) {
        this.workers = workers;
        this.getHigherPaidWorker();
    }

    public void getHigherPaidWorker(){
        Worker higherPaid = workers[0];
        for(int index = 0; index < this.workers.length; ++index){
            if(this.workers[index].getAnnualSalary() > higherPaid.getAnnualSalary()){
                higherPaid = this.workers[index];
            }
        }
        System.out.println(" El empleado con el salario más alto es:");
        System.out.println(higherPaid.toString());
    }

    public void getHigerPaidHalfTimePosition(){

    }
}
