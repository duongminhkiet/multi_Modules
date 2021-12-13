package com.zmk.library.lib.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zmk.library.lib.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer>{

}
