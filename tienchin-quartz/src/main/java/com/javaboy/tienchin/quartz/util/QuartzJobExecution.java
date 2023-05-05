package com.javaboy.tienchin.quartz.util;

import org.quartz.JobExecutionContext;
import com.javaboy.tienchin.quartz.domain.SysJob;

/**
 * 定时任务处理（允许并发执行）
 *
 * @author tienchin
 */
public class QuartzJobExecution extends AbstractQuartzJob {
    @Override
    protected void doExecute(JobExecutionContext context, SysJob sysJob) throws Exception {
        JobInvokeUtil.invokeMethod(sysJob);
    }
}
