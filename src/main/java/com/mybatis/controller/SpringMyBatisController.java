package com.mybatis.controller;

import com.mybatis.mapper.AccountsMyBatisMapper;
import com.mybatis.model.Accounts;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SpringMyBatisController {

    private final AccountsMyBatisMapper accountsMyBatisMapper;

    public SpringMyBatisController(AccountsMyBatisMapper accountsMyBatisMapper) {
        this.accountsMyBatisMapper = accountsMyBatisMapper;
    }

    @RequestMapping(value = "/accounts", method = RequestMethod.GET)
    public List<Accounts> getAll() {
        return accountsMyBatisMapper.findAll();
    }

    @RequestMapping(value = "/account/{id}", method = RequestMethod.GET)
    public Accounts findById(@PathVariable("id") int id) {
        return accountsMyBatisMapper.findById(id);
    }

    @RequestMapping(value = "/account/insert", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Accounts insert(@RequestBody Accounts accounts) {
        int insert = accountsMyBatisMapper.insert(accounts);
        return insert == 1 ? accounts : null;
    }

    @RequestMapping(value = "/account/update", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Accounts update(@RequestBody Accounts accounts) {
        int update = accountsMyBatisMapper.update(accounts);
        return update == 1 ? accounts : null;
    }

    @RequestMapping(value = "/account/delete/{id}", method = RequestMethod.DELETE)
    public int delete(@PathVariable("id") int id) {
        return accountsMyBatisMapper.deleteById(id);
    }
}
