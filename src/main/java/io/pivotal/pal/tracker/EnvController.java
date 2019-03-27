package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EnvController {
    String port, mem_limit, cf_instance_index, cf_instance_add ;


    public EnvController(
            @Value("${port:NOT SET}") String p,
            @Value("${memory.limit:NOT SET}") String ml,
            @Value("${cf.instance.index:NOT SET}") String cfii,
            @Value("${cf.instance.addr:NOT SET}") String cfia){
        this.port = p;
        this.mem_limit = ml;
        this.cf_instance_index = cfii;
        this.cf_instance_add = cfia;
    }

    @GetMapping("/env")
    public Map<String, String> getEnv(){
        Map<String, String> map = new HashMap<>();

        map.put("PORT",port);
        map.put("MEMORY_LIMIT",mem_limit);
        map.put("CF_INSTANCE_INDEX",cf_instance_index);
        map.put("CF_INSTANCE_ADDR",cf_instance_add);
        return map;
    }
}
