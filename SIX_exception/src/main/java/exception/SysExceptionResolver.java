package exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 异常处理器
 */

public class SysExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {

        //获取异常对象
        SysException exception=null;
        if(e instanceof SysException){
            exception=(SysException)e;
        }else {
            exception=new SysException("系统正在维护中...");
        }

        ModelAndView mv=new ModelAndView();
        mv.addObject("errorMessage",exception.getMessage());
        mv.setViewName("error");
        return mv;
    }
}
