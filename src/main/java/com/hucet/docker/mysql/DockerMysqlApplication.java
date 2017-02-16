package com.hucet.docker.mysql;

import com.hucet.docker.mysql.dao.TestRepository;
import com.hucet.docker.mysql.domain.TestTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DockerMysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerMysqlApplication.class, args);
    }

    @Autowired
    TestRepository repository;

    @Transactional
    @RequestMapping(value = "/test", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @ResponseStatus(code = HttpStatus.CREATED)
    void test(String name) {
        repository.save(new TestTable(name));
    }
}
