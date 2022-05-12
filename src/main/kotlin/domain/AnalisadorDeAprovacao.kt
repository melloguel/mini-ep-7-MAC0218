package domain

import domain.criterios.Basico
import domain.criterios.CriterioDeAprovacao

class AnalisadorDeAprovacao {
    var criterio : CriterioDeAprovacao = Basico()

    fun defineCriterio(criterio : CriterioDeAprovacao) {
        this.criterio = criterio
    }

    fun fechaBoletim(boletim : Boletim) : BoletimFechado {
        return BoletimFechado(
            boletim.mediaEPs,
            boletim.mediaMiniEPs,
            criterio.mediaFinal(boletim),
            criterio.estaAprovado(boletim))
    }
}