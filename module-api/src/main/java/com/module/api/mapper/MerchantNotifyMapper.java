package com.module.api.mapper;
import com.module.api.entity.MerchantNotifyList;
import java.util.List;
import java.util.Map;
public interface MerchantNotifyMapper {
    List<MerchantNotifyList> selectAll(Map<String, Object> map);
}