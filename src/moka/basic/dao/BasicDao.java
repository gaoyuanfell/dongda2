package moka.basic.dao;

import moka.basic.bo.Basic;
import moka.basic.page.Page;

import java.util.List;

/**
 * Created by moka on 2017/3/6 0006.
 */
public interface BasicDao<E, T> {
    int insert(E e);

    T findOne(Integer id);

    T findOneAll(Integer id);

    List<T> findList();

    List<T> findList(Page page);

    List<T> findPage(Page page);

    int findCount();

    int findCount(Page page);

    int delete(Integer id);

    int update(Basic basic);
}