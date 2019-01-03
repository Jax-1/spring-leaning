package com.spring.leaning;

import org.springframework.web.servlet.DispatcherServlet;


//@Configuration
public class RequestMappingHandlerConfig extends DispatcherServlet {
    /**
     * 地址解析，mapping映射
     * @param request
     * @param response
     * @throws Exception
     */
//    @Override
//    protected void doDispatch(HttpServletRequest request, HttpServletResponse response) throws Exception {
//        HttpServletRequest processedRequest = request;
//        HandlerExecutionChain mappedHandler = null;
//        boolean multipartRequestParsed = false;
//        WebAsyncManager asyncManager = WebAsyncUtils.getAsyncManager(request);
//
//        try {
//            try {
//                ModelAndView mv = null;
//                Object dispatchException = null;
//
//                try {
//                    processedRequest = this.checkMultipart(request);
//                    multipartRequestParsed = processedRequest != request;
//                    mappedHandler = this.getHandler(processedRequest);
//                    if (mappedHandler == null) {
//                        this.noHandlerFound(processedRequest, response);
//                        return;
//                    }
//
//                    HandlerAdapter ha = this.getHandlerAdapter(mappedHandler.getHandler());
//                    String method = request.getMethod();
//                    boolean isGet = "GET".equals(method);
//                    if (isGet || "HEAD".equals(method)) {
//                        long lastModified = ha.getLastModified(request, mappedHandler.getHandler());
//                        if ((new ServletWebRequest(request, response)).checkNotModified(lastModified) && isGet) {
//                            return;
//                        }
//                    }
//
//                    if (!mappedHandler.applyPreHandle(processedRequest, response)) {
//                        return;
//                    }
//
//                    mv = ha.handle(processedRequest, response, mappedHandler.getHandler());
//                    if (asyncManager.isConcurrentHandlingStarted()) {
//                        return;
//                    }
//
//                    this.applyDefaultViewName(processedRequest, mv);
//                    mappedHandler.applyPostHandle(processedRequest, response, mv);
//                } catch (Exception var20) {
//                    dispatchException = var20;
//                } catch (Throwable var21) {
//                    dispatchException = new NestedServletException("Handler dispatch failed", var21);
//                }
//
//                this.processDispatchResult(processedRequest, response, mappedHandler, mv, (Exception)dispatchException);
//            } catch (Exception var22) {
//                this.triggerAfterCompletion(processedRequest, response, mappedHandler, var22);
//            } catch (Throwable var23) {
//                this.triggerAfterCompletion(processedRequest, response, mappedHandler, new NestedServletException("Handler processing failed", var23));
//            }
//
//        } finally {
//            if (asyncManager.isConcurrentHandlingStarted()) {
//                if (mappedHandler != null) {
//                    mappedHandler.applyAfterConcurrentHandlingStarted(processedRequest, response);
//                }
//            } else if (multipartRequestParsed) {
//                this.cleanupMultipart(processedRequest);
//            }
//
//        }
//    }
    /**
     * 请求映射
     */
//        @Override
//     public  HandlerExecutionChain getHandler(HttpServletRequest request) throws Exception {
//        if (this.handlerMappings != null) {
//            Iterator var2 = this.handlerMappings.iterator();
//
//            while(var2.hasNext()) {
//                HandlerMapping mapping = (HandlerMapping)var2.next();
//                HandlerExecutionChain handler = mapping.getHandler(request);
//                if (handler != null) {
//                    return handler;
//                }
//            }
//        }
//
//        return null;
//    }


}
