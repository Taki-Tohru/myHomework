Git ��һ����ǿ��ķֲ�ʽ�汾����ϵͳ���Ҵ�������������˽�˵Ĵ�����ĵ���

��ʹ��ʡ��-m������ git commit ������� git rebase ������ʱ��Git ����� GIT_EDITOR ϵͳ���������� Git �� core.editor ȫ�ֱ���ָ���ı༭�����ɲ����԰�����ϲ���� EmEditor ���ó� Git �ı༭���أ����Եģ���Ȼ������Ե�ʱ��������һЩС�鷳��

Ϊʲô���±����ԣ�EmEditor �Ͳ��У�

���ǿ���ʹ�� git config --global core.editor notepad.exe ������±����ó� Git �ı༭����֮���޸�һЩ�ĵ���ִ�� git commit -a ���Git ���ڡ�����Ŀ¼\.git\���½�һ����Ϊ COMMIT_EDITMSG ���ı��ļ���Ȼ����ü��±�������ļ����ȴ��û����뱸ע��Ϣ����ʱ git commit -a ���������״̬��ֱ�������ڼ��±���������Ϣ�����沢�رռ��±�֮��Git �ٴ� COMMIT_EDITMSG �ļ����ȡ��ע��Ϣ������ύ������

���� Git �� Linux �µ���Ŀ����ʹ��ֲ���� Windows ��Ҳ��Ȼʹ�� LF ������ CRLF ��Ϊ���з�����ᵼ���ü��±��򿪵��ı�ȫ��������һ�У���������ϣ��ʹ���� EmEditor �������ܹ����� LF ���з����ı��༭����

���ǣ��������ʹ�� git config --global core.editor F:/������/�ĵ�����/EmEditor/EmEditor.exe �� EmEditor ����Ϊ Git �ı༭������ִ�� git commit -a ����ᷢ����Ȼ�ɹ�ͨ�� EmEditor ���� COMMIT_EDITMSG �ļ������� git commit -a ���û������������ֱ�Ӷ�ȡ�˿հ׵� COMMIT_EDITMSG �ļ������ǻ�û���ü�������Ϣ�أ��������ء�Aborting commit due to empty commit message.��������Ϣ��

����Ϊʲô�أ����ǿ��Բ²� git commit -a �Ĺ���ԭ���ǣ��ȴ����༭����һ���µĽ��̣�Ȼ�� COMMIT_EDITMSG �ļ����ݸ�������̲��ȴ����̽�����Ȼ���ٶ�ȡ COMMIT_EDITMSG �ļ���Ȼ�������� EmEditor.exe COMMIT_EDITMSG ����һ���ᴴ���µĽ��̡�����������������ŵ� EmEditor������ֱ��ʹ��������̴� COMMIT_EDITMSG �ļ�������һ��Tabҳ�������� Git ��ȻҲ�Ͳ��������ˡ�Ϊ����֤����뷨��������һ��Сʵ�飺�ر����������ŵ� EmEditor�������������ϵ�����ͼ�꣨emedtry.exe����Ȼ��ִ�� git commit -a �����ξͻᴦ������״̬�ˡ���Ȼ�����ǲ���ÿ�ζ���ô�ɡ����� EmEditor ��һ����/sp�������в�������˼��ǿ�ƴ����µ� EmEditor ���̣������������ǲ����ܵó���Ը�ˡ�������ʵ�ʲ���һ�¾ͻᷢ�֣�ֱ��ʹ�� git config --global core.editor F:/������/�ĵ�����/EmEditor/EmEditor.exe ����������ò������ã�����Ҫ����������������

��EmEditor����ΪGit�ı༭����Step by Step��

�ҵ� EmEditor.exe ��·���ǡ�F:/������/�ĵ�����/EmEditor/EmEditor.exe�����������ö��ǻ������·����������·��������Ҳ�ͬ���������ܾ���

1. Step1 ����һ����Ϊ GIT_EDITOR ��ϵͳ������������������ֵΪ EmEditor.exe //sp��
2. Step2 �޸� PATH ϵͳ����������׷�� F:\������\�ĵ�����\EmEditor��
3. Step3 ���µ�Git�������Ա���ϵͳ�����������޸���Ч��

���� ִ�� git commit -a ����ᷢ�־����µ� EmEditor ���̴� COMMIT_EDITMSG �ļ���git commit -a ���������״̬���� EmEditor ������һЩ���֣������ļ����ر� EmEditor��git commit -a �������ִ�в��ɹ��ύ��

Ϊʲô����ֱ������ core.editor ȫ�ֱ�����Ϊʲô����ֱ�Ӱ� GIT_EDITOR ������Ϊ F:/������/�ĵ�����/EmEditor/EmEditor.exe //sp����Ϊ��ô��ȫ�������á�������ϲ�������ƣ����� Git ̫��̬��
