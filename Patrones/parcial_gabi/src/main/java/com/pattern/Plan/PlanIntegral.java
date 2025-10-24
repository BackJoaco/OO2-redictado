package com.pattern.Plan;

import java.time.LocalDate;

import com.pattern.Afiliado;

public class PlanIntegral extends PlanMedico{
    public PlanIntegral(){
        this.cargoPorGrupoFamiliar = 3000;
        this.montoFijo = 22000;
        this.fechaContratacion = LocalDate.now();
    }

    public double calcularCargoPorGrupoFamiliar(Afiliado afiliado){
        double valor = this.getCargoPorGrupoFamiliar() * afiliado.getFamiliaresACargo();
        return valor + afiliado.getSalario() * 0.01;
    }

    public double calcularCostoPorCoberturaViajera(Afiliado afiliado){
        return (afiliado.getSalario() * 0.03 - afiliado.getCoseguro().getAntiguedad() * 10000);
    }

    public double calcularCostoMensual(Afiliado afiliado){
        return super.calcularCostoMensual(afiliado) + this.montoFijo * 0.05;
    }
}
