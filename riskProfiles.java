package robo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class riskProfiles implements Serializable{
	ArrayList<String> funds = new ArrayList<String>();
	ArrayList<Double> ratio = new ArrayList<Double>();
	HashMap<String, Double> fundRatio = new HashMap<String, Double>();
public riskProfiles(Integer score) {
		if (score<10) {
			funds.addAll(Arrays.asList("VOO", "BSV","MGC","VTIP","VTI"));
			ratio.addAll(Arrays.asList(0.1,0.2,0.2,0.3,0.2));
			//System.out.println("not risky");
			}
		else if (score>9&&score<15) {
			funds.addAll(Arrays.asList("VB", "VCIT","VTI","VTIP","BSV"));
			ratio.addAll(Arrays.asList(0.15,0.2,0.25,0.2,0.2));
			//System.out.println("not risky 1");
			}
		else if (score>14&&score<19) {
			funds.addAll(Arrays.asList("VO", "VCIT","VTI","VTIP","VBR"));
			ratio.addAll(Arrays.asList(0.15,0.3,0.35,0.1,0.1));
			//System.out.println("not risky 2");
			}
		else if (score>18&&score<23) {
			funds.addAll(Arrays.asList("VTV","BLV","VTI","VNQ","VBR"));
			ratio.addAll(Arrays.asList(0.2,0.2,0.3,0.1,0.2));
			//System.out.println("not risky 3");
			}
		else {
			funds.addAll(Arrays.asList("VSS","VBR","VTI","VNQ","VWO"));
			ratio.addAll(Arrays.asList(0.25,0.25,0.2,0.15,0.15));
			//System.out.println("not risky 4");
			}
	for (int i = 0; i < ratio.size(); i++) {
		fundRatio.put(funds.get(i), ratio.get(i));
	}
	
}
public ArrayList<String> getFunds() {
	return funds;
}
public void setFunds(ArrayList<String> funds) {
	this.funds = funds;
}
public ArrayList<Double> getRatio() {
	return ratio;
}
public void setRatio(ArrayList<Double> ratio) {
	this.ratio = ratio;
}
public HashMap<String, Double> getFundRatio() {
	return fundRatio;
}
public void setFundRatio(HashMap<String, Double> fundRatio) {
	this.fundRatio = fundRatio;
}
	
}
