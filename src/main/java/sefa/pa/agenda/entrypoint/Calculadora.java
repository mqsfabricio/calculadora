package sefa.pa.agenda.entrypoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class Calculadora {
    @GetMapping("/somar")
    public Integer somar (@RequestParam Integer x, @RequestParam Integer y) {
        Integer resultado = x + y;
        return resultado;
    }

    @GetMapping("/subtrair")
    public Integer subtrair (@RequestParam Integer x, @RequestParam Integer y) {
        Integer resultado = x - y;
        return resultado;
    }
}
