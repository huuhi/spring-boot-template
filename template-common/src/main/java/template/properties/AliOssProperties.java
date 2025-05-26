package template.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *阿里云OSS属性
 */
@Component
@ConfigurationProperties(prefix = "library.aliyun")
@Data
public class AliOssProperties {

    private String endpoint;
    private String bucketName;
    private String region;
    private String dir;

}
