package com.pedroguzman.ds.chicagoanalysis.models;

public class Worker extends Person {

    protected String department;
    protected String jobTitle;
    protected boolean isPartTime;
    protected boolean isHourly;
    protected int typicalAmountOfHours;
    protected double annualSalary;
    protected double hourlyRate;

    public Worker(final String name,
                  final String lastname,
                  final String jobTitle,
                  final String department,
                  final String isPartTime,
                  final String isHourly,
                  final String typicalAmountOfHours,
                  final String annualSalary,
                  final String hourlyRate) {

        super(name, lastname);
        this.jobTitle = jobTitle;
        this.department = department;
        this.isPartTime = this.parsePartTimeInput(isPartTime);
        this.isHourly = this.parseIsHourlyInput(isHourly);
        this.typicalAmountOfHours = this.parseTypicalAmountOfHoursInput(typicalAmountOfHours);
        this.annualSalary = this.parseAnnualSalaryInput(annualSalary);
        this.hourlyRate = this.parseHourlyRateInput(hourlyRate);
    }

    private boolean parseIsHourlyInput(String isHourlyColumnData){
        // Ustedes deben implementar este método para que valide el input en texto y asignen el valor booleano correspondiente
        return false;
    }

    private int parseTypicalAmountOfHoursInput(String typicalAmountOfHoursColumnData){
        // Ustedes deben implementar este método
        return 0;
    }

    private double parseAnnualSalaryInput(String annualSalaryColumnData){
        // Ustedes deben implementar este método
        return 0.0;
    }

    private double parseHourlyRateInput(String hourlyRateColumnData){
        // Ustedes deben implementar este método
        return 0.0;
    }

    public String toString(){
        // Ustedes deben implementar este método de manera que devuelva todos los atributos de la clase
        return "";
    }

    /**
     *
     * @param partTimeColumnData
     * @return
     */
    private boolean parsePartTimeInput(String partTimeColumnData){
        boolean isPartTime = false;
        if(partTimeColumnData.compareTo("P") == 0){
            isPartTime = true;
        }
        return isPartTime;
    } // METHOD PARSE PART TIME INPUT ENDS ------------------------------------
} // CLASS WORKER ENDS --------------------------------------------------------
