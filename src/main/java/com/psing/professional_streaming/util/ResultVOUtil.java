package com.psing.professional_streaming.util;

import com.psing.professional_streaming.VO.ResultVO;

/**
 * 外层对象生成工具
 */
public class ResultVOUtil {

    //成功
    public ResultVO seccess(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }
    public ResultVO seccess(){
        return seccess(null);
    }

    //失败
    public ResultVO error(Integer code, String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
