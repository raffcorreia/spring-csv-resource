package com.raffcorreia.springcsvresource.sample;

import com.raffcorreia.springcsvresource.model.BandMember;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SampleService {


    public List<BandMember> getBandMembers() {
        return Arrays.asList(new BandMember(1, "A", "some role", 1983), new BandMember(2, "B", "Another role", 1972));
    }
}
