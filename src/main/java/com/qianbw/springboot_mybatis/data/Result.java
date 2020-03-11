package com.qianbw.springboot_mybatis.data;

import lombok.Getter;

/**

/**
 * @author Qianbw
 * @create 2020-03-09 14:35
 * @desc 结果信息
 **/
public class Result<T> {
    // hide the private constructor to limit subclass types (Success, Error)
    private Result() {
    }

    @Override
    public String toString() {
        if (this instanceof Result.Success) {
            Success success = (Success) this;
            return "Success[data=" + success.getData().toString() + "]";
        }
        else if(this instanceof Result.Fail)
        {
            Fail fail=(Fail)this;
            return "Fail[exception=" + fail.getReason().toString() + "]";
        }else if (this instanceof Result.Error) {
            Error error = (Error) this;
            return "Error[exception=" + error.getError().toString() + "]";
        }
        return "";
    }

    // Success sub-class
    public final static class Success<T> extends Result {
        @Getter
        private T data;

        @Getter
        private long count;

        public Success(T data,long count) {
            this.data = data;
            this.count = count;
        }


    }

    // Error sub-class
    public final static class Error extends Result {
        @Getter
        private Exception error;

        public Error(Exception error) {
            this.error = error;
        }


    }
    // Fail sub-class
    public final static class Fail extends Result {
        @Getter
        private Code reason;

        public Fail(Code reason) {
            this.reason = reason;
        }

    }
}
