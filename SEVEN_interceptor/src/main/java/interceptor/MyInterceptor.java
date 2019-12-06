package interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义拦截器
 */
public class MyInterceptor implements HandlerInterceptor {

    /**
     * 预处理:controller方法执行前执行
     * @param request
     * @param response
     * @param handler
     * @return true:放行 false：不放行 跳转到提示界面
     * @throws Exception
     */

    //放行 让controller中的方法继续执行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("预处理方法执行了。。。");
        return true;
    }

//    //不放行 直接被拦截 跳到提示界面
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        System.out.println("预处理方法执行了。。。");
//        request.getRequestDispatcher("/WEB-INF/pages/intercept.jsp").forward(request,response);
//        return false;
//    }


    /**
     * 后处理方法
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("请求方法执行后 后处理方法也执行了。。。");
        //重定向到另一页面 不去succeed界面了
        //request.getRequestDispatcher("/WEB-INF/pages/intercept2.jsp").forward(request,response);

    }

    /**
     * 此方法就不能重定向了 只做收尾工作
     *  释放一些资源啥的
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("最后的收尾方法也执行完毕啦！");
    }
}
