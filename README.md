## Longest_Common_Substring_API

//@RestController
//public class Misc
//{
//    @GetMapping
//    public String hi()
//    {
//        return"Hi from IntelliJ";
//    }
//
//    Differentwaytotakeinputfromclient
//    @GetMapping(value="input1")
//    publicStringinput1(HttpServletRequestreq)
//    {
//        intn=Integer.parseInt(req.getParameter("n"));         //Call->localhost:8080/home?n=10
//        return"ThisishomeandvalueEnteredis-"+n;
//    }
//
//    @PostMapping("input2")
//    publicvoidinput2(intn,intm,into,HttpSessionsession)
//    {
//      intz=n+m+o;//won'tworkifanyvariableismissing
//    }
//
//    @GetMapping("input4")
//    publicintinput4(intn,intm)
//    {
//        return n + m;
//    }
//
//    @PostMapping("input3")
//    publicModelAndViewinput3(@RequestParam("num")intn)
//    {
//        ModelAndViewmv = newModelAndView();
//        mv.addObject("num",n);
//        mv.setViewName("Home");
//        return mv;
//    }
//
//    @PostMapping("Strings")
//    publicvoidstrings(Stringn,Stringm,HttpSessionsession)
//    {
//        LcsController(n,m);
//    }
//}
