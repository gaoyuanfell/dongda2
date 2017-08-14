package moka.goods.bo;

import moka.basic.bo.IdEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="t_goods")
public class Goods extends IdEntity implements Serializable {

}
