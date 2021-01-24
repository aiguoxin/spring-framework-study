package com.agx.core;

import org.springframework.core.io.*;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.*;

/**
 * 2021/1/24 上午8:10
 * aiguoxin
 * 说明:
 * 1）利用spring的资源loader读取文件，包括本地文件、classpath中文件
 * 2）一次读取多个文件
 */
public class ResourceTest {
	public static void main(String[] args)throws Exception {
//		testSingleFileRead();
		testReadMutiFileAtOnce();

	}

	private static void testReadMutiFileAtOnce() throws IOException {
		//一次读取多个文件
		ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
		Resource[] resources = resourcePatternResolver.getResources("classpath*:test*.properties");
		for(Resource resource : resources){
			System.out.println(resource.getURL());
		}
	}

	private static void testSingleFileRead() throws IOException {
		//默认文件也为classpathResource
		ResourceLoader resourceLoader = new DefaultResourceLoader();
		//使用文件类型loader，则为file类型
//		ResourceLoader resourceLoader = new FileSystemResourceLoader();
//		Resource fileResource1 = resourceLoader.getResource("file:/Users/liuruixue/Downloads/agx.txt");
		Resource fileResource1 = resourceLoader.getResource("classpath:test.properties");

		if(fileResource1.isFile()){
			File file = fileResource1.getFile();
			try(InputStreamReader read = new InputStreamReader(new FileInputStream(file));
			    BufferedReader bufferedReader = new BufferedReader(read)) {
				String textLine;
				while ((textLine = bufferedReader.readLine()) != null) {
					System.out.println(textLine);
				}
			}
		}
		System.out.println("fileResource1 is FileSystemResource:"+ (fileResource1 instanceof FileSystemResource));
		System.out.println("fileResource1 is ClassPathResource:"+ (fileResource1 instanceof ClassPathResource));
	}
}
