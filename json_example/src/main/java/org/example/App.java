package org.example;

import com.google.gson.Gson;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Person p = new Person(1, "Ngọc", "HG");
//        Gson gson = new Gson();
//
//        String json = gson.toJson(p);
//        System.out.println(json);

        PersonService service = new PersonService();
        List<Person> list = service.getAllPersons();
        list.forEach(i -> System.out.println(i.getId() + " - " + i.getName() +
                " - " + i.getAddress()));

    }
}
