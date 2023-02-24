package org.skyer.order.api.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

import org.skyer.boot.platform.lov.annotation.LovValue;
import org.skyer.starter.keyencrypt.core.Encrypt;

/**
 * @author: lzh
 * @date: 2022-03-18
 * @description:
 */
@Data
public class RefundPageVO {
	@Encrypt
	private Long id;
	@ApiModelProperty(value = "内部订单号")
	private String innerOrderNo;
	@ApiModelProperty(value = "三方订单号")
	private String outerOrderNo;
	@ApiModelProperty(value = "第三方退款退货单号")
	private String outerRefundNo;
	@ApiModelProperty(value = "内部退款退货单号")
	private String innerRefundNo;
	@ApiModelProperty(value = "售后类型 1-退款单  2- 退货退款")
	private String type;
	@ApiModelProperty(value = "状态")
	private String status;
	@ApiModelProperty(value = "退货单来源：普通转单、手工单、复制单、导入单")
	private String actionType;
	@ApiModelProperty(value = "退款单类型： 普通退款单 ")
	private String orderRefundType;
	@ApiModelProperty(value = "退款/退货原因")
	private String reason;
	@ApiModelProperty(value = "退款/退货客服备注")
	private String remark;
	@ApiModelProperty(value = "退货数量")
	private Integer goodsQuantity;
	@ApiModelProperty(value = "应退买家")
	private BigDecimal refundAmount;
	@ApiModelProperty(value = "结算方式")
	private String payType;
	@ApiModelProperty(value = "收货仓库名称")
	private String receivingWarehouseName;
	@ApiModelProperty(value = "退货物流信息")
	private String logisticsInfo;
	@ApiModelProperty(value = "买家昵称")
	private String buyerNick;
	@ApiModelProperty(value = "退货人姓名")
	private String receiverName;
	@ApiModelProperty(value = "退货人手机")
	private String mobile;
	@ApiModelProperty(value = "退货人地址")
	private String address;

	@ApiModelProperty("渠道类型编码")
	@LovValue(lovCode = "SCHL.CHANNEL_TYPE", meaningField = "channelTypeMeaning")
	private String channel;
	@ApiModelProperty("渠道类型")
	private String channelTypeMeaning;
	@ApiModelProperty(value = "店铺id")
	private Long storeId;
	@ApiModelProperty(value = "店铺名称")
	private String storeName;
	@ApiModelProperty(value = "三方退款/退回退款时间")
	private Date outReturnTime;
	@ApiModelProperty(value = "内部创建时间")
	private Date creationDate;
	@ApiModelProperty(value = "完成时间")
	private Date completeDate;
	@ApiModelProperty(value = "退款类型/退货退款类型：1-未发货仅退款  1-退货退款")
	private String refundType;
	@Encrypt
	@ApiModelProperty(value = "关联订单号ID")
	private Long originOrderId;
	@ApiModelProperty(value = "买家备注/留言")
	private String buyerRemarks;
	@ApiModelProperty(value = "客服备注")
	private String serviceRemarks;
	@ApiModelProperty(value = "审核状态")
	private String endorseStatus;
}
