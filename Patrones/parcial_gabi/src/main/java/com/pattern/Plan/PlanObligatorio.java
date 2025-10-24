package com.pattern.Plan;

import java.time.LocalDate;

import com.pattern.Afiliado;

public class PlanObligatorio extends PlanMedico{
    public PlanObligatorio(){
        this.cargoPorGrupoFamiliar = 3500;
        this.montoFijo = 15000;
        this.fechaContratacion = LocalDate.now();
    }

    public double calcularCargoPorGrupoFamiliar(Afiliado afiliado){
        double valor = this.getCargoPorGrupoFamiliar() * afiliado.getFamiliaresACargo();
        return valor + valor * afiliado.getCoseguro().getDescuento();
    }

    public double calcularCostoPorCoberturaViajera(Afiliado afiliado){
        return (afiliado.getSalario() * 0.01 - afiliado.getCoseguro().getMontoCoberturaViajes());
    }
}
