package com.springCore.JSR250.ResourceAnnotation;


import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by chetan on 30/10/16.
 */
import javax.annotation.Resource;
/*
You can use @Resource annotation on fields or setter methods and it works the same as in Java EE 5.
The @Resource annotation takes a 'name' attribute which will be interpreted as the bean name
to be injected. You can say, it follows
by-name autowiring semantics as demonstrated in the below example:

If no 'name' is specified explicitly, the default name is derived from the field name or setter method.
In case of a
field, it takes the field name; in case of a setter method, it takes the bean property name.
 */
public class TextEditor {
   private SpellChecker spellChecker;

   /*
    * The Resource annotation marks a resource that is needed
 * by the application.
 *
 * This annotation may be applied to an
 * application component class, or to fields or methods of the
 * component class.  When the annotation is applied to a
 * todo )field or method, the container will inject an instance( mucch like @Bean)
 * of the requested resource into the application component
 * todo when the component is initialized.

  * If the annotation is
 * applied to the component class, the annotation declares a
 * resource that the application will look up at runtime. <p>
    */
   @Resource(name= "spellChecker")
   public void setSpellChecker( SpellChecker spellChecker ){
      this.spellChecker = spellChecker;
   }
   public SpellChecker getSpellChecker(){
      return spellChecker;
   }
   public void spellCheck(){
      spellChecker.checkSpelling();
   }
}