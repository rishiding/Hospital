package com.cyansoft.reserve.fragment;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.cyansoft.reserve.Adapter.findAdapter;
import com.cyansoft.reserve.JavaBean.DataBean;
import com.cyansoft.reserve.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by author:StarryFei on 2016/6/9 0009.
 * Email:760646630fei@sina.com
 */
public class FindFragment extends Fragment {
    private ListView mListView;
    private List<DataBean> mDataBeanList = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.find_fragment,container,false);
        mListView = (ListView) view.findViewById(R.id.find_list);
        findAdapter adapter= new findAdapter(getActivity(),R.layout.finditem,mDataBeanList);
        mListView.setAdapter(adapter);
        DataBean dataBean1 = new DataBean("001","002","003","004");
        adapter.add(dataBean1);
        DataBean dataBean2 = new DataBean("001","002","003","004");
        adapter.add(dataBean2);
        DataBean dataBean3 = new DataBean("001","002","003","004");
        adapter.add(dataBean3);
        return view;
    }


}
