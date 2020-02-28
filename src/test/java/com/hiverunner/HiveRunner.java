package com.hiverunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.klarna.hiverunner.HiveShell;
import com.klarna.hiverunner.StandaloneHiveRunner;
import com.klarna.hiverunner.annotations.HiveSQL;

import java.nio.file.Paths;

@RunWith(StandaloneHiveRunner.class)
public class HiveRunner {
	
	@HiveSQL(files = {}, autoStart = true)
    private HiveShell shell;

	@Test
	public void test_without_set() {
		this.shell.execute(Paths.get("src/test/resources/test_without_set.hql"));
	}
	
	@Test
	public void test_with_set() {
		this.shell.execute(Paths.get("src/test/resources/test_with_set.hql"));
	}

}
