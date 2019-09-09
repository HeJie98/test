package cn.tedu.fallback;

import org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Zuul环境中启动他作为一个断路器
 */
@Component
public class HelloFallBack implements ZuulFallbackProvider {
    public String getRoute() {
        //设置通用路由
        return "*";
    }

    public ClientHttpResponse fallbackResponse() {
        return new ClientHttpResponse() {
            /**
             * 状态码
             * @return
             * @throws IOException
             */
            public HttpStatus getStatusCode() throws IOException {
                return HttpStatus.BAD_REQUEST;
            }

            /**
             * 状态码的值
             * @return
             * @throws IOException
             */
            public int getRawStatusCode() throws IOException {
                return HttpStatus.BAD_REQUEST.value();
            }

            /**
             * 状态码描述
             * @return
             * @throws IOException
             */
            public String getStatusText() throws IOException {
                return HttpStatus.BAD_REQUEST.getReasonPhrase();
            }

            /**
             * 关闭
             */
            public void close() {

            }

            /**
             * 返回内容
             * @return
             * @throws IOException
             */
            public InputStream getBody() throws IOException {
                String message = "请求失败--Zuul";
                ByteArrayInputStream inputStream = new ByteArrayInputStream(message.getBytes());
                return inputStream;
            }

            /**
             * 头信息
             * @return
             */
            public HttpHeaders getHeaders() {
                //创建Http消息头对象
                HttpHeaders headers = new HttpHeaders();
                //设置头信息，将JSON编码格式设置为UTF-8
                headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
                return headers;
            }
        };
    }
}
