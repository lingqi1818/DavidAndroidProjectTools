package davidandroidprojecttools.qq986945193.com.davidandroidprojecttools.activity;

import android.view.View;
import android.widget.Button;

import davidandroidprojecttools.qq986945193.com.davidandroidprojecttools.R;

/**
 * @author ：程序员小冰
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 * @CSDN博客: http://blog.csdn.net/qq_21376985
 */

/**
 * 上拉加载更多与下拉刷新的多种实现
 */
public class RefreshLoadMoreActivity extends BaseActivity {
    private Button btn_pull_xlistview;
    private Button btn_pull_xlistview_two;
    private Button btn_auto_loadmore;
    private Button btn_recycleview_auto_loadmore;


    @Override
    protected void initView() {
        setContentView(R.layout.activity_refresh_load_more);
        btn_pull_xlistview = (Button) findViewById(R.id.btn_pull_xlistview);
        btn_pull_xlistview_two = (Button) findViewById(R.id.btn_pull_xlistview_two);
        btn_auto_loadmore = (Button) findViewById(R.id.btn_auto_loadmore);
        btn_recycleview_auto_loadmore = (Button) findViewById(R.id.btn_recycleview_auto_loadmore);
    }

    @Override
    protected void initData() {
        /**
         * pullXlistview的刷新与加载数据。真实数据
         */
        btn_pull_xlistview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(MyAdapterActivity.class);
            }
        });
        /**
         * PullXlistview的模拟数据实现效果
         */
        btn_pull_xlistview_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(DavidXListViewActivity.class);
            }
        });
        /**
         * 自动加载更多AutoLoadmore仿微博
         */
        btn_auto_loadmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(AutoLoadMoreActivity.class);
            }
        });
        /**
         *RecycleView的自动加载更多数据
         */
        btn_recycleview_auto_loadmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(RecycleViewLoadMoreActivity.class);
            }
        });

    }
}
