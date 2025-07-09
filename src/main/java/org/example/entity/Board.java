package org.example.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "board")
public class Board {
    /**
     * ID
     */
    @Id
    private Integer boardId;

    /**
     * 桌位区域ID
     */
    @Column(name = "board_area_id")
    private Integer boardAreaId;

    /**
     * 桌号
     */
    @Column(name = "board_no")
    private String boardNo;

    /**
     * 座位数
     */
    @Column(name = "seats")
    private Integer seats;

    /**
     * 桌贴编号
     */
    @Column(name = "sn")
    private String sn;

    /**
     * 门店ID
     */
    @Column(name = "store_id")
    private Integer storeId;

    /**
     * 优先序 1最大优先序 依次类推
     */
    @Column(name = "priority")
    private Integer priority;

    /**
     * 桌位状态: 0清台 1占用
     */
    @Column(name = "board_status")
    private Integer boardStatus;

    /**
     * 当前占用桌位的顾客ID
     */
    @Column(name = "customer_id")
    private Integer customerId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;
}