package org.example;

import org.example.enums.Plan;

import java.util.Arrays;

public class HealthPlan {
    private int id;
    private String name;
    private Plan plan;

    public String toString(){
        return ("ID: "+id+" Sağlık Planının İsmi: "+name+" Plan: "+plan);
    }

    public HealthPlan(int id, String name, Plan plan){
        this.id = id;
        this.name = name;
        this.plan = plan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }
}
