package ma.cigma.pfe;

import ma.cigma.pfe.controller.ClientController;
import ma.cigma.pfe.controller.FactureController;
import ma.cigma.pfe.models.Adresse;
import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.models.Facture;
import ma.cigma.pfe.models.Genre;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class ApplicationRunner {
    public static void main(String[] args) {
        System.out.println("hello world");
        ApplicationContext context= new
                ClassPathXmlApplicationContext("spring.xml");
        FactureController fctrl = (FactureController)
                context.getBean("controller");
        Client c =new Client(1,"assali",
                "saad","0707109204"
//                ,
//                Genre.m,
//                new Adresse(1,"zine salame",
//                "casa","maroc")
        );
        ClientController cCtrl=(ClientController) context.getBean("Clientcontroller");

        c= cCtrl.save(c);

        c.toString();


    }
}
