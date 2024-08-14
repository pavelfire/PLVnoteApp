NoteApp with ui tests


#run this command for activate git hooks from project root
git config --local core.hooksPath .githooks

#check that you activate new path for hooks correctly
git config --local core.hooksPath

#make git hook executable
chmod +x .githooks/pre-commit

#on Win run to activate
git config --local --replace-all core.hooksPath .githooks/
#to turn off on Win
git config --local --unset-all core.hooksPath
