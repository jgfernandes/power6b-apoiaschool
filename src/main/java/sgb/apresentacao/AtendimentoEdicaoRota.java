package sgb.apresentacao;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import sgb.entidades.Atendimento;
import sgb.entidades.Autor;
import sgb.negocio.AtendimentoServico;
import sgb.negocio.AutorServico;

public class AtendimentoEdicaoRota extends VerticalLayout implements HasUrlParameter<Integer> {
    private AtendimentoServico servico;
    private AtendimentoFormulario formulario;
    private Atendimento atendimento;

    @Override
    public void setParameter(BeforeEvent beforeEvent, Integer integer) {
    }
}