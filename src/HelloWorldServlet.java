import java.io.IOException;

/**
 * Created by xu.haifeng on 2018/9/21.
 */
public class HelloWorldServlet extends MyServlet{
    @Override
    public void doGet(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("get  HelloWorld .....");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("post  HelloWorld .....");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
