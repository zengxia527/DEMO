package com.example.demo.exception;

import com.example.demo.enums.ResultStatus;

import lombok.Getter;

/**
 * 业务异常类
 * @author DK_ZX
 *
 */
@Getter
public class ResultException extends Exception {

	/**
	 * 业务异常信息
	 */
	private static final long serialVersionUID = 3285473847810372298L;
	ResultStatus resultStatus;
	public ResultException() {
		this(ResultStatus.INTERNAL_SERVER_ERROR);
	}
	
	public ResultException(ResultStatus resultStatus) {
        super(resultStatus.getMessage());
        this.resultStatus = resultStatus;
    }
}
