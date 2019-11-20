package com.module.service.impl;
import com.module.api.entity.MerchantNotifyList;
import com.module.api.mapper.MerchantNotifyMapper;
import com.module.service.MerchantNotifyService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class MerchantNotifyServiceImpl implements MerchantNotifyService {
    @Resource
    private MerchantNotifyMapper merchantNotifyMapper;

    public List<MerchantNotifyList> selectAll(Map<String, Object> map) {
        return merchantNotifyMapper.selectAll(map);
    }
}
