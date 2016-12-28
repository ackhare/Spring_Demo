package com.springCore.useOfQualifierAnnotation;

/**
 * Created by chetan on 19/12/16.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//There may be a situation when you create more than one bean of the same type and
// want to wire only one of them with a property,
// in such case you can use @Qualifier annotation along with @Autowired to
// remove the confusion by specifying which exact bean will be wired. .
public class Profile {
    @Autowired
    @Qualifier("student1")
    private Student student;

    public Profile(){
        System.out.println("Inside Profile constructor." );
    }

    public void printAge() {
        System.out.println("Age : " + student.getAge() );
    }

    public void printName() {
        System.out.println("Name : " + student.getName() );
    }
}
