package com.springCore.AutowiredWithRequiredFalse;

/**
 * Created by chetan on 19/12/16.
 */
import org.springframework.beans.factory.annotation.Required;

/*
By default, the @Autowired annotation implies the dependency is required similar to @Required annotation,
 however, you can turn off the default behavior by using (required=false) option with @Autowired.
The following example will work even if you do not pass any value for age property but still
it will demand for name property.
 */
import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    private Integer age;
    private String name;

    @Autowired(required=false)
    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    @Autowired
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}