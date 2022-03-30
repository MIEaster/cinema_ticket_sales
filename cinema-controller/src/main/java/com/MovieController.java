package com;

import com.VO.ResponeVO;
import com.entity.Movie;
import com.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieService service;

    /**
     * 查询所有电影的数据
     * @return
     */

    @RequestMapping("/list")
    @ResponseBody
    public ResponeVO getAll(){
        List<Movie> movies = service.allMovie();

        return new ResponeVO(200,"ok",movies);
    }

    /**
     * 添加电影
     * @param movie
     * @return
     */
    @RequestMapping("/insert")
    @ResponseBody
    public ResponeVO Insert(Movie movie){
        int i = service.addMovie(movie);
        boolean rs=i==1?true:false;
        return new ResponeVO(200,"ok",rs);
    }

    /**
     * 删除电影
     * @param id
     * @return
     */
    @RequestMapping("/delete")
    @ResponseBody
    public  ResponeVO deleteaMovie(int id){
        int i = service.delete(id);
        boolean rs=i==1?true:false;
        return new ResponeVO(200,"ok",rs);
    }

    /**
     * 根据id来查找电影
     * @param id
     * @return
     */
    @RequestMapping("/getById")
    @ResponseBody
    public  ResponeVO getMovieById(int id){
        Movie byMovieId = service.getByMovieId(id);

        return new ResponeVO(200,"ok",byMovieId);
    }

    /**
     * 对电影进行更新操作
     * @param movie
     * @return
     */
    @RequestMapping("/update")
    @ResponseBody
    public  ResponeVO updateMovie(Movie movie){
        int i = service.updateMovie(movie);
        boolean rs=i==1?true:false;
        return new ResponeVO(200,"ok",rs);
    }
}
