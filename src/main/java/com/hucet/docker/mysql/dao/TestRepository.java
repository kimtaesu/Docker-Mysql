package com.hucet.docker.mysql.dao;

import com.hucet.docker.mysql.domain.TestTable;
import org.springframework.data.repository.Repository;


public interface TestRepository extends Repository<TestTable, Integer> {
    TestTable save(TestTable oauth2Account);
}
