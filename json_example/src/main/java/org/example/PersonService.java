package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class PersonService {

    public List<Person> getAllPersons(){
        Gson gson = new Gson();
        List<Person> list = new ArrayList<>();
        try {
            FileReader reader = new FileReader("person.json");
            Type type = new TypeToken<List<Person>>(){}.getType();
            list = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        }

        return list;
    }
}
