package cadastroee.model;

import cadastroee.model.Pessoa;
import cadastroee.model.Produto;
import cadastroee.model.Usuario;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-05-12T14:04:07", comments="EclipseLink-4.0.0.v20221005-r140718fa5062562a31cdb0451ffa0bb09523047d")
@StaticMetamodel(Movimento.class)
@SuppressWarnings({"rawtypes", "deprecation"})
public class Movimento_ { 

    public static volatile SingularAttribute<Movimento, Integer> idMovimento;
    public static volatile SingularAttribute<Movimento, Pessoa> idPessoa;
    public static volatile SingularAttribute<Movimento, Character> tipo;
    public static volatile SingularAttribute<Movimento, Produto> idProduto;
    public static volatile SingularAttribute<Movimento, Usuario> idUsuario;
    public static volatile SingularAttribute<Movimento, Integer> quantidade;
    public static volatile SingularAttribute<Movimento, BigDecimal> valorUnitario;

}