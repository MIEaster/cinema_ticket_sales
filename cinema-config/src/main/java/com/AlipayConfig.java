package com;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2021000116695357";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQC21tFeg3uox6y6BW9pOzYVSUuIywZX5ve1xPYtAYNPn5mTxxK9/URJXl+bQvIsemJg5ryKj79N7UuglfngJIsFJP4UE8biyKQ+oCjC7XTCZqqxpVkuQRoWHJJeHugmSqbv9jQ1c/7Y0dWR/PwjY0xJuD5HBXnfl8soyWqw+P7rbGDQpOBKkJfHzmWS5hfSLYIXZFku9urLNM+fO5HwNVgvMmITwgWVfBxhnJuzyLKUxTbiQLRZpqj/uxIivq6ecgNRUHXB4i7HZChDGPdCU38Sbv+rhOCFFF9YdG8KAhe0Zl6FpOkRo/nmbMHjRiB/hJTQHHIMHDt/9zPE6r61vy/TAgMBAAECggEAOvds7p5Y80XyXswB8l42QwcwZR2VHiRPH0A2ZK1oO/WtAgvh74QO0dqt2tTsZYvSzo2boNRbTjaJfXDg9XjTnQUhLDh0nA85aTkd7D/IuCmEQ2agLFqynw735YLyO+c3j4xHqjWOqz6BMmP0rTUJFX1mGGGbvJCn5K+QySKElEgD+IbDg+en6fH1eFOMxstIaPMIxWsq7KfwguvyLwPkomxv1Jr+qp+s+Z1Il1wM1meKlbZSW+N5Zr9HVjltHbX0hmzBZeIPsqJzkXYZm4nUicMJSSqxemn+lTNYOAfAhIdsYvzDQIp+p30F6Rp9hqNf4cFYmqzccXonDwfPItX/AQKBgQDjYAc/M+yazbvdLChMQr+c/U7DPxjdXCI1acWZXPgXr6nxFQMobXrt8gjf/UNbIqk16Sd5eY+gU6tfYfg8Y0Wjc5jvrq07ZssJNoj6oHbrbw9IFc55WRxB7of/JDJQyGFbm7t3QJtevlvGQbDT9weasKAjgpDZdwGbC5hKGTrN2QKBgQDN23WP580fc9ktY1ZxIK0UuT5C5DEvclUbh92Wk78+GJ27NH0g6mYOJ1yrYM7ukwBHi/t7YaqjxrMWru/gm0Hbvk6WUldg0DJWCe0RJ4lwUw1RgIp6GgBWyT8GJJnMlkRe1s80/5I1ZDHD8EIU5qkVMRsXWsY1rTcwWi8DgFrjiwKBgCKH9fHKT/eeoRZQ23nhdTpBWhHa5krP8D4OZz0IWoE2Y2fCmi0sm0vBw0lJLE6N8AbI9v7C0GY37sHYnhuFtBDDwIk+DP8FeHZYuurdLdJJlpeLAEV7nAgDUtITzDRqiiagexL8U9xKqqNsXI+EZ7o9csSR0q/EHBFQ7HrsY/rZAoGAbCT3jMMMypI0rJh8J/AvnSx33fI9OJzKwyzMJze1By0tZ9R6S9l4BcV99HZmH4VQZ0XNtpKnb2SKXsdGM2u83HEMngHh73VQjEyooxNvK3gmDgQGO4D/XphYqKR/u6/ReTVGI6SDrdLWJgZI4OwQNZbXkZxZdodp79fgzOkYVmMCgYEAm4WMhQ/nMEEbp9kA0rWtKpAnu04FPpBVXVMlDeScKVFYuTHmJI6ZnxX4YgO0+5wDJXWTswv5TPYDa/Yu/jtaliP03yl3vjQTE0TDM+MVnVZFTSITkNjjvNHqP0DPPFVsgSU7EQn7z3tr8Et/T6ikl9Xf2Th6+Tr0fz68bEsFNUI=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAsmtM5X4jUz0xVJB8Nf3Yta51BygIjLDnyz9aKkLaxErSOEGG/TRphKgZ4XHj6BmsrkByR+fz4jIg/+EmcfCoOHGtAbuTI5EKt+rbdbXFj2sQDxySpu28w+h3rSy1LrSL+uYKI+QZfMKITLinv6x7f3VmMELwoeTZis5pCyBIUJICG4jhPbuROAlJ/PD6qHRRtx0em6exPCx91vNKuZ66ACCv/VYZOTzuHNzM0bbj7Ru8w6wFZ5LI8UGJaVEA2hi3vQMDTsnvi6aXs8Hw1Pj89F6UDOsUjYIDCMRI9qFkf/+mSxhwSeamo8M4t+DF5SsrRPF/Cytr1M8R2Wh9XOkjlQIDAQAB";
    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://127.0.0.0:5501/yhhtml/confirm.html";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://127.0.0.0:5501/yhhtml/confirm.html";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 日志路径
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     *
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {

        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis() + ".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

