import java.util.ArrayList;
import java.util.List;

/**
 * Created by xu.haifeng on 2018/9/21.
 */
public class ServletMappingConfig {
    public static List<ServletMapping> servletMappingList=new ArrayList<>();
    static {
        servletMappingList.add(new ServletMapping("helloJava","/java","HelloJavaServlet"));
        servletMappingList.add(new ServletMapping("helloWorld","/world","HelloWorldServlet"));
    }
}
