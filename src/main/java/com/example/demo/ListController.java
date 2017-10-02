package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by fengy on 2017/10/1.
 */
@RestController
public class ListController {
    @Autowired
    ListRepository listRepository;

    @GetMapping(value = "allList")
    public List<TodoList> findAll(){
        return listRepository.findAll();
    }

    @PostMapping(value = "add")
    public @ResponseBody TodoList addList(@RequestBody TodoList list){
        TodoList todo=new TodoList();
        todo.setThing(list.getThing());
        return listRepository.save(todo);
    }

    @PutMapping(value = "change/{id}")
    public TodoList changeList(@RequestParam("id") int id){
        TodoList todo=listRepository.findOne(id);
        todo.setStatus(1);
        return listRepository.save(todo);
    }
}
