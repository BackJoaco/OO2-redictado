package com.pattern.Plan;

import java.time.LocalDate;

import com.pattern.Afiliado;

public class PlanPremium extends PlanMedico{
    public PlanPremium(){
        this.cargoPorGrupoFamiliar = 2800;
        this.montoFijo = 33000;
        this.fechaContratacion = LocalDate.now();
    }

    public double calcularCargoPorGrupoFamiliar(Afiliado afiliado){
        double valor = this.getCargoPorGrupoFamiliar()-4;
        if (valor > 0){
            valor = valor * afiliado.getFamiliaresACargo();
        } else {
            valor = 0;
        }
        return valor;
    }

    public double calcularCostoPorCoberturaViajera(Afiliado afiliado){
        return (afiliado.getSalario() * 0.01 - afiliado.getCoseguro().getMontoCoberturaViajes());
    }

    public double calcularCostoMensual(Afiliado afiliado){
        double valor = this.montoFijo + this.montoFijo * afiliado.getCoseguro().getDescuento(); 
        return valor + this.calcularCargoPorGrupoFamiliar(afiliado)+ calcularCostoPorCoberturaViajera(afiliado) + this.montoFijo * 0.05;
    }
}
