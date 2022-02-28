package ma.cigma.pfe;

import ma.cigma.pfe.controller.ClientController;
import ma.cigma.pfe.controller.FactureController;
import ma.cigma.pfe.models.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class ApplicationRunner {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRunner.class, args);



//        System.out.println("hello world");
//        ApplicationContext context= new
//                ClassPathXmlApplicationContext("spring.xml");
//
//        List<Adresse> adresseList=new ArrayList<Adresse>();
//
//
//        Client c1 =new Client("assali",
//                "saad","0707109204",Genre.m);
////        Client c2 =new Client("ahmed",
////                "assali","0561238456",Genre.m);
//
//        ClientVip c1=new ClientVip("ahmed",
//                "assali","0561238456",Genre.m,2);
//
//        c1.toString();
//        adresseList.add(new Adresse("zine salame","casa","maroc",c1));
//        adresseList.add(new Adresse("hay riyad","rabat","maroc",c1));
//
//
//
      //  ClientController cCtrl=(ClientController) context.getBean("clientCtrl");
//        c1.setAdresse(adresseList);

//        cCtrl.save(c1);
//      c2= cCtrl.save(c2);
//
//
//        c1.toString();
//

    }
}
