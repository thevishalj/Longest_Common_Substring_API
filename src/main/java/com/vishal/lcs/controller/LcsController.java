package com.vishal.lcs.controller;

import com.vishal.lcs.model.LcsModel;
import com.vishal.lcs.repository.LcsRepo;
import com.vishal.lcs.service.LcsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping("lcs")
    public String LCSprint(@RequestBody LcsModel Lcs)
    {
        return lcsService.LCSprint(Lcs.getList());
    }

    @PostMapping("addlcs")
    public ResponseEntity<?> LcsAdd(@RequestBody LcsModel Lcs)
    {
        Lcs.setAnswer(lcsService.LCSprint(Lcs.getList()));
        LcsModel save = this.lcsRepo.save(Lcs);
        return ResponseEntity.ok(save);
    }

    @GetMapping("getall")
    public ResponseEntity<?> getlcs()
    {
        return ResponseEntity.ok(this.lcsRepo.findAll());
    }

//    @PostMapping("lcs")
//    public String LCSprint(@RequestBody List<String> list)   //RequestBody is needed to process JSON data
//    {
//        // LcsService lcsService =new LcsService();          //wrong approach
//        return lcsService.LCSprint(list);                    //forwarding the values to main program
//    }

//    @PostMapping("addLcs")
//    public String AddLcs(@RequestBody List<String> list)   //RequestBody is needed to process JSON data
//    {
//        lcsRepo.save(list);
//        return lcsService.LCSprint(list);                    //forwarding the values to main program
//    }
}