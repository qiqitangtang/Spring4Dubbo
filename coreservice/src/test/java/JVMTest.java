import com.google.common.collect.Lists;

import java.util.List;

/**
 * @Auhtor: tangqi@otasim.com
 * @Description: JVMOOM测试代码
 * @Date: Create in 15:22 2017/5/5
 * @Modified By:
 */
public class JVMTest {

    static class OOMObject{}
    
    /**
     * @Author: tangqi@otasim.com
     * @Description: VM args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
     * @Date: 15:25 2017/5/5
     */
    public static void HeapOOM(){
        List<OOMObject> list = Lists.newArrayList();
        while (true) {
            list.add(new OOMObject());
        }
    }

    public static void main(String[] args) {
        HeapOOM();
    }
}
