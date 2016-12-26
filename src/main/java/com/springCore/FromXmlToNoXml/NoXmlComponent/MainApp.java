package com.springCore.FromXmlToNoXml.NoXmlComponent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chetan on 26/12/16.
 */
public class MainApp {
    public static void main(String[] args) {
//        ApplicationContext context =
//                new FileSystemXmlApplicationContext("//home/chetan/Downloads/Spring-Core-master/src/main/java/com/springCore/FromXmlToNoXml/FullXmlBasedConfig/Beans.xml");

        ApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        PdfService pdfService = (PdfService) context.getBean("pdfService");

        pdfService.readPdf();
    }

}
