package cadastroee.model;

import cadastroee.model.Pessoa;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-05-12T14:04:07", comments="EclipseLink-4.0.0.v20221005-r140718fa5062562a31cdb0451ffa0bb09523047d")
@StaticMetamodel(PessoaFisica.class)
@SuppressWarnings({"rawtypes", "deprecation"})
public class PessoaFisica_ { 

    public static volatile SingularAttribute<PessoaFisica, Integer> idPessoa;
    public static volatile SingularAttribute<PessoaFisica, Pessoa> pessoa;
    public static volatile SingularAttribute<PessoaFisica, String> cpf;

}