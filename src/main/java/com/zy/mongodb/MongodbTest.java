package com.zy.mongodb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongodbTest {
	
	public static void main(String[] args) {
		
		MongoClient mongoClient = new MongoClient("localhost", 27017);
		
		System.out.println(mongoClient.getDatabaseNames());
		
		MongoDatabase mongoDatabase = mongoClient.getDatabase("zytest");
		
//		MongoCollection<Document> collection = mongoDatabase.getCollection("zytest");
//		
//		BasicDBObject filter = new BasicDBObject();
//		filter.put("name", "first");
//		filter.put("ot", null);
//		
//		Document newDocument = new Document();
//		newDocument.put("key", "value");
//		newDocument.put("id", "aaaaaaaaaaaa");
//		
//		collection.insertOne(newDocument);
//		
//		FindIterable<Document> iterable = collection.find(filter);
//		
//		for (Document document : iterable) {
//			System.out.println(document);
//		}
//		
//		System.out.println("=================================");
//		
//		FindIterable<Document> iterable2 = collection.find();
//		
//		for (Document document : iterable2) {
//			System.out.println(document);
//		}
//		
//		System.out.println("=================================");
		
		
		
		mongoDatabase.createCollection("users");
		MongoCollection<Document> userColl = mongoDatabase.getCollection("users");
		MongoCollection<Document> addressColl = mongoDatabase.getCollection("address");
		
		Document adocument = new Document();
		adocument.put("name", "张三房屋1");
		Document adocument2 = new Document();
		adocument2.put("name", "张三房屋2");
		Document adocument3 = new Document();
		adocument3.put("name", "李四房屋1");
		Document adocument4 = new Document();
		adocument4.put("name", "李四房屋2");
		Document adocument5 = new Document();
		adocument5.put("name", "李四房屋3");
		addressColl.insertMany(Arrays.asList(adocument,adocument2,adocument3,adocument4,adocument5));
		
		MongoCollection<Document> addressColl2 = mongoDatabase.getCollection("address");
		FindIterable<Document> findIterable = addressColl2.find();
		
		System.out.println("========address===============");
		for (Document document : findIterable) {
			System.out.println(document);
		}
		
		Document document1 = new Document();
		document1.put("name", "zhangsan");
		document1.put("age", 15);
		document1.put("sex", "男");
		Document document2 = new Document();
		document2.put("name", "李四");
		document2.put("age", 20);
		document2.put("sex", "男");
		Document document3 = new Document();
		document3.put("name", "王丽");
		document3.put("age", 26);
		document3.put("sex", "女");
		
		
		List<String> zsidList = new ArrayList<>();
		List<String> lsidList = new ArrayList<>();
		for (Document document : findIterable) {
			if (document.get("name").toString().startsWith("张三")) {
				zsidList.add(document.get("_id").toString());
			}
			if (document.get("name").toString().startsWith("李四")) {
				lsidList.add(document.get("_id").toString());
			}
		}
		if (CollectionUtils.isNotEmpty(zsidList)) {
			document1.put("address", zsidList);
			System.out.println(zsidList);
		}
		if (CollectionUtils.isNotEmpty(lsidList)) {
			document2.put("address", lsidList);
			System.out.println(lsidList);
		}
		userColl.insertMany(Arrays.asList(document1,document2,document3));
		
		MongoCollection<Document> usersColl2 = mongoDatabase.getCollection("users");
		FindIterable<Document> findUsersIterable = usersColl2.find();
		
		System.out.println("=========users==============");
		for (Document document : findUsersIterable) {
			System.out.println(document);
		}
		
		
	}
	
}
