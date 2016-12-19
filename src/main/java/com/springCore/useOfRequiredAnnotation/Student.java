package com.springCore.useOfRequiredAnnotation;

/**
 * Created by chetan on 19/12/16.
 */
import org.springframework.beans.factory.annotation.Required;

public class Student {
    private Integer age;
    private String name;

    @Required
    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
/*

If we remove this @required for say setName and remove name from xml it will work but with required annotation it forces us to place both name and age in xml
 */