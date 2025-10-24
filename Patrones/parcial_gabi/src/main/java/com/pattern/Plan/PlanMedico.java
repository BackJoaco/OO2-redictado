package com.pattern.Plan;

import java.time.LocalDate;

import com.pattern.Afiliado;

public abstract class PlanMedico {
    protected LocalDate fechaContratacion;
    protected double montoFijo;
    protected double cargoPorGrupoFamiliar;

    public LocalDate getFechaCOntratacion(){
        return fechaContratacion;
    }

    public int limitePrestaciones() {
        return 1;
    }
    public double getCargoPorGrupoFamiliar(){
        return cargoPorGrupoFamiliar;
    }

    public abstract double calcularCargoPorGrupoFamiliar(Afiliado afiliado);
    public abstract double calcularCostoPorCoberturaViajera(Afiliado afiliado);

    public double calcularCostoMensual(Afiliado afiliado){
        return montoFijo + this.calcularCargoPorGrupoFamiliar(afiliado) + calcularCostoPorCoberturaViajera(afiliado);
    }
}
