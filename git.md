Git 是一个很强大的分布式版本控制系统，我打算用它来管理私人的代码和文档。

当使用省略-m参数的 git commit 命令，还有 git rebase 等命令时，Git 会打开由 GIT_EDITOR 系统环境变量或 Git 的 core.editor 全局变量指定的编辑器。可不可以把我们喜欢的 EmEditor 配置成 Git 的编辑器呢？可以的，虽然最初尝试的时候遇到了一些小麻烦。

为什么记事本可以，EmEditor 就不行？

我们可以使用 git config --global core.editor notepad.exe 命令将记事本配置成 Git 的编辑器。之后，修改一些文档，执行 git commit -a 命令，Git 会在“工作目录\.git\”新建一个名为 COMMIT_EDITMSG 的文本文件，然后调用记事本打开这个文件，等待用户输入备注信息，此时 git commit -a 命令处于阻塞状态，直到我们在记事本里输入信息，保存并关闭记事本之后，Git 再从 COMMIT_EDITMSG 文件里读取备注信息，完成提交操作。

由于 Git 是 Linux 下的项目，即使移植到了 Windows 下也仍然使用 LF 而不是 CRLF 作为换行符，这会导致用记事本打开的文本全都挤到了一行，所以我们希望使用像 EmEditor 这样的能够兼容 LF 换行符的文本编辑器。

但是，如果我们使用 git config --global core.editor F:/工具箱/文档工具/EmEditor/EmEditor.exe 将 EmEditor 配置为 Git 的编辑器，再执行 git commit -a 命令，会发现虽然成功通过 EmEditor 打开了 COMMIT_EDITMSG 文件，但是 git commit -a 命令并没有阻塞，而是直接读取了空白的 COMMIT_EDITMSG 文件（我们还没来得及输入信息呢），并返回“Aborting commit due to empty commit message.”错误信息。

这是为什么呢？我们可以猜测 git commit -a 的工作原理是：先创建编辑器的一个新的进程，然后将 COMMIT_EDITMSG 文件传递给这个进程并等待进程结束，然后再读取 COMMIT_EDITMSG 文件。然而，运行 EmEditor.exe COMMIT_EDITMSG 并不一定会创建新的进程——如果有正在运行着的 EmEditor，将会直接使用这个进程打开 COMMIT_EDITMSG 文件（新增一个Tab页），这样 Git 自然也就不会阻塞了。为了验证这个想法，可以做一个小实验：关闭所有运行着的 EmEditor，包括任务栏上的托盘图标（emedtry.exe），然后执行 git commit -a 命令，这次就会处于阻塞状态了。当然，我们不能每次都这么干。好在 EmEditor 有一个“/sp”命令行参数，意思是强制创建新的 EmEditor 进程，有了它，我们差不多就能得偿所愿了。不过，实际操作一下就会发现，直接使用 git config --global core.editor F:/工具箱/文档工具/EmEditor/EmEditor.exe 命令进行配置并不好用，而是要像下面这样操作。

将EmEditor配置为Git的编辑器（Step by Step）

我的 EmEditor.exe 的路径是“F:/工具箱/文档工具/EmEditor/EmEditor.exe”，以下配置都是基于这个路径，如果你的路径如果与我不同请自行智能纠错。

*. Step1 新增一个名为 GIT_EDITOR 的系统环境变量，设置它的值为 EmEditor.exe //sp。
*. Step2 修改 PATH 系统环境变量，追加 F:\工具箱\文档工具\EmEditor。
*. Step3 打开新的Git命令行以便让系统环境变量的修改生效。

测试 执行 git commit -a 命令，会发现经由新的 EmEditor 进程打开 COMMIT_EDITMSG 文件，git commit -a 命令处于阻塞状态，在 EmEditor 中输入一些文字，保存文件并关闭 EmEditor，git commit -a 命令继续执行并成功提交。

为什么不能直接配置 core.editor 全局变量？为什么不能直接把 GIT_EDITOR 参数设为 F:/工具箱/文档工具/EmEditor/EmEditor.exe //sp？因为这么做全都不好用。不是我喜欢弯弯绕，而是 Git 太变态。
