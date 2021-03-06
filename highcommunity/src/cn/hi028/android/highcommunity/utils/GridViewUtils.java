package cn.hi028.android.highcommunity.utils;

import cn.hi028.android.highcommunity.view.NoScroolGridView;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;

//public class GridViewUtils {

//	static SparseIntArray mGvWidth = new SparseIntArray();
//	static int mWidth ;
//	static int mHeight ;

public class GridViewUtils {

	/**
	 * 存储宽度
	 */
	static SparseIntArray mGvWidth = new SparseIntArray();

	/**
	 * 计算GridView的高度
	 * 
	 * @param gridView 要计算的GridView
	 */
	public static void updateGridViewLayoutParams(NoScroolGridView gridView, int maxColumn) {
		int childs = gridView.getAdapter().getCount();

		if (childs > 0) {
			int columns = childs < maxColumn ? childs % maxColumn : maxColumn;
			gridView.setNumColumns(columns);
			int width = 0;
			int cacheWidth = mGvWidth.get(columns);
			if (cacheWidth != 0) {
				width = cacheWidth;
			} else { // 计算gridview每行的宽度, 如果item小于3则计算所有item的宽度;
				// 否则只计算3个child宽度，因此一行最多3个child。 (这里我们以3为例)
				int rowCounts = childs < maxColumn ? childs : maxColumn;
				for (int i = 0; i < rowCounts; i++) {
					View childView = gridView.getAdapter().getView(i, null, gridView);
					childView.measure(0, 0);
					width += childView.getMeasuredWidth();
				}
			}

			ViewGroup.LayoutParams params = gridView.getLayoutParams();
			params.width = width;
			gridView.setLayoutParams(params);
			if (mGvWidth.get(columns) == 0) {
				mGvWidth.append(columns, width);
			}
		}
	}
}
//	public static void updateGridViewLayoutParams(NoScroolGridView gridView) {
//		int childs = gridView.getAdapter().getCount();
////		for (int i = 0; i < childs; i++) {
////			
////			View childView = gridView.getAdapter().getView(i, null, gridView);
//////			childView.measure(0, 0);
////			mWidth += childView.getMeasuredWidth();
////			mHeight=childView.getMeasuredHeight();
////		}
////		mWidth=width;
//		LayoutParams params = (LayoutParams) gridView.getLayoutParams();
//		params.width = childs*70;
//		params.height = 70;
//		gridView.setLayoutParams(params);
//	}
//}