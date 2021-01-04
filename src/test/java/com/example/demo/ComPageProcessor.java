package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

@Slf4j
public class ComPageProcessor implements PageProcessor {

	@Override
	public void process(Page page) {
		log.info("爬取成功！");
		log.info("爬取的内容："+page.getRawText());

	}

	@Override
	public Site getSite() {
		// TODO Auto-generated method stub
		return Site.me().setSleepTime(1000).setRetryTimes(3);
	}
	
	public static void main(String[] args) {
		String url="http://www.nongli123.com/day_calendar_2022.php";
		Spider.create(new ComPageProcessor()).addUrl(url).thread(1).run();
	}

}
