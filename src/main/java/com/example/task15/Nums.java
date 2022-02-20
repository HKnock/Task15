package com.example.task15;

public class Nums {
    private double tableColumn1;
    private double tableColumn2;

    public Nums(){ }

    public Nums(double tableColumn1, double tableColumn2){
        this.tableColumn1 = tableColumn1;
        this.tableColumn2 = tableColumn2;
    }

    public double getTableColumn1() {
        return tableColumn1;
    }

    public void setTableColumn1(double tableColumn1) {
        tableColumn1 = tableColumn1;
    }

    public double getTableColumn2() {
        return tableColumn2;
    }

    public void setTableColumn2(double tableColumn2) {
        tableColumn2 = tableColumn2;
    }
}
