# admin
# 第一个用于测试的项目
# 每一个项目作为一个本地库，对应一个远程库
# ========================================
# git branch 新分支---新建分支
# git checkout 分支----切换分支
# git checkout -b 新分支---新建并切换到新分支

# git branch ----查看所有分支（当前分支前有*）

# git merge 分支---将分支合并到当前分支(Fast forward快进模式，合并后历史中也看不出合并)
# git merge --no-ff 分支（合并后有合并记录）

# git log --graph --pretty=oneline --abbrev-commit 查看时间线的分合过程

# 设置别名
#  git config --global alias.tree "log --color --graph --pretty=format:'%Cred%h%Creset -%C(yellow)%d%Creset %s %Cgreen(%cr) %C(bold blue)<%an>%Creset' --abbrev-commit"


# git branch -d 分支---删除本地分支
# git push --delete origin 分支---删除远程分支

# git add . ---添加所有开发区的更改到暂存区