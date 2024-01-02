package wekaex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import org.netlib.util.doubleW;

import java_cup.internal_error;
import weka.classifiers.Evaluation;
import weka.classifiers.trees.RandomForest;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.CSVLoader;
import weka.core.pmml.jaxbbindings.INVALIDVALUETREATMENTMETHOD;

public class SimpleWekaex03 {

	public static void main(String[] args) throws Exception {
		int numfolds = 10;
		int numfold = 0;
		int seed = 1;

		Instances data = new Instances(
				         new BufferedReader(
				         new FileReader("c:/temp/titanic_pre.arff")));
                      
		
		//데이터 분활 - 훈련 데이터, 평가 데이터
		Instances train = data.trainCV(numfolds, numfold, new Random(seed));
		Instances test = data.testCV(numfolds, numfold);

		// 정답 속성 인덱스 설정 (마지막 속성)
		train.setClassIndex(train.numAttributes() - 1);
		test.setClassIndex(train.numAttributes() - 1);

		// 분류기 무델 설정
		RandomForest model = new RandomForest();
		
		//평가 설정
		Evaluation eval = new Evaluation(train);
		
		eval.crossValidateModel(model, train, numfolds, new Random(seed));
		
		// Random Forest 훈련 실행
		model.buildClassifier(train);
		
		//평가
		eval.evaluateModel(model, test);
		
		//결과 출력
		System.out.println(model);
		System.out.println(eval.toSummaryString());
		System.out.println(eval.toMatrixString());
		
		//실제 1개의 데이터 판정
		Instance indata = test.get(1);
		
		System.out.println(indata);
		
		//예측(predict)
		double result=model.classifyInstance(indata);
		
		System.out.println(result);
		System.out.println(test.classAttribute().value((int)result));
	}

}
