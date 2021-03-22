
package com.gmail.hikkm10.javastudy.pareSample;

import java.util.stream.Collectors;

public class CSVparseSampleCore
{
	public static void main(String[] args) throws Exception
	{
		EQDataLoader loader = new EQDataLoader();
		loader.storeData(CSVparseSampleCore.class.getResourceAsStream("/sample.csv"));
		String result = loader.getData().stream().map(d -> d.toString()).collect(Collectors.joining("\n"));
		System.out.println(result);
	}
}

