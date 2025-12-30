package com.mangkyu.appstore.admin.apps.app.test;

import com.mangkyu.globalutils.AndOrUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("/admin/use-ohter-module-method")
    public String test() {

        boolean result1 = AndOrUtils.or(true, false);
        boolean result2 = AndOrUtils.and(true, false);

        return result1 + " : " + result2;
    }
}
