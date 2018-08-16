package com.blueice.springreadlist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2017/5/26.
 */
@Controller
@RequestMapping("/readingList")
public class ReadListController {

    private BookRepository bookRepository;

    @Autowired
    public ReadListController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    /**
     * 处理/{reader}上的HTTP请求，根据指定的读者，从仓库获取book列表。
     * @param reader
     * @param model
     * @return
     */
    @RequestMapping(value = "/{reader}",method = RequestMethod.GET)
    @ResponseBody
    public String readersBooks(@PathVariable("reader") String reader,Model model){

        List<Book> readingList = bookRepository.findByReader(reader);

        model.addAttribute("name",reader);
        if(readingList != null){
            model.addAttribute("books",readingList);
        }
        return "readingList";
    }

    @RequestMapping(value = "/{reader}", method = RequestMethod.POST)
    public String addToReadingList(@PathVariable("reader") String reader,Book book){
        book.setReader(reader);
        bookRepository.save(book);
        return "redirect:/readingList/{reader}";
    }
}


















