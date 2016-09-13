package com.renke.assist;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;
import org.springframework.oxm.XmlMappingException;

import com.renke.pojo.User;

public class OXMExample {
	private static final String FILE_NAME = "testUser.xml";
	private User user;

	private Marshaller marshaller;

	private Unmarshaller unmarshaller;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public void writeToFile() throws XmlMappingException, IOException{
		marshaller.marshal(user, new StreamResult(new FileOutputStream(new File(FILE_NAME))));
	}
	
	public Object readByFile() throws XmlMappingException, IOException{
		return unmarshaller.unmarshal(new StreamSource(new FileInputStream(new File(FILE_NAME))));
	}

	public Marshaller getMarshaller() {
		return marshaller;
	}

	public void setMarshaller(Marshaller marshaller) {
		this.marshaller = marshaller;
	}

	public Unmarshaller getUnmarshaller() {
		return unmarshaller;
	}

	public void setUnmarshaller(Unmarshaller unmarshaller) {
		this.unmarshaller = unmarshaller;
	}
	
}
