package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by fengy on 2017/10/1.
 */

public interface ListRepository extends JpaRepository<TodoList,Integer>{

}
