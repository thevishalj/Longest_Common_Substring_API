package com.vishal.lcs.controller;

import com.vishal.lcs.model.LcsInput;
import com.vishal.lcs.model.LcsOutput;
import com.vishal.lcs.repository.LcsRepo;
import com.vishal.lcs.service.LcsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class LcsController
{
    private final LcsService lcsService;
    private final LcsRepo lcsRepo;

    public LcsController(LcsService lcsService, LcsRepo lcsRepo)
    {
        this.lcsService = lcsService;
        this.lcsRepo = lcsRepo;
    }

    @PostMapping("listinput")
    public String LCSprint(@RequestBody List<LcsOutput> list)   //RequestBody is needed to process JSON data
    {
        // LcsService lcsService = new LcsService();          //wrong approach
        return lcsService.LCSprint(list);                    //forwarding the values to main program
    }

    @PostMapping("lcs")
    public String LCSprint(@RequestBody LcsInput Lcs)
    {
        return lcsService.LCSprint(Lcs.getList());
    }

    @PostMapping("addtodb")
    public ResponseEntity<?> LcsAdd(@Valid @RequestBody LcsInput LcsIn, LcsOutput LcsOut)
    {
        LcsOut.setValue(lcsService.LCSprint(LcsIn.getList()));
        LcsOutput save = lcsRepo.save(LcsOut);
        return ResponseEntity.ok(save);
    }

    @GetMapping("getfromDB")
    public ResponseEntity<?> getlcs()
    {
        return ResponseEntity.ok(this.lcsRepo.findAll());
    }
}