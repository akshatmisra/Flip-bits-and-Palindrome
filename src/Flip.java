import java.util.*;
public class Flip {

	public static void main(String args[])
	{
//		Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        String [] str = new String[t+1];
//        for(int i = 0; i< t+1; i++)
//        {
//             str[i]= sc.nextLine();
//        }
//        
//        for( int i = 1; i<t+1; i++)
//        {
//            char [] arr = str[i].toCharArray(); 
//            int count = 0;
//            for(int j = 0; j<arr.length-1; j++)
//            {
//                if(arr[j] == arr[j+1])
//                    count++;
//            }
//            System.out.println(count);
//        }
        
        int [] n = {0,1,2,4,5,7};//{0,5,9};//{0,1,2,4,5,7};
        //System.out.println(summaryRanges(n));
        String [] words = {"fjdhdb","ahaaiddgfgddecdd","g","acbh","hfcjifbbgejaaeidbeeg","egjbgffbada","dgigeaijafcdbbhdebj",
        		"fiegjibadiejehhjeeg","icajiciee","iidbfdjgaafecdj","gcjdbidecahbfjjb","jec","gifdeeaajffj","faajbdhijiifjgeeec",
        		"fjb","afaadihebidfbcbgj","f","gbiecjfbeahddfc","bffgcgfbddfcef","egijebjh","egbfeifcgij","dfbjhdhgeicfbff",
        		"hbeiefghiee","dgb","bcfdfjhijjjcifade","hacedh","jhjhfjij","ic","gdidchffeeif","jadbbjfdfdgid","b",
        		"ciaejbedfegaidha","abjja","fhbjagh","chfjjg","ehgdeiaifhgjfcbe","aihbaggacihjaiie","gdacggbceeiai",
        		"ichaagbfiiccccjfadc","dccefhebdiaabaddb","eijcfed","jdcgbjehghbjibfbfgh","ce","bigafcihgeidbjjdjj","bjiieichidfidij",
        		"hecbg","ccjhbcdfdaahdaiefged","hjaigafaibjifdahcj","edbfjh","bfdjbhcdgfajajd","eiedde","ccd","hgdhfiegiccgghabgc","be",
        		"ffcbbah","efgiabeeecehacehiebe","cabjedjiacaabbcecd","eegfdhfe","h","jbhihjbfhgdd","djihhdgaecjhbjcjeedg","fbjgjbch",
        		"ihgja","eggjeagaffchcj","cihjhhabi","ifba","djgebgge","cgfigag","haagfegghgacjijjfb","fghifedehiicec","jcjbhhicdhiahd",
        		"eai","gaeiiifcfgi","ggbfih","if","bcgcihgbcgicbfagbeic","jgedjjhihdeihgg","cddcgddiigf","acbdicdjbhej","ehacf",
        		"giebcfjbbjigj","jheceafeagjbiihh","ghhcccjajehhajafcajd","jdhajef","bfghgfhdeeafgiegcb","bheiceh","fgddf",
        		"gdjgiihifijfgefcgdae","jibdfhjf","gjaeigiefdhbc","ghidg","aicdfeiidd","gbha","ccjb","bijgibjedehfijbicgb","ciej",
        		"bijdeibgicehia","ajfhj","icdcbhhhifhh","haeaeaggdefjfagfa","bebjabhbaijhag","agbedijjc","gifihgdgfbjedfc","djcbbieaadbig",
        		"gadgejhjgechbbdhj","egacjhaeaehjfchahfdf","hdjjgibdfficbbi","dfgfdbaajajhc","cjdfaahffjbfgdfej","cgfif","hibafgegaahgejbh",
        		"ifgbihah","cgieagifija","ahbjidgdibbdjfgcdfjf","cigbhadeidiicjiagif","beiddjb","ccecec","aefddcefgedf","bgig",
        		"fafaaeaheddjajigg","igefhhhdcgfgjgei","jhifahchagcc","cf","bhjhcbcgaefbd","bcijaahhcchh","eghjgc","hccjjhdffdd",
        		"jbgchdijidfabfeejhf","fbabfaffdaeiabcd","igdjcbijghcehghhegb","iddhbegedhfgagf","eg","ceafb","cibfchgegegeegij","fhc",
        		"cdbaid","hihdbijbaccab","idhbgbhcjdih","aebijeicgdcbbgbech","efcfchbi","d","fcjjhggbhiaigchhih","jdfaafcidfi","dchbfhbdha",
        		"eiif","ffadhjjfhabejage","bajeffjccb","ghiabihgicfhajdbijj","jgfijafhdhjaihcgc","jedfhjeihb","jeba","egccdichiicfedeegc",
        		"dedbhcjffgj","ghehhcdjijhghejihe","jbjeeehajgiighgfhj","ecegddibhgdbhe","geijibjifjhbdibe","ffceaeadhaigffahj","feijgiidi",
        		"ghejahihgha","hdiijadf","dejaidibgg","a","dbh","ga","ejahbdhjgi","gjadchfcgja","egbfah","hcaahjd","gfj","dhc","fijbdjc",
        		"ifhiaaddddcagae","gbeiaafebdcagd","ajiehffaficcdieeebgg","ahagebiggi","hhaa","aiihfiefjaicbbbc","cieeiicajaeadd",
        		"hddfddffdhbaecejhfd","bdbhbcjiabdiaefeeh","gddabdiggecbf","acjcgbhgbbcgdejefa","abjdh","aeiac","gfbgfceij",
        		"ccfbeffjbdghahbaff","jieggdhcag","eiagdchhjgh","fbjfiagjf","hfddigjgdcifccdi","gihgbhgehbfghgccej","jjedbddf",
        		"ieajachii","gbgiaagdfj","eafjifffejeebahae","idgjhgjiahbba","ehchihhdbbbceaghhic","jiaaaifhefegajfhcah","hjehgg",
        		"feehbiigeechdbjhfdig","jiccegdfgafaij","chcdcfeefaj","eachhbch","bdaaefdjehgchbgjaf","j","iejeb","bdiabheabfffbibdhgei",
        		"hbgbcjihedgig","ch","eiacejifdbjdgf","jfjagcabfjebefhbc","cdhg","dagciafbieidjhaehej","ggaiifiacgfjhehdi","edcffabge",
        		"gedeecfefjiijheiijah","jge","hdjcbhejehge","gjiaffdcfej","dchgicedebiaafdbdiha","jcfaeffhidd","ebihchidchci","giecfgbd",
        		"cedjcfedahea","ifdjeg","gbdhfgaagegcidebh","hfhjbaffdjbfg","iidihbg","eeiihhihabb","dghf","hidbecc","ijgbfhccfahchgf","ecfhj",
        		"eifbgaheieegi","cceiaedbgcagihciacc","bdbhffcdfggeieiccfae","aaadhgcgidbjegd","egd","eccbcfccaceceddfhdfh",
        		"hdihcaijhhjbcigbjgjf","hijifehciafe","i","aejebjejgbjbacjdj","babjah","jeaiigeigdh","gbdecaf","idgdjhhjhcgafc",
        		"hejedcbdjihhaiehih","iigbic","cjh","ccaad","ajjjgjf","jbd","baggcg","afgdhjbcbji","ebfbdddceeib","jbcb","dajeggajhdhajfbdj",
        		"cecegegcabaiifd","fhibgcjfbfchfda","gddddciagafjfejagda","bifjdhggh","hbfafbdciecgijcge","abdf","hdbd","jei","jjfdebda",
        		"ae","ifccbidaaigeh","efdib","afjffgcehjcjbg","hdbeee","ejfajjfhef","iee","dgacjhficcichbiga","hhghjceicjjbbej","aahdibfdhjb",
        		"hhbjefbch","geifhebbfgebfehdab","ejgheadchhd","jbej","hh","fhigeahiighhia","jgcgbhjgcegag","dfdhiebciiahdh","hjhii",
        		"aghdbfhhjjcg","ihceifhahhbjea","jgcjiaiiebaci","chdbfdcii","igheb","dgei","iaie","bdaibdcbaagffee","ceiggfdbfdfgei",
        		"fabdhcggdda","ibddedbjccdj","bf","dcdaca"};
        System.out.println(palindromePairs(words));
        //sc.close();
//		Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        boolean [] ch = new boolean[26];
//        
//        for(char c : str.toLowerCase().toCharArray())
//        {
//        	if(c!=' ')
//        		if(ch[c -'a'] == false)
//        			ch[c - 'a'] = true;
//        }
//        
//        for(boolean b: ch)
//        {
//            if(b == false)
//                System.out.println("not pangram");
//        }
//        System.out.println("pangram");
//        
//        sc.close();
	}
	public static List<String> summaryRanges(int[] nums) {
        List<String> result = new LinkedList<String>();
        
        int start = 0; 
        int end = 1;
        //int prev = nums[0];
        
        for(; end<nums.length; end++)
        {
            if((long)nums[end] - (long)nums[start] > end - start)
            {
            	if(start == end -1)
                    result.add(Integer.toString(nums[start]));
                else
                    result.add(nums[start] +"->"+nums[end-1]);
                start = end;
            }
        }
        if(start == nums.length -1)
            result.add(Integer.toString(nums[start]));
        else
            result.add(nums[start] +"->"+nums[end-1]);
        return result;
    }
	
