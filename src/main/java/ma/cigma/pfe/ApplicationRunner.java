package ma.cigma.pfe;

import ma.cigma.pfe.controller.FactureController;
import ma.cigma.pfe.models.Facture;
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
//       Facture f = new Facture(new Date(),20.05);
////        Facture f2 = new Facture(new Date(),23.05);
////        Facture f3 = new Facture(new Date(),25.05);
////        Facture f4 = new Facture(new Date(),30.05);
//        fctrl.save(f);
//        System.out.println("id facture ="+f.getId())  ;
////       fctrl.delete(f.getId());
//       fctrl.update(f.getId(),93.99);


        Facture f2 =  fctrl.find(4);
        System.out.println(f2.toString());
//
//
//        System.out.println("save done");
//
//        Facture f5 = fctrl.read(2);
//        Facture f6 = new Facture(new Date(),9999999.05);;
//
//        f5.toString();
      //  fctrl.delete(3);
        //fctrl.update(f6);


    }
}
