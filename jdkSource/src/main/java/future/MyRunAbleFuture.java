package future;

import java.util.concurrent.Future;

/**
 * <p> @TODO <p>
 * <p>Author: LiquorSea</p>
 * <p>Version: 1.0.0</p>
 * <p>Create Date：2019/12/6</p>
 * <p>Modified By：LiquorSea</p>
 * <p>Modified Date: 2019/12/6 </p>
 * <p>Copyright (c) 2018 ~ 2019 Allchips版权所有</p>
 */
public interface MyRunAbleFuture<T> extends Runnable , Future<T> {

}
