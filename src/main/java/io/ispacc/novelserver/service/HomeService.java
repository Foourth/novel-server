package io.ispacc.novelserver.service;

import io.ispacc.novelserver.core.common.resp.RestResp;
import io.ispacc.novelserver.dto.resp.HomeBookRespDto;

import java.util.List;

public interface HomeService {
    RestResp<List<HomeBookRespDto>> listHomeBooks();
}
