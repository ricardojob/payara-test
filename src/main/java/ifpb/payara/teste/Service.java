package ifpb.payara.teste;

import javax.ejb.Stateless;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 09/03/2016, 00:07:55
 */
@Stateless
public class Service {

    public String nome(){
        return "job";
    }
}
