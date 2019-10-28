package org.lanqiao.bean;

public class Page {
    private int totalCount;  //数据总条数
    private int pageSize;    //每页显示的条数
    private int totalPage;   //数据总页数
    private int currentPage; //当前是第几页

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPage() {
        //判断总条数能否除尽每页显示的条数
        if (totalCount%pageSize==0){
            return totalCount/pageSize;
        }else{
            return totalCount/pageSize+1;
        }
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

}