	public static List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        HashMap<String,String> map = new HashMap<String,String>();
        for(int i = 0; i<words.length -1; i++)
        {
        	for(int j = 0; j<words.length; j++)
        	{
        		if(i != j)
        			map.put(String.valueOf(i+","+j),words[i]+words[j]);
        	}
        }
        
        for(String str : map.keySet())
        {
        	//map.get(str)
        	ArrayList<Integer> al = new ArrayList<Integer>();
    		if(isPalindrome(map.get(str).toCharArray()) == true)
    		{	
    			String[] idx = str.split(",");
    			al.add(Integer.parseInt(idx[0]));
    			al.add(Integer.parseInt(idx[1]));
    		}
    		if(!al.isEmpty())
    			result.add(al);
        }
        
//        for(int i = 0; i < words.length -1; i++)
//        {
//        	int j = 0;
//    		String palindrom = words[i]+words[j];
//    		ArrayList<Integer> al = new ArrayList<Integer>();
//    		if(isPalindrome(palindrom.toCharArray()) == true && i != j)
//    		{	
//    			al.add(i);
//    			al.add(j);
//    		}
//    		if(!al.isEmpty())
//    			result.add(al);
//    		
//        }
        
        return result;
    }
	
	public static boolean isPalindrome(char[] str)
	{
		for(int i = 0; i< str.length /2; i++)
			if(str[i] != str[str.length -i -1])
				return false;
		return true;
	}
}
