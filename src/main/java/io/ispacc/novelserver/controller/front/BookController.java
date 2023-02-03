package io.ispacc.novelserver.controller.front;

import io.ispacc.novelserver.core.common.resp.RestResp;
import io.ispacc.novelserver.dto.resp.BookRankRespDto;
import io.ispacc.novelserver.service.BookSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("book")
public class BookController {

    @Autowired
    private BookSerivce bookService;

    /**
     * 小说点击榜查询接口
     */
    @GetMapping("visit-rank")
    public RestResp<List<BookRankRespDto>> listVisitRankBooks() {
        return bookService.listVisitRankBooks();
    }
}
