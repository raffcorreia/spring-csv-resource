package com.raffcorreia.springcsvresource.sample;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SampleService {


    public List<String> getBandMembers() {
        return Arrays.asList("A", "B", "C");
    }
}
