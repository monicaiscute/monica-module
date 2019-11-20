package com.module.service;
import com.module.api.entity.MerchantNotifyList;

import java.util.List;
import java.util.Map;

public interface MerchantNotifyService {
       List<MerchantNotifyList> selectAll(Map<String, Object> map);
}