package com.jdbcconnectionex.demo.controllers;

import java.sql.SQLException;
import java.util.List;
import com.jdbcconnectionex.demo.DAOs.Person;
import com.jdbcconnectionex.demo.DBManager.DBOperations;
import com.jdbcconnectionex.demo.Requests.CreateRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    @RequestMapping(path = "/getPersons", method = RequestMethod.GET)
    public List<Person> getAllPeople() {
        return DBOperations.getPersons();
    }

    @RequestMapping(path = "/createTable", method = RequestMethod.POST)
    public void createTableWithName(@RequestParam String name) throws SQLException {
        DBOperations.createTable(name);
    }

    @RequestMapping(path = "/createPerson", method = RequestMethod.POST)
    public Person createPerson(@RequestBody CreateRequest request) throws SQLException {
        return DBOperations.createPerson(request);
    }

}
