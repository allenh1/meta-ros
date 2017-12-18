# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_py_console is a Python GUI plugin providing an interactive Python console."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin python-rospkg python-qt-binding qt-gui qt-gui-py-common rospy rqt-gui rqt-gui-py"
SRC_URI = "https://github.com/ros-gbp/rqt_py_console-release/archive/release/lunar/rqt_py_console/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dbba94500c4e953fdc6bc74a717cad4f"
SRC_URI[sha256sum] = "25e8d3dfaeea7a284535aee54c4c29820314da6ef916f75451ad1cbe95a6c185"
S = "${WORKDIR}/rqt_py_console-release-release-lunar-rqt_py_console-0.4.8-0"

inherit catkin
