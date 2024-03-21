package com.hv.sync.domain;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author liuhongxu2000
 * @since 2024-03-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("biao")
@ApiModel(value="Biao对象", description="")
@DS("slave")
public class Biao implements Serializable {
    private static long serialVersionUID = 1L;

    @TableField("vin")
    private String vin;

    @TableField("ctype")
    private String ctype;


    public Biao(String vin, String ctype) {
    }

    public Biao(long serialVersionUID, String vin, String ctype) {
        this.serialVersionUID = serialVersionUID;
        this.vin = vin;
        this.ctype = ctype;
    }

    public Biao() {

    }

    /**
     * 获取
     * @return vin
     */
    public String getVin() {
        return vin;
    }

    /**
     * 设置
     * @param vin
     */
    public void setVin(String vin) {
        this.vin = vin;
    }

    /**
     * 获取
     * @return ctype
     */
    public String getCtype() {
        return ctype;
    }

    /**
     * 设置
     * @param ctype
     */
    public void setCtype(String ctype) {
        this.ctype = ctype;
    }

    public String toString() {
        return "Biao{serialVersionUID = " + serialVersionUID + ", vin = " + vin + ", ctype = " + ctype + "}";
    }
}
