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

    /**
     *
     * @param isHourlyColumnData
     * @return
     */
    private boolean parseIsHourlyInput(String isHourlyColumnData){
        boolean isHourly = false;
        if(isHourlyColumnData.compareTo("Hourly") == 0){
            isHourly = true;
        }
        return isHourly;
    } // METHOD PARSE IS HOURLY ENDS ------------------------------------------ //

    /**
     *
     * @param typicalAmountOfHoursColumnData
     * @return
     */
    private int parseTypicalAmountOfHoursInput(String typicalAmountOfHoursColumnData){
        int typicalAmountOfHours = 0;
        if(!typicalAmountOfHoursColumnData.isEmpty()){
            try {
                typicalAmountOfHours = Integer.parseInt(typicalAmountOfHoursColumnData);
            }
            catch (NumberFormatException exc){
                System.out.println(typicalAmountOfHoursColumnData + " is not a valid number");
                exc.printStackTrace();
            } // CATCH ENDS
        } // IF ENDS
        return typicalAmountOfHours;
    }

    private double parseAnnualSalaryInput(String annualSalaryColumnData){
        double annualSalary = 0.0;
        if(!annualSalaryColumnData.isEmpty()){
            try {
                annualSalary = Double.parseDouble(annualSalaryColumnData);
            }
            catch (NumberFormatException exc){
                System.out.println(annualSalaryColumnData + " is not a valid double");
                exc.printStackTrace();
            } // CATCH ENDS
        } // IF ENDS
        return annualSalary;
    } // METHOD PARSE

    private double parseHourlyRateInput(String hourlyRateColumnData){
        double hourlyRateInput = 0.0;
        if(!hourlyRateColumnData.isEmpty()){
            try {
                hourlyRateInput = Double.parseDouble(hourlyRateColumnData);
            }
            catch (NumberFormatException exc){
                System.out.println(hourlyRateColumnData + " is not a valid double");
                exc.printStackTrace();
            } // CATCH ENDS
        } // IF ENDS
        return hourlyRateInput;
    }

    public String toString(){
        // Ustedes deben implementar este método de manera que devuelva todos los atributos de la clase
        return "-------------------------------------------------------\n" +
                "Name="+ this.name +
                "\nLastname=" + this.lastname +
                "\nTypicalAmountOfHours=" + this.typicalAmountOfHours;
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
