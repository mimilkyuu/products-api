package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    private String info;

    public InfoController() {
    }

    public String GetInfo() { return info; }

    @GetMapping("/info")
    public String info() { return "The purpose of this application is to get familiar with using SpringBoot, Swagger UI, and uploading to GitHub"; }

}
