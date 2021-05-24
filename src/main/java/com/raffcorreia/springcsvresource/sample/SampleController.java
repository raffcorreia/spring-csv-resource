package com.raffcorreia.springcsvresource.sample;

import com.raffcorreia.springcsvresource.model.BandMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SampleController {

    @Autowired
    SampleService sampleService;

    @RequestMapping(value = "band/members", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<BandMember> getBandMembers() {
        return sampleService.getBandMembers();
    }
}
