package com;

import com.VO.ResponeVO;
import com.entity.Scheduling;
import com.service.SchedulingService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SchedulingController {

    @Autowired
    private SchedulingService schedulingService;

    /**
     * 查询所有的排片
     * @return
     */

    @RequestMapping("/schedul/all")
    @ResponseBody
    public ResponeVO getAll(){
        List<Scheduling> all = schedulingService.all();

        return new ResponeVO(200,"ok-all",all);
    }

    /**
     * 添加排片
     * @param scheduling
     * @return
     */

    @RequestMapping("/schedul/add")
    @ResponseBody
    public ResponeVO add(Scheduling scheduling){
        Scheduling add = schedulingService.add(scheduling);
        return new ResponeVO(200,"ok-add",add);
    }

    /**
     * 根据id来查找对象
     * @param id
     * @return
     */
    @RequestMapping("/schedul/getById")
    @ResponseBody
    public ResponeVO getByIds(int id){
        Scheduling byId = schedulingService.getById(id);

        return new ResponeVO(200,"ok-delete",byId);
    }

    /**
     * 修改排片
     * @param scheduling
     * @return
     */
    @RequestMapping("/schedul/update")
    @ResponseBody
    public ResponeVO update(Scheduling scheduling){

        int update = schedulingService.update(scheduling);
        boolean rs=update==1?true:false;
        return new ResponeVO(200,"ok-update",rs);
    }

    /**
     * 根据id进行删除操作
     * @param id
     * @return
     */
    @RequestMapping("/schedul/delete")
    @ResponseBody
    public ResponeVO delete(int id){
        int deletes = schedulingService.deletes(id);
        boolean rs=deletes==1?true:false;
        return new ResponeVO(200,"ok-delete",rs);
    }

}
