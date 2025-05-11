package org.example;

import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public String toString(){
        return ("ID: "+id+" İsim Soyisim: "+fullName+" Email: "+email+" Şifre: "+password+" Sağlık Planı: "+ Arrays.toString(healthPlans));
    }

    public Employee(int id, String fullName, String email, String password, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    public int getidEmployee() {
        return id;
    }

    public void setidEmployee(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }

    public void addHealthPlan(int index, String name) {
        if (index < 0 || index >= this.healthPlans.length) {
            System.out.println("Hata: İlgili index dizinin sınırları dışında.");
        } else if (this.healthPlans[index] == null) {
            this.healthPlans[index] = name;
        } else {
            System.out.println("İlgili index boş değil. '" + this.healthPlans[index] + "' değeri var!");
        }
    }

}
