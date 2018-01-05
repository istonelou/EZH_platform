package com.github.pig.gateway.feign.fallback;

import com.github.pig.common.vo.MenuVo;
import com.github.pig.gateway.feign.MenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;

/**
 * @author lengleng
 * @date 2017/10/31
 */
public class MenuServiceFallbackImpl implements MenuService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public Set<MenuVo> findMenuByRole(String role) {
        logger.error("调用{}异常{}","findMenuByRole",role);
        return null;
    }
}
