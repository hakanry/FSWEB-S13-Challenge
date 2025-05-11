package org.example;

import java.util.Arrays;

public class Company {
    private int id;
    private  String name;
    private double giro;
    private String[] developerNames;

    public String toString(){
        return ("ID: "+id+" İsim: "+name+" Ciro: "+giro+" Geliştiriciler: "+Arrays.toString(developerNames));
    }

    public  Company(int id,String name,double giro,String [] developerNames){
        this.id = id;
        this.name = name;
        this.giro = (giro<0) ? 0 : giro;
        this.developerNames = developerNames;
    }
    public void setIDCompany(int ID){this.id = ID;}
    public void setNameCompany(String name){this.name = name;}
    public void setGiro(double giro){this.giro = (giro<0) ? 0 : giro;}
    public void setDeveloperNames(String[] developerNames){this.developerNames = developerNames;}

    public int getIDCompany(){return this.id;}
    public String getNameCompany() {return this.name;}
    public double getGiro(){return this.giro;}
    public String[] getDeveloperNames(){return this.developerNames;}

    public void addEmployee(int index, String name) {
        if (index < 0 || index >= this.developerNames.length) {
            System.out.println("Hata: İlgili index dizinin sınırları dışında.");
        } else if (this.developerNames[index] == null) {
            this.developerNames[index] = name;
        } else {
            System.out.println("İlgili index boş değil. '" + this.developerNames[index] + "' değeri var!");
        }
    }
}
