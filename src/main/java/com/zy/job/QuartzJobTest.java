package com.zy.job;

import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.helpers.TriggerUtils;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QuartzJobTest implements Job {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(QuartzJobTest.class);
	
	public void execute(JobExecutionContext context) throws JobExecutionException {
		LOGGER.info("context = " + context);
		System.out.println("context.getJobDetail().getFullName() = " + context.getJobDetail().getFullName()+"\n");
		System.out.println("context.getJobDetail().getName() = " + context.getJobDetail().getName()+"\n");
		System.out.println("context.getJobDetail().getGroup() = " + context.getJobDetail().getGroup()+"\n");
	}
	
	
	public static void main(String[] args) throws Exception {
		SchedulerFactory factory = new StdSchedulerFactory();
		Scheduler scheduler = factory.getScheduler();
		
		JobDetail detail = new JobDetail("job1", "firstJobGroup", QuartzJobTest.class);
		
		Trigger trigger = TriggerUtils.makeWeeklyTrigger(6, 17, 59);
		trigger.setName("Trigger1");
		
		scheduler.scheduleJob(detail, trigger);
		
	}
	
}
