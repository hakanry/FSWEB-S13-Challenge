package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {

        Plan plan = Plan.BASIC;
        System.out.println(plan);

        Company company = new Company(1,"ŞirketA",32.5, new String[]{"Ali", "Veli"});
        System.out.println(company);

        Employee employee = new Employee(1,"Hakan Reşit YALÇIN","hkn@hkn.com","123",new String[]{"Sağlık Plan1"});
        System.out.println(employee);

        HealthPlan healthPlan = new HealthPlan(1,"Bağkur",plan);
        System.out.println(healthPlan);

        company.addEmployee(1,"Hakan");
        System.out.println(company);

        employee.addHealthPlan(0,healthPlan.getName());
    }
}