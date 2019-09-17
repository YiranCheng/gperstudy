package com.gupao.factorydemo.simplefactory;

public class CourseFactoryTest {
    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();
        ICourse iCourse = courseFactory.create("math");
        iCourse.study();
        iCourse = courseFactory.createByClassName("com.gupao.factorydemo.simplefactory.JavaCourse");
        iCourse.study();
        iCourse = courseFactory.createByClass(JavaCourse.class);
        iCourse.study();
    }
}
