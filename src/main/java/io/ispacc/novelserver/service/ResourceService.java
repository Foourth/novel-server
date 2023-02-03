package io.ispacc.novelserver.service;

import io.ispacc.novelserver.core.common.resp.RestResp;
import io.ispacc.novelserver.dto.resp.ImgVerifyCodeRespDto;

import java.io.IOException;

public interface ResourceService {

    /**
     * 获取图片验证码
     *
     * @throws IOException 验证码图片生成失败
     * @return Base64编码的图片
     */
    RestResp<ImgVerifyCodeRespDto> getImgVerifyCode() throws IOException;

}
