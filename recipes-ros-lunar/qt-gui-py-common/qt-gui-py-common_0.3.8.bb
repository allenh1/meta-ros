# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "qt_gui_py_common provides common functionality for GUI plugins written in Python"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin python-rospkg python-qt-binding"
SRC_URI = "https://github.com/ros-gbp/qt_gui_core-release/archive/release/lunar/qt_gui_py_common/0.3.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "13e6e108d3fbf028d1b7107f73fea77c"
SRC_URI[sha256sum] = "7b7ffdda54e8ec3f7868ed19d190f7a54306a88660a034f5885d9bb35f3cb892"
S = "${WORKDIR}/qt_gui_core-release-release-lunar-qt_gui_py_common-0.3.8-0"

inherit catkin
