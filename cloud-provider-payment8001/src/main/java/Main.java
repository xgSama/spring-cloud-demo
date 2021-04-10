import com.xgsama.cloud.entity.CommonResult;

/**
 * Main
 *
 * @author xgSama
 * @date 2021/4/10 22:01
 */
public class Main {
    public static void main(String[] args) {

        CommonResult<Object> sss = new CommonResult<>(22, "SSS");

        System.out.println(sss.getCode());
    }
}
