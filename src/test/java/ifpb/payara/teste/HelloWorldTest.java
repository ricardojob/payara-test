package ifpb.payara.teste;

import javax.inject.Inject;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.testng.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.junit.runner.RunWith;


/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 09/03/2016, 00:05:28
 */



//@RunWith(Arquillian.class)
//public class HelloWorldTest {//extends Arquillian {
    
public class HelloWorldTest extends Arquillian {

    @Inject
    private Service service;
    
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(HelloWorld.class)
                .addClass(Service.class);
                //.addAsManifestResource(EmptyAsset.INSTANCE, ArchivePaths.create("beans.xml"));

    }

    @Test()
    public void sayHelloTest() {
        HelloWorld helloWorld = new HelloWorld();
        Assert.assertEquals(helloWorld.sayHello(), "Hello World");
    }

    @Test()
    public void nomeTest() {
        
        Assert.assertEquals(service.nome(), "job");
    }
}
