package com.equalinformation.jsf.template;

import javax.faces.bean.ManagedBean;

/**
 * Created by bpupadhyaya on 7/9/16.
 */

@ManagedBean(name="sampleMessage", eager = true)
public class SampleMessage {
    public SampleMessage() {
        System.out.println("Sample message started...");
    }

    public String getMessage() {
        return "This is a test message";
    }
}
