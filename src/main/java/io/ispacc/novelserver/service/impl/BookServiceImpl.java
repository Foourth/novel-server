package io.ispacc.novelserver.service.impl;

import io.ispacc.novelserver.base.cache.BookRankCacheManger;
import io.ispacc.novelserver.core.common.resp.RestResp;
import io.ispacc.novelserver.dto.resp.BookRankRespDto;
import io.ispacc.novelserver.service.BookSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookSerivce {
    @Autowired
    private BookRankCacheManger bookRankCacheManager;

    @Override
    public RestResp<List<BookRankRespDto>> listVisitRankBooks() {
//        return RestResp.ok(bookRankCacheManager.listVisitRankBooks());
        return null;
    }
}
