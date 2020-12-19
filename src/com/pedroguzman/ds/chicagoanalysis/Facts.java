package com.pedroguzman.ds.chicagoanalysis;

import com.pedroguzman.ds.chicagoanalysis.models.Worker;


public class Facts {

    private Worker[] workers;

    public Facts(Worker[] workers) {
        this.workers = workers;
        this.getHigherPaidWorker();
        this.getHigerPaidHalfTimePosition();
        this.getAverageSalaryForPartTimeWorkers();
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
        Worker higherPaid = null;
        for(int index = 0; index < this.workers.length; ++index){
            if(this.workers[index].isPartTime() && (higherPaid == null || this.workers[index].getAnnualSalary() > higherPaid.getAnnualSalary())){
                higherPaid = this.workers[index];
            }
        }
        System.out.println(" El empleado que trabaja medio tiempo con el salario más alto es:");
        System.out.println(higherPaid.toString());
    }

    public void getAverageSalaryForPartTimeWorkers(){
        int amountOfPartTimeWorkers = 0;
        double totalPartTimeSalaries = 0.0;
        for (Worker worker: workers) {
            if(worker.isPartTime()){
                amountOfPartTimeWorkers++;
                totalPartTimeSalaries += worker.getAnnualSalary();
            }
        }
        System.out.println("El promedio salarial de los empleados de medio tiempo en la  ciudad de Chicago es: " + totalPartTimeSalaries / amountOfPartTimeWorkers);
    }



}
