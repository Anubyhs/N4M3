package cadastroee.model;

import cadastroee.model.Movimento;
import jakarta.persistence.metamodel.CollectionAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-05-12T14:04:07", comments="EclipseLink-4.0.0.v20221005-r140718fa5062562a31cdb0451ffa0bb09523047d")
@StaticMetamodel(Produto.class)
@SuppressWarnings({"rawtypes", "deprecation"})
public class Produto_ { 

    public static volatile SingularAttribute<Produto, Float> precoVenda;
    public static volatile SingularAttribute<Produto, Integer> idProduto;
    public static volatile SingularAttribute<Produto, String> nome;
    public static volatile CollectionAttribute<Produto, Movimento> movimentoCollection;
    public static volatile SingularAttribute<Produto, Integer> quantidade;

}