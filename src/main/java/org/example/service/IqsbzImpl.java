package org.example.service;

import org.example.dao.IqsbzDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class IqsbzImpl implements IqsbzService{
    @Autowired
    private IqsbzDao iqsbzDao;

    @Override
    public List<Map<String, Object>> selectAll(){
        return iqsbzDao.selectAll();
    }
}
