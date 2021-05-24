package com.company.Lesson_7;

import java.io.*;

// 6th task
public class Serializator {
    boolean flag = false;

    public boolean serialization(Auto auto) {
        ObjectOutputStream oos = null;
        File file = new File("C:/Users/Lenovo/Downloads/TMS_tasks_Anna/src/com/directory/autoOne.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(auto);
            flag = true;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return flag;
    }

    public Auto deserialization() throws InvalidObjectException {
        File file = new File("C:/Users/Lenovo/Downloads/TMS_tasks_Anna/src/com/directory/autoOne.txt");
        ObjectInputStream ois = null;
        try {
            FileInputStream fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            Auto auto = (Auto) ois.readObject();
            flag = true;
            return auto;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        throw new InvalidObjectException("Fail");
    }
}
