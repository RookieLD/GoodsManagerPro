package com.panli.model;
/**
 * GoodsTypeʵ����
 * @author Peter
 *
 */
public class GoodsType {
	
	private int id;
	private String goodsTypeName;
	private String goodsTypeDesc;
	/**
	 *�̳��Ը���Ĺ��췽��
	 */
	public GoodsType() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * һ�������Ĺ��췽��
	 * @param goodsTypeName
	 */
	public GoodsType(String goodsTypeName) {
		super();
		this.goodsTypeName = goodsTypeName;
	}
	

	/**
	 * һ�������Ĺ��췽��
	 * @param id
	 */
	public GoodsType(int id) {
		super();
		this.id = id;
	}

	/**
	 * 2�������Ĺ��췽��
	 * @param goodsTypeName
	 * @param goodsTypeDesc
	 */
	public GoodsType(String goodsTypeName, String goodsTypeDesc) {
		super();
		this.goodsTypeName = goodsTypeName;
		this.goodsTypeDesc = goodsTypeDesc;
	}
	
	/**
	 * 3���������췽��
	 * @param id
	 * @param goodsTypeName
	 * @param goodsTypeDesc
	 */
	public GoodsType(int id, String goodsTypeName, String goodsTypeDesc) {
		super();
		this.id = id;
		this.goodsTypeName = goodsTypeName;
		this.goodsTypeDesc = goodsTypeDesc;
	}

	
	@Override
	public String toString() {
		return goodsTypeName;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGoodsTypeName() {
		return goodsTypeName;
	}
	public void setGoodsTypeName(String goodsTypeName) {
		this.goodsTypeName = goodsTypeName;
	}
	public String getGoodsTypeDesc() {
		return goodsTypeDesc;
	}
	public void setGoodsTypeDesc(String goodsTypeDesc) {
		this.goodsTypeDesc = goodsTypeDesc;
	}
}
