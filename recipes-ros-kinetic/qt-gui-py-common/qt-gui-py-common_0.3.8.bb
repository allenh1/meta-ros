# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "qt_gui_py_common provides common functionality for GUI plugins written in Python"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-rospkg python-qt-binding"
SRC_URI = "https://github.com/ros-gbp/qt_gui_core-release/archive/release/kinetic/qt_gui_py_common/0.3.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4807cbf6edc937e4962940b8e8625780"
SRC_URI[sha256sum] = "b7dfc4dcfce5fee240c1c0a7e8c6f5c12a07c2c36d49b578bce40f0d11efab15"
S = "${WORKDIR}/qt_gui_core-release-release-kinetic-qt_gui_py_common-0.3.8-0"

inherit catkin
