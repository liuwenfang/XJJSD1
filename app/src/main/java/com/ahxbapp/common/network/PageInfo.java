package com.ahxbapp.common.network;

/**
 * Created by gravel on 14-10-6.
 */
public class PageInfo {
    public int pageAll = 1;
    public int pageIndex = 0;

    public boolean isNewRequest = true;

    public boolean isLoadingLastPage() {
        return pageIndex >= pageAll;
    }

    public String toString() {
        return pageIndex + ", " + pageAll;
    }


}
