import java.io.IOException;

/**
 * Created by xu.haifeng on 2018/9/21.
 */
public class HelloJavaServlet extends MyServlet {

    @Override
    public void doGet(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("get java .....");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("post java .....");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
