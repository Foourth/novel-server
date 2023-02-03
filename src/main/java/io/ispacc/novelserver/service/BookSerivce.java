package io.ispacc.novelserver.service;

import io.ispacc.novelserver.core.common.resp.RestResp;
import io.ispacc.novelserver.dto.resp.BookRankRespDto;

import java.util.List;

public interface BookSerivce {
    RestResp<List<BookRankRespDto>> listVisitRankBooks();
}
