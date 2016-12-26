package com.springCore.FromXmlToNoXml.FullXmlBasedConfig;

import com.springCore.DIBYSetterWithAutowire.TextEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by chetan on 26/12/16.
 */
public class MainApp {
    public static void main(String[] args) {
//        ApplicationContext context =
//                new FileSystemXmlApplicationContext("//home/chetan/Downloads/Spring-Core-master/src/main/java/com/springCore/FromXmlToNoXml/FullXmlBasedConfig/Beans.xml");

        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "META-INF/FromXmlToNoXml/FullXmlConfig/Beans.xml");

        PdfService pdfService = (PdfService) context.getBean("pdfService");

        pdfService.readPdf();
    }

}
