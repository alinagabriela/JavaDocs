package ro.teamnet.zerotohero.reflection;

import ro.teamnet.zerotohero.reflection.demoobjects.SuperClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * TODO
 * in order to resolve the exercises below, you will have to create
 * all the needed clasees, with their members and methods
 * (in ro.teamnet.zerotohero.reflection.demoobjects package)
 */
enum enumClass {
    UNU,
    DOI;
}

class wrapperClass {
    int obj;
}
public class ClassReflectionDemoMain extends SuperClass {
    public int primitiveObj;
    private String stringField;

    public ClassReflectionDemoMain() {
        this.primitiveObj = 50;
    }

    public ClassReflectionDemoMain(int value) {
        System.out.println("daaaa");
        this.primitiveObj = value;
    }

    class Class1 {

    }

    public void method1(int value) {
        this.primitiveObj = value;
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

        ClassReflectionDemoMain classReflectionDemoMain = new ClassReflectionDemoMain();


        //TODO get the class for a String object, and print it
		String stringObject = new String();
        System.out.println(stringObject.getClass());

        //TODO get the class of an Enum, and print it
        enumClass enumObject = enumClass.UNU;
        System.out.println(enumObject.getClass());

        //TODO get the class of a collection, and print it
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println(arrayList.getClass());

        //TODO get the class of a primitive type, and print it
        int i;
        System.out.println(int.class);

        //TODO get and print the class for a field of primitive type
        ClassReflectionDemoMain classReflectionDemoMainObj = new ClassReflectionDemoMain();

        Field field = null;
        try {
            field = classReflectionDemoMainObj.getClass().getDeclaredField("primitiveObj");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        System.out.println("fieldType = " + field.getType());

        //TODO get and print the class for a primitive type, using the wrapper class
        System.out.println("print the class for a primitive type: " + Integer.TYPE);
        Class c = Integer.TYPE;
        System.out.println(c);

        //TODO get the class for a specified class name
        System.out.println("get the class for a specified class name: " + ClassReflectionDemoMain.class);

        //TODO get the superclass of a class, and print it
        //TODO get the superclass of the superclass above, and print it
        System.out.println("get the superclass of a class, and print it: " + classReflectionDemoMain.getClass().getSuperclass());
        System.out.println("get the superclass of the superclass above, and print it: " + classReflectionDemoMain.getClass().getSuperclass().getSuperclass());

        //TODO get and print the declared classes within some other class
        System.out.println("get and print the declared classes within some other class: " + classReflectionDemoMain.getClass().getDeclaredClasses()[0]);

        //TODO print the number of constructors of a class
        System.out.println("print the number of constructors of a class: " + classReflectionDemoMain.getClass().getDeclaredConstructors().length);

        //TODO get and invoke a public constructor of a class
        Constructor ct = classReflectionDemoMain.getClass().getDeclaredConstructor(int.class);
        ClassReflectionDemoMain obj = (ClassReflectionDemoMain) ct.newInstance(100000); //creez o noua instanta a clasei; newInsatnce invoca un contructor din clasa respectiva si primeste ca paramentru argumentele constructorului
        System.out.println("get and invoke a public constructor of a class: " + obj.primitiveObj);

        //TODO get and print the class of one private field 
        System.out.println(" get and print the class of one private field: " + classReflectionDemoMain.getClass().getDeclaredField("stringField").getType());

        //TODO set and print the value of one private field for an object Field f = classReflectionDemoMain.getClass().getDeclaredField("stringField");

        f.setAccessible(true);
        f.set(classReflectionDemoMainObj, "string");
        System.out.println("set and print the value of one private field for an object: " + f.get(classReflectionDemoMainObj));

        //TODO get and print only the public fields class
        System.out.println("get and print only the public fields class");
        Field[] fdArray = classReflectionDemoMain.getClass().getFields();
        for (int j = 0; j < fdArray.length; j++) {
            System.out.println(fdArray[j].get(classReflectionDemoMainObj));
        } //doar din clasa actuala sau din toate????

        //TODO get and invoke one public method of a class
        Method method = classReflectionDemoMain.getClass().getMethod("method1", int.class);
        method.invoke(classReflectionDemoMain, 22);
        System.out.println("get and invoke one public method of a class: " + classReflectionDemoMain.primitiveObj);

        //TODO get and invoke one inherited method of a class
        Method methodInherited = classReflectionDemoMain.getClass().getSuperclass().getMethod("setSuperClass", int.class);
        methodInherited.invoke(classReflectionDemoMain, 333);
        System.out.println("get and invoke one inherited method of a class: " + classReflectionDemoMain.superClass);
       
		
		//TODO invoke a method of a class the classic way for ten times, and print the timestamp (System.currentTimeMillis())
		//TODO invoke a method of a class by Reflection for 100 times, and print the timestamp
		//what do you observe?
        long initialSec = System.currentTimeMillis();
        for(int j = 0; j < 10000; j++) {
            classReflectionDemoMain.method1(2);
        }
        long finalSec = System.currentTimeMillis();
        System.out.println("invoke a method of a class the classic way for ten times, and print the timestamp: ");
        System.out.println(finalSec - initialSec);

        initialSec = System.currentTimeMillis();
        Method methodTest = classReflectionDemoMain.getClass().getMethod("method1", int.class);
        for (int j = 0; j < 10000; j++)
            method.invoke(classReflectionDemoMain, 22);
        finalSec = System.currentTimeMillis();
        System.out.println("invoke a method of a class by Reflection for 100 times, and print the timestamp: ");
        System.out.println(finalSec - initialSec);

    }
}
