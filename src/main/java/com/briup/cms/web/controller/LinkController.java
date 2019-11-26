package com.briup.cms.web.controller;

import com.briup.cms.bean.Link;
import com.briup.cms.service.ILinkService;
import com.briup.cms.util.Message;
import com.briup.cms.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/link")
@Api(description = "链接管理")
public class LinkController {
    @Autowired
    private ILinkService linkService;
    @PostMapping("/add")
    @ApiOperation("添加更新S链接")
    public Message addLink(Link link){
        linkService.addLink(link);
        return MessageUtil.success();
    }

    @GetMapping("/delete")
    @ApiOperation("删除链接")
    @ApiImplicitParam(name = "链接id" ,paramType = "query", required = true)
    public Message deleteLink(int id){
        linkService.deleteLink(id);
        return MessageUtil.success();
    }

    @PostMapping("/update")
    @ApiOperation("更新链接")
    public Message updateLink(Link link){
        linkService.addLink(link);
        return MessageUtil.success();
    }
    @GetMapping("/query")
    @ApiOperation("查询链接")
    public  Message<Link> queryById(int id){
        Link link = linkService.queryById(id);
        return  MessageUtil.success(link);

    }
    @GetMapping("/findAll")
    @ApiOperation("查询所有链接")
    public Message<List<Link>> findAll(){
        List<Link> links = linkService.findAll();
        return MessageUtil.success(links);
    }
}
