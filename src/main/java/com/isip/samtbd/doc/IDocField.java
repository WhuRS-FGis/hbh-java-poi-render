package com.isip.samtbd.doc;

import org.apache.poi.xwpf.usermodel.XWPFParagraph;

/**
 * 文档字段接口
 * @author huyigong
 *
 */
public interface IDocField {
	/**
	 * 获取字段类型
	 * @return 字段类型
	 */
	public DocFieldType getType();
	
	/**
	 * 更新文档
	 * @param para 文档段落
	 * @param start 开始位置
	 */
	public void updateDocument(Object para, int start);
}
