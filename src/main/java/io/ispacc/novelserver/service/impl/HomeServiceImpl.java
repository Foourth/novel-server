package io.ispacc.novelserver.service.impl;

import io.ispacc.novelserver.base.cache.HomeBookCacheManager;
import io.ispacc.novelserver.core.common.resp.RestResp;
import io.ispacc.novelserver.dto.resp.HomeBookRespDto;
import io.ispacc.novelserver.service.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 首页模块 服务实现类
 */
@Service
public class HomeServiceImpl implements HomeService {

    @Autowired
    private HomeBookCacheManager homeBookCacheManager;

    @Override
    public RestResp<List<HomeBookRespDto>> listHomeBooks() {
        return RestResp.ok(homeBookCacheManager.listHomeBooks());
    }
}
