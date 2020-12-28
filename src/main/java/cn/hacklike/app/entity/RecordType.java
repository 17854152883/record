package cn.hacklike.app.entity;

import cn.hacklike.common.LkEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class RecordType extends LkEntity {

    private static final long serialVersionUID = -5419766557794647681L;

    @TableId(value = "rec_type_id", type = IdType.ASSIGN_ID)
    private String recTypeId;

    private String recTypeName;

    private String recTypeCode;

    private String recTypeRemark;

    public String getRecTypeId() {
        return recTypeId;
    }

    public void setRecTypeId(String recTypeId) {
        this.recTypeId = recTypeId;
    }

    public String getRecTypeName() {
        return recTypeName;
    }

    public void setRecTypeName(String recTypeName) {
        this.recTypeName = recTypeName;
    }

    public String getRecTypeCode() {
        return recTypeCode;
    }

    public void setRecTypeCode(String recTypeCode) {
        this.recTypeCode = recTypeCode;
    }

    public String getRecTypeRemark() {
        return recTypeRemark;
    }

    public void setRecTypeRemark(String recTypeRemark) {
        this.recTypeRemark = recTypeRemark;
    }
}
