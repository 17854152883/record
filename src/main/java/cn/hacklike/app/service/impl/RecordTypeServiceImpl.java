package cn.hacklike.app.service.impl;

import cn.hacklike.app.entity.RecordType;
import cn.hacklike.app.mapper.RecordTypeMapper;
import cn.hacklike.app.service.RecordTypeService;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RecordTypeServiceImpl implements RecordTypeService {

    @Autowired
    private RecordTypeMapper recordTypeMapper;

    @Override
    public List<RecordType> selectRecordType() {

        List<RecordType> recordTypes = this.recordTypeMapper.selectList(new QueryWrapper<RecordType>());

        return recordTypes;
    }

    @JmsListener(destination = "like新用户",containerFactory = "jmsListenerContainerTopic")
    public void rctiveMsg(String message){
        System.out.println("------监听到activemq的数据"+message);
        Map map = JSON.parseObject(message, Map.class);
        System.out.println("转成的对象是" + map);
    }

}
