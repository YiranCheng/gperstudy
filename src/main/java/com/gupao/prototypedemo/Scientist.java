package com.gupao.prototypedemo;

import java.io.*;

/**
 * @author yiran
 */
public class Scientist {
    public Sheep cloneSheep(Sheep sheep){
        Sheep cloneSheep = null;
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(sheep);
            oos.flush();
            oos.close();
            bos.close();

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            cloneSheep = (Sheep) ois.readObject();
            ois.close();
            bis.close();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cloneSheep;
    }

    public Sheep shallowClone(Sheep sheep) {
        Sheep clone = new Sheep();
        clone.setName(sheep.getName());
        clone.setOwner(sheep.getOwner());
        clone.setWeight(sheep.getWeight());
        return clone;
    }
}
