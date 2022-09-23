package com.Dao;

import com.bean.Book;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;


import javax.xml.transform.Result;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDao {
    private JdbcTemplate jt;
    //Getter Setter


    public JdbcTemplate getJt() {
        return jt;
    }

    public void setJt(JdbcTemplate jt) {
        this.jt = jt;
    }

    //return number of inserted books
    public int insertBook(Book b) {
        return jt.update("insert into JTBookDetails values (?, ?,?,?)", b.getBookId(), b.getBookName(), b.getAuthorName(), b.getPrice());
    }


    public List<Book> fetchAllBooks() {
        String sql = "select * from JTBookDetails";

        List<Book> lbook = jt.query(sql, new RowMapper() {
            @Override
            public Object mapRow(ResultSet resultSet, int i) throws SQLException {
                Book book = new Book();
                book.setBookId(resultSet.getInt(1));
                book.setBookName(resultSet.getString(2));
                book.setAuthorName(resultSet.getString(3));
                book.setPrice(resultSet.getInt(4));

                return book;
            }


        });
        return lbook;
    }


    /*public int updateBook(String bookname, float price){




    }*/
/*    public int deleteBook(String bookname){

        return jt.update("insert into JTBookDetails values (?, ?,?,?)",b.getBookId(), b.getBookName(),b.getAuthorName(),b.getPrice());

    }*/


    public List<Book> fetchWithId(int bookId) {
        String sql = "Select * from JTBookDetails where bid = ? ";
        Object[] values = {bookId};
        List<Book> book = (List<Book>) jt.query(sql, values, new ResultSetExtractor() {
            @Override
            public Object extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                List<Book> bookList = new ArrayList<>();
               Book book1;
                while (resultSet.next()) {
                    book1 = new Book();
                    book1.setBookId(resultSet.getInt(1));
                    book1.setBookName(resultSet.getString(2));
                    book1.setAuthorName(resultSet.getString(3));
                    book1.setPrice(resultSet.getFloat(4));
                    bookList.add(book1);

                }
                return bookList;
            }
        });

        return book;

    }
}

