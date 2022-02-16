package ma.cigma.pfe;

import ma.cigma.pfe.controller.ClientController;
import ma.cigma.pfe.controller.FactureController;
import ma.cigma.pfe.models.Adresse;
import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.models.Facture;
import ma.cigma.pfe.models.Genre;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApplicationRunner {
    public static void main(String[] args) {
        System.out.println("hello world");
        ApplicationContext context= new
                ClassPathXmlApplicationContext("spring.xml");

        List<Adresse> adresseList=new ArrayList<Adresse>();


        Client c1 =new Client("assali",
                "saad","0707109204",Genre.m);
        Client c2 =new Client("ahmed",
                "assali","0561238456",Genre.m);
        c1.toString();
        adresseList.add(new Adresse("zine salame","casa","maroc",c1));

        adresseList.add(new Adresse("hay riyad","raba","maroc",c1));



        ClientController cCtrl=(ClientController) context.getBean("clientCtrl");
        c1.setAdresse(adresseList);
        c1= cCtrl.save(c1);
        c2= cCtrl.save(c2);

        c1.toString();


    }
}
