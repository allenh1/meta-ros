# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_shell is a Python GUI plugin providing an interactive shell."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-rospkg python-qt-binding qt-gui qt-gui-py-common rqt-gui rqt-gui-py"
SRC_URI = "https://github.com/ros-gbp/rqt_shell-release/archive/release/lunar/rqt_shell/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3b6bfb3fd7d97ae61f3c10bbc33a196b"
SRC_URI[sha256sum] = "bc6a1761519871a4f5f45b79a8b7eccc18133a123b77154f983d230b05e39cc3"
S = "${WORKDIR}/rqt_shell-release-release-lunar-rqt_shell-0.4.8-0"

inherit catkin
