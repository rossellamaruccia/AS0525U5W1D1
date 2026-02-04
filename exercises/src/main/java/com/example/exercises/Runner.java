package com.example.exercises;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(As0525U5Wd1Application.class);
        try {
            Menu m = (Menu) ctx.getBean("menu");
            m.printMenu();

            Tavolo t1 = (Tavolo) ctx.getBean("Tavolo 1");

            Ordine o1 = new Ordine(4, t1);

            o1.modificaComanda(ctx.getBean("margherita", Pizza.class));
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        } finally {
            ctx.close();
        }

    }
}
