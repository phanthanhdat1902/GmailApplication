package com.example.gmailapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import java.time.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<UserInformation> userInformationList;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userInformationList=new ArrayList<UserInformation>();
        userInformationList.add(new UserInformation("T Le","Title 1","Em có sai với ai đi nữa, có làm cái gì đi nữa. Nếu có phải trả giá thì em cũng xin chấp nhận"));
        userInformationList.add(new UserInformation("Thanh Dat Phan","Title 2","Ra xã hội làm ăn bươn chải. Liều thì ăn nhiều, không liều thì ăn ít"));
        userInformationList.add(new UserInformation("DTiLee","Title 3","Muốn thành công thì phải chấp nhận chịu qua đắng cay ngọt bùi"));
        userInformationList.add(new UserInformation("L Trang","Title 4","Làm ăn muốn kiếm được tiền phải chấp nhận mạo hiểm, nguy hiểm một tý, nhưng “trong tầm kiểm soát”."));
        userInformationList.add(new UserInformation("Dat Phan Thanh","Title 5","Xã hội này chỉ có làm, chịu khó, cần cù thì bù siêng năng. Chỉ có làm thì mới có ăn."));
        userInformationList.add(new UserInformation("Quyet Vu","Title 6","Ở cái xã hội này phải chịu khó làm, chịu khó học hỏi, khắc có tiền. Nay không kiếm được nhiều thì kiếm được ít, mình tích tiểu thành đại, mình chưa có thì mình không được chơi bời."));
        userInformationList.add(new UserInformation("Vu Quyet","Title 7","Những người có tiền, không phải người ta ngu đâu, không phải người ta thừa tiền đâu. Người ta coi mình quan trọng hơn tiền bạc,người ta mới giúp lúc mình khó khăn, lúc mình khổ." ));
        userInformationList.add(new UserInformation("Phong Ban","Title 8","Những người cho mình vay tiền, lúc mình khó khăn, lúc mình khổ, lúc mình vỡ nợ, không phải vì người ta ngu, không phải vì người ta dại, mà vì chính người đó mình nên tôn trọng, bởi những người đó coi mình là anh em bạn bè thì những lúc mình vỡ nợ, khó khăn, khổ người ta mới đưa tiền cho mình vay."));
        userInformationList.add(new UserInformation("Ban Phong","Title 9","Sống muốn được người ta tôn trọng thì mình phải tôn trọng người khác trước, Muốn người ta quý mình thì mình phải quý người ta trước."));
        listView=findViewById(R.id.list_item);
        MailAdapter adapter=new MailAdapter(userInformationList);
        listView.setAdapter(adapter);
    }
}
