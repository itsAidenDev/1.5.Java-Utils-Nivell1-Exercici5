package org.example.classes;

import java.io.*;

public class Serialization {
    public static void run(){
        Person person = new Person("Aiden" , 25);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))){
            oos.writeObject(person);
            System.out.println("Person object serialized to person.ser");
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))){
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println("Deserialized Person: "+ deserializedPerson);
        }catch (IOException | ClassNotFoundException e){
            System.out.println("Error during deserialization: " + e.getMessage());
        }

    }
}