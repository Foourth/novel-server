package io.ispacc.novelserver.service.impl;

import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import io.ispacc.novelserver.base.VerifyCodeManager;
import io.ispacc.novelserver.core.common.resp.RestResp;
import io.ispacc.novelserver.dto.resp.ImgVerifyCodeRespDto;
import io.ispacc.novelserver.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private VerifyCodeManager verifyCodeManager;
    @Override
    public RestResp<ImgVerifyCodeRespDto> getImgVerifyCode() throws IOException {
        String sessionId = IdWorker.get32UUID();
        return RestResp.ok(ImgVerifyCodeRespDto.builder()
                .sessionId(sessionId)
                .img(verifyCodeManager.genImgVerifyCode(sessionId))
                .build());
    }
}
