function copyToClipBoard(id)
{
   var clipBoardContent="";
   clipBoardContent+=$(id).val();
   window.clipboardData.setData("Text",clipBoardContent);
   //alert("复制成功，请粘贴到你的QQ/MSN上推荐给你的好友");
}
