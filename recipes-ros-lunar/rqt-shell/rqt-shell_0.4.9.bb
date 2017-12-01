# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_shell is a Python GUI plugin providing an interactive shell."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-rospkg python-qt-binding qt-gui qt-gui-py-common rqt-gui rqt-gui-py"
SRC_URI = "https://github.com/ros-gbp/rqt_shell-release/archive/release/lunar/rqt_shell/0.4.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5e4894f6170bbe66ffbe3764ba3a89ed"
SRC_URI[sha256sum] = "22e7d399d1e2ee56cd67b7a0afa27415f7215f2a3ee770fa19aced5dc510acd0"
S = "${WORKDIR}/rqt_shell-release-release-lunar-rqt_shell-0.4.9-0"

inherit catkin
