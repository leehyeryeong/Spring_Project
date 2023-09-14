package org.example.dao;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface IqsbzDao {
    List<Map<String, Object>> selectAll();
}
