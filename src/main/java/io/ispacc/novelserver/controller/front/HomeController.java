package io.ispacc.novelserver.controller.front;

import io.ispacc.novelserver.core.common.constant.ApiRouterConsts;
import io.ispacc.novelserver.core.common.resp.RestResp;
import io.ispacc.novelserver.dto.resp.HomeBookRespDto;
import io.ispacc.novelserver.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(ApiRouterConsts.API_FRONT_HOME_URL_PREFIX)
public class HomeController {

    @Autowired
    private HomeService homeService;

    /**
     * 首页小说推荐查询接口
     * */
    @GetMapping("books")
    public RestResp<List<HomeBookRespDto>> listHomeBooks(){
        return homeService.listHomeBooks();
    }
}
