package com.pattern;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.pattern.Coseguro.AbsCoseguro;
import com.pattern.Coseguro.Coseguro;
import com.pattern.Coseguro.NullCoseguro;
import com.pattern.Plan.PlanMedico;

public class Afiliado {
    private String nombre;
    private int familiaresACargo;
    private double salario;
    private LocalDate fechaNacimiento;
    private PlanMedico plan;
    private List<PlanMedico> previos;
    private AbsCoseguro coseguro;

    public Afiliado(String nombre, int familiarACargo, double salario, LocalDate fechaNacimiento, PlanMedico plan, AbsCoseguro coseguro) {
        this.nombre = nombre;
        this.familiaresACargo = familiarACargo;
        this.salario = salario;
        this.fechaNacimiento = fechaNacimiento;
        this.plan = plan;
        this.previos = new ArrayList<>();
        this.coseguro = coseguro;
    }

    public Afiliado(String nombre, int familiarACargo, double salario, LocalDate fechaNacimiento, PlanMedico plan) {
        this.nombre = nombre;
        this.familiaresACargo = familiarACargo;
        this.salario = salario;
        this.fechaNacimiento = fechaNacimiento;
        this.plan = plan;
        this.previos = new ArrayList<>();
        this.coseguro = new NullCoseguro();
    }

    public double calcularMonto(){
        return this.plan.calcularCostoMensual(this);
    }

    public int getFamiliaresACargo(){
        return this.familiaresACargo;
    }

    public AbsCoseguro getCoseguro(){
        return this.coseguro;
    }
    
    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public PlanMedico getPlan() {
        return plan;
    }

    public List<PlanMedico> getPrevios() {
        return previos;
    }

    public void setPlanMedico(PlanMedico plan){
        this.previos.add(this.plan);
        this.plan = plan;
    }
}
