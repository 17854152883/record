package cn.hacklike.app.service.impl;

import cn.hacklike.app.entity.RecordType;
import cn.hacklike.app.mapper.RecordTypeMapper;
import cn.hacklike.app.service.RecordTypeService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordTypeServiceImpl implements RecordTypeService {

    @Autowired
    private RecordTypeMapper recordTypeMapper;

    @Override
    public List<RecordType> selectRecordType() {

        List<RecordType> recordTypes = this.recordTypeMapper.selectList(new QueryWrapper<RecordType>());

        return recordTypes;
    }

}
