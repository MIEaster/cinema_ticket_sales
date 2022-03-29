package com.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author MIEaster
 * @date 2022/3/28 9:10
 * @apiNote
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponeVO {
    private int id;
    private String msg;
    private Object data;
}
