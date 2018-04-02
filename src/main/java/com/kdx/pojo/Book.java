package com.kdx.pojo;

public class Book {
    private Integer bookid;

    private String bookname;

    private String booktype;
    
    //虚拟字段
    private Integer page;
    
    private Integer rows;
    

    public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	private Integer bookprice;

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
    }

    public String getBooktype() {
        return booktype;
    }

    public void setBooktype(String booktype) {
        this.booktype = booktype == null ? null : booktype.trim();
    }

    public Integer getBookprice() {
        return bookprice;
    }

    public void setBookprice(Integer bookprice) {
        this.bookprice = bookprice;
    }
}