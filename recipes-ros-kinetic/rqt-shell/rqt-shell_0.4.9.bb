# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_shell is a Python GUI plugin providing an interactive shell."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-rospkg python-qt-binding qt-gui qt-gui-py-common rqt-gui rqt-gui-py"
SRC_URI = "https://github.com/ros-gbp/rqt_shell-release/archive/release/kinetic/rqt_shell/0.4.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7295c35e3cab4f255e2ed055a32834a3"
SRC_URI[sha256sum] = "a3c19eb189acd631299f7012f0224e39f1ac2ac76b071f1796606f22619ad2b7"
S = "${WORKDIR}/rqt_shell-release-release-kinetic-rqt_shell-0.4.9-0"

inherit catkin
