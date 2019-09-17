package com.gupao.factorydemo.simplefactory;

public class CourseFactory {

    public ICourse create(String name) {
        if ("java".equals(name)) {
            return new JavaCourse();
        }else if ("math".equals(name)) {
            return new MathCourse();
        }
        return null;
    }

    public ICourse createByClassName(String className) {
        if (className != null) {
            try {
                return (ICourse) Class.forName(className).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public ICourse createByClass(Class clazz) {
        if (clazz != null) {
            try {
                return (ICourse) clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
